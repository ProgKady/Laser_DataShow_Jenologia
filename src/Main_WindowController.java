

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author ahmed.elkady
 */




public class Main_WindowController implements Initializable {

    Connection conn_read=null;
    ResultSet rs_read=null;
    PreparedStatement pst_read=null;
    
    Connection conn_write=null;
    ResultSet rs_write=null;
    PreparedStatement pst_write=null;
    
    
    
    @FXML
    private JFXTextField mid;

    @FXML
    private JFXButton refresh;

    @FXML
    private JFXTextField mno;

    @FXML
    private JFXTextField init;

    @FXML
    private JFXTextField end;

    @FXML
    private JFXTextField model;

    @FXML
    private JFXTextField unit;
    
    private Calendar calendar;

    @FXML
    void refreshaction(ActionEvent event) {

        //Get Last Row Data
        
          ////////////////Machine ID////////////////
    
     String command="wmic bios get serialnumber";
              StringBuffer output=new StringBuffer();
              try {
                  Process SerNumProcess=Runtime.getRuntime().exec(command);
                   BufferedReader  sNumReader=new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));
                   String linee="";
                   while ((linee=sNumReader.readLine())!=null) {
                       output.append(linee+"\n");
                   }
                   String MachineID=output.toString().substring(output.indexOf("\n"),output.length()).trim();
                   mid.setText(MachineID);
              }
             catch (IOException ex) {
             } 
    //////////////////////////////////////////
        
        //read file for dbs (read)(write).
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
           BufferedReader buf  = new BufferedReader (new FileReader ("MachineNumber.kady"));
           String db_pathnot=buf.readLine().replace("Machine Number=", "");
           mno.setText(db_pathnot);
           buf.close();
        } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        //Read and Write DBS.........
        
     //   System.out.println("Hello Kadysoft Ltd. before");//Fire Action Here
        
          try {
              
      String sql = "SELECT * FROM production WHERE id IN ( SELECT max( id ) FROM production )";
      this.pst_read = this.conn_read.prepareStatement(sql);
      this.rs_read=this.pst_read.executeQuery();
      
      
      String add1 = this.rs_read.getString("design");
      model.setText(add1);
      //System.out.println(add1);
      
      String add2 = this.rs_read.getString("init_date");
      init.setText(add2);
      //System.out.println(add2);
      
      String add3 = this.rs_read.getString("end_date");
      if (add3.isEmpty()||add3.equals(null)) {
      Date currentDate1 = GregorianCalendar.getInstance().getTime();
      DateFormat df1 = DateFormat.getDateInstance();
      String dateString1 = df1.format(currentDate1);
      Date d1 = new Date();
      SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
      String timeString1 = sdf1.format(d1);
      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
      String timeString2 = sdf2.format(d1);
      String value000 = timeString1;
      String value111 = timeString2;
      String dateandtime=timeString2+" "+timeString1;
      end.setText(dateandtime);
      }
      else {
      end.setText(add3);
      }
      
      //System.out.println(add3);
      
      String add4 = this.rs_read.getString("units");
      unit.setText(add4);
      //System.out.println(add4);
      
      
    } 
        catch (Exception exception) {
    } 
        finally {
      try {
        this.rs_read.close();
        this.pst_read.close();
      } catch (Exception exception) {}
    } 
             
          
//   System.out.println("Hello Kadysoft Ltd. Starting updation.................");//Fire Action Here      
   //Get no and id if found update if not insert       
       
   String num,idd,initt,endd,modely,unity;
   num=mno.getText();
   idd=mid.getText();
   initt=init.getText();
   endd=end.getText();
   modely=model.getText();
   unity=unit.getText();
   
  /////////////////////////////////////////////////////////////////////////////////////
 
  try {
      String sqlo = "select * from Information where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' ";
      this.pst_write = this.conn_write.prepareStatement(sqlo);
      this.rs_write = this.pst_write.executeQuery();
      
    if (this.rs_write.next()) {
      //noti to show plan
      //Yes - Update
      
      //////////////////Update/////////////////////

 try {
     
      String sql1 = "update Information set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' ";
      this.pst_write = this.conn_write.prepareStatement(sql1);
      this.rs_write = this.pst_write.executeQuery();
      
    } 
        catch (Exception exception) {
    } 
        finally {
      try {
      //  this.rs_write.close();
      //  this.pst_write.close();
        
      //   System.out.println("Hello Kadysoft Ltd. update information");//Fire Action Here
        
      } catch (Exception exception) {}
    } 

/////////////////////////////////////////////   
      
    }
    
    else {
        
//no - insert

     //////////////////Insert///////////////////// 


try {
     
      String sql2 = "insert into Information (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      this.pst_write = this.conn_write.prepareStatement(sql2);
      this.pst_write.setString(1,num);
      this.pst_write.setString(2,idd);
      this.pst_write.setString(3,initt);
      this.pst_write.setString(4,endd);
      this.pst_write.setString(5,modely);
      this.pst_write.setString(6,unity);
      this.pst_write.execute();
      
    } 
        catch (Exception exception) {
    } 
        finally {
      try {
      //  this.rs_write.close();
     //   this.pst_write.close();
        
      //   System.out.println("Hello Kadysoft Ltd. insert information");//Fire Action Here
        
      } catch (Exception exception) {}
    } 


////////////////////////////////////////////// 
      
    
      
    }
      
    }
        
        catch (Exception exception) {
    } 
        finally {
      try {
        this.rs_write.close();
        this.pst_write.close();
      
      } catch (Exception exception) {}
    } 
        
 /////////////////////////////////////////////////////////////////////////////////////
 
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 
  /////////////////////////////////////////////////////////////////////////////////////
 
  try {
      String sqlo = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      this.pst_write = this.conn_write.prepareStatement(sqlo);
      this.rs_write = this.pst_write.executeQuery();
      
    if (this.rs_write.next()) {
      //noti to show plan
      //Yes - Update
      
      //////////////////Update/////////////////////

 try {
     
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      this.pst_write = this.conn_write.prepareStatement(sql1);
      this.rs_write = this.pst_write.executeQuery();
      
    } 
        catch (Exception exception) {
    } 
        finally {
      try {
     //   this.rs_write.close();
     //   this.pst_write.close();
        
     //    System.out.println("Hello Kadysoft Ltd. update production");//Fire Action Here
        
      } catch (Exception exception) {}
    } 

///////////////////////////////////////////// 

      
    }
    
    else {
        
//no - insert

     //////////////////Insert///////////////////// 


try {
     
      String sql2 = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      this.pst_write = this.conn_write.prepareStatement(sql2);
      this.pst_write.setString(1,num);
      this.pst_write.setString(2,idd);
      this.pst_write.setString(3,initt);
      this.pst_write.setString(4,endd);
      this.pst_write.setString(5,modely);
      this.pst_write.setString(6,unity);
      this.pst_write.execute();
      
    } 
        catch (Exception exception) {
    } 
        finally {
      try {
      //  this.rs_write.close();
      //  this.pst_write.close();
        
       //  System.out.println("Hello Kadysoft Ltd. insert production");//Fire Action Here
        
      } catch (Exception exception) {}
    } 


////////////////////////////////////////////// 
  
      
    }
      
    }
        
        catch (Exception exception) {
    } 
        finally {
      try {
        this.rs_write.close();
        this.pst_write.close();
      
      } catch (Exception exception) {}
    } 
        
 /////////////////////////////////////////////////////////////////////////////////////
      
 
 
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
          
  //  System.out.println("Hello Kadysoft Ltd. after");//Fire Action Here
        
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.conn_read=db_reader.java_db();
        this.conn_write=db_writer.java_db();
      
        //Read file for number and get id for bios.
        
          ////////////////Machine ID////////////////
    
     String command="wmic bios get serialnumber";
              StringBuffer output=new StringBuffer();
              try {
                  Process SerNumProcess=Runtime.getRuntime().exec(command);
                   BufferedReader  sNumReader=new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));
                   String linee="";
                   while ((linee=sNumReader.readLine())!=null) {
                       output.append(linee+"\n");
                   }
                   String MachineID=output.toString().substring(output.indexOf("\n"),output.length()).trim();
                   mid.setText(MachineID);
              }
             catch (IOException ex) {
             } 
    //////////////////////////////////////////
        
        //read file for dbs (read)(write).
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
           BufferedReader buf  = new BufferedReader (new FileReader ("MachineNumber.kady"));
           String db_pathnot=buf.readLine().replace("Machine Number=", "");
           mno.setText(db_pathnot);
           buf.close();
        } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Update fire every 1 second.
        try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("RefreshRate.kady"));
           String timey=buffr.readLine();
           int secondsdelay = Integer.parseInt(timey);  //READ FROM FILE
           buffr.close();
    Runnable helloRunnable = new Runnable() {
    public void run() {
    refresh.fire();
    }
};
ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
executor.scheduleAtFixedRate(helloRunnable, 0, secondsdelay, TimeUnit.SECONDS);
        } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        }
////////////////////////////////////////////////////////////////////////////////   
    }    
    
}




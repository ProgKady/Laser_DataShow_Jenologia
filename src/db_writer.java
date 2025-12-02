

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javax.swing.JOptionPane;
import org.controlsfx.control.Notifications;

public class db_writer {
   Connection conn = null;

   public static Connection java_db() {
//      try {
//         Class.forName("org.sqlite.JDBC");
//         Connection conn = DriverManager.getConnection("jdbc:sqlite:X:\\Recipe_System\\Database\\Recipe_System_DB.db");
//         return conn;
//      } catch (Exception var1) {
//         //JOptionPane.showMessageDialog((Component)null, var1);
//         
//        Alert alo = new Alert(Alert.AlertType.INFORMATION);
//        alo.setTitle(var1.toString());
//        alo.setResizable(false);
//        alo.setHeaderText(var1.toString());
//        alo.setContentText("Sorry we face a problem :\n"+"\""+var1.toString()+"\""+"\n\nPowered By Kadysoft Ltd - Ahmed Elkady.");
//        //DialogPane dialogPane = alo.getDialogPane();
//        //dialogPane.getStylesheets().add(
//      //getClass().getResource("primer-dark.css").toExternalForm());
//        alo.showAndWait();
//         
//         
//         return null;
//      }


  //Read Config File then store in vars................
         
         
        
        try {
          BufferedReader buf = new BufferedReader(new FileReader("DataBasesInfo.kady"));
          //String db_pathnot=buf.readLine().replace("DataBase Reader=", "");
          String db_path=buf.readLine();
          buf.close();
          Class.forName("org.sqlite.JDBC");
          Connection conn = DriverManager.getConnection("jdbc:sqlite:"+db_path);
          //conn.setAutoCommit(true);
          return conn;
            
        } catch (FileNotFoundException ex) {
            
            Alert al=new Alert (Alert.AlertType.ERROR);
        al.setTitle("Database Error");
        al.setHeaderText("Database Error");
        al.setContentText("Database not found, please go to settings to install database.");
        al.setResizable(false);
        DialogPane dialogPane = al.getDialogPane();
        //dialogPane.getStylesheets().add(getClass().getResource("dracula.css").toExternalForm());
        al.showAndWait();
            
          //   JOptionPane.showMessageDialog(null, ex);
           // Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
             Alert al=new Alert (Alert.AlertType.ERROR);
        al.setTitle("Database Error");
        al.setHeaderText("Database Error");
        al.setContentText("Database not found, please go to settings to install");
        al.setResizable(false);
        DialogPane dialogPane = al.getDialogPane();
     //   dialogPane.getStylesheets().add(
    //  getClass().getResource("dracula.css").toExternalForm());
        al.showAndWait();
            
            
          //    JOptionPane.showMessageDialog(null, ex);
         //   Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception var1) {
          Notifications noti = Notifications.create();
          noti.title("Database Error!");
          noti.text("Database not found");
          noti.position(Pos.CENTER);
          noti.showWarning();
         return null;
      }
        
        /////////////////////////////////////////////////////
      return null;
        








   }
}

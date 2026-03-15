//
//
//import com.gluonhq.charm.glisten.animation.PulseTransition;
//import com.jfoenix.controls.JFXButton;
//import com.jfoenix.controls.JFXTextArea;
//import com.jfoenix.controls.JFXTextField;
//import java.awt.Desktop;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//import java.nio.channels.Channels;
//import java.nio.channels.ReadableByteChannel;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.ResourceBundle;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//import static java.util.concurrent.TimeUnit.MILLISECONDS;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Platform;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.concurrent.Task;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.geometry.Pos;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Accordion;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.DialogPane;
//import javafx.scene.control.Label;
//import javafx.scene.control.Menu;
//import javafx.scene.control.Tooltip;
//import javafx.scene.effect.DropShadow;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.media.AudioClip;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.ImagePattern;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.web.WebView;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.UnsupportedAudioFileException;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.controlsfx.control.Notifications;
//
///**
// * FXML Controller class
// *
// * @author ahmed.elkady
// */
//public class ViewerController_New implements Initializable {
//    
//    Connection conn_write=null;
//    ResultSet rs_write=null;
//    PreparedStatement pst_write=null;
//    
//
//    @FXML
//    private Menu temomenu;
//    
//    @FXML
//    private JFXTextField allgarments;
//
//    @FXML
//    private JFXTextField allperformance;
//
//    @FXML
//    private JFXButton refresh;
//
//    @FXML
//    private JFXTextField dateoftoday;
//
//    @FXML
//    private ImageView tandcicon;
//
//    @FXML
//    private Label mno1;
//
//    @FXML
//    private JFXTextField nog1;
//
//    @FXML
//    private JFXTextField eff1;
//
//    @FXML
//    private JFXTextField mod1;
//
//    @FXML
//    private JFXTextField unit1;
//
//    @FXML
//    private Label mno11;
//
//    @FXML
//    private JFXTextField nog11;
//
//    @FXML
//    private JFXTextField eff11;
//
//    @FXML
//    private JFXTextField mod11;
//
//    @FXML
//    private JFXTextField unit11;
//
//    @FXML
//    private Label mno12;
//
//    @FXML
//    private JFXTextField nog12;
//
//    @FXML
//    private JFXTextField eff12;
//
//    @FXML
//    private JFXTextField mod12;
//
//    @FXML
//    private JFXTextField unit12;
//
//    @FXML
//    private Label mno13;
//
//    @FXML
//    private JFXTextField nog13;
//
//    @FXML
//    private JFXTextField eff13;
//
//    @FXML
//    private JFXTextField mod13;
//
//    @FXML
//    private JFXTextField unit13;
//
//    @FXML
//    private Label mno14;
//
//    @FXML
//    private JFXTextField nog14;
//
//    @FXML
//    private JFXTextField eff14;
//
//    @FXML
//    private JFXTextField mod14;
//
//    @FXML
//    private JFXTextField unit14;
//
//    @FXML
//    private Label mno15;
//
//    @FXML
//    private JFXTextField nog15;
//
//    @FXML
//    private JFXTextField eff15;
//
//    @FXML
//    private JFXTextField mod15;
//
//    @FXML
//    private JFXTextField unit15;
//
//    @FXML
//    private Label mno16;
//
//    @FXML
//    private JFXTextField nog16;
//
//    @FXML
//    private JFXTextField eff16;
//
//    @FXML
//    private JFXTextField mod16;
//
//    @FXML
//    private JFXTextField unit16;
//
//    @FXML
//    private Label mno17;
//
//    @FXML
//    private JFXTextField nog17;
//
//    @FXML
//    private JFXTextField eff17;
//
//    @FXML
//    private JFXTextField mod17;
//
//    @FXML
//    private JFXTextField unit17;
//
//    @FXML
//    private Label mno18;
//
//    @FXML
//    private JFXTextField nog18;
//
//    @FXML
//    private JFXTextField eff18;
//
//    @FXML
//    private JFXTextField mod18;
//
//    @FXML
//    private JFXTextField unit18;
//
//    @FXML
//    private Label mno19;
//
//    @FXML
//    private JFXTextField nog19;
//
//    @FXML
//    private JFXTextField eff19;
//
//    @FXML
//    private JFXTextField mod19;
//
//    @FXML
//    private JFXTextField unit19;
//
//    @FXML
//    private Label mno110;
//
//    @FXML
//    private JFXTextField nog110;
//
//    @FXML
//    private JFXTextField eff110;
//
//    @FXML
//    private JFXTextField mod110;
//
//    @FXML
//    private JFXTextField unit110;
//
//    @FXML
//    private Label mno111;
//
//    @FXML
//    private JFXTextField nog111;
//
//    @FXML
//    private JFXTextField eff111;
//
//    @FXML
//    private JFXTextField mod111;
//
//    @FXML
//    private JFXTextField unit111;
//
//    @FXML
//    private Label mno112;
//
//    @FXML
//    private JFXTextField nog112;
//
//    @FXML
//    private JFXTextField eff112;
//
//    @FXML
//    private JFXTextField mod112;
//
//    @FXML
//    private JFXTextField unit112;
//
//    @FXML
//    private Label mno113;
//
//    @FXML
//    private JFXTextField nog113;
//
//    @FXML
//    private JFXTextField eff113;
//
//    @FXML
//    private JFXTextField mod113;
//
//    @FXML
//    private JFXTextField unit113;
//
//    @FXML
//    private Label mno114;
//
//    @FXML
//    private JFXTextField nog114;
//
//    @FXML
//    private JFXTextField eff114;
//
//    @FXML
//    private JFXTextField mod114;
//
//    @FXML
//    private JFXTextField unit114;
//
//    @FXML
//    private Label mno115;
//
//    @FXML
//    private JFXTextField nog115;
//
//    @FXML
//    private JFXTextField eff115;
//
//    @FXML
//    private JFXTextField mod115;
//
//    @FXML
//    private JFXTextField unit115;
//
//    @FXML
//    private Label mno116;
//
//    @FXML
//    private JFXTextField nog116;
//
//    @FXML
//    private JFXTextField eff116;
//
//    @FXML
//    private JFXTextField mod116;
//
//    @FXML
//    private JFXTextField unit116;
//
//    @FXML
//    private Label mno117;
//    
//    @FXML
//    private Label launchdate;
//
//    @FXML
//    private JFXTextField nog117;
//
//    @FXML
//    private JFXTextField eff117;
//
//    @FXML
//    private JFXTextField mod117;
//
//    @FXML
//    private JFXTextField unit117;
//    
//    
//    @FXML
//    private JFXTextField nog118;
//
//    @FXML
//    private JFXTextField eff118;
//
//    @FXML
//    private JFXTextField mod118;
//
//    @FXML
//    private JFXTextField unit118;
//
//    @FXML
//    private Label mno118;
//    
//    
//    
//    @FXML
//    private JFXTextField nog119;
//
//    @FXML
//    private JFXTextField eff119;
//
//    @FXML
//    private JFXTextField mod119;
//
//    @FXML
//    private JFXTextField unit119;
//
//    @FXML
//    private Label mno119;
//    
//    
//    @FXML
//    private JFXTextField nog120;
//
//    @FXML
//    private JFXTextField eff120;
//
//    @FXML
//    private JFXTextField mod120;
//
//    @FXML
//    private JFXTextField unit120;
//
//    @FXML
//    private Label mno120;
//    
//    
//    @FXML
//    private JFXTextField nog121;
//
//    @FXML
//    private JFXTextField eff121;
//
//    @FXML
//    private JFXTextField mod121;
//
//    @FXML
//    private JFXTextField unit121;
//
//    @FXML
//    private Label mno121;
//    
//    ////////////////////////////////
//    @FXML
//    private JFXTextField nog122;
//
//    @FXML
//    private JFXTextField eff122;
//
//    @FXML
//    private JFXTextField mod122;
//
//    @FXML
//    private JFXTextField unit122;
//
//    @FXML
//    private Label mno122;
//    
//    ////////////////////////////////
//    
//    @FXML
//    private JFXTextField nog123;
//
//    @FXML
//    private JFXTextField eff123;
//
//    @FXML
//    private JFXTextField mod123;
//
//    @FXML
//    private JFXTextField unit123;
//
//    @FXML
//    private Label mno123;
//    
//    ////////////////////////////////
//    
//    @FXML
//    private JFXTextField nog124;
//
//    @FXML
//    private JFXTextField eff124;
//
//    @FXML
//    private JFXTextField mod124;
//
//    @FXML
//    private JFXTextField unit124;
//
//    @FXML
//    private Label mno124;
//    
//    
//    
//    
//    
//    
//    
//    
//    @FXML
//    private StackPane zeros;
//    
//    @FXML
//    private VBox vboxpane1;
//    
//    @FXML
//    private VBox vboxpane2;
//    
//    @FXML
//    private VBox vboxpane3;
//    
//    @FXML
//    private VBox vboxpane4;
//    
//    @FXML
//    private VBox vboxpane5;
//    
//    @FXML
//    private VBox vboxpane6;
//    
//    @FXML
//    private VBox vboxpane7;
//    
//    @FXML
//    private VBox vboxpane8;
//    
//    @FXML
//    private VBox vboxpane9;
//    
//    @FXML
//    private VBox vboxpane10;
//    
//    @FXML
//    private VBox vboxpane11;
//    
//    @FXML
//    private VBox vboxpane12;
//    
//    @FXML
//    private VBox vboxpane13;
//    
//    @FXML
//    private VBox vboxpane14;
//    
//    @FXML
//    private VBox vboxpane15;
//    
//    @FXML
//    private VBox vboxpane16;
//    
//    @FXML
//    private VBox vboxpane17;
//    
//    @FXML
//    private VBox vboxpane18;
//    
//    @FXML
//    private VBox vboxpane19;
//    
//    @FXML
//    private VBox vboxpane20;
//    
//    @FXML
//    private VBox vboxpane21;
//    
//    @FXML
//    private VBox vboxpane22;
//    
//    @FXML
//    private VBox vboxpane23;
//    
//    @FXML
//    private VBox vboxpane24;
//    
//    @FXML
//    private VBox vboxpane25;
//    
//   @FXML
//    private JFXTextArea areatoupdate,readwrite;
//   
//   
//    @FXML
//    private Rectangle rectangle;
//    
//  //  public static BufferedReader buffr;
//    
//    @FXML
//    private WebView newsssss;
//    
//   
//   
//    @FXML
//    private Pane refresh1,refresh11,refresh12,refresh13,refresh14,refresh15,refresh16,refresh17,refresh18,refresh19,
//            refresh110,refresh111,refresh112,refresh113,refresh114,refresh115,refresh116,refresh117,refresh118,refresh119,refresh120,refresh121,refresh122,refresh123,refresh124; 
//    
//    
//    
//    public  int summe1=0;
//    public  int summe2=0;
//    public  int summe3=0;
//    public  int summe4=0;
//    public  int summe5=0;
//    public  int summe6=0;
//    public  int summe7=0;
//    public  int summe8=0;
//    public  int summe9=0;
//    public  int summe10=0;
//    public  int summe11=0;
//    public  int summe12=0;
//    public  int summe13=0;
//    public  int summe14=0;
//    public  int summe15=0;
//    public  int summe16=0;
//    public  int summe17=0;
//    public  int summe18=0;
//    public  int summe19=0;
//    public  int summe20=0;
//    public  int summe21=0;
//    public  int summe22=0;
//    public  int summe23=0;
//    public  int summe24=0;
//    public  int summe25=0;
//    
//    
//    
//    public static String summe111;
//    public static String summe222;
//    public static String summe333;
//    public static String summe444;
//    public static String summe555;
//    public static String summe666;
//    public static String summe777;
//    public static String summe888;
//    public static String summe999;
//    public static String summe101010;
//    public static String summe111111;
//    public static String summe121212;
//    public static String summe131313;
//    public static String summe141414;
//    public static String summe151515;
//    public static String summe161616;
//    public static String summe171717;
//    public static String summe181818;
//    public static String summe191919;
//    public static String summe202020;
//    public static String summe212121;
//    public static String summe222222;
//    public static String summe232323;
//    public static String summe242424;
//    public static String summe252525;
//    
//    
//    
//    
//   // public String unitoo1,modeloo1,timeoo1;
//    
//    
//    
//    public int workingmachinesno=0;
//    
//    public static String poth;
//    
//    
//    
//    private Label timerLabelll;
//    private LocalTime timeRemaininggg;
//    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("mm:ss");
//    private Timeline timelineee;
//    
//    public static int mmm1y,mmm2y,minutttey,secondddey;
//    
// 
//    @FXML
//    private JFXTextField workmach;
//           
//   
//    @FXML
//    void helpaction(ActionEvent event) throws IOException {
//        
//    Stage stg = new Stage();
//    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Help.fxml"));
//    Scene sce = new Scene(root);
//    stg.setTitle("Help");
//    stg.setResizable(false);
//    stg.setScene(sce);
//    stg.centerOnScreen();
//    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
//    stg.show();
//        
//    }
//    
//    @FXML
//    void aboutaction(ActionEvent event) throws IOException {
//        
//    Stage stg = new Stage();
//    Parent root = FXMLLoader.<Parent>load(getClass().getResource("About.fxml"));
//    Scene sce = new Scene(root);
//    stg.setTitle("About");
//    stg.setResizable(false);
//    stg.setScene(sce);
//    stg.centerOnScreen();
//    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
//    stg.show();
//        
//    }
//    
//    @FXML
//    void exitaction(ActionEvent event) throws IOException {
//        
//        Platform.exit();
//        
//    }
//    
//    @FXML
//    void newshiftaction(ActionEvent event) throws IOException {
//        
//        
//      File godel=new File (System.getProperty("user.home")+"\\Laser_Daily_Production");   
//       
//      FileUtils.deleteDirectory(godel);
//      
//      File hn=new File (System.getProperty("user.home")+"\\Laser_Shifts");
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
//               pca.print(unit1.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               
//               PrintWriter pca=new PrintWriter (new FileWriter (cx1));
//               pca.print(unit1.getText());
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
//               pca.print(unit11.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx2));
//               pca.print(unit11.getText());
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
//               pca.print(unit12.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx3));
//               pca.print(unit12.getText());
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
//               pca.print(unit13.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx4));
//               pca.print(unit13.getText());
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
//               pca.print(unit14.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx5));
//               pca.print(unit14.getText());
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
//               pca.print(unit15.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx6));
//               pca.print(unit15.getText());
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
//               pca.print(unit16.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx7));
//               pca.print(unit16.getText());
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
//               pca.print(unit17.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx8));
//               pca.print(unit17.getText());
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
//               pca.print(unit18.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx9));
//               pca.print(unit18.getText());
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
//               pca.print(unit19.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx10));
//               pca.print(unit19.getText());
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
//               pca.print(unit110.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx11));
//               pca.print(unit110.getText());
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
//               pca.print(unit111.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx12));
//               pca.print(unit111.getText());
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
//               pca.print(unit112.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx13));
//               pca.print(unit112.getText());
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
//               pca.print(unit113.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx14));
//               pca.print(unit113.getText());
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
//               pca.print(unit114.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx15));
//               pca.print(unit114.getText());
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
//               pca.print(unit115.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx16));
//               pca.print(unit115.getText());
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
//               pca.print(unit116.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx17));
//               pca.print(unit116.getText());
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
//               pca.print(unit117.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx18));
//               pca.print(unit117.getText());
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
//               pca.print(unit118.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx19));
//               pca.print(unit118.getText());
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
//               pca.print(unit119.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx20));
//               pca.print(unit119.getText());
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           
//           ///////////////////////////////////
//           File cx21=new File (hn+"\\summe21.txt");
//           if (!cx21.exists()) {
//               cx21.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
//               pca.print(unit120.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
//               pca.print(unit120.getText());
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           
//           ///////////////////////////////////
//           File cx22=new File (hn+"\\summe22.txt");
//           if (!cx22.exists()) {
//               cx22.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
//               pca.print(unit121.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
//               pca.print(unit121.getText());
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx23=new File (hn+"\\summe23.txt");
//           if (!cx23.exists()) {
//               cx23.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx23));
//               pca.print(unit122.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx23));
//               pca.print(unit122.getText());
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx24=new File (hn+"\\summe24.txt");
//           if (!cx24.exists()) {
//               cx24.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx24));
//               pca.print(unit123.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx24));
//               pca.print(unit123.getText());
//               pca.close();
//               
//           }
//           ///////////////////////////////////
//           File cx25=new File (hn+"\\summe25.txt");
//           if (!cx25.exists()) {
//               cx25.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx25));
//               pca.print(unit124.getText());
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx25));
//               pca.print(unit124.getText());
//               pca.close();
//               
//           }
//           
//         
//    }
//    
//    @FXML
//    void zerosaction(ActionEvent event) throws IOException {
//        
//        
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
//           //////////////////////////////////////
//           ///////////////////////////////////
//           File cx21=new File (hn+"\\summe21.txt");
//           if (!cx21.exists()) {
//               cx21.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx21));
//               pca.print("0");
//               pca.close();
//               
//           }
//           //////////////////////////////////////
//           ///////////////////////////////////
//           File cx22=new File (hn+"\\summe22.txt");
//           if (!cx22.exists()) {
//               cx22.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx22));
//               pca.print("0");
//               pca.close();
//               
//           }
//           //////////////////////////////////////
//           ///////////////////////////////////
//           File cx23=new File (hn+"\\summe23.txt");
//           if (!cx23.exists()) {
//               cx23.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx23));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx23));
//               pca.print("0");
//               pca.close();
//               
//           }
//           //////////////////////////////////////
//           ///////////////////////////////////
//           File cx24=new File (hn+"\\summe24.txt");
//           if (!cx24.exists()) {
//               cx24.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx24));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx24));
//               pca.print("0");
//               pca.close();
//               
//           }
//           //////////////////////////////////////
//           ///////////////////////////////////
//           File cx25=new File (hn+"\\summe25.txt");
//           if (!cx25.exists()) {
//               cx25.createNewFile();
//               
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx25));
//               pca.print("0");
//               pca.close();
//           }
//           else {
//               //Do something
//               PrintWriter pca=new PrintWriter (new FileWriter (cx25));
//               pca.print("0");
//               pca.close();
//               
//           }
//           //////////////////////////////////////
//           
//           }
//           
//           catch (Exception m) {
//               
//           }
//   
//        
//    }
//    
//    
//    ////////////////////////////////////////////Machine Hacker/////////////////////////////////////////////////////////
//    
//    
//    @FXML
//    void viewerhackeraction1(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane1.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//        
//    }
//        
//    
//    @FXML
//    void viewerhackeraction2(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane2.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction3(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane3.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction4(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane4.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction5(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane5.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction6(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane6.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction7(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane7.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction8(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane8.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction9(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane9.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction10(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane10.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction11(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane11.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    ///////////////////////////////
//    
//    @FXML
//    void viewerhackeraction12(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane12.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction13(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane13.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction14(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane14.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction15(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane15.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction16(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane16.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction17(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane17.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction18(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane18.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction19(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane19.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction20(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane20.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    
//    @FXML
//    void viewerhackeraction21(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane21.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction22(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane22.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction23(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane23.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction24(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane24.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    @FXML
//    void viewerhackeraction25(MouseEvent event) throws IOException, InterruptedException  {
//       String ido=vboxpane25.getId();
//       String nummy=ido.replace("vboxpane","");
//       BufferedReader za=new BufferedReader (new FileReader ("Machines_Conn_Data\\info"+nummy+".kady"));
//       String ippa=za.readLine().toString();
//       String porte=za.readLine().toString();
//       za.close();
//       PrintWriter psa=new PrintWriter (new FileWriter ("viewer.conf"));
//       psa.print("#kadinio viewer configuration file\n" +
//"#Thu May 09 07:54:53 EET 2024\n" +
//"default-address=false\n" +
//"multihomed-enabled=false\n" +
//"server-address="+ippa+"\n" +
//"username=kady\n" +
//"ssl-enabled=false\n" +
//"server-port="+porte+"\n" +
//"reverse-connection=false\n" +
//"password=YQKQgI26amA\\=\n" +
//"http-port=6666");
//        psa.close();  
//        Thread.sleep(1000);
//        jrdesktop.viewer.ConnectionDialog ui=new jrdesktop.viewer.ConnectionDialog ();
//        ui.setVisible(true);
//    }
//    
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    
//
//   @FXML
//void refreshaction(ActionEvent event) throws InterruptedException, SQLException {
//    
//  
//        
//        
//  
//    
//   
//      //  new Thread(() -> {
//            
//    Task<Void> task = new Task<Void>() {
//    @Override
//    protected Void call() {
//           
//            Platform.runLater(() -> {
//                
//           try {
//            
//            workingmachinesno = 0;
//            refresh1.setStyle("-fx-background-color:green;");
//            
//            //Run Audio Here
//            ///////////////////////////////////////////////
//            
////            String alertSound = "/message.mp3";
////            Media sound = new Media(new File(alertSound).toURI().toString());
////            MediaPlayer mediaPlayer = new MediaPlayer(sound);
////            mediaPlayer.play();
//            
//try {
//    
//AudioClip fz=new AudioClip (getClass().getResource("message.mp3").toExternalForm());
//fz.play();
//
//    
//} catch (Exception e) {
//    e.printStackTrace();
//}          
//
//
//
////            
////            String alertSound = "message.mp3"; // Replace with your actual sound file path
////try {
////    File soundFile = new File(alertSound);
////    if (soundFile.exists()) {
////        Media sound = new Media(alertSound);
////        MediaPlayer mediaPlayer = new MediaPlayer(sound);
////        mediaPlayer.play();
////    } else {
////        System.out.println("Sound file not found at: " + alertSound);
////    }
////} catch (Exception e) {
////    e.printStackTrace();
////}
//            
//            ///////////////////////////////////////////////
//            
//            // Machine 1
//            String machine_number1 = "1";
//            File lkg1 = new File(poth + "\\Machine1.kady");
//            if (lkg1.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg1))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno1.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod1.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit1.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod1.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit1.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine1.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine1.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine1.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine1.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine1.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe1.txt"))) {
//                        summe1 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine1.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog1.setText(Integer.toString(sum - summe1));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane1.setStyle("-fx-background-color:orange;");
//                        eff1.setText("0%");
//                    } else {
//                        vboxpane1.setStyle("-fx-background-color:transparent;");
//                        
//                        
//                               
////          long lasetime=Long.parseLong(v7);
////          long unito=Long.parseLong(v6);
////          if (unito==0) {
////              unito=unito+1;
////          } 
////            
////          else {
////              
////          }
////          long unita=unito*1000;
////          double onegarmenttakes=lasetime/unita;
////          if (onegarmenttakes>0&&onegarmenttakes<=30) {
////              double newonegarmenttakes=onegarmenttakes+3;
////              double p1=onegarmenttakes*100;
////              double p2=p1/newonegarmenttakes;
////              int percentago=(int)p2;
////              eff1.setText(Integer.toString(percentago)+"%");
////          }
////          else if (onegarmenttakes>30&&onegarmenttakes<=50) {
////              double newonegarmenttakes=onegarmenttakes+5;
////              double p1=onegarmenttakes*100;
////              double p2=p1/newonegarmenttakes;
////              int percentago=(int)p2;
////              eff1.setText(Integer.toString(percentago)+"%");
////          }
////          else if (onegarmenttakes>50) {
////              double newonegarmenttakes=onegarmenttakes+7;
////              double p1=onegarmenttakes*100;
////              double p2=p1/newonegarmenttakes;
////              int percentago=(int)p2;
////              eff1.setText(Integer.toString(percentago)+"%");
////          }
////          else {
////              eff1.setText("N/A");
////          }
//                        
//                        
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff1.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg1.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                
//                vboxpane1.setStyle("-fx-background-color:transparent;");
//                mno1.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno1.setText("Machine   " + machine_number1);
//                nog1.setText("0");
//                eff1.setText("0%");
//                mod1.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod1.setText("Machine isn't working");
//                unit1.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit1.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh1.setStyle("-fx-background-color:transparent;");
//            refresh11.setStyle("-fx-background-color:green;");
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 2
//            String machine_number2 = "2";
//            File lkg2 = new File(poth + "\\Machine2.kady");
//            if (lkg2.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg2))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno11.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod11.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit11.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod11.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit11.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine2.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine2.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine2.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine2.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine2.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe2.txt"))) {
//                        summe2 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine2.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog11.setText(Integer.toString(sum - summe2));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane2.setStyle("-fx-background-color:orange;");
//                        eff11.setText("0%");
//                    } else {
//                        vboxpane2.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff11.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane2.setStyle("-fx-background-color:transparent;");
//                mno11.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno11.setText("Machine   " + machine_number2);
//                nog11.setText("0");
//                eff11.setText("0%");
//                mod11.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod11.setText("Machine isn't working");
//                unit11.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit11.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh11.setStyle("-fx-background-color:transparent;");
//            refresh12.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 3
//            String machine_number3 = "3";
//            File lkg3 = new File(poth + "\\Machine3.kady");
//            if (lkg3.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg3))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno12.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod12.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit12.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod12.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit12.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine3.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine3.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine3.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine3.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine3.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe3.txt"))) {
//                        summe3 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine3.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog12.setText(Integer.toString(sum - summe3));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane3.setStyle("-fx-background-color:orange;");
//                        eff12.setText("0%");
//                    } else {
//                        vboxpane3.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff12.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane3.setStyle("-fx-background-color:transparent;");
//                mno12.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno12.setText("Machine   " + machine_number3);
//                nog12.setText("0");
//                eff12.setText("0%");
//                mod12.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod12.setText("Machine isn't working");
//                unit12.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit12.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh12.setStyle("-fx-background-color:transparent;");
//            refresh13.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 4
//            String machine_number4 = "4";
//            File lkg4 = new File(poth + "\\Machine4.kady");
//            if (lkg4.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg4))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno13.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod13.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit13.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod13.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit13.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine4.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine4.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine4.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine4.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine2.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe4.txt"))) {
//                        summe4 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine4.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog13.setText(Integer.toString(sum - summe4));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane4.setStyle("-fx-background-color:orange;");
//                        eff13.setText("0%");
//                    } else {
//                        vboxpane4.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff13.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane4.setStyle("-fx-background-color:transparent;");
//                mno13.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno13.setText("Machine   " + machine_number4);
//                nog13.setText("0");
//                eff13.setText("0%");
//                mod13.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod13.setText("Machine isn't working");
//                unit13.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit13.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh13.setStyle("-fx-background-color:transparent;");
//            refresh14.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 5
//            String machine_number5 = "5";
//            File lkg5 = new File(poth + "\\Machine5.kady");
//            if (lkg5.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg5))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno14.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod14.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit14.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod14.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit14.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine5.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine5.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine5.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine5.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine5.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe5.txt"))) {
//                        summe5 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine5.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog14.setText(Integer.toString(sum - summe5));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane5.setStyle("-fx-background-color:orange;");
//                        eff14.setText("0%");
//                    } else {
//                        vboxpane5.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff14.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane5.setStyle("-fx-background-color:transparent;");
//                mno14.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno14.setText("Machine   " + machine_number5);
//                nog14.setText("0");
//                eff14.setText("0%");
//                mod14.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod14.setText("Machine isn't working");
//                unit14.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit14.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh14.setStyle("-fx-background-color:transparent;");
//            refresh15.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 6
//            String machine_number6 = "6";
//            File lkg6 = new File(poth + "\\Machine6.kady");
//            if (lkg6.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg6))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno15.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod15.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit15.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod15.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit15.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine6.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine6.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine6.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine6.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine6.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe6.txt"))) {
//                        summe6 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine6.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog15.setText(Integer.toString(sum - summe6));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane6.setStyle("-fx-background-color:orange;");
//                        eff15.setText("0%");
//                    } else {
//                        vboxpane6.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff15.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane6.setStyle("-fx-background-color:transparent;");
//                mno15.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno15.setText("Machine   " + machine_number6);
//                nog15.setText("0");
//                eff15.setText("0%");
//                mod15.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod15.setText("Machine isn't working");
//                unit15.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit15.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh15.setStyle("-fx-background-color:transparent;");
//            refresh16.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 7
//            String machine_number7 = "7";
//            File lkg7 = new File(poth + "\\Machine7.kady");
//            if (lkg7.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg7))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno16.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod16.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit16.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod16.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit16.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine7.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine7.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine7.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine7.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine7.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe7.txt"))) {
//                        summe7 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine7.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog16.setText(Integer.toString(sum - summe7));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane7.setStyle("-fx-background-color:orange;");
//                        eff16.setText("0%");
//                    } else {
//                        vboxpane7.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff11.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane7.setStyle("-fx-background-color:transparent;");
//                mno16.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno16.setText("Machine   " + machine_number7);
//                nog16.setText("0");
//                eff16.setText("0%");
//                mod16.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod16.setText("Machine isn't working");
//                unit16.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit16.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh16.setStyle("-fx-background-color:transparent;");
//            refresh17.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 8
//            String machine_number8 = "8";
//            File lkg8 = new File(poth + "\\Machine8.kady");
//            if (lkg8.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg8))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno17.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod17.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit17.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod17.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit17.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine8.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine8.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine8.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine8.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine8.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe8.txt"))) {
//                        summe8 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine8.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog17.setText(Integer.toString(sum - summe8));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane8.setStyle("-fx-background-color:orange;");
//                        eff17.setText("0%");
//                        
//                    } else {
//                        vboxpane8.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff17.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane8.setStyle("-fx-background-color:transparent;");
//                mno17.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno17.setText("Machine   " + machine_number8);
//                nog17.setText("0");
//                eff17.setText("0%");
//                mod17.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod17.setText("Machine isn't working");
//                unit17.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit17.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh17.setStyle("-fx-background-color:transparent;");
//            refresh18.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 9
//            String machine_number9 = "9";
//            File lkg9 = new File(poth + "\\Machine9.kady");
//            if (lkg9.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg9))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno18.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod18.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit18.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod18.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit18.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine9.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine9.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine9.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine9.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine9.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe9.txt"))) {
//                        summe9 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine9.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog18.setText(Integer.toString(sum - summe9));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane9.setStyle("-fx-background-color:orange;");
//                        eff18.setText("0%");
//                    } else {
//                        vboxpane9.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff18.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane9.setStyle("-fx-background-color:transparent;");
//                mno18.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno18.setText("Machine   " + machine_number9);
//                nog18.setText("0");
//                eff18.setText("0%");
//                mod18.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod18.setText("Machine isn't working");
//                unit18.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit18.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh18.setStyle("-fx-background-color:transparent;");
//            refresh19.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 10
//            String machine_number10 = "10";
//            File lkg10 = new File(poth + "\\Machine10.kady");
//            if (lkg10.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg10))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno19.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod19.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit19.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod19.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit19.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine10.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine10.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine10.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine10.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine10.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe10.txt"))) {
//                        summe10 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine10.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog19.setText(Integer.toString(sum - summe10));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane10.setStyle("-fx-background-color:orange;");
//                        eff19.setText("0%");
//                    } else {
//                        vboxpane10.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff19.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane10.setStyle("-fx-background-color:transparent;");
//                mno19.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno19.setText("Machine   " + machine_number10);
//                nog19.setText("0");
//                eff19.setText("0%");
//                mod19.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod19.setText("Machine isn't working");
//                unit19.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit19.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh19.setStyle("-fx-background-color:transparent;");
//            refresh110.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 11
//            String machine_number11 = "11";
//            File lkg11 = new File(poth + "\\Machine11.kady");
//            if (lkg11.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg11))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno110.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod110.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit110.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod110.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit110.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine11.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine11.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine11.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine11.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine11.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe11.txt"))) {
//                        summe11 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine11.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog110.setText(Integer.toString(sum - summe11));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane11.setStyle("-fx-background-color:orange;");
//                        eff110.setText("0%");
//                    } else {
//                        vboxpane11.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff110.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane11.setStyle("-fx-background-color:transparent;");
//                mno110.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno110.setText("Machine   " + machine_number11);
//                nog110.setText("0");
//                eff110.setText("0%");
//                mod110.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod110.setText("Machine isn't working");
//                unit110.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit110.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh110.setStyle("-fx-background-color:transparent;");
//            refresh111.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 12
//            String machine_number12 = "12";
//            File lkg12 = new File(poth + "\\Machine12.kady");
//            if (lkg12.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg12))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno111.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod111.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit111.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod111.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit111.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine12.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine12.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine12.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine12.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine12.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe12.txt"))) {
//                        summe12 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine12.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog111.setText(Integer.toString(sum - summe12));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane12.setStyle("-fx-background-color:orange;");
//                        eff111.setText("0%");
//                    } else {
//                        vboxpane12.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff111.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane12.setStyle("-fx-background-color:transparent;");
//                mno111.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno111.setText("Machine   " + machine_number12);
//                nog111.setText("0");
//                eff111.setText("0%");
//                mod111.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod111.setText("Machine isn't working");
//                unit111.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit111.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh111.setStyle("-fx-background-color:transparent;");
//            refresh112.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 13
//            String machine_number13 = "13";
//            File lkg13 = new File(poth + "\\Machine13.kady");
//            if (lkg13.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg13))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno112.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod112.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit112.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod112.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit112.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine2.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine13.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine13.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine13.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine13.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe13.txt"))) {
//                        summe13 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine13.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog112.setText(Integer.toString(sum - summe13));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane13.setStyle("-fx-background-color:orange;");
//                        eff112.setText("0%");
//                    } else {
//                        vboxpane13.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff112.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                
//                vboxpane13.setStyle("-fx-background-color:transparent;");
//                mno112.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno112.setText("Machine   " + machine_number13);
//                nog112.setText("0");
//                eff112.setText("0%");
//                mod112.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod112.setText("Machine isn't working");
//                unit112.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit112.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh112.setStyle("-fx-background-color:transparent;");
//            refresh113.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 14
//            String machine_number14 = "14";
//            File lkg14 = new File(poth + "\\Machine14.kady");
//            if (lkg14.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg14))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno113.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod113.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit113.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod113.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit113.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine14.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine14.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine14.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine14.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine14.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe14.txt"))) {
//                        summe14 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine14.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog113.setText(Integer.toString(sum - summe14));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane14.setStyle("-fx-background-color:orange;");
//                        eff113.setText("0%");
//                    } else {
//                        vboxpane14.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff113.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane14.setStyle("-fx-background-color:transparent;");
//                mno113.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno113.setText("Machine   " + machine_number14);
//                nog113.setText("0");
//                eff113.setText("0%");
//                mod113.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod113.setText("Machine isn't working");
//                unit113.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit113.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh113.setStyle("-fx-background-color:transparent;");
//            refresh114.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 15
//            String machine_number15 = "15";
//            File lkg15 = new File(poth + "\\Machine15.kady");
//            if (lkg15.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg15))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno114.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod114.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit114.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod114.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit114.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine15.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine15.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine15.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine15.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine15.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe15.txt"))) {
//                        summe15 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine15.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog114.setText(Integer.toString(sum - summe15));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane15.setStyle("-fx-background-color:orange;");
//                        eff114.setText("0%");
//                    } else {
//                        vboxpane15.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff114.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane15.setStyle("-fx-background-color:transparent;");
//                mno114.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno114.setText("Machine   " + machine_number15);
//                nog114.setText("0");
//                eff114.setText("0%");
//                mod114.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod114.setText("Machine isn't working");
//                unit114.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit114.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh114.setStyle("-fx-background-color:transparent;");
//            refresh115.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 16
//            String machine_number16 = "16";
//            File lkg16 = new File(poth + "\\Machine16.kady");
//            if (lkg16.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg16))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno115.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod115.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit115.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod115.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit115.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine16.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine16.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine16.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine16.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine16.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe16.txt"))) {
//                        summe16 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine16.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog115.setText(Integer.toString(sum - summe16));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane16.setStyle("-fx-background-color:orange;");
//                        eff115.setText("0%");
//                    } else {
//                        vboxpane15.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff115.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane16.setStyle("-fx-background-color:transparent;");
//                mno115.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno115.setText("Machine   " + machine_number16);
//                nog115.setText("0");
//                eff115.setText("0%");
//                mod115.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod115.setText("Machine isn't working");
//                unit115.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit115.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh115.setStyle("-fx-background-color:transparent;");
//            refresh116.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 17
//            String machine_number17 = "17";
//            File lkg17 = new File(poth + "\\Machine17.kady");
//            if (lkg17.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg17))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno116.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod116.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit116.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod116.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit116.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine17.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine17.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine17.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine17.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine17.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe17.txt"))) {
//                        summe17 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine17.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog116.setText(Integer.toString(sum - summe17));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane17.setStyle("-fx-background-color:orange;");
//                        eff116.setText("0%");
//                    } else {
//                        vboxpane17.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff116.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane17.setStyle("-fx-background-color:transparent;");
//                mno116.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno116.setText("Machine   " + machine_number17);
//                nog116.setText("0");
//                eff116.setText("0%");
//                mod116.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod116.setText("Machine isn't working");
//                unit116.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit116.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh116.setStyle("-fx-background-color:transparent;");
//            refresh117.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 18
//            String machine_number18 = "18";
//            File lkg18 = new File(poth + "\\Machine18.kady");
//            if (lkg18.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg18))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno117.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod117.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit117.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod117.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit117.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine18.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine18.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine18.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine18.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine18.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe18.txt"))) {
//                        summe18 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine18.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog117.setText(Integer.toString(sum - summe18));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane18.setStyle("-fx-background-color:orange;");
//                        eff117.setText("0%");
//                    } else {
//                        vboxpane18.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff117.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane18.setStyle("-fx-background-color:transparent;");
//                mno117.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno117.setText("Machine   " + machine_number18);
//                nog117.setText("0");
//                eff117.setText("0%");
//                mod117.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod117.setText("Machine isn't working");
//                unit117.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit117.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh117.setStyle("-fx-background-color:transparent;");
//            refresh118.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 19
//            String machine_number19 = "19";
//            File lkg19 = new File(poth + "\\Machine19.kady");
//            if (lkg19.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg19))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno118.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod118.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit118.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod118.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit118.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine19.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine19.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine19.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine19.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine19.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe19.txt"))) {
//                        summe19 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine19.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog118.setText(Integer.toString(sum - summe19));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane19.setStyle("-fx-background-color:orange;");
//                        eff118.setText("0%");
//                    } else {
//                        vboxpane19.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff118.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane19.setStyle("-fx-background-color:transparent;");
//                mno118.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno118.setText("Machine   " + machine_number19);
//                nog118.setText("0");
//                eff118.setText("0%");
//                mod118.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod118.setText("Machine isn't working");
//                unit118.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit118.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh118.setStyle("-fx-background-color:transparent;");
//            refresh119.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 20
//            String machine_number20 = "20";
//            File lkg20 = new File(poth + "\\Machine20.kady");
//            if (lkg20.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg20))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno119.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod119.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit119.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod119.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit119.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine20.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine20.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine20.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine20.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine20.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe20.txt"))) {
//                        summe20 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine20.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog119.setText(Integer.toString(sum - summe20));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane20.setStyle("-fx-background-color:orange;");
//                        eff119.setText("0%");
//                    } else {
//                        vboxpane20.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff119.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane20.setStyle("-fx-background-color:transparent;");
//                mno119.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno119.setText("Machine   " + machine_number20);
//                nog119.setText("0");
//                eff119.setText("0%");
//                mod119.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod119.setText("Machine isn't working");
//                unit119.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit119.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh119.setStyle("-fx-background-color:transparent;");
//            refresh120.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 21
//            String machine_number21 = "21";
//            File lkg21 = new File(poth + "\\Machine21.kady");
//            if (lkg21.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg2))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno120.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod120.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit120.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod120.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit120.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine21.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine21.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine21.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine21.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine21.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe21.txt"))) {
//                        summe21 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine21.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog120.setText(Integer.toString(sum - summe21));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane21.setStyle("-fx-background-color:orange;");
//                        eff120.setText("0%");
//                    } else {
//                        vboxpane21.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff120.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane21.setStyle("-fx-background-color:transparent;");
//                mno120.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno120.setText("Machine   " + machine_number21);
//                nog120.setText("0");
//                eff120.setText("0%");
//                mod120.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod120.setText("Machine isn't working");
//                unit120.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit120.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh120.setStyle("-fx-background-color:transparent;");
//            refresh121.setStyle("-fx-background-color:green;");
//        
//        
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 22
//            String machine_number22 = "22";
//            File lkg22 = new File(poth + "\\Machine22.kady");
//            if (lkg22.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg22))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno121.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod121.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit121.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod121.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit121.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine22.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine22.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine22.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine22.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine22.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe22.txt"))) {
//                        summe22 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine22.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog121.setText(Integer.toString(sum - summe22));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane22.setStyle("-fx-background-color:orange;");
//                        eff121.setText("0%");
//                    } else {
//                        vboxpane22.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff121.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane22.setStyle("-fx-background-color:transparent;");
//                mno121.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno121.setText("Machine   " + machine_number22);
//                nog121.setText("0");
//                eff121.setText("0%");
//                mod121.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod121.setText("Machine isn't working");
//                unit121.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit121.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh121.setStyle("-fx-background-color:transparent;");
//            refresh122.setStyle("-fx-background-color:green;");
//        
//        
//             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 23
//            String machine_number23 = "23";
//            File lkg23 = new File(poth + "\\Machine23.kady");
//            if (lkg23.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg23))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno122.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod122.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit122.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod122.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit122.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine23.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine23.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine23.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine23.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine23.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe23.txt"))) {
//                        summe23 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine23.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog122.setText(Integer.toString(sum - summe23));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane23.setStyle("-fx-background-color:orange;");
//                        eff122.setText("0%");
//                    } else {
//                        vboxpane23.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff122.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane23.setStyle("-fx-background-color:transparent;");
//                mno122.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno122.setText("Machine   " + machine_number23);
//                nog122.setText("0");
//                eff122.setText("0%");
//                mod122.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod122.setText("Machine isn't working");
//                unit122.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit122.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh122.setStyle("-fx-background-color:transparent;");
//            refresh123.setStyle("-fx-background-color:green;");
//        
//        
//             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 24
//            String machine_number24 = "24";
//            File lkg24 = new File(poth + "\\Machine24.kady");
//            if (lkg24.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg24))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno123.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod123.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit123.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod123.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit123.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine24.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine24.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine24.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine24.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine24.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe24.txt"))) {
//                        summe24 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine24.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog123.setText(Integer.toString(sum - summe24));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane24.setStyle("-fx-background-color:orange;");
//                        eff123.setText("0%");
//                    } else {
//                        vboxpane24.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff123.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane24.setStyle("-fx-background-color:transparent;");
//                mno123.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno123.setText("Machine   " + machine_number24);
//                nog123.setText("0");
//                eff123.setText("0%");
//                mod123.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod123.setText("Machine isn't working");
//                unit123.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit123.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh123.setStyle("-fx-background-color:transparent;");
//            refresh124.setStyle("-fx-background-color:green;");
//        
//        
//             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//            // Machine 25
//            String machine_number25 = "25";
//            File lkg25 = new File(poth + "\\Machine25.kady");
//            if (lkg25.exists()) {
//                try (BufferedReader buffr = new BufferedReader(new FileReader(lkg25))) {
//                    String v1 = buffr.readLine().replace("Number=", "");
//                    String v2 = buffr.readLine().replace("ID=", "");
//                    String v3 = buffr.readLine().replace("Init=", "");
//                    String v4 = buffr.readLine().replace("End=", "");
//                    String v5 = buffr.readLine().replace("Model=", "");
//                    String v6 = buffr.readLine().replace("Unit=", "");
//                    String v7 = buffr.readLine().replace("Laser_Time=", "");
//
//                    mno124.setStyle("-fx-font-weight:bold; -fx-background-color:#93d7f3; -fx-background-radius:1em; -fx-font-size:20;");
//                    mod124.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:20; -fx-text-fill:black;");
//                    unit124.setStyle("-fx-background-color:#00bff3; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//
//                    mod124.setText(v5.replace(".jean5","").replace(".jean",""));
//                    unit124.setText(v6);
//
//                    areatoupdate.clear();
//                    File hn = new File(System.getProperty("user.home") + "\\Laser_Daily_Production");
//                    if (!hn.exists()) hn.mkdirs();
//
//                    File cx = new File(hn + "\\Machine25.txt");
//                    if (!cx.exists()) cx.createNewFile();
//
//                    try (BufferedReader bui = new BufferedReader(new FileReader(cx))) {
//                        String line;
//                        while ((line = bui.readLine()) != null) {
//                            areatoupdate.appendText(line + "   ");
//                        }
//                    }
//
//                    String texttoupdate = areatoupdate.getText().replaceAll("   ", "\n");
//                    String comm = v3 + "/" + v5;
//
//                    if (texttoupdate.contains(comm)) {
//                        String title = StringUtils.substringBetween(texttoupdate, comm + "=", "\n");
//                        String allold = comm + "=" + title;
//                        String allnew = comm + "=" + v6;
//                        String input = texttoupdate.replace(allold, allnew);
//                        try (PrintWriter pnm = new PrintWriter(new FileWriter(hn + "\\Machine25.txt"))) {
//                            pnm.print(input);
//                        }
//                        areatoupdate.clear();
//                    } else {
//                        try {
//                            Path path = Paths.get(hn + "\\Machine25.txt");
//                            Files.write(path, Arrays.asList(v3 + "/" + v5 + "=" + v6), StandardCharsets.UTF_8,
//                                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.WRITE);
//                        } catch (IOException ioe) {
//                            // Handle exception
//                        }
//                    }
//
//                    readwrite.clear();
//                    try (BufferedReader no = new BufferedReader(new FileReader(hn + "\\Machine25.txt"))) {
//                        String lc;
//                        while ((lc = no.readLine()) != null) {
//                            if (!lc.isEmpty()) readwrite.appendText(lc + "\n");
//                        }
//                    }
//
//                    String qw = readwrite.getText();
//                    try (PrintWriter ndk = new PrintWriter(new FileWriter(hn + "\\Machine25.txt"))) {
//                        ndk.print(qw);
//                    }
//
//                    try (BufferedReader wq = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Laser_Shifts\\summe25.txt"))) {
//                        summe25 = Integer.parseInt(wq.readLine());
//                    }
//
//                    try (BufferedReader bd = new BufferedReader(new FileReader(hn + "\\Machine25.txt"))) {
//                        String lop;
//                        int sum = 0;
//                        while ((lop = bd.readLine()) != null) {
//                            if (!lop.isEmpty()) {
//                                String requiredString = lop.substring(lop.indexOf("=") + 1);
//                                int num = Integer.parseInt(requiredString);
//                                sum += num;
//                            }
//                        }
//                        nog124.setText(Integer.toString(sum - summe25));
//                    }
//
//                    long lasetimy = Long.parseLong(v7);
//                    if (lasetimy == 0) {
//                        vboxpane25.setStyle("-fx-background-color:orange;");
//                        eff124.setText("0%");
//                    } else {
//                        vboxpane22.setStyle("-fx-background-color:transparent;");
//                        long lasetime = Long.parseLong(v7);
//                        long unito = Long.parseLong(v6);
//                        if (unito == 0) unito++;
//                        long unita = unito * 1000;
//                        double onegarmenttakes = lasetime / (double) unita;
//
//                        int percentago = calculateEfficiency(onegarmenttakes);
//                        eff124.setText(percentago + "%");
//                    }
//
//                    updateDatabase(v1, v2, v3, v4, v5, v6);
//
//                } catch (IOException ex) {
//                    //lkg2.delete();
//                }
//
//                workingmachinesno++;
//            } else {
//                vboxpane25.setStyle("-fx-background-color:transparent;");
//                mno124.setStyle("-fx-font-weight:bold; -fx-background-color:red; -fx-background-radius:1em; -fx-font-size:20;");
//                mno124.setText("Machine   " + machine_number25);
//                nog124.setText("0");
//                eff124.setText("0%");
//                mod124.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-font-size:23; -fx-text-fill:red;");
//                mod124.setText("Machine isn't working");
//                unit124.setStyle("-fx-background-color:red; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size:30;");
//                unit124.setText("0");
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            refresh124.setStyle("-fx-background-color:transparent;");
//            //refresh12.setStyle("-fx-background-color:green;");
//        
//        
//            
//   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        
//                
//                  
//   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //Continue  
//        
//        
//        int allgary=Integer.parseInt(nog1.getText())+Integer.parseInt(nog11.getText())+Integer.parseInt(nog12.getText())+Integer.parseInt(nog13.getText())+Integer.parseInt(nog14.getText())+Integer.parseInt(nog15.getText())
//        +Integer.parseInt(nog16.getText())+Integer.parseInt(nog17.getText())+Integer.parseInt(nog18.getText())+Integer.parseInt(nog19.getText())+Integer.parseInt(nog110.getText())+Integer.parseInt(nog111.getText()) 
//        +Integer.parseInt(nog112.getText())+Integer.parseInt(nog113.getText())+Integer.parseInt(nog114.getText())+Integer.parseInt(nog115.getText())+Integer.parseInt(nog116.getText())+Integer.parseInt(nog117.getText())
//        +Integer.parseInt(nog120.getText())+Integer.parseInt(nog121.getText())+Integer.parseInt(nog118.getText())+Integer.parseInt(nog119.getText())+Integer.parseInt(nog122.getText())+Integer.parseInt(nog123.getText())+Integer.parseInt(nog124.getText());
//        
//        
//        allgarments.setText(Integer.toString(allgary));
//        
//        
//                int allpery=
//                Integer.parseInt(eff1.getText().replace("%",""))
//                +Integer.parseInt(eff11.getText().replace("%",""))
//                +Integer.parseInt(eff12.getText().replace("%",""))
//                +Integer.parseInt(eff13.getText().replace("%",""))
//                +Integer.parseInt(eff14.getText().replace("%",""))
//                +Integer.parseInt(eff15.getText().replace("%",""))
//                +Integer.parseInt(eff16.getText().replace("%",""))
//                +Integer.parseInt(eff17.getText().replace("%",""))
//                +Integer.parseInt(eff18.getText().replace("%",""))
//                +Integer.parseInt(eff19.getText().replace("%",""))
//                +Integer.parseInt(eff110.getText().replace("%",""))
//                +Integer.parseInt(eff111.getText().replace("%",""))
//                +Integer.parseInt(eff112.getText().replace("%",""))
//                +Integer.parseInt(eff113.getText().replace("%",""))
//                +Integer.parseInt(eff114.getText().replace("%",""))
//                +Integer.parseInt(eff115.getText().replace("%",""))
//                +Integer.parseInt(eff116.getText().replace("%",""))
//                +Integer.parseInt(eff117.getText().replace("%",""))
//                +Integer.parseInt(eff119.getText().replace("%",""))
//                +Integer.parseInt(eff118.getText().replace("%",""))
//                +Integer.parseInt(eff120.getText().replace("%",""))
//                +Integer.parseInt(eff121.getText().replace("%",""))
//                +Integer.parseInt(eff122.getText().replace("%",""))
//                +Integer.parseInt(eff123.getText().replace("%",""))
//                +Integer.parseInt(eff124.getText().replace("%",""));
//                
//        
//
//        if (workingmachinesno==0) {
//        allperformance.setText("N/A");   
//            //Set here the number
//      //  workmach.setText(Integer.toString(workingmachinesno));
//        }
//        else {
//        int newallpery=allpery/(workingmachinesno);
//        allperformance.setText(Integer.toString(newallpery)+" %");
//         
//        }
//        
//        //allperformance.setText("N/A");
//       // allgarments.setText("N/A");
//           //Set here the number
//        workmach.setText(Integer.toString(workingmachinesno));
//      
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//          } catch (Exception m) {
//        refresh.fire();
//        
//      
//        
//        
//    }
//        
//          });
//        
//               return null;
//     }
//};
//new Thread(task).start();
//    
//        
//       // }).start();
//  
//}
//
//
//
//
//
//
//
//private int calculateEfficiency(double onegarmenttakes) {
//    
//    
//    if (onegarmenttakes > 0 && onegarmenttakes <= 30) {
//        double newonegarmenttakes = onegarmenttakes + 3;
//        double p1 = onegarmenttakes * 100;
//        double p2 = p1 / newonegarmenttakes;
//        return (int) p2;
//    } else if (onegarmenttakes > 30 && onegarmenttakes <= 50) {
//        double newonegarmenttakes = onegarmenttakes + 5;
//        double p1 = onegarmenttakes * 100;
//        double p2 = p1 / newonegarmenttakes;
//        return (int) p2;
//    } else if (onegarmenttakes > 50) {
//        double newonegarmenttakes = onegarmenttakes + 7;
//        double p1 = onegarmenttakes * 100;
//        double p2 = p1 / newonegarmenttakes;
//        return (int) p2;
//    } else {
//        return 0;
//    }
//    
//    
//    
//}
//
//
//
//
//
//
//
//
//private void updateDatabase(String num, String idd, String initt, String endd, String modely, String unity) {
//    
//    
//    
//    try {
//        conn_write = db_writer.java_db();
//        String sqlor = "select * from Production where Machine_Number like '" + num + "' and Machine_ID like '" + idd + "' and Init_Date like '" + initt + "' ";
//        pst_write = conn_write.prepareStatement(sqlor);
//        rs_write = pst_write.executeQuery();  
//
//        if (rs_write.next()) {
//            String sql1 = "update Production set Machine_Number='" + num + "', Machine_ID='" + idd + "', Init_Date='" + initt + "', End_Date='" + endd + "', Model='" + modely + "', Unit='" + unity + "' where Machine_Number='" + num + "' and Machine_ID='" + idd + "' and Init_Date='" + initt + "' ";
//            pst_write = conn_write.prepareStatement(sql1);
//            pst_write.execute();
//        } else {
//            String sql2s = "insert into Production (Machine_Number, Machine_ID, Init_Date, End_Date, Model, Unit) values (?,?,?,?,?,?)";
//            pst_write = conn_write.prepareStatement(sql2s);
//            pst_write.setString(1, num);
//            pst_write.setString(2, idd);
//            pst_write.setString(3, initt);
//            pst_write.setString(4, endd);
//            pst_write.setString(5, modely);
//            pst_write.setString(6, unity);
//            pst_write.execute();
//        }
//  
//    } catch (Exception exception) {
//        // Handle exception
//    } finally {
//        try {
//            if (conn_write != null) conn_write.close();
//            if (rs_write != null) rs_write.close();
//            if (pst_write != null) pst_write.close();
//        } catch (Exception exception) {
//            // Handle exception
//        }
//    }
//    
//    
//    
//}
//
//    
//    
//    
//    
//  
//
//
//    @FXML
//    void zerosaction(MouseEvent eventa)  {}
//    @FXML
//    void refre(MouseEvent event) throws IOException, InterruptedException {}
//    
// 
//    
//    
//   
//    
//    @Override
//public void initialize(URL url, ResourceBundle rb) {
//    
//    loadFilePath();
//    logViewerStart();
//    int secondsDelay = loadDelay("RefreshRate.kady");
//    mmm1y=secondsDelay;
//    minutttey=mmm1y/60000;
//    int initialDelay = loadDelay("DelayRate.kady");
//    mmm2y=initialDelay;
//    secondddey=mmm2y/1000;
//    setupRefreshTimer(initialDelay, secondsDelay);
//    int restartDelay = loadDelay("DelayRateForRestarting.kady");
//    setupRestartTimer(restartDelay);
//    setupMachineLabels();
//    setupRectangle();
//    
//    
////     // Initialize the remaining time to 5 minutes (00:05:00)
////        timeRemaininggg = LocalTime.of(0, minutttey, secondddey);
////        // Create the timer label and set the initial text
////        //temomenu = new Menu();
////        updateTimerLabel();
////        // Setup the timeline to decrement the time every second
////        timelineee = new Timeline(new KeyFrame(Duration.seconds(1), e -> Platform.runLater(() -> decrementTime())));
////        timelineee.setCycleCount(Timeline.INDEFINITE); // Run indefinitely
////        timelineee.play(); // Start the timeline
////        // Layout the components
////        
//    /////////////////////////////////////ADS/////////////////////////////////////////    
//    Timeline reloadTimeline = new Timeline(new KeyFrame(Duration.minutes(1), event -> {
//    Platform.runLater(() -> {
//    URI uri = Paths.get("ADS.html").toAbsolutePath().toUri();
//    newsssss.getEngine().load(uri.toString()); 
//    
//    });
//    
//    }));
//    reloadTimeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely
//    reloadTimeline.play(); // Start the Timeline
//    /////////////////////////////////////////////////////////////////////////////////
//    
//   // temomenu.setGraphic(new ImageView (new Image(getClass().getResourceAsStream("Kadysoftt.png"))));
//    
//}
//private void loadFilePath() {
//    try (BufferedReader buffr = new BufferedReader(new FileReader("File_Des.kady"))) {
//        poth = buffr.readLine();
//    } catch (IOException ex) {
//        Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//    }
//}
//private void logViewerStart() {
//    String logMessage = getCurrentDateTime() + "  Viewer Started at " + getCurrentTime() + "  Successfully." + System.lineSeparator();
//    writeLog("Log.kady", logMessage);
//}
//private int loadDelay(String filename) {
//    try (BufferedReader buffr = new BufferedReader(new FileReader(filename))) {
//        return Integer.parseInt(buffr.readLine());
//    } catch (IOException | NumberFormatException ex) {
//        Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//        return 0;
//    }
//}
//
//
//private void setupRefreshTimeroo () {
//    
//     try {
//     new Thread(() -> {
//     Platform.runLater(() -> refresh.fire());  
//     }).start();
//     } catch (Exception m) {
//     Platform.runLater(() -> refresh.fire());
//     }
//    
//}
//
//private void setupRefreshTimer(int initialDelay, int secondsDelay) {
//    Timer timer = new Timer();
//    timer.schedule(new TimerTask() {
//        @Override
//        public void run() {
//            Platform.runLater(() -> setupRefreshTimeroo());  
//            
//          //  Platform.runLater(() -> workmach.setText(Integer.toString(workingmachinesno)));  
//            
//        }
//    }, initialDelay , secondsDelay );
//}
//private void setupRestartTimer(int restartDelay) {
//    Timer timer = new Timer();
//    timer.scheduleAtFixedRate(new TimerTask() {
//        @Override
//        public void run() {
//            Platform.runLater(() -> restartApplication());
//        }
//    }, restartDelay, 12000000L);
//}
//private void restartApplication() {
//    try (BufferedReader buffr = new BufferedReader(new FileReader("FileToRestart.kady"))) {
//        String filePath = buffr.readLine();
//        File file = new File(filePath);
//        if (file.exists()) {
//            Desktop.getDesktop().open(file);
//            logViewerExit();
//            System.exit(0);
//        }
//    } catch (IOException ex) {
//        Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//    }
//}
//private void logViewerExit() {
//    String logMessage = getCurrentDateTime() + "  Viewer Exited at " + getCurrentTime() + "  Successfully." + System.lineSeparator();
//    writeLog("Log.kady", logMessage);
//}
//private void writeLog(String fileName, String content) {
//    try {
//        Files.write(Paths.get(fileName), content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//    } catch (IOException ex) {
//        Logger.getLogger(ViewerController_New.class.getName()).log(Level.SEVERE, null, ex);
//    }
//}
//private String getCurrentDateTime() {
//    return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//}
//private String getCurrentTime() {
//    return new SimpleDateFormat("HH:mm:ss").format(new Date());
//}
//private void setupMachineLabels() {
//    mno1.setText("Machine 1");
//    mno11.setText("Machine 2");
//    mno12.setText("Machine 3");
//    mno13.setText("Machine 4");
//    mno14.setText("Machine 5");
//    mno15.setText("Machine 6");
//    mno16.setText("Machine 7");
//    mno17.setText("Machine 8");
//    mno18.setText("Machine 9");
//    mno19.setText("Machine 10");
//    mno110.setText("Machine 11");
//    mno111.setText("Machine 12");
//    mno112.setText("Machine 13");
//    mno113.setText("Machine 14");
//    mno114.setText("Machine 15");
//    mno115.setText("Machine 16");
//    mno116.setText("Machine 17");
//    mno117.setText("Machine 18");
//    mno118.setText("Machine 19");
//    mno119.setText("Machine 20");
//    mno120.setText("Machine 21");
//    mno121.setText("Machine 22");
//    mno122.setText("Machine 23");
//    mno123.setText("Machine 24");
//    mno124.setText("Machine 25");
//}
//private void setupRectangle() {
//    rectangle.setArcWidth(30.0);
//    rectangle.setArcHeight(30.0);
//    ImagePattern pattern = new ImagePattern(new Image("file:adsimage.png", 1200, 120, false, false));
//    rectangle.setFill(pattern);
//    rectangle.setEffect(new DropShadow(20, Color.BLACK));
//}
//
// 
//// Method to decrement the time by 1 second
//    private void decrementTime() {
//        
//        
////         try {
////        new Thread(() -> {
//        
//        // Decrement 1 second from the remaining time
//        timeRemaininggg = timeRemaininggg.minusSeconds(1);
//        // If time reaches zero, reset to 5 minutes
//        if (timeRemaininggg.equals(LocalTime.MIDNIGHT)) {
//        timeRemaininggg = LocalTime.of(0, minutttey, 0); // Reset to 5 minutes
//        }
//        // Update the label text
//        updateTimerLabel();
//        
//        
////        
////             }).start();
////    } catch (Exception m) {
////        decrementTime();
////    }
////        
//        
//        
//        
//        
//    }
//    // Method to update the label text with the current remaining time
//    private void updateTimerLabel() {
//      //  temomenu.setText(timeRemaininggg.format(TIME_FORMATTER));
//    }
//
//
//
//  
//}

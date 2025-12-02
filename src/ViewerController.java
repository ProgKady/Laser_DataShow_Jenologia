

import com.jfoenix.controls.JFXButton;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed.elkady
 */
public class ViewerController implements Initializable {
    
    Connection conn_read=null;
    ResultSet rs_read=null;
    PreparedStatement pst_read=null;
    

    @FXML
    private JFXButton refresh;
  
    ///////////////////////////////////////////////////////////////////// 1

    @FXML
    private Label no1;

    @FXML
    private Label id1;

    @FXML
    private Label init1;

    @FXML
    private Label end1;

    @FXML
    private Label mod1;

    @FXML
    private Label unit1;

    @FXML
    private JFXButton pro1;

    @FXML
    private Label per1;
    
    ///////////////////////////////////////////////////////////////////// 2

    @FXML
    private Label no11;

    @FXML
    private Label id11;

    @FXML
    private Label init11;

    @FXML
    private Label end11;

    @FXML
    private Label mod11;

    @FXML
    private Label unit11;

    @FXML
    private JFXButton pro11;

    @FXML
    private Label per11;
    
    ///////////////////////////////////////////////////////////////////// 3

    @FXML
    private Label no12;

    @FXML
    private Label id12;

    @FXML
    private Label init12;

    @FXML
    private Label end12;

    @FXML
    private Label mod12;

    @FXML
    private Label unit12;

    @FXML
    private JFXButton pro12;

    @FXML
    private Label per12;
    
    ///////////////////////////////////////////////////////////////////// 4

    @FXML
    private Label no13;

    @FXML
    private Label id13;

    @FXML
    private Label init13;

    @FXML
    private Label end13;

    @FXML
    private Label mod13;

    @FXML
    private Label unit13;

    @FXML
    private JFXButton pro13;

    @FXML
    private Label per13;
    
    ///////////////////////////////////////////////////////////////////// 5

    @FXML
    private Label no14;

    @FXML
    private Label id14;

    @FXML
    private Label init14;

    @FXML
    private Label end14;

    @FXML
    private Label mod14;

    @FXML
    private Label unit14;

    @FXML
    private JFXButton pro14;

    @FXML
    private Label per14;
    
    ///////////////////////////////////////////////////////////////////// 6

    @FXML
    private Label no15;

    @FXML
    private Label id15;

    @FXML
    private Label init15;

    @FXML
    private Label end15;

    @FXML
    private Label mod15;

    @FXML
    private Label unit15;

    @FXML
    private JFXButton pro15;

    @FXML
    private Label per15;
    
    ///////////////////////////////////////////////////////////////////// 7

    @FXML
    private Label no16;

    @FXML
    private Label id16;

    @FXML
    private Label init16;

    @FXML
    private Label end16;

    @FXML
    private Label mod16;

    @FXML
    private Label unit16;

    @FXML
    private JFXButton pro16;

    @FXML
    private Label per16;
    
    ///////////////////////////////////////////////////////////////////// 8

    @FXML
    private Label no17;

    @FXML
    private Label id17;

    @FXML
    private Label init17;

    @FXML
    private Label end17;

    @FXML
    private Label mod17;

    @FXML
    private Label unit17;

    @FXML
    private JFXButton pro17;

    @FXML
    private Label per17;
    
    ///////////////////////////////////////////////////////////////////// 9

    @FXML
    private Label no18;

    @FXML
    private Label id18;

    @FXML
    private Label init18;

    @FXML
    private Label end18;

    @FXML
    private Label mod18;

    @FXML
    private Label unit18;

    @FXML
    private JFXButton pro18;

    @FXML
    private Label per18;
    
    ///////////////////////////////////////////////////////////////////// 10

    @FXML
    private Label no19;

    @FXML
    private Label id19;

    @FXML
    private Label init19;

    @FXML
    private Label end19;

    @FXML
    private Label mod19;

    @FXML
    private Label unit19;

    @FXML
    private JFXButton pro19;

    @FXML
    private Label per19;
    
    ///////////////////////////////////////////////////////////////////// 11

    @FXML
    private Label no110;

    @FXML
    private Label id110;

    @FXML
    private Label init110;

    @FXML
    private Label end110;

    @FXML
    private Label mod110;

    @FXML
    private Label unit110;

    @FXML
    private JFXButton pro110;

    @FXML
    private Label per110;
    
    ///////////////////////////////////////////////////////////////////// 12

    @FXML
    private Label no111;

    @FXML
    private Label id111;

    @FXML
    private Label init111;

    @FXML
    private Label end111;

    @FXML
    private Label mod111;

    @FXML
    private Label unit111;

    @FXML
    private JFXButton pro111;

    @FXML
    private Label per111;
    
    ///////////////////////////////////////////////////////////////////// 13

    @FXML
    private Label no112;

    @FXML
    private Label id112;

    @FXML
    private Label init112;

    @FXML
    private Label end112;

    @FXML
    private Label mod112;

    @FXML
    private Label unit112;

    @FXML
    private JFXButton pro112;

    @FXML
    private Label per112;
    
    ///////////////////////////////////////////////////////////////////// 14

    @FXML
    private Label no113;

    @FXML
    private Label id113;

    @FXML
    private Label init113;

    @FXML
    private Label end113;

    @FXML
    private Label mod113;

    @FXML
    private Label unit113;

    @FXML
    private JFXButton pro113;

    @FXML
    private Label per113;
    
    ///////////////////////////////////////////////////////////////////// 15

    @FXML
    private Label no114;

    @FXML
    private Label id114;

    @FXML
    private Label init114;

    @FXML
    private Label end114;

    @FXML
    private Label mod114;

    @FXML
    private Label unit114;

    @FXML
    private JFXButton pro114;

    @FXML
    private Label per114;
    
    ///////////////////////////////////////////////////////////////////// 16

    @FXML
    private Label no115;

    @FXML
    private Label id115;

    @FXML
    private Label init115;

    @FXML
    private Label end115;

    @FXML
    private Label mod115;

    @FXML
    private Label unit115;

    @FXML
    private JFXButton pro115;

    @FXML
    private Label per115;
    
    ///////////////////////////////////////////////////////////////////// 17

    @FXML
    private Label no116;

    @FXML
    private Label id116;

    @FXML
    private Label init116;

    @FXML
    private Label end116;

    @FXML
    private Label mod116;

    @FXML
    private Label unit116;

    @FXML
    private JFXButton pro116;

    @FXML
    private Label per116;
    
    ///////////////////////////////////////////////////////////////////// 18

    @FXML
    private Label no117;

    @FXML
    private Label id117;

    @FXML
    private Label init117;

    @FXML
    private Label end117;

    @FXML
    private Label mod117;

    @FXML
    private Label unit117;

    @FXML
    private JFXButton pro117;

    @FXML
    private Label per117;
    
    ///////////////////////////////////////////////////////////////////// 19

    @FXML
    private Label no118;

    @FXML
    private Label id118;

    @FXML
    private Label init118;

    @FXML
    private Label end118;

    @FXML
    private Label mod118;

    @FXML
    private Label unit118;

    @FXML
    private JFXButton pro118;

    @FXML
    private Label per118;
    
    /////////////////////////////////////////////////////////////////////

    
    @FXML
    void pro1action(ActionEvent event) throws IOException {

        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
        
    }
    
    
    @FXML
    void pro10action(ActionEvent event) throws IOException {

        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
        
    }

    @FXML
    void pro11action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro12action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro13action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro14action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro15action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro16action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro17action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro18action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro19action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    

    @FXML
    void pro2action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro3action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro4action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro5action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro6action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro7action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro8action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    @FXML
    void pro9action(ActionEvent event) throws IOException {

        
        
        //Open FXML Window ................
        
    Stage stg = new Stage();
    Parent root = FXMLLoader.<Parent>load(getClass().getResource("Productivity.fxml"));
    Scene sce = new Scene(root);
    stg.setTitle("Productivity Viewer");
    stg.setResizable(false);
    stg.setScene(sce);
    stg.centerOnScreen();
    //stg.getIcons().add(new javafx.scene.image.Image(Main.class.getResourceAsStream(".png")));
    stg.show();
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @FXML
    void refreshaction(ActionEvent event) {

        //Write all actions here ..............
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 1////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 2////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 3////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 4////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 5////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 6////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 7////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 8////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 9////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 10////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 11////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 12////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 13////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 14////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 15////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 16////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 17////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 18////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        /////////////////////////Machine No 19////////////////////////////
        
        
        
        /////////////////////////////////////////////////////////////////
        
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        conn_read=db_writer.java_db();
        
        //Create refresh every 1 second here .................
        
        
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

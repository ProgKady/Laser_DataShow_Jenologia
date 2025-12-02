

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.LocalTimeStringConverter;
import org.controlsfx.control.table.TableFilter;

/**
 * FXML Controller class
 *
 * @author ahmed.elkady
 */
public class ProductivityController implements Initializable {

    Connection conn_read=null;
    ResultSet rs_read=null;
    PreparedStatement pst_read=null;
    
    
    @FXML
    private JFXTextField mno;

    @FXML
    private JFXDatePicker datefrom;

    @FXML
    private JFXDatePicker dateto;

    @FXML
    private JFXTimePicker timefrom;

    @FXML
    private JFXTimePicker timeto;

    @FXML
    private JFXButton getreport;

    @FXML
    private JFXButton exporttoexcel;

    @FXML
    private TableView<String> table;

    @FXML
    void exporttoexcelaction(ActionEvent event) {

        
        
        
    }

    @FXML
    void getreportaction(ActionEvent event) {

//        String machno=mno.getText();
//        
//        String datfrom=datefrom.getEditor().getText();
//        String datto=dateto.getEditor().getText();
//        
//        String timfrom=timefrom.getEditor().getText();
//        String timto=timeto.getEditor().getText();
//        
//        if (machno.isEmpty()&&datfrom.isEmpty()&&datto.isEmpty()&&timfrom.isEmpty()&&timto.isEmpty()) {
//            
//            //Preview All.....
            
        table.getColumns().clear();
        ////////////////////////////////////////////////////////////////////
        ObservableList <ObservableList> data;
        data=FXCollections.observableArrayList();
        ////////////////////////////////////////////////////////////////////
         try{
            String sql ="select * from Production";
            pst_read=conn_read.prepareStatement(sql);  
            rs_read=pst_read.executeQuery();   
        ///////////////////////////////////////////////////////////////  
        for (int i=0;i<rs_read.getMetaData().getColumnCount();i++) {
            final int j=i;
            TableColumn col=new TableColumn(rs_read.getMetaData().getColumnName(i+1));
            col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){
                public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                     return new SimpleStringProperty(param.getValue().get(j).toString()); 
                } 
            });
            table.getColumns().addAll(col);  
        }
        while (rs_read.next()) {
            ObservableList<String> row=FXCollections.observableArrayList();
            for (int i=1;i<=rs_read.getMetaData().getColumnCount();i++) {
            row.add(rs_read.getString(i));
            }
            data.add(row);
        }
        table.setItems((ObservableList)data);
       ////////////////////////////////////////////////////////////////  
        }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
        }
        finally {   
            try{
                rs_read.close();
                pst_read.close();
                conn_read.close();
            }
            catch(Exception e){    
            }
         } 
          TableFilter filter = new TableFilter(table);
            
            
            
//        }
//        
//        
//        else {
//            
//            //Filter then preview.......
//            
//            
//        }
        
        
    }

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        conn_read=db_writer.java_db();
        
        //StringConverter<LocalTime> defaultConverter = new LocalTimeStringConverter(FormatStyle.FULL, Locale.ENGLISH);
        
        timefrom.setIs24HourView(true);
        
        //timefrom.setConverter(defaultConverter);
        
        timeto.setIs24HourView(true);
        //timeto.setConverter(defaultConverter);
        
        
 datefrom.setConverter(new StringConverter<LocalDate>() {
 String pattern = "yyyy-MM-dd";
 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

 {
     datefrom.setPromptText(pattern.toLowerCase());
 }

 @Override public String toString(LocalDate date) {
     if (date != null) {
         return dateFormatter.format(date);
     } else {
         return "";
     }
 }

 @Override public LocalDate fromString(String string) {
     if (string != null && !string.isEmpty()) {
         return LocalDate.parse(string, dateFormatter);
     } else {
         return null;
     }
 }
});
        
        
        
 dateto.setConverter(new StringConverter<LocalDate>() {
 String pattern = "yyyy-MM-dd";
 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

 {
     dateto.setPromptText(pattern.toLowerCase());
 }

 @Override public String toString(LocalDate date) {
     if (date != null) {
         return dateFormatter.format(date);
     } else {
         return "";
     }
 }

 @Override public LocalDate fromString(String string) {
     if (string != null && !string.isEmpty()) {
         return LocalDate.parse(string, dateFormatter);
     } else {
         return null;
     }
 }
}); 
        
        
        
        
        
        
    }    
    
}

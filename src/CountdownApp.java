

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CountdownApp extends Application {

     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private Label timerLabel;
    private LocalTime timeRemaining;
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("mm:ss");
    private Timeline timeline;
    
    int mmm1,mmm2,minuttte,seconddde;
    
    

     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public void start(Stage primaryStage) {
        
        
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        mmm1=60000;
        mmm2=5000;
        minuttte=mmm1/60000;
        seconddde=mmm2/1000;
        
        // Initialize the remaining time to 5 minutes (00:05:00)
        timeRemaining = LocalTime.of(0, minuttte, seconddde);
        // Create the timer label and set the initial text
        timerLabel = new Label();
        updateTimerLabel();
        // Setup the timeline to decrement the time every second
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> decrementTime()));
        timeline.setCycleCount(Timeline.INDEFINITE); // Run indefinitely
        timeline.play(); // Start the timeline
        // Layout the components
        
        
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        
        
        
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(timerLabel);
        // Set up the scene and stage
        Scene scene = new Scene(layout, 200, 100);
        primaryStage.setTitle("Countdown Timer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    
    
    
    
    
    
    
    // Method to decrement the time by 1 second
    private void decrementTime() {
        // Decrement 1 second from the remaining time
        timeRemaining = timeRemaining.minusSeconds(1);
        // If time reaches zero, reset to 5 minutes
        if (timeRemaining.equals(LocalTime.MIDNIGHT)) {
        timeRemaining = LocalTime.of(0, minuttte, 0); // Reset to 5 minutes
        }
        // Update the label text
        updateTimerLabel();
    }
    // Method to update the label text with the current remaining time
    private void updateTimerLabel() {
        timerLabel.setText(timeRemaining.format(TIME_FORMATTER));
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        launch(args);
    }
}

package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import lab5.FXMainPane;


public class FXDriver extends Application {
     
  
   public static void main(String[] args) {
       launch(args);
   }
         
   @Override
   public void start(Stage stage) throws Exception {
       //call the main scene which is a BorderPane
       FXMainPane root = new FXMainPane();
        stage.setScene(new Scene(root, 300, 300));
       // Set stage title and show the stage.
       stage.setTitle("Hello World GUI");
       stage.show();

   }
}
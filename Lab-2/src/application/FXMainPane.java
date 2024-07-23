package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMainPane extends VBox {

	   Button hello = new Button();
	   Button howdy = new Button();
	   Button chinese = new Button();
	   Button clear = new Button();
	   Button exit = new Button();

	   Label feedback = new Label();
	   TextField textField;
	   HBox hbox1 = new HBox();
	   HBox hbox2 = new HBox();
	   VBox vbox = new VBox();

	   DataManager dataManager = new DataManager(); 
	  
	   public FXMainPane() {
	  
	       HBox hbox1= new HBox();
	       HBox hbox2= new HBox();
	       HBox hbox3 = new HBox();
	       HBox hbox4 = new HBox();
	       HBox hbox5 = new HBox();
	       HBox hbox6 = new HBox();
	  
	       hello= new Button("Hello");
	       howdy = new Button("Howdy");
	       chinese = new Button("Chinese");
	       clear = new Button("Clear");
	       exit = new Button("Exit");
	      
	       feedback = new Label("Feedback");
	       textField = new TextField();
	       //student Task #4:
	      
	       dataManager = new DataManager();
	       hbox1.setAlignment(Pos.CENTER);
	       hbox2.setAlignment(Pos.CENTER);
	       hbox3.setAlignment(Pos.CENTER);
	       hbox4.setAlignment(Pos.CENTER);
	       hbox5.setAlignment(Pos.CENTER);
	       hbox6.setAlignment(Pos.CENTER);
	      
	  
	       hbox1.getChildren().addAll(feedback, textField);
	       hbox2.getChildren().addAll(hello);
	       hbox3.getChildren().addAll(howdy);
	       hbox4.getChildren().addAll(chinese);
	       hbox5.getChildren().addAll(clear);
	       hbox6.getChildren().addAll(exit);

	       getChildren().addAll(hbox1);
	       getChildren().addAll(hbox2);
	       getChildren().addAll(hbox3);
	       getChildren().addAll(hbox4);
	       getChildren().addAll(hbox5);
	       getChildren().addAll(hbox6);
	       
	       VBox.setMargin(hbox1, new Insets(10));
	       VBox.setMargin(hbox2, new Insets(10));
	       VBox.setMargin(hbox3, new Insets(10));
	       VBox.setMargin(hbox4, new Insets(10));
	       VBox.setMargin(hbox5, new Insets(10));
	       VBox.setMargin(hbox6, new Insets(10));
	      
	       hello.setOnAction(new ButtonHandler());
	       howdy.setOnAction(new ButtonHandler());
	       chinese.setOnAction(new ButtonHandler());
	       clear.setOnAction(new ButtonHandler());
	       exit.setOnAction(new ButtonHandler());
	   }
	   class ButtonHandler implements EventHandler<ActionEvent>{
		   

		      
		   public void handle(ActionEvent a) {
		       if (a.getTarget()==hello) {
		           textField.setText(dataManager.getHello());
		       }
		       else if (a.getTarget()==howdy) {
		           textField.setText(dataManager.getHowdy());
		       }
		       else if (a.getTarget()==chinese) {
		           textField.setText(dataManager.getChineese());
		       }
		       else if (a.getTarget()==clear) {
		           textField.setText("");
		       }
		       else if (a.getTarget()==exit) {
		           Platform.exit();
		           System.exit(0);
		       }
		   }
	   }
}

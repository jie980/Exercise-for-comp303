package chex8.ex9;


import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		GridPane root = new GridPane(); // Initialize with a component graph
		Label label = new Label(LocalDateTime.now().toString());
		Button button = new Button("now");
		button.setOnAction(e->label.setText(LocalDateTime.now().toString()));

		root.add(label, 0, 0);
		root.add(button, 0, 1);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		
	}
}
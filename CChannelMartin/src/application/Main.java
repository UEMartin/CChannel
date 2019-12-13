package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private AnchorPane myPane;
	
	@Override
	public void start(Stage stage) throws IOException{
	
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/CChannelView.fxml"));
			
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			
			myPane = (AnchorPane) loader.load();
	
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(new Scene(myPane));
			stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

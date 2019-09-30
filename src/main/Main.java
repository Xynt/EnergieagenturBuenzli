package main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * class for calling the main method
 * 
 * @author	Jan Gehbauer
 * @date	2019-09-30
 * @version	2.4
 */
public class Main extends Application {
	
	/**
	 * start the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		launch(args);
	}
	
	/**
	 * set up the editor
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*Editor editor;
		Scene scene;
		
		editor = new Editor();
		
		scene = new Scene(editor, 1000, 600);
		scene.getStylesheets().add(new File("src\\ide\\stylesheet.css").toURI().toURL().toExternalForm());
		
		primaryStage.setTitle("IDE");
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> editor.close(e));
		primaryStage.show();*/
	}
}
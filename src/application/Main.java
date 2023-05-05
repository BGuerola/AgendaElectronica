package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
//		Button btn = new Button();
//		btn.setText("Digues 'Hola mon'");
//		btn.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("Hola mon");
//			}
//		});
//		
//		CheckBox check = new CheckBox("Un check");
//		TextField text = new TextField ("Un TextField");
//		HBox hbox = new HBox();
//		hbox.getChildren().addAll(check,text);
		
		
		
		try {
//			AnchorPane root = new AnchorPane();
//			root.getChildren().addAll(hbox);	

//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			FXMLLoader loader = new FXMLLoader();
			AnchorPane root = loader.load(getClass().getResourceAsStream("/vista/MenuPrincipal.fxml"));
			
			Scene scene = new Scene(root);		
			primaryStage.setTitle("Agenda Comercial");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

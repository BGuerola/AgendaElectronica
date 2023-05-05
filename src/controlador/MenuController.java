package controlador;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML public void llençarFulles(ActionEvent event) throws IOException {
		Stage secondaryStage = new Stage();
		
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

		FXMLLoader loader = new FXMLLoader();
		AnchorPane mp = loader.load(getClass().getResourceAsStream("/vista/form.fxml"));		
		
		Scene scene = new Scene(mp);		
		secondaryStage.setTitle("Agenda");
		secondaryStage.setScene(scene);
		secondaryStage.show();
        
        
        
	}

}

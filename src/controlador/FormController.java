package controlador;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import repositori.Connexio;

public class FormController implements Initializable{

	String sqlSentence;
	
	@FXML TextField nom;
	@FXML TextField cognom1;
	@FXML TextField cognom2;
	@FXML TextField telf;
	@FXML ChoiceBox<?> categoria;
	@FXML ChoiceBox<?> subcategoria;
	@FXML TextArea  descripcio;
	@FXML TextField email;
	@FXML TextField web;
	@FXML TextField linkedin;
	@FXML TextField twitter;
	@FXML TextField localitat;
	@FXML TextField provincia;
	@FXML Button btnAcceptar;
	@FXML Label missatge;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
//		btnAcceptar.setOnAction((event)-> {
//			System.out.println("Formulari llançat");
//		});
	}
	
	
	  @FXML public void iniciarSessio(ActionEvent event) throws SQLException { 
		  
		  Connexio con = new Connexio();
		  ResultSet rs = con.CONSULTAR(sqlSentence);
	  
	  }
	 
	
	
}

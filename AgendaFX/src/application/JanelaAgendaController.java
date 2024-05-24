package application;

import negocio.Agenda;
import negocio.Contato;
import negocio.Agenda;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

public class JanelaAgendaController {

	@FXML
	private Button btn_incluir;
	@FXML
	private Button btn_consultar;
	@FXML
	private Button btn_limpar;
	@FXML
	private java.awt.TextField tx_nome;
	@FXML
	private java.awt.TextField tx_telefone;
	@FXML
	private java.awt.TextField tx_email;
	
	private Agenda agenda;
	
	@FXML
	public void botaoPressionado(ActionEvent evento) {
		String faceBotao = ((Button)evento.getSource()).getText();
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("success");
		alert.setHeaderText(null);
		
		if(faceBotao.contentEquals("Incluir")) {
			agenda.incluirContato(new Contato(tx_nome.getText(),    //nome
											  tx_telefone.getText(),//telefone
											  tx_email.getText())); //email
			alert.setContentText("Contato incluido com sucesso!");
			alert.showAndWait();
		}
		
	}
}
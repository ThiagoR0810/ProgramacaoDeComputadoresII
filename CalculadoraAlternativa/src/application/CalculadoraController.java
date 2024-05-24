package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import projeto.Calculadora;

public class CalculadoraController {

	@FXML
	private Button btn_0;
	@FXML
	private Button btn_1;
	@FXML
	private Button btn_2;
	@FXML
	private Button btn_3;
	@FXML
	private Button btn_4;
	@FXML
	private Button btn_5;
	@FXML
	private Button btn_6;
	@FXML
	private Button btn_7;
	@FXML
	private Button btn_8;
	@FXML
	private Button btn_9;
	
	@FXML
	private Button btn_C;
	@FXML
	private Button btn_CE;
	
	@FXML
	private Button btn_x2;
	@FXML
	private Button btn_ponto;
	@FXML
	private Button btn_divisao;
	@FXML
	private Button btn_multiplicacao;
	@FXML
	private Button btn_soma;
	@FXML
	private Button btn_subtracao;
	@FXML
	private Button btn_resto;
	@FXML
	private Button btn_igual;
	
	@FXML
	private TextField visor;
	
	@FXML
	public void botaoPressionado(ActionEvent evento) {
		String faceBotao = ((Button)evento.getSource()).getText();
		String numA = "";
		String numB = "";
		String operador = "";
		Calculadora calculadora = new Calculadora();
		
		if(faceBotao.contentEquals("0")||
		   faceBotao.contentEquals("1")||
		   faceBotao.contentEquals("2")||
		   faceBotao.contentEquals("3")||
		   faceBotao.contentEquals("4")||
		   faceBotao.contentEquals("5")||
		   faceBotao.contentEquals("6")||
		   faceBotao.contentEquals("7")||
		   faceBotao.contentEquals("7")||
		   faceBotao.contentEquals("9")||
		   faceBotao.contentEquals(".")) {
			visor.setText(visor.getText()+faceBotao);
			if(numA == "") {
				numA = numA + faceBotao;
			}
			else {
				numB = numB + faceBotao;
			}
			
		}
		else if(faceBotao.contentEquals("+")||
				faceBotao.contentEquals("-")||
				faceBotao.contentEquals("*")||
				faceBotao.contentEquals("/")||
				faceBotao.contentEquals("%")){
			operador = faceBotao;
			numA = visor.getText();
			visor.setText(visor.getText()+faceBotao);
		}
		else if(faceBotao.contentEquals("x^2")) {
			numA = visor.getText();
			visor.setText(visor.getText()+"^2 ");
		}
		else if(faceBotao.contentEquals("CE")) {
			visor.setText("");
		}
		else if(faceBotao.contentEquals("C")) {
			visor.setText(numA+operador);
		}
		else if(faceBotao.contentEquals("=")) {
			if(operador=="+") {
				numA = String.valueOf(calculadora.soma(numA, numB));
				visor.setText(numA);
			}
			else if(operador == "-") {
				numA = String.valueOf(calculadora.subtracao(numA, numB));
				visor.setText(numA);
			}
			else if(operador == "*") {
				numA = String.valueOf(calculadora.multiplicacao(numA, numB));
				visor.setText(numA);
			}
			else if(operador == "/" && numB!="0") {
				numA = String.valueOf(calculadora.divisao(numA, numB));
				visor.setText(numA);
			}
			else if(operador == "%") {
				numA = String.valueOf(calculadora.resto(numA, numB));
				visor.setText(numA);
			}
			else if(operador == "x^2") {
				numA = String.valueOf(calculadora.quadrado(numA));
				visor.setText(numA);
			}
		}
	}
}

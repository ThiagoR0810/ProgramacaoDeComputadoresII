package projeto;

public class Calculadora {

	private double numA;
	private double numB;
	
	public Calculadora() {
		numA = 0.0;
		numB = 0.0;
	}
	
	public double soma(String num1, String num2) {
		numA = Double.parseDouble(num1);
		numB = Double.parseDouble(num2);
		numA = numA + numB;
		return numA;
	}
	
	public double subtracao(String num1, String num2) {
		numA = Double.parseDouble(num1);
		numB = Double.parseDouble(num2);
		numA = numA - numB;
		return numA;
	}
	
	public double multiplicacao(String num1, String num2) {
		numA = Double.parseDouble(num1);
		numB = Double.parseDouble(num2);
		numA = numA * numB;
		return numA;
	}
	
	public double divisao(String num1, String num2) {
		numA = Double.parseDouble(num1);
		numB = Double.parseDouble(num2);
		numA = numA / numB;
		return numA;
	}
	
	public double resto(String num1, String num2) {
		numA = Double.parseDouble(num1);
		numB = Double.parseDouble(num2);
		numA = numA % numB;
		return numA;
	}
	
	public double quadrado(String num1) {
		numA = Double.parseDouble(num1);
		numA = numA * numA;
		return numA;
	}
	
	

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}
	
	
}

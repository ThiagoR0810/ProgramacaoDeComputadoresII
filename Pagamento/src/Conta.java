
public abstract class Conta extends Pagavel {
	
	protected int dia;
	protected int mes;
	protected double valor;
	
	public Conta(int diaPagto, int mesPagto, double valor) {
		this.dia = diaPagto;
		this.mes = mesPagto;
		this.valor = valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getMes() {
		return mes;
	}
	
	
	
}

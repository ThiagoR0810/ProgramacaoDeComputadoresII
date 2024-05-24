
public class Comissionado extends Empregado {

	private double valorVendas;
	
	public Comissionado(double valorVendas, String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = valorVendas;
	}
	
	public double getValorAPagar(int diaPagto, int mesPagto) {
		return (valorVendas * 0.06);//recebem 6% dos valores de suas vendas
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
}

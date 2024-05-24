
public class AssalariadoComissionado extends Comissionado {

	private double percentualBonus;
	
	public AssalariadoComissionado(double valorVendas, String nome, String sobrenome, int numIdent) {
		super(valorVendas, nome, sobrenome, numIdent);
		this.percentualBonus = valorVendas*0.06;
	}
	
	public double getValorAPagar(int diaPagto, int mesPagto) {
		return (ControlePagamento.SALARIO + percentualBonus);
	}
	
	public void setPercentualBonus(double valorVendas) {
		this.percentualBonus = valorVendas*0.06;
	}
	
	public double getPercentualBonus() {
		return percentualBonus;
	}
	
}

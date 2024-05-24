
public class Assalariado extends Empregado {

	private double horasExtra;
	
	public Assalariado(double horasExtra, String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.horasExtra = horasExtra;
	}
	
	public double getValorAPagar(int diaPagto, int mesPagto) {
		return (ControlePagamento.SALARIO + (horasExtra * ControlePagamento.HORAEXTRA));
	}
	
	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	public double getHorasExtra() {
		return horasExtra;
	}
}

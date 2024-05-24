
public class Terceirizado extends Empregado {

	private double horasTrabalhadas;
	
	public Terceirizado(double horasTrabalhadas, String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorAPagar(int diaPagto, int mesPagto) {
		return (horasTrabalhadas * ControlePagamento.HORA);
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
}

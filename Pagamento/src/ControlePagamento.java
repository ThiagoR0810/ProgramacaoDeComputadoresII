import java.util.ArrayList;

public class ControlePagamento {

	public static final double SALARIO = 1212.00;
	public static final double HORA = 30.00;
	public static final double HORAEXTRA = 20.00;
	private ArrayList<Pagavel> pagamentos;
	
	public ControlePagamento() {
		this.pagamentos = new ArrayList<Pagavel>();
	}
	
	public void addItemPagavel(Pagavel item){
		pagamentos.add(item);
	}
	
	public void removeItemPagavel(Pagavel item) {
		pagamentos.remove(item);
	}
	
	public void listarPagamentos(int dia, int mes) {
		for(Pagavel p : pagamentos) {
			if(p instanceof Conta) {
				System.out.print("Essa eh uma conta de valor: R$ ");
			}
			else{
				System.out.print("Esse eh o funcionario "+((Empregado) p).getNome()+" "+((Empregado) p).getSobrenome()+" e o valor a pagar eh: R$ ");
			}
			System.out.println(p.getValorAPagar(dia, mes));
		}
	}
	
	public double calculaValorFuncionarios(int dia, int mes) {
		double retorno = 0;
		for(int i=0; i<pagamentos.size(); i++) {
			if(pagamentos.get(i) instanceof Empregado) {
				retorno = retorno + pagamentos.get(i).getValorAPagar(dia, mes);
			}
		}
		return retorno;
	}
	
	public double calculaValorFaturas(int dia, int mes) {
		double retorno = 0;
		for(int i=0; i<pagamentos.size(); i++) {
			if(pagamentos.get(i) instanceof Conta) {
				retorno = retorno + pagamentos.get(i).getValorAPagar(dia, mes);
			}
		}
		return retorno;
	}
	
	public double calculaGastoTotal(int dia, int mes) {
		double retorno = 0;
		for(int i=0; i<pagamentos.size(); i++) {
			retorno = retorno + pagamentos.get(i).getValorAPagar(dia, mes);
		}
		return retorno;
	}
	
	
}

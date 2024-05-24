import java.util.Scanner;

public class SistemaPagamentoTeste {
	
	public static void main (String[] args){
		
		System.out.println("Informe o dia do pagamento:");
		Scanner input = new Scanner(System.in);
		int dia = input.nextInt();
		System.out.println("Informe o mes do pagamento:");
		int mes = input.nextInt();
		
		
		Empregado terceirizado = new Terceirizado(160,"Roberto","Junior",403289401);
		Empregado assalariado = new Assalariado(2,"Luiz","Ricardo",172793704);
		Empregado comissionado = new Comissionado(1000.00,"Josias","Galoucura",100384653);
		Empregado assalariadoComissionado = new AssalariadoComissionado(1000.00,"Luiz","Airao",123456789);
		Conta contaLuz = new Concessionaria(25,5,1000.00);
		Conta boleto = new Titulo(25,5, 6750.00);
		
		ControlePagamento controle = new ControlePagamento();
		
		controle.addItemPagavel(terceirizado);
		controle.addItemPagavel(assalariado);
		controle.addItemPagavel(comissionado);
		controle.addItemPagavel(assalariadoComissionado);
		controle.addItemPagavel(boleto);
		controle.addItemPagavel(contaLuz);
		
		double valorFuncionarios = 0;
		double valorContas = 0;
		double gastoTotal = 0;
		
		valorFuncionarios = controle.calculaValorFuncionarios(dia, mes);
		valorContas = controle.calculaValorFaturas(dia, mes);
		gastoTotal = controle.calculaGastoTotal(dia, mes);
		
		controle.listarPagamentos(20, 5);
		
		System.out.println("Valor gasto pela empresa no mes com funcionarios: R$ "+valorFuncionarios);
		System.out.println("Valor gasto pela empresa no mes com contas: R$ "+valorContas);
		System.out.println("Valor total gasto pela empresa no mes: R$ "+gastoTotal);
		
	}

}

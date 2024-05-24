import java.util.Scanner;
import java.util.HashSet;

public class CallCenter {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao sistema de Suporte Técnico");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.\n");
		
		int aux = 0;
		if(input.nextLine().equals("sair")) {// condicao caso a pessoa deseja sair do Suporte Tecnico
			aux++;
			System.out.println("Obrigado por utilizar nossos serviços!");
		}
		
		while(aux == 0) {
			System.out.println("Descreva seu problema de maneira sucinta.");
			
			SuporteTecnico suporte = new SuporteTecnico();
			
			String problema = input.nextLine();// string que guarda o problema descrito pelo usuario
			
			Interpretadora interpretadora = new Interpretadora();
			String[] palavrasChave = interpretadora.tirarEspacos(problema);// vetor de strings que guarda palavra por palavra,sem repeticao, do problema descrito
			
			for(int i=0; i<palavrasChave.length; i++) {// loop para adicionar as palavras digitadas pelo usuario ao HashSet
				interpretadora.adicionaPalavras(palavrasChave[i]);
			}
			
			String resposta = suporte.buscaSolucao(interpretadora.getPalavrasChave());// string que guarda a respota do suporte a ser retornada para o usuario
			
			System.out.println(resposta);
			
			System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.\n");
			if(input.nextLine().equals("sair")) {// condicao caso a pessoa deseja sair do Suporte Tecnico
				aux++;
				System.out.println("Obrigado por utilizar nossos serviços!");
			}
		}
	}

}

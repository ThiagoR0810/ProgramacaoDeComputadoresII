package principal__VitorMartins_ThiagoRibeiro;

import java.util.Scanner;

public class AppJogo {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiroJ1 = new Tabuleiro();
		Tabuleiro tabuleiroJ2 = new Tabuleiro();
		Jogador jogador1 = new Jogador(tabuleiroJ1);
		Jogador jogador2 = new Jogador(tabuleiroJ2);
		int pontuacaoJ1 = 0;
		int pontuacaoJ2 = 0;
		Scanner input = new Scanner(System.in);
		
		
		jogador1.getTabuleiro().addEspada(jogador1, "G6", jogador1.getEspadaDeOuro());
		jogador1.getTabuleiro().addEspada(jogador1, "M4", jogador1.getEspadaDeGelo());
		jogador1.getTabuleiro().addEspada(jogador1, "A1", jogador1.getEspadaDeMadeira());
		jogador1.getTabuleiro().addEspada(jogador1, "F3", jogador1.getEspadaDeBronze());
		jogador1.getTabuleiro().addEspada(jogador1, "G1", jogador1.getEspadaDeAluminio());
		jogador1.getTabuleiro().addEspada(jogador1, "H7", jogador1.getEspadaDePlatina());
		
		jogador2.getTabuleiro().addEspada(jogador1, "B7", jogador2.getEspadaDeOuro());
		jogador2.getTabuleiro().addEspada(jogador1, "C12", jogador2.getEspadaDeGelo());
		jogador2.getTabuleiro().addEspada(jogador1, "E11", jogador2.getEspadaDeMadeira());
		jogador2.getTabuleiro().addEspada(jogador1, "F5", jogador2.getEspadaDeBronze());
		jogador2.getTabuleiro().addEspada(jogador1, "F2", jogador2.getEspadaDeAluminio());
		jogador2.getTabuleiro().addEspada(jogador1, "B10", jogador2.getEspadaDePlatina());
		
		while(jogador1.getPontuacao()!= 155 || jogador2.getPontuacao() != 155) {
			System.out.println("Vez do jogador1. Digite a coordenada desejada:");
			pontuacaoJ1 = pontuacaoJ1 + jogador1.jogar(input.next(), jogador2.getTabuleiro());
			jogador1.setPontuacao(pontuacaoJ1);
			System.out.println("A pontuacao do jogador1 eh:"+jogador1.getPontuacao());
			if(jogador1.getPontuacao()==155) {
				System.out.println("O jogador1 ganhou!!\n\nFIM DE JOGO");
				break;
			}
			
			System.out.println("Vez do jogador2. Digite a coordenada desejada:");
			pontuacaoJ2 = pontuacaoJ2 + jogador2.jogar(input.next(), jogador1.getTabuleiro());
			jogador2.setPontuacao(pontuacaoJ2);
			System.out.println("A pontuacao do jogador2 eh:"+jogador2.getPontuacao());
			if(jogador2.getPontuacao()==155) {
				System.out.println("O jogador2 ganhou!!\n\nFIM DE JOGO");
				break;
			}
		}
	}
}

import java.util.Scanner;

public class Mesa {
	
	public static void main(String[] args){
		
		int loop = 0;
		
		while(loop==0) {
			System.out.println("Mesa embaralhando...");
			Baralho baralho = new Baralho();
			baralho.embaralharCartas();
			
			System.out.println("Informe o número de cartas a distribuir para cada jogador:");
			Scanner input = new Scanner(System.in);
			int quantidadeDeCartas = input.nextInt();
			System.out.println("Mesa distribui "+quantidadeDeCartas+" carta(s) para jogador A e "+quantidadeDeCartas+" cartas(s) para jogador B.");
			
			Jogador jogadorA = new Jogador(quantidadeDeCartas);
			Jogador jogadorB = new Jogador(quantidadeDeCartas);
			
			Carta cartaMaiorA = new Carta();	
			Carta cartaMaiorB = new Carta();
			
			jogadorA.setMao(baralho.distribuirCartasJogador(quantidadeDeCartas));
			cartaMaiorA = jogadorA.escolherEjogarMaiorCarta(jogadorA.getMao());
			Carta[] maoA = jogadorA.getMao();
			System.out.println("A mao do jogador A eh:");
			for(int i=0; i<maoA.length;i++) {
				System.out.println(maoA[i].getValor()+" "+maoA[i].getNaipe()+"  ");
			}
			
			jogadorB.setMao(baralho.distribuirCartasJogador(quantidadeDeCartas));
			cartaMaiorB = jogadorB.escolherEjogarMaiorCarta(jogadorB.getMao());
			Carta[] maoB = jogadorB.getMao();
			System.out.println("A mao do jogador B eh:");
			for(int i=0; i<maoB.length;i++) {
				System.out.println(maoB[i].getValor()+" "+maoB[i].getNaipe()+"  ");
			}
			
			System.out.println("O jogador A joga a carta "+cartaMaiorA.getValor()+" de "+cartaMaiorA.getNaipe()+".");
			System.out.println("O jogador B joga a carta "+cartaMaiorB.getValor()+" de "+cartaMaiorB.getNaipe()+".");
			
			if(cartaMaiorA.comparaValor(cartaMaiorB)==1) {
				System.out.println("O jogador A ganhou!");
				loop = 1;
			}
			else { 
				if(cartaMaiorA.comparaValor(cartaMaiorB)==-1) {
					System.out.println("O jogador B ganhou!");
					loop = 1;
				}
				else {
					if(cartaMaiorA.comparaValor(cartaMaiorB)==0) {
						if(cartaMaiorA.getNaipe().equals("Ouros")){
							System.out.println("Jogador A ganhou pois sua carta eh de naipe Ouros!");
							loop = 1;
						}
						else{
							if(cartaMaiorB.getNaipe().equals("Ouros")){
								System.out.println("Jogador B ganhou pois sua carta eh de naipe Ouros!");
								loop = 1;
							}
							else {
								System.out.println("Como o valor das cartas dos jogadores A e B são iguais e nenhum deles possui carta de naipe Ouros, o jogo ficou empatado.");
								System.out.println("Jogando novamente...");
							}
						}
					}
				}
			}
		}
	}
}

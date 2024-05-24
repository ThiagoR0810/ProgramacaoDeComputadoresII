import java.util.Random;
import java.util.random.*;

public class Baralho {
	
	private Carta[] baralho;
	private String[] naipes = {"Ouros","Paus","Espada","Copas"};
	

	public Baralho() {
		baralho = new Carta[52];
		int k = 0;
		for(int j=0; j<naipes.length; j++)	
			for(int i=0;i<13;i++) {
				baralho[k] = new Carta(i,naipes[j]);
				k++;
			}
	}
	
	public void embaralharCartas() {
		Random gerador = new Random();
		Carta aux;
		int posicao = gerador.nextInt(52);
		for(int i=0; i<baralho.length; i++) {
			posicao = gerador.nextInt(52);
			aux = baralho[i];
			baralho[i] = baralho[posicao];
			baralho[posicao] = aux;
		}
	}
	
	public Carta[] distribuirCartasJogador(int quantidade) {
		Carta[] maoJogador = new Carta[quantidade];
			int j=0;
			
			for(int i = 0; i<quantidade; i++) {
				while(baralho[j] == null && j<baralho.length) {
					j++;
				}
				maoJogador[i] = baralho[j];
				baralho[j] = null;
			}
			
			return maoJogador;
	}
	
	
}

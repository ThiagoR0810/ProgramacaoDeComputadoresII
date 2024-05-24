package principal__VitorMartins_ThiagoRibeiro;

import java.util.HashMap;

public class Tabuleiro {

	private HashMap<String, Integer> tabuleiro;
	
	public Tabuleiro() {
		tabuleiro = new HashMap<>();
	}

	public HashMap<String, Integer> getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(HashMap<String, Integer> tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public void addEspada(Jogador jogador, String posicao, Integer espada) {
		tabuleiro.put(posicao, espada);
	}

	
}

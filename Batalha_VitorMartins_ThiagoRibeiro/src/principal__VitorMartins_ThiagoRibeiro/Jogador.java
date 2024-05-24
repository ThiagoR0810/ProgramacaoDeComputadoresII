package principal__VitorMartins_ThiagoRibeiro;

public class Jogador {

	private int EspadaDeOuro = 50;
	private int EspadaDeBronze = 40;
	private int EspadaDePlatina = 30;
	private int EspadaDeGelo = 20;
	private int EspadaDeAluminio = 10;
	private int EspadaDeMadeira = 5;
	private int pontuacao = 0;
	private Tabuleiro tabuleiro;
	
	public Jogador(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getEspadaDeOuro() {
		return EspadaDeOuro;
	}

	public void setEspadaDeOuro(int espadaDeOuro) {
		EspadaDeOuro = espadaDeOuro;
	}

	public int getEspadaDeBronze() {
		return EspadaDeBronze;
	}

	public void setEspadaDeBronze(int espadaDeBronze) {
		EspadaDeBronze = espadaDeBronze;
	}

	public int getEspadaDePlatina() {
		return EspadaDePlatina;
	}

	public void setEspadaDePlatina(int espadaDePlatina) {
		EspadaDePlatina = espadaDePlatina;
	}

	public int getEspadaDeGelo() {
		return EspadaDeGelo;
	}

	public void setEspadaDeGelo(int espadaDeGelo) {
		EspadaDeGelo = espadaDeGelo;
	}

	public int getEspadaDeAluminio() {
		return EspadaDeAluminio;
	}

	public void setEspadaDeAluminio(int espadaDeAluminio) {
		EspadaDeAluminio = espadaDeAluminio;
	}

	public int getEspadaDeMadeira() {
		return EspadaDeMadeira;
	}

	public void setEspadaDeMadeira(int espadaDeMadeira) {
		EspadaDeMadeira = espadaDeMadeira;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public int jogar(String posicao, Tabuleiro tabuleiro) {
		int retorno = 0;
		if(tabuleiro.getTabuleiro().containsKey(posicao)) {
			retorno = tabuleiro.getTabuleiro().get(posicao);
		}
		return retorno;
	}
}

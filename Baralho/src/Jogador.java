
public class Jogador {
	
	private Carta[] mao;
	
	public Jogador (int quantidade) {
		mao = new Carta[quantidade];	
	}
	
	public Carta escolherEjogarMaiorCarta(Carta[] mao) {
		Carta maiorCarta= mao[0];
		
		for(int i=0;i<mao.length;i++) {
			if(maiorCarta.getValor()== mao[i].getValor() && mao[i].getNaipe()=="Ouros") {//condicao que assegura que, se o jogador possuir mais de uma carta de valor 12 e uma delas for o 12 de Ouros, a carta 12 de ouros sera a maior carta
				maiorCarta = mao[i];
			}
			if(maiorCarta.getValor()<mao[i].getValor()) {
				maiorCarta = mao[i];
			}
		}
		
		return maiorCarta;
	}
	
	public Carta[] getMao() {
		return mao;
	}
	
	public void setMao(Carta[] mao) {
		this.mao = mao;
	}
}

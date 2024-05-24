
public class Carta {
	
	private int valor;
	private String naipe;
	
	public Carta() {
		valor = 0;
		naipe = "";
	}
	
	public Carta(int valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public int comparaValor(Carta carta) {// compara os valores de duas cartas
		if(carta.getValor()<valor) {
			return 1;// retorna 1 se o valor da carta for maior
		}
		else {
			if(carta.getValor()>valor) {
				return -1;// retorna -1 se o valor da carta for menor
			}
			else {
				return 0;// retorna 0 se o valor das cartas forem iguais
			}
		}
	}
	
	public boolean comparaNaipe(Carta carta) {
		if(naipe.equals(carta.getNaipe())) {
			return true;
		}
		return false;
	}
	
}

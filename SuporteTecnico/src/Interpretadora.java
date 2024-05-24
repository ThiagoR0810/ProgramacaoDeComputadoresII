import java.util.HashSet;

public class Interpretadora {

	private HashSet<String> palavrasChave;
	
	public Interpretadora(){
		palavrasChave = new HashSet<>();
	}

	public String[] tirarEspacos(String problema) {// tira os espacos separando palavra por palavra em diferentes strings
		String[] palavras = problema.split(" ");
		return palavras;
	}
	
	public void adicionaPalavras(String palavraChave) { // adiciona palavras ao HashSet para nao haver repeticao de palavras
		palavrasChave.add(palavraChave);
	}

	public HashSet<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(HashSet<String> palavraChave) {
		this.palavrasChave = palavraChave;
	}
	
}

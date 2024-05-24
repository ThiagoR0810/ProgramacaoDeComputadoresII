import java.util.ArrayList;

public class Notebook extends Produto {

	private int numSerie;
	private int mesFabricacao;
	private int anoFabricacao;
	private int lote;
	private String transportadora;
	
	public Notebook(String marca, String modelo, String nome, Fornecedor f,int numSerie, int mes, int ano, int lote, String transportadora) {
		super(marca, modelo, nome, f);
		this.numSerie = numSerie;
		this.mesFabricacao = mes;
		this.anoFabricacao = ano;
		this.lote = lote;
		this.transportadora = transportadora;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public int getMesFabricacao() {
		return mesFabricacao;
	}

	public void setMesFabricacao(int mesFabricacao) {
		this.mesFabricacao = mesFabricacao;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}
	
	
}

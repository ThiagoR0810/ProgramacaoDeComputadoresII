
public abstract class Empregado extends Pagavel {
	
	protected String nome;
	protected String sobrenome;
	protected int numIdent;
	
	public Empregado(String nome, String sobrenome, int numIdent) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numIdent = numIdent;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.nome = sobrenome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setNumIdent(int numIdent) {
		this.numIdent = numIdent;
	}
	
	public int getNumIdent() {
		return numIdent;
	}
	
}

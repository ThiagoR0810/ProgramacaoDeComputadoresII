import java.util.ArrayList;

public class Produto {
	
	private String marca;
	private String modelo;
	private String nome;
	private Fornecedor fornecedor;
	
	public Produto(String marca, String modelo, String nome, Fornecedor f) {
		this.marca = marca;
		this.modelo = modelo;
		this.nome = nome;
		this.fornecedor = f;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	
}

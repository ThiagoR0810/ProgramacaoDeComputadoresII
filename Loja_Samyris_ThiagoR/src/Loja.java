import java.util.ArrayList;

public class Loja {

	private String nome;
	private String endereco;
	private ArrayList<Produto> portfolio;
	
	public Loja(String nome, String endereco,ArrayList<Produto> portfolio ) {
		this.nome = nome;
		this.endereco = endereco;
		this.portfolio = portfolio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Produto> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(ArrayList<Produto> portfolio) {
		this.portfolio = portfolio;
	}
	
	public void cadastrarProdutos(Produto P) {
		this.portfolio.add(P);
	}
	
	public void listarProdutos() {
		System.out.println("Os produtos sao:");
		for(int i=0; i<portfolio.size();i++) {
			System.out.println(portfolio.get(i).getMarca()+" "+portfolio.get(i).getModelo()+" "+portfolio.get(i).getNome());
		}
	}
	
	public void buscarProdutoNome(String nome) {
		System.out.println("O produto buscado pelo nome eh:");
		for(int i=0; i<portfolio.size();i++) {
			if(portfolio.get(i).getNome() == nome) {
				System.out.println(portfolio.get(i).getMarca()+" "+portfolio.get(i).getModelo()+" "+portfolio.get(i).getNome());
			}
		}
	}
	
	public void buscarProdutoFornecedor(Fornecedor fornecedor) {
		System.out.println("O produto buscado pelo fornecedor eh:");
		for(int i=0; i<portfolio.size();i++) {
			if(portfolio.get(i).getFornecedor() == fornecedor) {
				System.out.println(portfolio.get(i).getMarca()+" "+portfolio.get(i).getModelo()+" "+portfolio.get(i).getNome());
			}
		}
	}
	
	public void cadastrarFornecedor(Fornecedor f) {
		
	}
	
}

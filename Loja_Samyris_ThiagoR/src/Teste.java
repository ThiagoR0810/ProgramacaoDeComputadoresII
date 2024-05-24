import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Produto> portfolio = new ArrayList<Produto>();
		Loja loja1 = new Loja("Casas Bahia", "BH", portfolio);
		Fornecedor f1 = new Fornecedor("joao", 319999999);
		Fornecedor f2 = new Fornecedor("ana", 319999765);
		
		
		Produto celular = new Celular("samsung", "galaxy", "s20", f1, 123, 05, 2020, 30, "brasspress");
		Produto notebook = new Notebook("dell", "a32", "inspiron", f2, 143, 05, 2021, 20, "brasspress");
		
		loja1.cadastrarProdutos(notebook);
		loja1.cadastrarProdutos(celular);
		loja1.listarProdutos();
		loja1.buscarProdutoFornecedor(f1);
		loja1.buscarProdutoNome(notebook.getNome());
		
		
	}

}

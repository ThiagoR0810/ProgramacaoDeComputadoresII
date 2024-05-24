import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class SuporteTecnico{

	private HashMap<String, String> bancoSolucao;
	private ArrayList<String> respostaPadrao;
	
	public SuporteTecnico(){
		inicializar();
		construirBancoSolucao();
		construirRespostaPadrao();
	}
	
	private void inicializar() {
		this.bancoSolucao = new HashMap<>();
		this.respostaPadrao = new ArrayList<>();
	}
	
	private void construirBancoSolucao() {
		bancoSolucao.put("lento", "\nPenso que o problema está relacionado com o hardware. Fazer um upgrade\ndo seu processador deve resolver o problema de performance. Você tem algum\nproblema com o software?");
		bancoSolucao.put("performance", "\nA performance está próxima do esperado nos testes que realizamos. Você está\nexecutando algum outro processo em paralelo?");
		bancoSolucao.put("bug", "\nBom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\njá estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\ncom mais detalhes?");
		bancoSolucao.put("buggy", "\nBom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\njá estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\ncom mais detalhes?");
		bancoSolucao.put("windows", "\nEste é um problema do sistema operacional Windows. Por favor, \nentre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
		bancoSolucao.put("macintosh", "\nEste é um problema do sistema operacional Mac. Por favor, \nentre em contato com a Apple. Não há nada que possamos fazer neste caso.");
		bancoSolucao.put("caro", "\nO preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\ne comparou todas as características do nosso software com outras ofertas de mercado?");
		bancoSolucao.put("instalação","\nA instalação é simples e direta. Nós temos programas de instalação previamente configurados\nque farão todo o trabalho para você. Você já leu as instruções\nde instalação?");
		bancoSolucao.put("memória", "\nSe você observar detalhadamente os requisitos mínimos de sistema, você verá que\na memória requerida é 1.5 giga byte. Você deverá adquirir\nmais memória. Mais alguma coisa que deseja saber?");
		bancoSolucao.put("linux", "\nNós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\nMuitos deles dizem respeito a versões incompatíveis. Você poderia ser\nmais preciso?");
		bancoSolucao.put("danificaram", "\nBom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração.");
		bancoSolucao.put("danificou",  "\nBom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração.");
	}
	
	private void construirRespostaPadrao() {
		respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
		respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \nQual é a sua configuração de sistema?");
		respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
		respostaPadrao.add("Preciso de maiores informações a respeito.");
		respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
		respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
		respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\nque poderia detalhar melhor este problema?");
		respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
		respostaPadrao.add("Você poderia explicar melhor?");
	}
	
	public String buscaSolucao(HashSet<String> palavrasChave) {// mostra uma solucao de acordo com o problema apresentado
		int contador = 0;
		String retorno = "";
		for(String p : palavrasChave) {
			if(bancoSolucao.containsKey(p) && contador==0) {
				contador++;
				retorno = bancoSolucao.get(p);
				return retorno;
			}
		}
		if(contador==0) {// caso o problema nao seja identificado, o sistema retorna uma resposta padrao aleatoria
			Random gerador = new Random();
			int posicao = gerador.nextInt(respostaPadrao.size());
			retorno = respostaPadrao.get(posicao);
		}
		return retorno;
	}

	public HashMap<String, String> getBancoSolucao() {
		return bancoSolucao;
	}

	public void setBancoSolucao(HashMap<String, String> bancoSolucao) {
		this.bancoSolucao = bancoSolucao;
	}

	public ArrayList<String> getRespostaPadrao() {
		return respostaPadrao;
	}

	public void setRespostaPadrao(ArrayList<String> respostaPadrao) {
		this.respostaPadrao = respostaPadrao;
	}
	
}

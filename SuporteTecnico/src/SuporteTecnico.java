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
		bancoSolucao.put("lento", "\nPenso que o problema est� relacionado com o hardware. Fazer um upgrade\ndo seu processador deve resolver o problema de performance. Voc� tem algum\nproblema com o software?");
		bancoSolucao.put("performance", "\nA performance est� pr�xima do esperado nos testes que realizamos. Voc� est�\nexecutando algum outro processo em paralelo?");
		bancoSolucao.put("bug", "\nBom, voc� sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\nj� est�o atuando no problema para solucion�-lo. Voc� poderia descrever seu problema\ncom mais detalhes?");
		bancoSolucao.put("buggy", "\nBom, voc� sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\nj� est�o atuando no problema para solucion�-lo. Voc� poderia descrever seu problema\ncom mais detalhes?");
		bancoSolucao.put("windows", "\nEste � um problema do sistema operacional Windows. Por favor, \nentre em contato com a Microsoft. N�o h� nada que possamos fazer neste caso.");
		bancoSolucao.put("macintosh", "\nEste � um problema do sistema operacional Mac. Por favor, \nentre em contato com a Apple. N�o h� nada que possamos fazer neste caso.");
		bancoSolucao.put("caro", "\nO pre�o do nosso produto � competitivo. Voc� j� fez uma pesquisa de mercado\ne comparou todas as caracter�sticas do nosso software com outras ofertas de mercado?");
		bancoSolucao.put("instala��o","\nA instala��o � simples e direta. N�s temos programas de instala��o previamente configurados\nque far�o todo o trabalho para voc�. Voc� j� leu as instru��es\nde instala��o?");
		bancoSolucao.put("mem�ria", "\nSe voc� observar detalhadamente os requisitos m�nimos de sistema, voc� ver� que\na mem�ria requerida � 1.5 giga byte. Voc� dever� adquirir\nmais mem�ria. Mais alguma coisa que deseja saber?");
		bancoSolucao.put("linux", "\nN�s consideramos seriamente o suporte Linux. Mas existem muitos problemas.\nMuitos deles dizem respeito a vers�es incompat�veis. Voc� poderia ser\nmais preciso?");
		bancoSolucao.put("danificaram", "\nBom, nosso software n�o danificaria seu sistema. Deve ser algo espec�fico\nno seu sistema. Diga-me sobre sua configura��o.");
		bancoSolucao.put("danificou",  "\nBom, nosso software n�o danificaria seu sistema. Deve ser algo espec�fico\nno seu sistema. Diga-me sobre sua configura��o.");
	}
	
	private void construirRespostaPadrao() {
		respostaPadrao.add("Isso soa estranho. Voc� poderia descrever o problema com mais detalhes?");
		respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \nQual � a sua configura��o de sistema?");
		respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
		respostaPadrao.add("Preciso de maiores informa��es a respeito.");
		respostaPadrao.add("Voc� j� verificou se existe algum conflito de DLL?");
		respostaPadrao.add("Isso est� descrito no manual. Voc� j� deu uma lida no manual que veio junto do seu software?");
		respostaPadrao.add("Sua descri��o n�o foi satisfat�ria. Voc� j� procurou um t�cnico\nque poderia detalhar melhor este problema?");
		respostaPadrao.add("Isso n�o � um problema, � apenas uma caracter�stica do software!");
		respostaPadrao.add("Voc� poderia explicar melhor?");
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

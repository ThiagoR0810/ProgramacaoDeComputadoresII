package negocio;

import java.util.HashMap;
import servicos.ManipulaArquivoTexto;
import java.util.ArrayList;

public class Agenda {

	private HashMap<String, Contato> contatos;
	
	ManipulaArquivoTexto manipulador = new ManipulaArquivoTexto("agenda.txt");
	
	public Agenda() {
		contatos = new HashMap<>();
	}
	
	public boolean incluirContato(Contato contato) {
		contatos.put(contato.getNome(), contato);
		return true;
	}
	
	public boolean existeContato(String nome) {
		if(contatos.containsKey(nome)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Contato consultarContato(String nome) {
		return contatos.get(nome);
	}
	
	public void removerContato(String nome) {
		contatos.remove(nome);
	}

	public void persistirAgenda(ArrayList<Contato> arrayContatos) {
		manipulador.abrirArquivoParaGravacao();
		for(Contato aux : arrayContatos) {
			manipulador.gravarContato(aux);
		}
		manipulador.fecharArquivoGravacao();
	}
	
	public ArrayList<Contato> lerAgenda() {
		manipulador.abrirArquivoParaLeitura();
		ArrayList<Contato> contatosDaAgenda = manipulador.lerArquivo();
		manipulador.fecharArquivoLeitura();
		return contatosDaAgenda;
	}

	public HashMap<String, Contato> getContatos() {
		return contatos;
	}

	public void setContatos(HashMap<String, Contato> contatos) {
		this.contatos = contatos;
	}
	
}

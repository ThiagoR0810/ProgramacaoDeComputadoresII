package visao;

import negocio.Agenda;
import negocio.Contato;
import java.util.ArrayList;
import java.util.Set;
public class AppAgenda {

	public static void main(String[] args) {
		
		Agenda agendaPessoal = new Agenda();
		Contato contato1 = new Contato("Thiago Ribeiro", "(31) 90909090", "Rua Pe", "trc@gmail.com");
		Contato contato2 = new Contato("Remy Lucas", "(31) 12345678", "Av Tancredo", "rls@gmail.com");
		Contato contato3 = new Contato("Gabriel", "(31) 99999999", "Rua da Vila", "grc@gmail.com");
		
		agendaPessoal.incluirContato(contato1);
		agendaPessoal.incluirContato(contato2);
		agendaPessoal.incluirContato(contato3);
		
		agendaPessoal.removerContato("Gabriel");
		
		if(agendaPessoal.existeContato("Thiago Ribeiro") == true) {// condicao que verifica, pelo nome, se o contato existe na agenda
			System.out.println("Esse contato existe na agenda.");
		}
		else {
			System.out.println("Esse contato nao existe na agenda.");
		}
		
		Contato aux = agendaPessoal.consultarContato("Remy Lucas");
		System.out.println("O contato"+aux.getNome()+" possui as seguintes informacoes: "+"Nome: "+aux.getNome()+"; Telefone: "+aux.getTelefone()+"; Endereco: "+aux.getEndereco()+"; Email: "+aux.getEmail());
		
		Set<String> chaves = agendaPessoal.getContatos().keySet();
		ArrayList<Contato> arrayContatos = new ArrayList<>(); 
		for(String a : chaves) {
			arrayContatos.add(agendaPessoal.getContatos().get(a));
		}
		
		agendaPessoal.persistirAgenda(arrayContatos);
		
		System.out.println("Os contatos são:");
		for(Contato a : agendaPessoal.lerAgenda()) {
			System.out.println("Nome: "+a.getNome()+"; Telefone: "+a.getTelefone()+"; Endereco: "+a.getEndereco()+"; Email: "+a.getEmail());
		}
		
		
		
	}
}

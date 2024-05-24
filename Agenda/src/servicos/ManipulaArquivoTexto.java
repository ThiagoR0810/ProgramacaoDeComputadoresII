package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import negocio.Contato;

public class ManipulaArquivoTexto {

	private File arquivo;
	private Formatter gravador;
	private Scanner leitor;
	
	public ManipulaArquivoTexto(String nomeArquivo) {
		arquivo = new File(nomeArquivo);
	}
	
	public void abrirArquivoParaGravacao() {
		try {
			gravador = new Formatter(arquivo);
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao abrir o arquivo para gravacao.");
		}
	}
	
	public void gravarContato(Contato contato) {
		gravador.format("%s;%s;%s;%s;\n", contato.getNome(), contato.getTelefone(), contato.getEndereco(), contato.getEmail());
	}
	
	public void fecharArquivoGravacao() {
		gravador.close();
	}
	
	public void abrirArquivoParaLeitura() {
		try {
			leitor = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao abrir o arquivo para leitura.");
		}
	}

	public ArrayList<Contato> lerArquivo() {
		ArrayList<Contato> retorno = new ArrayList<>();
		while(leitor.hasNextLine()) {
			String infoContato = leitor.nextLine();
			String[] infoSeparada = infoContato.split(";");
			Contato aux = new Contato(infoSeparada[0], infoSeparada[1], infoSeparada[2], infoSeparada[3]);
			retorno.add(aux);
		}
		return retorno;
	}
	
	public void fecharArquivoLeitura() {
		leitor.close();
	}
	
	public File getArquivo() {
		return arquivo;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}

	public Formatter getGravador() {
		return gravador;
	}

	public void setGravador(Formatter gravador) {
		this.gravador = gravador;
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}
}

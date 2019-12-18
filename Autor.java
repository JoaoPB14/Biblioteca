import java.util.ArrayList;
import java.util.Scanner;

public class Autor {
	
	private String nome;
	private String nacionalidade;
	private String dataNasc;
	Scanner s = new Scanner(System.in);
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public String getDataNasc() {
		return this.dataNasc;
	}
	
	public void addAutor(){
		Autor autor;
		autor = new Autor();
		System.out.print("Digite o Nome do Autor: ");
	    autor.setNome(s.nextLine());
	    System.out.print("Digite a Nacionalidade do autor: ");
	    autor.setNacionalidade(s.nextLine());
	    System.out.print("Digite a Data de Nascimento do autor: ");
	    autor.setDataNasc(s.nextLine());
	    ArrayList<Autor> autores = new ArrayList<Autor>();
	    autores.add(autor);
}
}
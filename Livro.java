import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Livro extends Autor {

	private String titulo;
	private String editora;
	private String dataPublic;
	private String autor;
	Scanner s = new Scanner(System.in);
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void setDataPublic(String dataPublic) {
		this.dataPublic = dataPublic;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public String getDataPublic() {
		return this.dataPublic;
	}
	
	public String getAutor() {
		return this.autor;
	}

	public void addLivro() {
		Livro livro;
		livro = new Livro();
		System.out.print("Digite o Titulo: ");
	    livro.setTitulo(s.nextLine());
	    System.out.print("Digite a Editora: ");
	    livro.setEditora(s.nextLine());
	    System.out.print("Digite a Data da publicação: ");
	    livro.setDataPublic(s.nextLine());
	    System.out.print("Digite o nome do(s) Autor(es): ");
	    livro.setAutor(s.nextLine());
	    ArrayList<String> livros = new ArrayList<String>();
	    livros.add(getTitulo());
	    livros.add(getEditora());
	    livros.add(getDataPublic());
	    livros.add(getAutor());
	    
	    for (int i = 0, size = livros.size(); i < size; i++) {
	        System.out.println(livros.get(i));
	    }
        }
	}



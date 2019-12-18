import java.util.Scanner;

public class TestaBiblioteca {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	String escolha;
	int opcao = 0;
	Livro livro;
	livro = new Livro();
	Autor autor;
	autor = new Autor();
	
	while (opcao != 4 ) {
	System.out.print("1) Cadastrar um Livro\n"
					  +"2) Cadastrar um autor\n"
					  +"3) Pesquisar por Titulo\n"
					  +"4) Sair\n"
					  +"\nEscolha: ");
	
	opcao = Integer.parseInt(s.nextLine());
		switch(opcao) {
			case 1: 
				livro.addLivro();
				break;
			case 2:
				autor.addAutor();
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Opção Invalida");
				break;
	}	
	
		if (opcao != 4) {
			System.out.println("\nDeseja voltar para o menu?");
			escolha = (s.nextLine());
				if (escolha.trim().equals("sim"))
					opcao = 0;
				else 
					opcao = 4;
				
		}
	}
	}
}

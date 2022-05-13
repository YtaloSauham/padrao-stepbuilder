package demo;

import java.util.ArrayList;
import java.util.List;

import builders.LivroStepBuilder;
import entidades.Livro;

public class Main {
	
	public static void main(String[] args) {
		
		String autor1= "H. M. Deitel";
        String autor2=  "P. J. Deitel";
        
        String tradutor1= "Elias SVT";
        String tradutor2=  "Bene";
        
		  List<String> autores = new ArrayList<>();
	        autores.add(autor1);
	        autores.add(autor2);
	         
	        List<String> tradutores = new ArrayList<>();
	        tradutores.add(tradutor1);
	        tradutores.add(tradutor2);

		Livro livro = LivroStepBuilder
				.newBuilder()
				.nomeNacional("Java, como programar")
				.publicadoEm(2003)
				.dosAutores(autores)
				.edicao(4)
				.cidade("Porto Alegre")
				.editora("Bookman")
				.nomeOriginal("Java How to Program")
				.tradutores(tradutores)
				.paginas(1386)
				.isbn(9788536301235L)
				.constroi();
		
		System.out.println(livro);
	}
	
	

}

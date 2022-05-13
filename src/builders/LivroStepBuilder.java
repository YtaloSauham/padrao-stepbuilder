package builders;

import java.util.List;

import builders.LivroStepBuilder.ConstroiStep;
import builders.LivroStepBuilder.EditoraStep;
import builders.LivroStepBuilder.IsbnStep;
import builders.LivroStepBuilder.NomeOriginalStep;
import builders.LivroStepBuilder.PaginasStep;
import entidades.Livro;

public class LivroStepBuilder {
	
	private LivroStepBuilder() {
		
	}
	
	public static NomeNacional newBuilder() {
		return new Steps();
	}
	
	public static interface NomeNacional {
		AnoStep nomeNacional(String nomeNacional);
		
	}
	
	public static interface AnoStep{
		AutoresStep publicadoEm(int ano);
	}
	
	public static interface AutoresStep{
		EdicaoStep dosAutores(List<String> autores);

	}
	
	public static interface EdicaoStep{
		CidadeStep edicao(int edicao);
	}
	
	public static interface CidadeStep{
		EditoraStep cidade(String cidade);
	}
	
	public static interface EditoraStep{
		NomeOriginalStep editora(String editora);
	
	}
	
	public static interface NomeOriginalStep{
		TradutoresStep nomeOriginal(String nomeOriginal);
	}
	
	public static interface TradutoresStep{
		PaginasStep tradutores(List<String> tradutores);
	}
	
	public static interface PaginasStep{
		IsbnStep paginas(int paginas);
	}
	
	public static interface IsbnStep{
		ConstroiStep isbn(Long isbn);
	}
	
	public static interface ConstroiStep{
	Livro constroi();
	}
	
	private static class Steps implements NomeNacional,AnoStep,AutoresStep,CidadeStep,ConstroiStep,EdicaoStep,EditoraStep,IsbnStep,NomeOriginalStep,PaginasStep,TradutoresStep {
		
		private Livro livro;

		@Override
		public AnoStep nomeNacional(String nomeNacional) {
			
			this.livro = new Livro();
			this.livro.setNomeNacional(nomeNacional);
			return this;
		}

		@Override
		public AutoresStep publicadoEm(int ano) {
			
			this.livro.setAno(ano);
			return this;
		}

		@Override
		public EdicaoStep dosAutores(List<String> autores) {
			this.livro.setAutores(autores);
			return this;
		
		}

		@Override
		public CidadeStep edicao(int edicao) {
			this.livro.setEdicao(edicao);
			return this;
		}
		
		

		@Override
		public EditoraStep cidade(String cidade) {
			this.livro.setCidade(cidade);
			return this;
		}
		
		

		@Override
		public PaginasStep tradutores(List<String> tradutores) {
			this.livro.setTradutores(tradutores);
			return this;
		}

		@Override
		public IsbnStep paginas(int paginas) {
			this.livro.setPaginas(paginas);
			return this;
		}

		@Override
		public ConstroiStep isbn(Long isbn) {
			this.livro.setIsbn(isbn);
			return this;
		}

		@Override
		public NomeOriginalStep editora(String editora) {
			this.livro.setEditora(editora);
			return this;
		}
		
		@Override
		public TradutoresStep nomeOriginal(String nomeOriginal) {
			this.livro.setNomeOriginal(nomeOriginal);
			return this;
		}
		

		@Override
		public Livro constroi() {
			return this.livro;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

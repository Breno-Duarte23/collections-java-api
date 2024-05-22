package dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionarioMap;
	
	public Dicionario() {
		super();
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("Palavra não encontrada! ");
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String definicaoPorPalavra = null;
		if(!dicionarioMap.isEmpty()) {
			definicaoPorPalavra = dicionarioMap.get(palavra);
		} else {
			System.out.println("Palavra nao encontrada!!");
		}
		if(definicaoPorPalavra!=null) {
			return definicaoPorPalavra;
		} else {
			return "Palavra nao encontrada";
		}
	}
	
	public static void main(String[] args) {
	    Dicionario dicionario = new Dicionario();

	    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
	    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
	    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

	    dicionario.exibirPalavras();

	    String definicaoJava = dicionario.pesquisarPorPalavra("java");
	    System.out.println("Definição da linguagem 'java': " + definicaoJava);

	    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
	    
	    System.out.println(definicaoCSharp);

	    dicionario.removerPalavra("typescript");
	    dicionario.exibirPalavras();
	}
}

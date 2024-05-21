package ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
	//atributo
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		super();
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	class ComparatorPorAltura implements Comparator<Pessoa>{
		@Override
		public int compare(Pessoa p1, Pessoa p2) {
			return Double.compare(p1.getAltura(), p2.getAltura());
		}
	}
	
	public static void main(String[] args) {
	    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

	    // Adicionando pessoas à lista
	    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
	    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
	    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

	    // Exibindo a lista de pessoas adicionadas
	    System.out.println(ordenacaoPessoas.pessoaList);

	    // Ordenando e exibindo por idade
	    System.out.println(ordenacaoPessoas.ordenarPorIdade());

	    // Ordenando e exibindo por altura
	    System.out.println(ordenacaoPessoas.ordenarPorAltura());

	}
}

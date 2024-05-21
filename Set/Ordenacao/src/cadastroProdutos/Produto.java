package cadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private long codigo;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
}

class ComparatorPorPreco implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}

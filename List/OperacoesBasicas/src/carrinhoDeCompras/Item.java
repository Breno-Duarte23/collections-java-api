package carrinhoDeCompras;

public class Item {
	private String nome;
	private Double preco;
	private Integer qtd;
	
	public Item(String nome, Double preco, Integer qtd) {
		
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQtd() {
		return qtd;
	}


	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", Quantidade=" + qtd + "]";
	}
}

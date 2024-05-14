package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item i : itens) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		itens.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double total = 0;
		if(!itens.isEmpty()) {
			for(Item i : itens) {
				double valorItem = i.getPreco() * i.getQtd();
				total += valorItem;
			}
		} else {
			System.out.println("A lista está vazia!!");
		}
		return total;
	}

	
	public void exibirItens() {
		System.out.println(itens);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras itens = new CarrinhoDeCompras();
		
		itens.adicionarItem("Batata", 3.0, 10);
		itens.adicionarItem("Cenoura", 5.0, 10);
		itens.adicionarItem("Manga", 7.0, 10);
		
		itens.exibirItens();
		
		itens.removerItem("Cenoura");
		
		itens.exibirItens();
		
		System.out.println(itens.calcularValorTotal());
	}
}

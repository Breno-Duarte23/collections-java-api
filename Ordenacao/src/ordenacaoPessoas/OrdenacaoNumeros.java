package ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

	private List<Integer> numerosList;
	
	@Override
	public int compareTo(Integer o) {
		return 0;
	}
	
	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		this.numerosList.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
		Collections.sort(numerosAscendente);
		return numerosAscendente; 
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
		numerosDescendente.sort(Collections.reverseOrder());
		return numerosDescendente; 
	}
	
	public void exibirNumeros() {
	    if (!numerosList.isEmpty()) {
	      System.out.println(this.numerosList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	
	public static void main(String[] args) {

		 OrdenacaoNumeros numeros = new OrdenacaoNumeros();

		    numeros.adicionarNumero(2);
		    numeros.adicionarNumero(5);
		    numeros.adicionarNumero(4);
		    numeros.adicionarNumero(1);
		    numeros.adicionarNumero(99);
		    
		    numeros.exibirNumeros();

		    System.out.println(numeros.ordenarAscendente());

		    numeros.exibirNumeros();

		    System.out.println(numeros.ordenarDescendente());

		    numeros.exibirNumeros();
	}
}

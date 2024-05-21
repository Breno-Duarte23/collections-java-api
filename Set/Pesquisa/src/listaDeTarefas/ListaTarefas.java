package listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefaSet;
	
	public ListaTarefas() {
		super();
		this.tarefaSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for(Tarefa t: tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				break;
			}
		}
		if(tarefaParaRemover != null) {
			tarefaSet.remove(tarefaParaRemover);
		} else {
			System.out.println("Tarefa não encontrada ");
		}
	}
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	
	public int contarTarefas() {
		return tarefaSet.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa t: tarefaSet) {
			if(t.isConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa t: tarefaSet) {
			if(!t.isConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)){
				t.setConcluida(true);
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
	    for (Tarefa t : tarefaSet) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        tarefaParaMarcarComoPendente = t;
	        break;
	      }
	    }

	    if (tarefaParaMarcarComoPendente != null) {
	      if(tarefaParaMarcarComoPendente.isConcluida()) {
	        tarefaParaMarcarComoPendente.setConcluida(false);
	      }
	    } else {
	      System.out.println("Tarefa não encontrada na lista.");
	    }
	}
	
	public void limparListaTarefas() {
		tarefaSet.clear();
	}
	
	public static void main(String[] args) {
	    ListaTarefas listaTarefas = new ListaTarefas();

	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    listaTarefas.exibirTarefas();

	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    System.out.println(listaTarefas.obterTarefasPendentes());

	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");

	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	}
}

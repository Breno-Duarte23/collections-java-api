package listaTarefas;

public class Tarefa {
	//Atributo 
	private String descricao;

	public Tarefa(String descricao) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}
}

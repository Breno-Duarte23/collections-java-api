package listaDeAlunos;

import java.util.Comparator;

public class Aluno {
	private String nome;
	private long matricula;
	private double media;
	
	public Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + media + "]";
	}
}
class ComparatorNota implements Comparator<Aluno> {
	  @Override
	  public int compare(Aluno o1, Aluno o2) {
	    return Double.compare(o1.getMedia(), o2.getMedia());
	  }
	}
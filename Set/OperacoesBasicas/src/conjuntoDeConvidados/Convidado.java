package conjuntoDeConvidados;

public class Convidado {
	private String nome;
	private int codigoConvites;
	
	public Convidado(String nome, int codigoConvites) {
		super();
		this.nome = nome;
		this.codigoConvites = codigoConvites;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvites() {
		return codigoConvites;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvites=" + codigoConvites + "]";
	}
	
	
}

import java.util.Objects;

public class Produto {
	private String nome;
	private String descrição;
	private Double preço;
	
	public Produto(String nome, String descrição, Double preço) {
		super();
		this.nome = nome;
		this.descrição = descrição;
		this.preço = preço;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descrição, nome, preço);
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
		return Objects.equals(descrição, other.descrição) && Objects.equals(nome, other.nome)
				&& Objects.equals(preço, other.preço);
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descrição=" + descrição + ", preço=" + preço + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
}

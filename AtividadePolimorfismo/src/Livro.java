import java.util.Objects;

public class Livro extends Produto {
	private String autores;
	private String ISBN;
	private String editora;
	

	public Livro(String nome, String descrição, Double preço, String autores, String iSBN, String editora) {
		super(nome, descrição, preço);
		this.autores = autores;
		ISBN = iSBN;
		this.editora = editora;
	}
	

	@Override
	public String toString() {
		return "Livro"+super.toString()+" [autores=" + autores + ", ISBN=" + ISBN + ", editora=" + editora + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ISBN, autores, editora);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(autores, other.autores)
				&& Objects.equals(editora, other.editora);
	}


	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}

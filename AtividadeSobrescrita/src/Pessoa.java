
public class Pessoa {
	private String nome;
	private String endereço;
	private int idade;
	private String cpf;
	private String sexo;
	
	public void imprimirValores() {
		getNome();
		getEndereço();
		getIdade();
		getCpf();
		getSexo();
	}
	public void andar() {
		System.out.println("Pessoa andar()");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}

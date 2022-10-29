
public class Paciente extends Pessoa {
	private String doença;
	private String medicação;
	
	public void imprimirValores() {
		super.imprimirValores();
		getDoença();
		getMedicação();
	}
	public void sentirDor() {
		System.out.println("Paciente sentirDor()");
	}
	public void terAlta() {
		System.out.println("Paciente terAlta()");
	}
	public String getDoença() {
		return doença;
	}
	public void setDoença(String doença) {
		this.doença = doença;
	}
	public String getMedicação() {
		return medicação;
	}
	public void setMedicação(String medicação) {
		this.medicação = medicação;
	}
	
}

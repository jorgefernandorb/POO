
public class Medico extends Pessoa {
	private String crm;
	private double salário;
	private String especialização;
	
	public void imprimirValores() {
		super.imprimirValores();
		getCrm();
		getSalário();
		getEspecialização();
	}
	public void darPlantão() {
		System.out.println("Medico darPlantão()");
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
	public String getEspecialização() {
		return especialização;
	}
	public void setEspecialização(String especialização) {
		this.especialização = especialização;
	}
}


public class ObjetoGeometrico {
	private double base;
	private double aultura;
	
	
	public ObjetoGeometrico(double base) {
		this.base = base;
	}
	public ObjetoGeometrico(double base, double aultura) {
		this.base = base;
		this.aultura = aultura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAultura() {
		return aultura;
	}
	public void setAultura(double aultura) {
		this.aultura = aultura;
	}
	public double area (double a, double b) {
		return a*b;
	}
	public double perimetro (double a, double b) {
		return 2*(a+b);
	}
}

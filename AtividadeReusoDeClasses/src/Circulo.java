
public class Circulo extends ObjetoGeometrico {
	private double cordX, cordY;
	private double raio;

	public Circulo(double cordX, double cordY, double raio) {
		super(0,0);
		this.cordX = cordX;
		this.cordY = cordY;
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCordX() {
		return cordX;
	}

	public void setCordX(double cordX) {
		this.cordX = cordX;
	}

	public double getCordY() {
		return cordY;
	}

	public void setCordY(double cordY) {
		this.cordY = cordY;
	}
	public double area() {
		return Math.PI*raio*raio;
	}
	public double perimetro() {
		return 2*Math.PI*raio;
	}
}


public class Triangulo extends ObjetoGeometrico {
	private double ladoB, ladoC, s;
	

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super(ladoA);
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double getS() {
		return s;
	}

	public void setS() {
		this.s = (ladoB+ladoC+getBase())/2;
	}
	public double area () {
		return Math.sqrt(s*(s-getBase())*(s-ladoB)*(s-ladoC));
	}
	public double perimetro() {
		return getBase()+ladoB+ladoC;
	}
}

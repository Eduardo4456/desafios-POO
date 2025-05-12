package circulo;

public class Circulo {
	
	double raio;
	final double pi = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		double area = this.pi * (this.raio * this.raio);
		return area;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}

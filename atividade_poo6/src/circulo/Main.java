package circulo;

public class Main {
	public static void main(String[] args) {
		Circulo[] circulos = new Circulo[5];
		
		circulos[0] = new Circulo(5);
		circulos[1] = new Circulo(2);
		circulos[2] = new Circulo(3);
		circulos[3] = new Circulo(6);
		circulos[4] = new Circulo(1);
		
		for(int i = 0; i < circulos.length; i++) {
			System.out.print("\nCirculo [" + (i + 1) + "]" + "\nRaio: " + circulos[i].getRaio() + "\nÁrea: " + circulos[i].calcularArea());
		}
		
	}
}

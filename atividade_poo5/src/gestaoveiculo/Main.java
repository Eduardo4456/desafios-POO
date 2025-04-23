package gestaoveiculo;

public class Main {
	public static void main(String[] args) {
		Moto moto = new Moto();
		Carro carro = new Carro();
		
		moto.calcularAluguel(5);
		carro.calcularAluguel(5);
	}
}

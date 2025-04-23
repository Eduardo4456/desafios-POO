package gestaoveiculo;

public class Moto extends Veiculo{

	double aluguel = 50;
	
	@Override
	public void calcularAluguel(int dia) {
		aluguel = aluguel * dia;
		System.out.println("Aluguel da moto: " + aluguel);
	}

}

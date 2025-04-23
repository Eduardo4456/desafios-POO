package gestaoveiculo;

public class Carro extends Veiculo{
	
	double aluguel = 100;
	
	@Override
	public void calcularAluguel(int dia) {
		aluguel = aluguel * dia;
		System.out.println("Aluguel do carro: " + aluguel);
	}

}

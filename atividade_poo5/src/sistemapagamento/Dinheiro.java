package sistemapagamento;

public class Dinheiro implements Pagamento{

	@Override
	public void processarPagamento() {
		System.out.println("Pagando com dinheiro");
	}

}

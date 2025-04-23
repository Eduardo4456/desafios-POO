package sistemapagamento;

public class CartaoCredito implements Pagamento{

	@Override
	public void processarPagamento() {
		System.out.println("Pagando com cartão");
	}

}

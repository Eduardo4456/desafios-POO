package sistemapagamento;

public class Main {
	public static void main(String[] args) {
		Pagamento dinheiro = new Dinheiro();
		Pagamento cartao = new CartaoCredito();
		
		finalizarCompra(cartao);
		finalizarCompra(dinheiro);
	}
	
	public static void finalizarCompra(Pagamento pagamento) {
		pagamento.processarPagamento();
	}
}

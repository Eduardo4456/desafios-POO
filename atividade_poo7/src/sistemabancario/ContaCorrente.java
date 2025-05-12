package sistemabancario;

public class ContaCorrente {
	
	private String numConta;
	private double saldo;
	
	public ContaCorrente(String numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(valor > saldo) {
			throw new SaldoInsuficienteException("ERRO saldo insuficiente");
		} else {
			saldo -= valor;
		}
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

package bancodobrasil;

public class ContaPoupanca {
	double saldo;
	
	public void depositarValor(double valor) {
		this.saldo += valor;
	}
	
	public void mostrar() {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void aplicarJuros(double juros) {
		this.saldo += this.saldo * (juros/100);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

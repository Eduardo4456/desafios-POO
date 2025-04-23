package bancodobrasil;

public class Main {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.setSaldo(1000);
		contaCorrente.depositarValor(100);
		contaCorrente.mostrar();
		
		contaCorrente.depositarValor(400);
		contaCorrente.mostrar();
		
		contaCorrente.sacar(200);
		contaCorrente.mostrar();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setSaldo(5000);
		contaPoupanca.mostrar();
		
		contaPoupanca.depositarValor(1000);
		contaPoupanca.mostrar();
		
		contaPoupanca.aplicarJuros(0.5);
		contaPoupanca.mostrar();
		
		ContaTesouroDireto contaTesouroDireto = new ContaTesouroDireto();
		contaTesouroDireto.setSaldo(10000);
		
		ContaPoupanca[] contaPoupancaArray = new ContaPoupanca[10];
		contaPoupancaArray[1] = contaTesouroDireto;
		
		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setSaldo(10000);
		
		contaPoupancaArray[2] = contaPoupanca2;
		
		System.out.println("Saldo primeira posição: " + contaPoupancaArray[1].getSaldo());
		System.out.println("Saldo segunda posição: " + contaPoupancaArray[2].getSaldo());
		
		contaPoupancaArray[1].depositarValor(500);
		System.out.println("Saldo primeira posição: " + contaPoupancaArray[1].getSaldo());
		
		contaPoupancaArray[2].depositarValor(500);
		System.out.println("Saldo segunda posição: " + contaPoupancaArray[2].getSaldo());
		
		contaPoupancaArray[1].aplicarJuros(1);
		System.out.println("Saldo primeira posição: " + contaPoupancaArray[1].getSaldo());
		
		contaPoupancaArray[2].aplicarJuros(1);
		System.out.println("Saldo segunda posição: " + contaPoupancaArray[2].getSaldo());
		
		
	}
}

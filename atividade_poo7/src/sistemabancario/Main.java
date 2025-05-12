package sistemabancario;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String numConta;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero da conta: ");
		numConta = entrada.nextLine();
		
		System.out.println("Saldo: ");
		saldo = entrada.nextDouble();
		
		ContaCorrente conta = new ContaCorrente(numConta, saldo);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Valor do " + i + " saque:");
			double saque = entrada.nextDouble();
			
			try {
				conta.sacar(saque);
				System.out.println("Saque de R$" + saque);
			}
			catch (SaldoInsuficienteException e) {
				System.out.println(e.getMessage());
			}
		}
		
		entrada.close();
	}
}

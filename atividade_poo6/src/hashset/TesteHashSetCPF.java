package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
	public static void main(String[] args) {
		HashSet<String> cpfs = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o CPF " + i + " :");
			String cpf = scanner.nextLine();
			cpfs.add(cpf);
		}
		scanner.close();
		
		System.out.println("\nResultado: ");
		for(String cpf : cpfs) {
			System.out.println(cpf);
		}
	}
}

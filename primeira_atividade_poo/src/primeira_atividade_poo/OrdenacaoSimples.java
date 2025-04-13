package primeira_atividade_poo;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoSimples {
	public static void main(String[] args) {
		String nomes[] = new String[8];
		
		Scanner ins = new Scanner(System.in);
		for(int i=0; i<nomes.length; i++) {
			System.out.println("Digite o nome: ");
			nomes[i] = ins.next();
		}
		
		System.out.println("Lista antes da ordenação: ");
		for(int i=0; i<nomes.length; i++) {
			System.out.println("[" + i + "] = " + nomes[i]);
		}
		
		Arrays.sort(nomes);
		
		System.out.println("\nLista depois da ordenação:");
		for(int i=0; i<nomes.length; i++) {
			System.out.println("[" + i + "] = " + nomes[i]);
		}
	}
}

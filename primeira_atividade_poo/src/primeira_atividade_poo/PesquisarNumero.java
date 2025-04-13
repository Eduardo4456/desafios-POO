package primeira_atividade_poo;

import java.util.Random;
import java.util.Scanner;

public class PesquisarNumero {
	public static void main(String[] args) {
		int numeros[] = new int[15];
		int num_pesq = 0;
		boolean achou = false;
		
		Random gerador = new Random();
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = gerador.nextInt(101);
			System.out.println("["+ i + "] = " + numeros[i]);
		}
		
		Scanner pesq = new Scanner(System.in);
		System.out.println("Pesquise um número: ");
		num_pesq = pesq.nextInt();
		
		for(int i=0; i < numeros.length; i++) {
			if(num_pesq == numeros[i]) {
				System.out.println("O número " + numeros[i] + " está na posição [" + i + "]");
				achou = true;
				break;
			}
			else {
				achou = false;
			}
		}
		
		if(achou == false) {
			System.out.println("O número não existe na lista.");
		}
	}
}

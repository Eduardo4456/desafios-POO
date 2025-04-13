package primeira_atividade_poo;

import java.util.Scanner;

public class EncontraMaiorMenor {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int menor_num = 1;
		int menor_pos = 1;
		int maior_num = 1;
		int maior_pos = 1;
		
		for(int i = 0; i < numeros.length; i++) {
			Scanner ent_numeros = new Scanner(System.in);
			System.out.println("Digite o número na posição [" + i + "]:");
			numeros[i] = ent_numeros.nextInt();
		}
		menor_num = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor_num) {
				menor_num = numeros[i];
				menor_pos = i;
			}
		}
		System.out.println("O menor número é " + menor_num + " na posição [" + menor_pos + "].");
		maior_num = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior_num) {
				maior_num = numeros[i];
				maior_pos = i;
			}
		}
		System.out.println("O maior número é " + maior_num + " na posição [" + maior_pos + "].");
	}
}

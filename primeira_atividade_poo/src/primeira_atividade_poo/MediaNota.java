package primeira_atividade_poo;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {
		float notas[] = new float[5];
		float media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			Scanner ent_nota = new Scanner(System.in);
			System.out.println("Digite a nota " + (i+1) + ":");
			notas[i] = ent_nota.nextFloat();
			media = media + notas[i];
		}
		media = media/5;
		System.out.println("A media final é: " + media + "\n");
		
		//notas acima da media
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > media) {
				System.out.println("\nA nota: " + notas[i] + " está acima da média.");
			}
		}
		
	}
}

package letraposicao;

import java.util.Scanner;

public class Posicao {
	public static void main(String[] args) {
		String nome;
		int posicao;
		char letra;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Posição: ");
		
		try {
			posicao = entrada.nextInt();
			letra = nome.charAt(posicao);
			
			System.out.println("Letra na posição [" + posicao + "]: " + letra);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("ERRO na posição");
		}
		catch (Exception e) {
			System.out.println("ERRO na entrada");
		}
		
		entrada.close();
	}
}

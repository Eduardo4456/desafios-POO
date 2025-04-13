package primeira_atividade_poo;

import java.util.ArrayList;
import java.util.Random;

public class ParImpar {
	public static void main(String[] args) {
		int numeros[] = new int[20];
		ArrayList par = new ArrayList();
		ArrayList impar = new ArrayList();
		Random gerador = new Random();
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = gerador.nextInt(51);
		}
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]%2==0) {
				par.add(numeros[i]);
			}
			else if(numeros[i]%2!=0) {
				impar.add(numeros[i]);
			}
		}
		
		System.out.println("Lista completa:");
		for(int i=0; i<numeros.length; i++) {
			System.out.println("[" + i + "] = " + numeros[i]);
		}

		
		System.out.println("\nNúmeros pares:");
		for(int i=0; i<par.size(); i++) {
			System.out.println("[" + i +  "] = " + par.get(i));
		}
		System.out.println("A lista possui " + par.size() + " números.");
		
		System.out.println("\nNúmeros impares:");
		for(int i=0; i<impar.size(); i++) {
			System.out.println("[" + i +  "] = " + impar.get(i));
		}
		System.out.println("A lista possui " + impar.size() + " números.");
		
	}
}

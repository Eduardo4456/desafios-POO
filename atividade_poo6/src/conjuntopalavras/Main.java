package conjuntopalavras;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> animais = new HashSet<>();
		animais.add("cachorro");
		animais.add("gato");
		animais.add("cachorro"); // repetida, será ignorada

		System.out.println(animais);
	}
}

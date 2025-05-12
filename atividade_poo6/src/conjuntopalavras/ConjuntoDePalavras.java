package conjuntopalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
	private Set<String> palavras;
	
	public ConjuntoDePalavras(String[] palavra) {
	    palavras = new HashSet<>();

	    for (String p : palavra) {
	        palavras.add(p);
	    }
	}
	
	public boolean contemTodas(String palavras) {
	    String[] palavrasArray = palavras.split(",");

	    for (String p : palavrasArray) {
	        if (!palavras.contains(p)) {
	            return false;
	        }
	    }
	    return true; 
	}

}

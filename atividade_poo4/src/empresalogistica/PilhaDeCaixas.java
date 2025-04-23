package empresalogistica;

import java.util.Stack;

public class PilhaDeCaixas {
	
	private double alturaMax;
	private Stack<Caixa> pilha;
	Caixa[] caixaTopo = new Caixa[10];

	public PilhaDeCaixas(double alturaMax) {
		super();
		this.alturaMax = alturaMax;
		this.pilha = new Stack<>();
	}
	
	public boolean empilhar(Caixa caixa) {
		if(getAlturaAtual() + caixa.getAltura() > this.alturaMax) {
			return false;
		}
		
		double pesoAcima = caixa.getPeso();
		for(int i = pilha.size() - 1; i >= 0; i--) {
			Caixa c = pilha.get(i);
			if(c instanceof CaixaFraca) {
				CaixaFraca caixaFraca = (CaixaFraca) c;
				if(pesoAcima > caixaFraca.getPesoMaxSuportado()) {
					System.out.println("[ERRO] caixa fraca");
					return false;
				}
			}
			pesoAcima += c.getPeso();
		}
		
		pilha.push(caixa);
		System.out.println("Caixa empilhada: " + caixa.getId());
		return true;
	}
	
	public void exibirPilha() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.println("Pilha de Caixas:");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilha.get(i).exibirEtiqueta();
        }
        System.out.println("\n|Altura: " + getAlturaAtual() + " m" + " |Peso: " + getPesoTotal() + " Kg");
    }
	
	public Caixa desempilhar() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return pilha.pop();
    }

	public double getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	public double getAlturaAtual() {
	    double altura = 0;
	    for (Caixa c : pilha) {
	         altura += c.getAltura();
	    }
	        return altura;
	}
	
	public double getPesoTotal() {
        double peso = 0;
        for (Caixa c : pilha) {
            peso += c.getPeso();
        }
        return peso;
    }

}

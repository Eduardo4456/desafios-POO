package empresalogistica;

public class Main {
	public static void main(String[] args) {
		PilhaDeCaixas pilha = new PilhaDeCaixas(100);
		
		Caixa c1 = new Caixa("aaa", "açucar", 5.0, 12.0);
		Caixa c2 = new Caixa("bbb", "Mesa", 10.0, 14.0);
		Caixa c3 = new Caixa("ccc", "cadeiras", 9.0, 1);
		
		pilha.empilhar(c1);
		pilha.empilhar(c2);
		pilha.empilhar(c3);
		
		pilha.desempilhar();
		
		pilha.exibirPilha();
		
	}
}

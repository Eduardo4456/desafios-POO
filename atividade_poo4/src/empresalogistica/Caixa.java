package empresalogistica;

public class Caixa{
	
	private String id;
	private String conteudo;
	private double peso;
	private double altura;
	
	public Caixa(String id, String conteudo, double peso, double altura) {
		super();
		this.id = id;
		this.conteudo = conteudo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void exibirEtiqueta() {
		System.out.println("Id: " + this.id + "| Conteudo: " + this.conteudo + " | Peso: " + this.peso + " | altura: " + this.altura);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0 ) {
			this.peso = peso;
		}
		else {
			System.out.println("[ERRO] peso inválido");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura >= 0) {
			this.altura = altura;
		}
		else {
			System.out.println("[ERRO] altura inválida");
		}
	}

}

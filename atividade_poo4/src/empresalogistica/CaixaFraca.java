package empresalogistica;

public class CaixaFraca extends Caixa{
	private double pesoMaxSuportado;

	public CaixaFraca(double pesoMaxSuportado, String id, String conteudo, double peso, double altura) {
		super(id, conteudo, peso, altura);
		this.pesoMaxSuportado = pesoMaxSuportado;
	}

	public double getPesoMaxSuportado() {
		return pesoMaxSuportado;
	}

	public void setPesoMaxSuportado(double pesoMaxSuportado) {
		if(pesoMaxSuportado >= 0) {
			this.pesoMaxSuportado = pesoMaxSuportado;
		}
		else {
			System.out.println("[ERRO] peso máximo inválido");
		}
	}
	
}

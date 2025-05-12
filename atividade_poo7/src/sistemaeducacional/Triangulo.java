package sistemaeducacional;

public class Triangulo {
	private double l1;
	private double l2;
	private double l3;
	
	public Triangulo(double l1, double l2, double l3) throws DimensoesInvalidasException {
		setL1(l1);
		setL2(l2);
		setL3(l3);
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) throws DimensoesInvalidasException {
		if(!(l1 > Math.abs(this.l2 - this.l3) && l1 < (this.l2 + this.l3))) {
			 throw new DimensoesInvalidasException("ERRO lado inválido");
		}
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) throws DimensoesInvalidasException {
		if(!(l2 > Math.abs(this.l1 - this.l3) && l2 < (this.l1 + this.l3))) {
			 throw new DimensoesInvalidasException("ERRO lado inválido");
		}
		
		this.l2 = l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL3(double l3) throws DimensoesInvalidasException {
		if(!(l3 > Math.abs(this.l1 - this.l2) && l3 < (this.l1 + this.l2))) {
			 throw new DimensoesInvalidasException("ERRO lado inválido");
		}
		
		this.l3 = l3;
	}
}

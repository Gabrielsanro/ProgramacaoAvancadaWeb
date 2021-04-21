package br.com.unipe.gabriel.moeda;

public class Dinheiro {
	
	private float dinheiro;

	public double Moeda() {
		return dinheiro;
	}

	public double Moeda(float dinheiro) {
		return this.dinheiro = dinheiro;
	}

	public float getValor() {
		return dinheiro;
	}

	public void setValor(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public double Calculo() {
		return (this.dinheiro * 5.57);
	}
	
}
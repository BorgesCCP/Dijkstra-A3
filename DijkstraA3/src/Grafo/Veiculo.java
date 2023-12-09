package Grafo;


public class Veiculo {
	private int id;
	private String tipo;
	private double kmPorL;
	private String combustivel;
	private double valorCombustivel;
	private double velocidadeMedia;

	public double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public Veiculo(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getKmPorL() {
		return kmPorL;
	}

	public void setKmPorL(double kmPorL) {
		this.kmPorL = kmPorL;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


}

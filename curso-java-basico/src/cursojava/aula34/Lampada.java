package cursojava.aula34;

public class Lampada {

	private String tipo;
	private String cor;
	private double potLamapda;
	private double preco;
	private int tensao;
	private boolean statusLampada;
	
	
	public Lampada() {	}

	public Lampada(String tipo, String cor, double potLamapda, double preco, int tensao, boolean statusLampada) {
		this.tipo = tipo;
		this.cor = cor;
		this.potLamapda = potLamapda;
		this.preco = preco;
		this.tensao = tensao;
		this.statusLampada = statusLampada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPotLamapda() {
		return potLamapda;
	}

	public void setPotLamapda(double potLamapda) {
		this.potLamapda = potLamapda;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	
	public boolean isStatusLampada() {
		return statusLampada;
	}

	public void setStatusLampada(boolean statusLampada) {
		this.statusLampada = statusLampada;
	}

	public void ligarLampada() { 
		this.statusLampada = true;
	} 
	
	public void desligarLampada() {
		this.statusLampada = false;
	}
	

}

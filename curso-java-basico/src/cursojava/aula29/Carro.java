package cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numberPasg;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numberPasg, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numberPasg = numberPasg;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() { }

	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + obterAutonomia() + " km!");
	}

	void exibirMarca() {
		System.out.println("A marca do carro é: " + marca);
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado!");
		return capCombustivel * consumoCombustivel;
	}

	double calculaCombustivel(double km) {
		return km / consumoCombustivel;
	}

}

package cursojava.aula31;

public class Carro {

	String marca;
	String modelo;
	int numberPasg;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + obterAutonomia() + " km!");
	}

	void exibirMarca() {
		System.out.println("A marca do carro é: " + marca);
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado!");
		return this.capCombustivel * this.consumoCombustivel;
	}

	double calculaCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

}

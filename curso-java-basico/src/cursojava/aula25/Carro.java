package cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numberPasg;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km!");		
	}
	
	void exibirMarca() {
		System.out.println("A marca do carro é: " + marca);
	}
}

package cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numberPasg;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + obterAutonomia() + " km!");		
	}
	
	void exibirMarca() {
		System.out.println("A marca do carro �: " + marca);
	}
	
	double obterAutonomia () {
		System.out.println("M�todo obterAutonomia foi chamado!");
		return capCombustivel * consumoCombustivel;
	}
}

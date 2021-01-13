package cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
	
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numberPasg = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fuca";
		fusca.numberPasg = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		
		van.exibirAutonomia();
		fusca.exibirMarca();

		
	}

}

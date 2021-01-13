	package cursojava.aula27;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
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

		
		
		System.out.print("Digite seu KM: ");
	    double km = scan.nextDouble();
				
		double qtdCombustivel = van.calculaCombustivel(km);
		System.out.println(qtdCombustivel);
	}

}

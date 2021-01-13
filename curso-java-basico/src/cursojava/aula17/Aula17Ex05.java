package cursojava.aula17;

import java.util.Scanner;

public class Aula17Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean valido = false;
		double popA;
		double popB;
		double taxaCresA;
		double taxaCresB;

		do {
			System.out.println("Entre com a popula��o A: ");
			popA = scan.nextInt();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Digite um n�mero maior que 0");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento da Popula��o A: ");
			taxaCresA = scan.nextDouble();

			if (taxaCresA >= 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento invalida");
			}

		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite a quantidade dA POPULI��O do PAIS B");
			popB = scan.nextInt();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Digite um n�mero maior que 0");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento da Popula��o B: ");
			taxaCresB = scan.nextDouble();

			if (taxaCresB >= 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento invalida");
			}

		} while (!valido);
		
		int cont = 0;
		
		while(popA < popB) {
			popA += (popA / 100)* taxaCresA;
			popB += (popB / 100)* taxaCresB;
			cont++;			
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantidade de anos: " + cont);

	}

}
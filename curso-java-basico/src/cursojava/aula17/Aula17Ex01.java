package cursojava.aula17;

import java.util.Scanner;

public class Aula17Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite uma nota de 0 a 10: ");
		double nota = scan.nextDouble();
		
		while(nota > 10) {
			System.out.println("valor invalido");
			System.out.println("Digite uma nota de 0 a 10: ");
			nota = scan.nextDouble();
		}
		
		System.out.println("Valor V�lido");
	}

}

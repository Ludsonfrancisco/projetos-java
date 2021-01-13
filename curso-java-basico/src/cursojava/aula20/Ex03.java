package cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		
		Random numberRandom = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Entre com o valor da pos [" + i + "," + j + "] ");
				matriz[i][j] = scan.nextInt();
			}
			System.out.println();
		}

//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				matriz[i][j] = numberRandom.nextInt(50);
//			}
//			System.out.println();
//		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] % 2 == 0) {
					numPar++;
				} else {
					numImpar++;
				}
			}
		}

		System.out.println("Quantida de números PARES: " + numPar);
		System.out.println("Quantida de números IMPARES: " + numImpar);
	}

}

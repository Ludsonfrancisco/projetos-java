package cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		Random numeroRandom = new Random ();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(100);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int col = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					col = j;
				}
				
			}
		}
		
		System.out.println("Maior Valor = " + maior);
		System.out.println("A linha = " + linha);
		System.out.println("A coluna = " + col);
	}

}

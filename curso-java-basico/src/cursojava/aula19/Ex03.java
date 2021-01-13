package cursojava.aula19;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int [] arrayA = new int [15];
		int [] arrayB = new int [arrayA.length];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Entre com o valor" + (i + 1) + ": ");
			arrayA[i] = scan.nextInt();
			
			arrayB[i] = arrayA[i] * arrayA[i];
		}
		
		System.out.println("VETOR A: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("["+ arrayA[i] + "] ");			
		}
		
		
		
		System.out.println("\nVETOR B: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("[" + arrayB[i] + "] ");			
		}
		
	}

	
}

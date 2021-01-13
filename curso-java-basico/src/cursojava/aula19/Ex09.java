package cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		int [] arrayA = new int [10];
		int [] arrayB = new int [arrayA.length];
		double [] arrayC = new double [arrayA.length];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Entre com o valor " + (i + 1) + " do Vetor A: " );
			arrayA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Entre com o valor " + (i + 1) + " do Vetor B: " );
			arrayB[i] = scan.nextInt();
			
			arrayC[i] = arrayA[i] /  arrayB[i];
		}
	
		System.out.println("VETOR A: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("["+ arrayA[i] + "] ");
		}
		
		
		
		System.out.println("\nVETOR B: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("[" + arrayB[i] + "] ");			
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##")
				;
		System.out.println("\nVETOR C: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("[" + arrayC[i] + "] ");			
		}


	}

}

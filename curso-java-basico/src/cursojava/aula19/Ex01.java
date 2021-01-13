package cursojava.aula19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] arrA = new int[5]; 
		int [] arrB = new int[arrA.length]; 
		
		for (int i = 0; i < arrA.length ; i++){
			System.out.println("Entre com o valor da posição " + (i + 1)  + ": ");
			arrA[i]  = scan.nextInt();
			
			arrB[i] = arrA[i];
			
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0;  i < arrA.length; i++) {
			System.out.print("[" + arrA[i] + "] " );
			
		}
	

	}

}

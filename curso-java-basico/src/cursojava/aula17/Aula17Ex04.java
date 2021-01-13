package cursojava.aula17;

import java.util.Scanner;

public class Aula17Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int popA = 80000;
		int popB = 200000;
		
		int crescimento = 0;
		
		while (popA < popB) {
			popA += (popA/100)*3;
			popB += (popB/100)*1.5;
			crescimento ++;
		}
		System.out.println("popA = " + popA);
		System.out.println("popB = " + popB);
		System.out.println(crescimento);
	}

}

package cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana){
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: System.out.println("Dia �til"); break;
			case 1:
			case 7: System.out.println("Fi de semana"); break; 
			default: System.out.println("N�o � um dia da semana v�lido.");
		}

		

	}

}

package cursojava.aula17;

import java.util.Scanner;

public class Aula17Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		boolean infoValida = false;
		
		String nome, sexo, estadoCivil;
		int idade;
		float salario;
				
		do {
			
			System.out.println("Digite seu Nome ");
			nome = scan.nextLine();
					
				if (nome.length() <= 3) {
				System.out.println("O nome deve possuir mais de 3 letras!");
				}else {
					infoValida = true;
				}				
		
		}while (!infoValida);
		
		infoValida = false;		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
					
				if (idade > 150 ) {
				System.out.println("Idade inv�lida! Digite uma idade entre 0 e 150!");
				}else {
					infoValida = true;
				}	
				
		}while (!infoValida);
	
		
		infoValida = false;
		do {
			System.out.println("Digite seu sal�rio: ");
			salario = scan.nextFloat();
					
				if (salario <= 0 ) {
				System.out.println("Sal�rio inv�lido! Sal�rio na� pode ser 0!");
				}else {
					infoValida = true;
				}	
				
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu sexo: ");
			sexo = scan.next();
					
				if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
					infoValida = true;
				}else {
					System.out.println("Sexo Inv�lio! digite M para masculino ou F para feminio!");					
				}	
				
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu Estado C�vil: ");
			estadoCivil = scan.next();
					
				if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") || 
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d") ){
					
					infoValida = true;
				}else {
					System.out.println("Estado Civil Inv�lio! Estado Civil precisa ser 'S', 'C', 'V', 'D'!");					
				}	
				
		}while (!infoValida);
		
	
		System.out.println("As seguintes inform��es foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo );
		System.out.println("Estado Civil: " + estadoCivil);

	}
	

}

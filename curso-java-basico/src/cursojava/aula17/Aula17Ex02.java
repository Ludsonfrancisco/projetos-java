package cursojava.aula17;

import java.util.Scanner;

public class Aula17Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite do usuário");
		String user = scan.nextLine();
		
		System.out.println("Digite a senha");
		String password = scan.nextLine();
		
		while (user.equalsIgnoreCase(password)) {
			System.out.println("Senha invalida, por favor digite a senha diferente do usuário!");
			
			System.out.println("Digite do usuário");
			 user = scan.nextLine();
			
			System.out.println("Digite a senha");
			 password = scan.nextLine();
		}

		System.out.println("Login com sucesso!");
	}

}

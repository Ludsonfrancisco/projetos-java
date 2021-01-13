package cursojava.aula24;

public class Ex04 {

	public static void main(String[] args) {
		
		Ex03 livro = new Ex03 ();
		
		livro.name = "JS Easy";
		livro.anoLancamento = 2020;
		livro.author = "Ludson Francisco";
		livro.numPages = 320;
		livro.price = 63.99;
		
		System.out.println("Nome do Livro = " + livro.name);
		System.out.println("O preço do livro = " + livro.price);
	}

}

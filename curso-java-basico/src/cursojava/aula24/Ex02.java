package cursojava.aula24;

public class Ex02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.name = "JS Easy";
		livro.anoLancamento = 2020;
		livro.author = "Ludson Francisco";
		livro.numPages = 320;
		
		System.out.println("Nome do Livro = " + livro.name);
	}

}

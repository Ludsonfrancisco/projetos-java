package cursojava.aula24;

public class Ex01 {

	public static void main(String[] args) {
		
		Lampada fluorescente = new Lampada ();
		
		fluorescente.tipo = "Flurescente";
		fluorescente.tensao = 127;
		fluorescente.cor = "Branca";
		fluorescente.potLamapda = 15;
		fluorescente.preco = 8.99;
		
		System.out.println(fluorescente.tipo);
		System.out.println(fluorescente.tensao);
		System.out.println(fluorescente.cor);
		System.out.println(fluorescente.potLamapda);
		System.out.println(fluorescente.preco);
	}

}

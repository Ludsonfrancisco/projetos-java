package cursojava.aula34;

public class Ex01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada ();
		
		System.out.println(lampada.isStatusLampada());
		lampada.ligarLampada();
		System.out.println(lampada.isStatusLampada());
	}

}

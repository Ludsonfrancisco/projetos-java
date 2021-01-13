package cursojava.aula27;

public class Lampada {
	String tipo;
	String cor;
	double potLamapda;
	double preco;
	int tensao;
	boolean lampadaAcesa;

	void ligarLampada() {
		lampadaAcesa = true;
		System.out.println("A lampada está acesa!");
	}

	void desligarLampada() {
		lampadaAcesa = false;
		System.out.println("A lampada está desligada!");	
	}

}
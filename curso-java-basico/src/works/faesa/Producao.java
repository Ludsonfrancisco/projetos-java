package works.faesa;

public class Producao {

	int previsaoDemanda = 200;
	int producaoNormal = 250;
	int estoqueInicial = 50;
	static int estoqueFinal;

	public static void main(String[] args) {

		Producao producao = new Producao();

		Producao.estoqueFinal = (producao.estoqueInicial + producao.producaoNormal) - producao.previsaoDemanda;

		System.out.println("O estoque final previsto para o mês é de: " + Producao.estoqueFinal + " Unidades.");
	}
}

package cursojava.aula27;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ContaCorrente cc = new ContaCorrente();

		cc.saldo = 1000.00;
		cc.limit = 500.00;

//		cc.verificarSaldoSaque();
//		cc.depositarDinheiro(1000);
//		cc.verificarSaldoSaque();
//		cc.depositarDinheiro(1000);
//		cc.verificarSaldoSaque();
//		cc.depositarDinheiro(1000);
//		cc.verificarSaldoSaque();
//		cc.sacarDinheiro(4011.00);
//		cc.verificarSaldoSaque();
		
		cc.sacarDinheiro(1100.00);
		cc.verificarSaldoSaque();
		cc.sacarDinheiro(399.00);
		cc.verificarSaldoSaque();
		cc.sacarDinheiro(1);
		cc.verificarSaldoSaque();
		cc.sacarDinheiro(1);
	}
}

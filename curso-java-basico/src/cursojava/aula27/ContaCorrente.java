package cursojava.aula27;

public class ContaCorrente {
	String ContaCorrente;
	double limit;
	double saldo;
	boolean special;

	void verificarSaldoSaque() {
		double saldo2 = saldo + limit;

		if (saldo <= limit) {
			System.out.println("Voc� est� usando o limite do cheque special. Possui " + saldo2 + " reais de limete!");
		}
		if (saldo > 0) {
			System.out.println("Voc� possui " + saldo2 + " para saque!");
		} 
		if (saldo2 <= 0 ) {
			System.out.println("Voc� n�o possui saldo para saque!");
		}
	}

	double depositarDinheiro(double dep) {
		System.out.println("Voc� depositou " + dep + " reais!");
		return saldo = saldo + dep;
	}

	double sacarDinheiro(double sac) {
		
		do {
			System.out.println("");
		}while (saldo == 0);
		
		
		return saldo = saldo - sac;

	}
	
}

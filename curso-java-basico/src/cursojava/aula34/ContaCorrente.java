package cursojava.aula34;

public class ContaCorrente {

	private String numberCC;
	private String agencia;
	private boolean special;
	private double limitSpecial;
	private double saldo;

	public ContaCorrente() {
	}

	public ContaCorrente(String numberCC, String agencia, boolean special, double limitSpecial, double saldo) {
		this.numberCC = numberCC;
		this.agencia = agencia;
		this.special = special;
		this.limitSpecial = limitSpecial;
		this.saldo = saldo;
	}

	public String getNumberCC() {
		return numberCC;
	}

	public void setNumberCC(String numberCC) {
		this.numberCC = numberCC;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public double getLimitSpecial() {
		return limitSpecial;
	}

	public void setLimitSpecial(double limitSpecial) {
		this.limitSpecial = limitSpecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}

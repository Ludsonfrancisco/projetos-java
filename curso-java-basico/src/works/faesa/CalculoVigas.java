package works.faesa;

import java.util.function.DoublePredicate;

import javax.swing.JOptionPane;

public class CalculoVigas {

	private double altura;
	private double base;
	private double comprimento;

	public CalculoVigas() {
	}

	public CalculoVigas(double altura, double base, double comprimento) {
		this.altura = altura;
		this.base = base;
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void calcViga() {

		this.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da VIGA em metros: "));
		this.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da VIGA em metros: "));
		this.comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a comprimento da VIGA em metros: "));

		double volume = this.altura * this.base * this.comprimento;

		JOptionPane.showConfirmDialog(null, "O volumento de concreto necessário para sua VIGA: " + volume + " m3");

	}

	public static void main(String[] args) {

		CalculoVigas viga = new CalculoVigas();

		viga.calcViga();

	}

}

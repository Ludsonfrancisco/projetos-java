package cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double temDia01 = 33.2;
		double temDia02 = 34.2;
		double temDia03 = 35.7;
		double temDia04 = 32.8;
		double temDia05 = 34.8;
		double temDia06 = 32.9;
		double temDia07 = 31.6;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 33.2;
		temperaturas[1] = 34.2;
		temperaturas[2] = 35.7;
		temperaturas[3] = 32.8;
		temperaturas[4] = 34.8;
		temperaturas[5] = 32.9;
		temperaturas[6] = 31.6;
		
		System.out.println("Temperatura do dia 1 é: " + temperaturas[5]);
		System.out.println("QUal o tamanho do array: " + temperaturas.length);
		
//		for(int i = 0; i < temperaturas.length; i++ ) {
//			System.out.println("O índice da temperatura do dia "+ (i + 1) + " é = " +  temperaturas[i]);
//		}
		
		
		for (double temp: temperaturas) {
			System.out.println("O índice da temperatura do dia "+ temperaturas.length + " é = " +  temp);
		}
		

	}

}

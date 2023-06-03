package desafios;

// De 1900.0 hasta 2800.0 el IR es de 7.5% y se pueden deducir $ 142
// De 2800.01 hasta 3751.0 el IR es de de 15% y se pueden deducir $ 350
// De 3751.01 hasta 4664.00 el IR es de de 22.5% y se pueden deducir $ 636

public class Tasa_con_ifs {
	public static void main(String[] args) {
		double salario = 4300.0;
		
		// ifs aqui
		boolean IR7 = salario >= 1900 && salario <= 2800;
		boolean IR15 = salario >= 2800.01 && salario < 3751;
		boolean IR22 = salario >= 3751.01 && salario < 4664;
		
		if (IR7) {
			System.out.println("Su tasa es del 7.5%");
			System.out.println("Se puede se pueden deducir $ 142");
		} else if (IR15) {
			System.out.println("Su tasa es del 15%");
			System.out.println("Se puede se pueden deducir $ 350");
		} else if (IR22) {
			System.out.println("Su tasa es del 22.5%");
			System.out.println("Se puede se pueden deducir $ 636");
		}
	}
}

package desafios;

public class Factorial {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int factorial = 1;
			for(int n = 1; n <= i; n++) {
				factorial *= n;
			}
			System.out.println(i + "! = " + factorial);
			System.out.println();
		}
		
		System.out.println(" Forma del profe ↓");
		
		int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }
	}
}

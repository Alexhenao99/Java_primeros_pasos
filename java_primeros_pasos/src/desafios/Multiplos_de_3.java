package desafios;

public class Multiplos_de_3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i% 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Otra forma ↓");
		
		// Otra forma
		for (int i = 0; i < 100; i += 3) {
			System.out.println(i);
		}
	}
}

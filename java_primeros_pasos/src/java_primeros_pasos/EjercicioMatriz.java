package java_primeros_pasos;

public class EjercicioMatriz {
	public static void main(String[] args) {
		for (int fila = 0; fila <= 10; fila++) {
			for (int columnas = 0; columnas < fila; columnas++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

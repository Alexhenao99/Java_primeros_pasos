package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {

		int edad = 18;
		int cantidadPersonas = 2;

		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
			System.out.println("Usted no puede entrar");
		}
		
		System.out.println("--------------- con booleanos ------------------");

		boolean esPareja = cantidadPersonas > 1;
		System.out.println("El valor de la condicional es: " + esPareja);
		
		boolean puedeEntrar = edad >=18 && esPareja;
		
		if (puedeEntrar) {
			System.out.println("Sea Bienvenido");
		} else {
			System.out.println("Usted no puede entrar");
		}

	}
}

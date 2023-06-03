package java_primeros_pasos;

public class EjemploValoresVariables {
	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		System.out.println(numero2);
		
		numero2 = numero1;
		System.out.println(numero2);
		
		numero1 = 88;
		System.out.println(numero2); // el valor de las variables no quedan guardados en memoria sino que se trabaja con los valores declarados "en el momento"
	}
}

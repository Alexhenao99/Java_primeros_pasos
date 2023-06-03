package java_primeros_pasos;

public class Caracteres {
	public static void main(String[] args) {
		
		char caracter = 'a'; // se declara con comilla simple (') y solo puede contener un carcater
		System.out.println(caracter);
		
		caracter = 65; // toma como refencia a ASCII
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online"; // se declara etre comillas dobles (") y se puede agragar uno o mas carcateres
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}
}

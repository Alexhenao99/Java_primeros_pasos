package java_primeros_pasos;

public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Hola Nuervo test!!");
	
		System.out.println("<--------------- int --------------->");
		
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println(edad);
		
		System.out.println("Mi edad es " + edad + ", Felicitaciones.");
		
		System.out.println("<--------------- double --------------->");
		
		double salario = 1250.50;
		System.out.println(salario);
		
		double edad2 = 28;
		System.out.println("double con enteros: " + edad2);
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad);
		
		int division = 1250 / 3;
		System.out.println(division);
		
		System.out.println("<--------------- convertir --------------->");
		
		double variable1 = 230.89;
		System.out.println(variable1);
		
		int variable1Entero = (int) variable1; // Cast => fuerza la conversion de la variable
		System.out.println(variable1Entero);
		
		double resultado = variable1 + variable1Entero;
		System.out.println("double: " + resultado);
		
		int resultado2 = (int) variable1 + variable1Entero;
		System.out.println("int casteado: " + resultado2);
		
		System.out.println("<--------------- Variables sonde su uso no es frecuente --------------->");
		long prueba = 1234567891234567891L; // soporta numeros largos de hasta 2^64byts 
		System.out.println("long " + prueba);
		short numeroPequeno = 12345; // soporta 2^16 byts
		System.out.println("short " + numeroPequeno);
		byte numeroAunMasPequeno = 123; // soporta 8byts -> para procesamiento de archivos
		System.out.println("byte " + numeroAunMasPequeno );
		float numeroDecimalPequeno = 12.5F; //
		System.out.println("float " + numeroDecimalPequeno);
	} 

}

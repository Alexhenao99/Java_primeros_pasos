package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta(1);
		primeraCuenta.depositar(400);
		
		System.out.println(primeraCuenta.getSaldo());
		
		
		Cuenta segundaCuenta = new Cuenta(2);
		segundaCuenta.depositar(400);
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		System.out.println();
		System.out.println("Las instancias");
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
		System.out.println();
		System.out.println("El atributo saldo");
		
		if(primeraCuenta.getSaldo() == segundaCuenta.getSaldo()) {
			System.out.println("Son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
	}
}

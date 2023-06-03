package proyecto_bytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1);
		primeraCuenta.depositar(400);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(700);
		
		System.out.println("Saldo Primera " + primeraCuenta.getSaldo());
		System.out.println("Saldo Segunda " + segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(400);;
		System.out.println("Saldo Primera " + primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		System.out.println();
		System.out.println("Las instancias: ");
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
	}
}

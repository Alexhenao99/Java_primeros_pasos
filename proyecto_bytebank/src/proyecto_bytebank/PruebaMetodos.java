package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(1);
		miCuenta.getSaldo();
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta(2);
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		if(puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		System.out.println();
		System.out.println("Saldo de Jimena: " + cuentaDeJimena.getSaldo());
		System.out.println("Mi saldo: " + miCuenta.getSaldo());
	}
}

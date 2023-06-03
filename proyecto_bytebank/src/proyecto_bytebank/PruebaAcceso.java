package proyecto_bytebank;

public class PruebaAcceso {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(1);
		
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		// public → modificadores de acceso 
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}

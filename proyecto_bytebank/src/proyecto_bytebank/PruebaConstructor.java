package proyecto_bytebank;

public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cuenta cuenta2 = new Cuenta(2);
		Cuenta cuenta3 = new Cuenta(3);
		
		System.out.println(Cuenta.getTotal());
		
	}
}

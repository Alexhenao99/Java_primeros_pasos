package proyecto_bytebank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Ales");
		cliente.setDocumento("85442458361");
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDocumento());
		
		cuenta.setTitular(cliente);
		System.out.println(cuenta.getTitular().getNombre());
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
		
	}
}

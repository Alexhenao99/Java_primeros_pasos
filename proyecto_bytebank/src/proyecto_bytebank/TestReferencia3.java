package proyecto_bytebank;

public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(1);

		// miCuenta.titular = new Cliente(); // ya no es necesario hacer estas declaracion ya que desde cuenta se asocian los objetos
		miCuenta.getTitular().setNombre("Ales");

		System.out.println(miCuenta.getTitular().getNombre());
		System.out.println(miCuenta.getTitular().getDocumento());
	}
}

package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.setNombre("Ales");
		diego.setDocumento("2146161");
		diego.setTelefono("3214568421");
		
		Cuenta cuentaDeDiego = new Cuenta(1);
		cuentaDeDiego.setTitular(diego);
		
		System.out.println(diego.getDocumento());
		System.out.println(cuentaDeDiego.getTitular());
		System.out.println(diego);
	}
}

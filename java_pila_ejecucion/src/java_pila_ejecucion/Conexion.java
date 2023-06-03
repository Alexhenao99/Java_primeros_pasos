package java_pila_ejecucion;

public class Conexion implements AutoCloseable {

	public Conexion() {
		System.out.println("Abriendo Conexion");
		throw new IllegalStateException();
	}

	public void leerDatos() {
		System.out.println("Recibiendo datos");

	}

	public void cerrar() {
		System.out.println("Cerrando conexion");
	}

	@Override
	public void close() throws Exception {
		cerrar();
	}
}

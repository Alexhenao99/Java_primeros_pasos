package bytebank_heredado;

public class SaldoInsuficienteExeption extends Exception {

	public SaldoInsuficienteExeption(String mensaje) {
		super(mensaje);
	}

}

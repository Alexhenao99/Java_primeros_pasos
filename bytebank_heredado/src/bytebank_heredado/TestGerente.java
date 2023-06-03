package bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {
	
		Gerente gerente = new Gerente();
		gerente.setClave("AluraCursoOnline");
		gerente.setTipo(1);
		gerente.setSalario(5000);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursoOnline"));
	}
}

package bytebank_heredado;

// Polimorfismo
public class TestReferencias {
	public static void main(String[] args) {

		// El elemento mas generico puede ser adaptado al elemento mas especifico
		// ↓ Referencia                ↓ Inicializador
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Lilo");

		Gerente gerente = new Gerente();
		gerente.setNombre("Ales");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
	}
}

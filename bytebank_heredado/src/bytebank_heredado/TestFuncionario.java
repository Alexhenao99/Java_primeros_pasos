package bytebank_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario ales = new Contador();
		
		ales.setNombre("Ales");
		ales.setDocumento("101235564");
		ales.setSalario(2000);
		ales.setTipo(0);
		
		System.out.println(ales.getSalario());
		System.out.println(ales.getBonificacion());
	}
}

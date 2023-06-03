package bytebank_heredado;

public class Contador extends Funcionario{ 
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutado desde Contador: ");
		return 200;
	}
}

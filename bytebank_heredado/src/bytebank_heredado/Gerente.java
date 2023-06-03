package bytebank_heredado;

//                   ↓ extiende de
public class Gerente extends Funcionario implements Autenticable{
	
	// Sobre-escritura de metodo
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente: ");
		return 2000; // Super => es la palabra reservada para que se usen los metodos de la clase padre
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}

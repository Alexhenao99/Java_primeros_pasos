package bytebank_heredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override // anotacion que indica que este sobreescribe el metodo padre
	public void retirar(double saldo) throws SaldoInsuficienteExeption {
		double comision = 0.2;
		super.retirar(saldo + comision);
	}

	@Override
	public void depositar(double saldo) {
		// TODO Auto-generated method stub
		
	}
	
}
package bytebank_heredado;

public abstract class Cuenta {

	protected double saldo;
	private int agencia;
	int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Estoy creando una cuenta " + Cuenta.total);

		Cuenta.total++;
	}

	// metodo que no retorna nada
	public abstract void depositar(double saldo);

	// metodo que retorna valor => metodo concreto
	public void retirar(double saldo) throws SaldoInsuficienteExeption {
		if (this.saldo < saldo) {
			throw new SaldoInsuficienteExeption("No tiene saldo");
		}
		this.saldo -= saldo;
	}

	public boolean transferir(double saldo, Cuenta cuenta) {
		if (this.saldo >= saldo) {
			try {
				this.retirar(saldo);
			} catch (SaldoInsuficienteExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.depositar(saldo);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
}

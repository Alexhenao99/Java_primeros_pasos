package proyecto_bytebank;

public class Cuenta {

	private double saldo;
	private int agencia;
	int numero;
	private Cliente titular = new Cliente();

	private static int total = 0; // static → esta variable no va a ser altarada por la instacia sino es de la
									// clase **PruebaConstructor.java

	public Cuenta(int agencia) { // Es un constructor, se puede manipular dede su nacimiento este es implementado
									// desde el principio de forma automatica por java pero dejando valores
									// predeterminados como 0 para valores como -1 una de sus mayores ventajas al
									// implementarlo es obligar a darle un valor a agencia (en este caso) para crear
									// la cuenta
		if (agencia <= 0) {
			System.out.println("No se permite 0 o un numero menor");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando " + total + " cuenta");
	}

	// metodo que no retorna nada
	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	// metodo que retorna valor
	public boolean retirar(double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double saldo, Cuenta cuenta) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
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

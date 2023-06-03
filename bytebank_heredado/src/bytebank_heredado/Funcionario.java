package bytebank_heredado;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;

	private int tipo;

	// Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Documento
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	// Salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Tipo
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// Bonificacion al ser abstracto existe conceptualmente pero es "libre" todos
	// los metodos abstractos deben de ser implementados en las clases hijas
	public abstract double getBonificacion();

}

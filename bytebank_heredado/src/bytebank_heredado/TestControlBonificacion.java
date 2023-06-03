package bytebank_heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario ales = new Contador();
		ales.setSalario(2000);
		
		Gerente lulu = new Gerente();
		lulu.setSalario(10000);
		
		Contador alexiz = new Contador();
		alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(ales);
		controlBonificacion.registrarSalario(lulu);
		controlBonificacion.registrarSalario(alexiz);
	}
}

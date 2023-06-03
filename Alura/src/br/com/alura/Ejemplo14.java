package br.com.alura;

import model.Alumno;
import model.Curso;

// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
// TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

public class Ejemplo14 {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Geometria", 30);

		Alumno alumno1 = new Alumno("Luiz Miguel", "001");
		Alumno alumno2 = new Alumno("Juan Carlos", "002");
		Alumno alumno3 = new Alumno("William Hernandez", "003");
		Alumno alumno4 = new Alumno("Luiza Hernandez", "004");
		Alumno alumno5 = new Alumno("Pablo Jaramillo", "005");
		Alumno alumno6 = new Alumno("Lazaro Mendez", "006");
		Alumno alumno7 = new Alumno("Claudia Patricia", "007");

		curso1.addAlumnos(alumno1);
		curso1.addAlumnos(alumno2);
		curso1.addAlumnos(alumno3);
		curso1.addAlumnos(alumno4);
		curso1.addAlumnos(alumno5);
		curso1.addAlumnos(alumno6);
		curso1.addAlumnos(alumno7);

		Alumno alumnoNuevo = new Alumno("Luiz Miguel", "00");
		System.out.println(curso1.getAlumnos().contains(alumnoNuevo));
		System.out.println(curso1.getAlumnos().contains(alumnoNuevo));
		System.out.println(curso1.verificaAlumno(alumnoNuevo)); // en la clase se implemento el metodo de verificacion
																// asi que la linea anterior no es necesaria

		System.out.println("---------------------------");
		System.out.println();

	}
}

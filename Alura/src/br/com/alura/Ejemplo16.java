package br.com.alura;

import java.util.Iterator;

import model.Alumno;
import model.Curso;

// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
// TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

public class Ejemplo16 {

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

		curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

		System.out.println("---------------------------");
		System.out.println();
		
		Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
		while (alumnoIterator.hasNext()) {
			System.out.println(alumnoIterator.next());
			
		}

	}
}

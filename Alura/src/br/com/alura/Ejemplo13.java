package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import model.Alumno;

// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
// TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

public class Ejemplo13 {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Luiz Miguel", "001");
		Alumno alumno2 = new Alumno("Juan Carlos", "002");
		Alumno alumno3 = new Alumno("William Hernandez", "003");
		Alumno alumno4 = new Alumno("Luiza Hernandez", "004");
		Alumno alumno5 = new Alumno("Pablo Jaramillo", "005");
		Alumno alumno6 = new Alumno("Lazaro Mendez", "006");
		Alumno alumno7 = new Alumno("Claudia Patricia", "007");

		Collection<Alumno> listaAlumnos = new HashSet<>();
//		Collection<Alumno> listaAlumnos = new ArrayList<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);

		System.out.println(listaAlumnos.contains(alumno1));

		System.out.println("---------------------------");
		System.out.println();
		
		Alumno alumnoNuevo = new Alumno("Luiz Miguel", "00");
		System.out.println(listaAlumnos.contains(alumnoNuevo));
		
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println(alumno1.equals(alumnoNuevo));
		
		

	}
}

package br.com.alura;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
// TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

public class Ejemplo12 {

	public static void main(String[] args) {
		String alumno1 = "Luiz Miguel";
		String alumno2 = "Juan Carlos";
		String alumno3 = "William Hernandez";
		String alumno4 = "Luiza Hernandez";
		String alumno5 = "Pablo Jaramillo";
		String alumno6 = "Lazaro Mendez";
		String alumno7 = "Lazaro Mendez";

		Collection<String> listaAlumnos = new HashSet<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);

		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}

		System.out.println();
		System.out.println("---------------------------");

		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});

		System.out.println();
		System.out.println("---------------------------");

		boolean validate = listaAlumnos.contains("William Benao");
		System.out.println(validate);

		System.out.println();
		System.out.println("---------------------------");

		String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(max);
		System.out.println(max.length());

		System.out.println();
		System.out.println("---------------------------");

		listaAlumnos.removeIf(alumno -> "Lazaro Mentirosinho".equalsIgnoreCase(alumno));
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});

	}
}

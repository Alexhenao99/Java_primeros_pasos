package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {

	public static void main(String[] args) {
		String alumno1 = "Luiz Miguel";
		String alumno2 = "Juan Carlos";
		String alumno3 = "William Hernandez";
		String alumno4 = "Luiza Hernandez";
		String alumno5 = "Pablo Jaramillo";
		String alumno6 = "Lazaro Mendez";
		String alumno7 = "Lazaro Mendez";

		Set<String> listaAlumnos = new HashSet<>(); // A diferencia de Array Set no permite guardar dos elemntos con el mismo valor

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		
		for (String alumno: listaAlumnos) {
			System.out.println(alumno);
		}

		System.out.println();
		System.out.println("---------------------------");
		
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});

		System.out.println();
		System.out.println("---------------------------");

	}
}

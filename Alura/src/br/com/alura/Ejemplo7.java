package br.com.alura;

import java.util.ArrayList;
import java.util.List;

import model.Aula;
import model.Curso;

public class Ejemplo7 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP", 30);
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkList"));
		curso1.addAula(new Aula("Inmutable"));

		List<Aula> aulaList = curso1.getAulaList();

//		aulaList.add(new Aula("Inmutable")); // genera un error debido a collects.unmodificableList de getAulaList en Aula

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);

		System.out.println(cursos.get(0).getAulaList());
	}
}

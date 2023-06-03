package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Curso {
	
	private String nombre;
	private int tiempo;
	private List<Aula> aulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
//	private Collection<Alumno> alumnos = new LinkedHashSet<>();
	
//	private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();
	private Map<String, Alumno> alumnoMap = new HashMap<>();
		
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Curso(String nombre, int tiempo, List<Aula> aulaList ) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.aulaList = aulaList;
	}
	
	// Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Tiempo
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}	
	
	// AulaList
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(aulaList);
	}
	public void setAulaList(List<Aula> aulaList) {
		this.aulaList = aulaList;
	}
	
	// Aula
	public void addAula(Aula aula) {
		this.aulaList.add(aula);
	}
	
	// Alumnos
	public void addAlumnos(Alumno alumno) {
		this.alumnos.add(alumno);
		this.alumnoMap.put(alumno.getCodigo(), alumno);
	}
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}
	
	// VerificaAlumnos
	public boolean verificaAlumno(Alumno alumno) {
		return this.alumnos.contains(alumno);
	}
	
	// Map
	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}	
	
	@Override
	public String toString() {
		return this.nombre;
	}
		
}

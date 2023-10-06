package com.midominio.asignaturas.web.app.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Asignatura {

	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numCreditos;
	private int numAlumnosMatriculados;

	public Asignatura(int id, String nombre, String descripcion, String tipo, int numCreditos,
			int numAlumnosMatriculados) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numCreditos = numCreditos;
		this.numAlumnosMatriculados = numAlumnosMatriculados;
	}
	@ModelAttribute("asignaturas")
	public static List<Asignatura> dameLaListaAsignaturas(){
		List<Asignatura> asignaturas = new ArrayList<>();
		asignaturas.add(new Asignatura(1, "Matemáticas", "Operaciones aritméticas", "ciencias", 6, 0 ));
		asignaturas.add(new Asignatura(2, "Matemáticas avanzadas", "Operaciones geométricas", "ciencias", 8, 0 ));
		asignaturas.add(new Asignatura(3, "Matemáticas aplicadas", "Operaciones exponenciales", "ciencias", 10, 0 ));
		asignaturas.add(new Asignatura(4, "SuperMatemáticas", "Operaciones complejas", "ciencias", 12, 0 ));
		asignaturas.add(new Asignatura(5, "Lengua", "Leer y escribir", "Letras", 6, 0));
		asignaturas.add(new Asignatura(6, "Lengua avanzadas", "Leer y escribir textos complejos", "Letras", 8, 0));
		asignaturas.add(new Asignatura(7, "Lengua aplicada", "Producción literaria", "Letras", 10, 0));
		asignaturas.add(new Asignatura(8, "SuperLengua", "Domina tu idioma por completo", "Letras", 12, 0));
		asignaturas.add(new Asignatura(9, "Literatura", "De Shakespeare a Carmen Mola", "Letras", 6, 0));
		asignaturas.add(new Asignatura(10, "La Lengua de las matemáticas", "Leer y escribir ecuaciones", "mixto", 8, 0));
		asignaturas.add(new Asignatura(11, "Estadística", "Principales fórmulas estadísticas", "sociales", 10, 0));
		asignaturas.add(new Asignatura(12, "Sociología básica", "Entendimiento básico de la sociedad", "sociales", 6, 0));
		asignaturas.add(new Asignatura(13, "Sociología", "Entendimiento de la sociedad", "sociales", 8, 0));
		asignaturas.add(new Asignatura(14, "Sociología avanzada", "Entendimiento avanzado de la sociedad", "sociales", 10, 0));
		asignaturas.add(new Asignatura(15, "Composición Artística básica", "Entendimiento básico de la composición", "artes", 6, 0));
		asignaturas.add(new Asignatura(16, "Composición Artística ", "Entendimiento de la composición", "artes", 8, 0));
		asignaturas.add(new Asignatura(17, "Composición Artística Avanzada", "Entendimiento avanzado de la composición", "artes", 10, 0));
		asignaturas.add(new Asignatura(18, "Composición Artística matemática", "Entendimiento básico de la composición", "mixto", 8, 0));
		asignaturas.add(new Asignatura(19, "Artes sociales", "representación artística de la sociedad", "mixto", 8, 0));
		asignaturas.add(new Asignatura(20, "Arte matemático", "representación artística de las matemáticas", "mixto", 8, 0));
		
		return asignaturas;
	}

	public static List<Asignatura> asignaturasPorTipo(String tipo){
		
		List<Asignatura>listaAsignaturas = new ArrayList<>();
		
		for (Asignatura a: Asignatura.dameLaListaAsignaturas()) {
		if(tipo.equalsIgnoreCase(a.getTipo())) {
			listaAsignaturas.add(a);
			
		}
			
		}
		return listaAsignaturas;
	} 

	
	public Asignatura() {

	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumCreditos() {
		return numCreditos;
	}

	public int getNumAlumnosMatriculados() {
		return numAlumnosMatriculados;
	}

	
}

package com.midominio.asignaturas.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.asignaturas.web.app.model.Asignatura;

@Controller
@RequestMapping("/asignatura")
public class SubjectController {

	@ModelAttribute("asignaturas")
	public List<Asignatura> listaAsignaturas() {
		List<Asignatura> asignaturas = new ArrayList<>();
		asignaturas.add(new Asignatura(1, "Matemáticas", "Operaciones aritméticas", "ciencias", 6, 0));
		asignaturas.add(new Asignatura(2, "Matemáticas avanzadas", "Operaciones geométricas", "ciencias", 8, 0));
		asignaturas.add(new Asignatura(3, "Matemáticas aplicadas", "Operaciones exponenciales", "ciencias", 10, 0));
		asignaturas.add(new Asignatura(4, "SuperMatemáticas", "Operaciones complejas", "ciencias", 12, 0));
		asignaturas.add(new Asignatura(5, "Lengua", "Leer y escribir", "letras", 6, 0));
		asignaturas.add(new Asignatura(6, "Lengua avanzadas", "Leer y escribir textos complejos", "letras", 8, 0));
		asignaturas.add(new Asignatura(7, "Lengua aplicada", "Producción literaria", "letras", 10, 0));
		asignaturas.add(new Asignatura(8, "SuperLengua", "Domina tu idioma por completo", "letras", 12, 0));
		asignaturas.add(new Asignatura(9, "Literatura", "De Shakespeare a Carmen Mola", "letras", 6, 0));
		asignaturas
				.add(new Asignatura(10, "La Lengua de las matemáticas", "Leer y escribir ecuaciones", "mixto", 8, 0));
		asignaturas.add(new Asignatura(11, "Estadística", "Principales fórmulas estadísticas", "sociales", 10, 0));
		asignaturas
				.add(new Asignatura(12, "Sociología básica", "Entendimiento básico de la sociedad", "sociales", 6, 0));
		asignaturas.add(new Asignatura(13, "Sociología", "Entendimiento de la sociedad", "sociales", 8, 0));
		asignaturas.add(
				new Asignatura(14, "Sociología avanzada", "Entendimiento avanzado de la sociedad", "sociales", 10, 0));
		asignaturas.add(new Asignatura(15, "Composición Artística básica", "Entendimiento básico de la composición",
				"artes", 6, 0));
		asignaturas
				.add(new Asignatura(16, "Composición Artística ", "Entendimiento de la composición", "artes", 8, 0));
		asignaturas.add(new Asignatura(17, "Composición Artística Avanzada", "Entendimiento avanzado de la composición",
				"artes", 10, 0));
		asignaturas.add(new Asignatura(18, "Composición Artística matemática", "Entendimiento básico de la composición",
				"mixto", 8, 0));
		asignaturas.add(new Asignatura(19, "Artes sociales", "representación artística de la sociedad", "mixto", 8, 0));
		asignaturas.add(
				new Asignatura(20, "Arte matemático", "representación artística de las matemáticas", "mixto", 8, 0));

		return asignaturas;
	}

	@GetMapping("/listado/con")
	public String listaAlumnos(@RequestParam(value = "tipo", defaultValue= "todos", required = false) String tipo, Model model) {
		tipo = tipo.toLowerCase();
		
		List<Asignatura> listaRecortada = new ArrayList<>();				
	
		if ("todos".equals(tipo)) {
	        listaRecortada = listaAsignaturas(); // Mostrar todas las asignaturas
	    } else {
	        listaRecortada = Asignatura.asignaturasPorTipo(tipo); // Filtrar por tipo
	    }
		
		//	listaRecortada = Asignatura.asignaturasPorTipo(tipo);

		model.addAttribute("titulo", "titulo");
		model.addAttribute("header", "Listado de Asignaturas con Alumnos");
		model.addAttribute("asignatura", listaRecortada);

		return "asignatura/listado";
	}

	@GetMapping("/listado/sin")
	public String listaSinAlumnos(
			@RequestParam(value = "tipo", defaultValue = "todos", required = false) String tipo, Model model) {
		tipo = tipo.toLowerCase();
		List<Asignatura> listaRecortada = new ArrayList<>();
	
		  if ("todos".equals(tipo)) {
		        listaRecortada = listaAsignaturas(); // Mostrar todas las asignaturas
		    } else {
		        listaRecortada = Asignatura.asignaturasPorTipo(tipo); // Filtrar por tipo
		    }
		    		
	//	listaRecortada = Asignatura.asignaturasPorTipo(tipo);
		
		model.addAttribute("titulo", "titulo");
		model.addAttribute("header", "Listado de Asignaturas sin Alumnos");
		model.addAttribute("asignatura", listaRecortada);

		return "asignatura/listado-sin";
	}
}

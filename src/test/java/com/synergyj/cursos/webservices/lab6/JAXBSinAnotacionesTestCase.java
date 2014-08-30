/**
 * Fecha de creación: 18/02/2011 08:26:14
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.lab6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.entidades.cursos.Curso;
import com.synergyj.cursos.webservices.entidades.cursos.Estudiante;

/**
 * Este ejemplo muestra el uso de JAXB para realizar marshall a clases no anotadas.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JAXBSinAnotacionesTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(JAXBSinAnotacionesTestCase.class);

	private static final String XSD_FILE = "esquemas/cursos/cursos.xsd";

	@Test
	public void marshall() {

	}

	/**
	 * @return
	 */
	private Curso obtenCurso() {
		Curso curso;
		Estudiante estudiante;
		List<Estudiante> estudiantes;
		Calendar calendar;

		curso = new Curso();
		curso.setFechaInicio(new Date());
		// duracion 5 semanas.
		calendar = Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_YEAR, 5);
		curso.setFechaFin(calendar.getTime());
		curso.setNombre("Curso de webservices");

		estudiantes = new ArrayList<Estudiante>();

		estudiante = new Estudiante();
		estudiante.setNombre("Julio");
		estudiante.setApellidoPaterno("Martinez");
		estudiante.setEdad(30);

		estudiantes.add(estudiante);
		curso.setEstudiantes(estudiantes);
		return curso;

	}

}

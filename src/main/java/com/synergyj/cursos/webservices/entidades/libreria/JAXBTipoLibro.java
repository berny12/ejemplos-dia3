/**
 * Fecha de creación: 18/02/2011 18:59:50
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.libreria;

/**
 * Clase puente que sirve para hacer marshall y unmarshall de la clase {@link Libro}
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JAXBTipoLibro {

	private int tipoLibroID;

	/**
	 * @return tipoLibroID
	 */
	public int getTipoLibroID() {
		return tipoLibroID;
	}

	/**
	 * @param tipoLibroID para inicializar el atributo tipoLibroID
	 */
	public void setTipoLibroID(int tipoLibroID) {
		this.tipoLibroID = tipoLibroID;
	}
}

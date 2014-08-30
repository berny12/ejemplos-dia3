/**
 * Fecha de creación: 18/02/2011 18:48:56
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.libreria;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@XmlRootElement
public class Libro {

	private String nombre;

	private String editorial;

	private TipoLibro tipoLibro;

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para inicializar el atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial para inicializar el atributo editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return tipoLibro
	 */
	public TipoLibro getTipoLibro() {
		return tipoLibro;
	}

	/**
	 * @param tipoLibro para inicializar el atributo tipoLibro
	 */
	public void setTipoLibro(TipoLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [nombre=");
		builder.append(nombre);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", tipoLibro=");
		builder.append(tipoLibro);
		builder.append("]");
		return builder.toString();
	}

}

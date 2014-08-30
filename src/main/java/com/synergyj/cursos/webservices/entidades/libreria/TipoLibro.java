/**
 * Fecha de creación: 18/02/2011 18:49:12
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.libreria;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@XmlJavaTypeAdapter(value = TipoLibroAdapter.class)
public enum TipoLibro {

	FABULA(1, "F", "Fabula", true), LITERATURA(2, "L", "Literatura", true), POLITICA(3, "P",
			"Politica", true);

	private int id;

	private String clave;

	private String descripcion;

	private boolean activo;

	/**
	 * @param id
	 * @param clave
	 * @param activo
	 */
	private TipoLibro(int id, String clave, String descripcion, boolean activo) {
		this.id = id;
		this.clave = clave;
		this.activo = activo;
		this.descripcion = descripcion;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id para inicializar el atributo id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave para inicializar el atributo clave
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo para inicializar el atributo activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/**
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion para inicializar el atributo descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param id
	 * @return
	 */
	public static TipoLibro valueOf(int id) {
		for (TipoLibro tipo : values()) {
			if (tipo.id == id) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("id de tipo de libro invalido: " + id);
	}
}

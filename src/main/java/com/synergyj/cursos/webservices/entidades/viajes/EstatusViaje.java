/**
 * Fecha de creación: 19/02/2011 11:21:44
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public enum EstatusViaje {

	/*
	 * para cambiar el valor de la enum
	 */
    @XmlEnumValue("R")
	RESERVADO(1, "R", true),
	  @XmlEnumValue("P")
	PAGADO(2, "P", true),
	  @XmlEnumValue("C")
	CANCELADO(3, "C", true),
	  @XmlEnumValue("L")
	REALIZADO(4, "L", true);

	private int id;

	private String clave;

	private boolean activo;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @param clave
	 * @param activo
	 */
	private EstatusViaje(int id, String clave, boolean activo) {
		this.id = id;
		this.clave = clave;
		this.activo = activo;
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
}

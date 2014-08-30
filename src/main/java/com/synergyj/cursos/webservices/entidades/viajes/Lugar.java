/**
 * Fecha de creación: 19/02/2011 11:24:44
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

import javax.xml.bind.annotation.XmlType;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
/*
 * para definir el orden de aparicon de los nodos en el xml
 */
@XmlType(propOrder={"descripcion","nombre","lugarID"})
public class Lugar {

	private long lugarID;

	private String nombre;

	private String descripcion;

	/**
	 * @return lugarID
	 */
	public long getLugarID() {
		return lugarID;
	}

	/**
	 * @param lugarID para inicializar el atributo lugarID
	 */
	public void setLugarID(long lugarID) {
		this.lugarID = lugarID;
	}

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
}

/**
 * Fecha de creación: 19/02/2011 11:22:55
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
/*
 * para especificar la relacion o herencia de todas las clases
 */
@XmlSeeAlso(MedioTerrestre.class)
public class MedioTransporte {

	private long medioTransporteID;

	private char tipoMedio;

	private int capacidad;

	private char clase;

	/**
	 * @return medioTransporteID
	 */
	public long getMedioTransporteID() {
		return medioTransporteID;
	}

	/**
	 * @param medioTransporteID para inicializar el atributo medioTransporteID
	 */
	public void setMedioTransporteID(long medioTransporteID) {
		this.medioTransporteID = medioTransporteID;
	}

	/**
	 * @return tipoMedio
	 */
	public char getTipoMedio() {
		return tipoMedio;
	}

	/**
	 * @param tipoMedio para inicializar el atributo tipoMedio
	 */
	public void setTipoMedio(char tipoMedio) {
		this.tipoMedio = tipoMedio;
	}

	/**
	 * @return capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad para inicializar el atributo capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return clase
	 */
	public char getClase() {
		return clase;
	}

	/**
	 * @param clase para inicializar el atributo clase
	 */
	public void setClase(char clase) {
		this.clase = clase;
	}
}

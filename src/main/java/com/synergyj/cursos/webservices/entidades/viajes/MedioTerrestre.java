/**
 * Fecha de creación: 19/02/2011 11:23:11
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class MedioTerrestre extends MedioTransporte {

	private String lineaTerrestre;

	private int numeroSalida;

	/**
	 * @return lineaTerrestre
	 */
	public String getLineaTerrestre() {
		return lineaTerrestre;
	}

	/**
	 * @param lineaTerrestre para inicializar el atributo lineaTerrestre
	 */
	public void setLineaTerrestre(String lineaTerrestre) {
		this.lineaTerrestre = lineaTerrestre;
	}

	/**
	 * @return numeroSalida
	 */
	public int getNumeroSalida() {
		return numeroSalida;
	}

	/**
	 * @param numeroSalida para inicializar el atributo numeroSalida
	 */
	public void setNumeroSalida(int numeroSalida) {
		this.numeroSalida = numeroSalida;
	}
}

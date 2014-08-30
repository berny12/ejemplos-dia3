/*
 * para usar @XmlSchema se realiza a nivel paquete 
 */
@XmlSchema(namespace = JAXBUtils.VIAJES_NAMESPACE, elementFormDefault = XmlNsForm.UNQUALIFIED)
package com.synergyj.cursos.webservices.entidades.viajes;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
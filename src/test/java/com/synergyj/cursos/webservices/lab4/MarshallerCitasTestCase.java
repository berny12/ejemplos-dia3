package com.synergyj.cursos.webservices.lab4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.synergyj.cursos.webservices.citas.JAXBCita;
import com.synergyj.cursos.webservices.citas.JAXBCitasPendientes;
import com.synergyj.cursos.webservices.citas.JAXBEstatusCita;



public class MarshallerCitasTestCase {
	
	private static Logger logger = LoggerFactory.getLogger(MarshallerCitasTestCase.class);
	
	@Test
	public void testMarshaller(){
		try {
			
			JAXBContext contexto =JAXBContext.newInstance("com.synergyj.cursos.webservices.citas");
			Marshaller marshaller = contexto.createMarshaller();
			//para validar con el esquema correcto
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
			Schema schema = sf.newSchema(new File("esquemas/citas/citas.xsd"));
			marshaller.setSchema(schema);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			JAXBCitasPendientes citas = obtenCitasPendientes();
			marshaller.marshal(citas, bos);
			logger.debug("El xml generado: "+ bos.toString());
			bos.close();
		} catch (JAXBException e) {
			logger.debug("no fue posible crear el contexto",e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private JAXBCitasPendientes obtenCitasPendientes(){
		JAXBCitasPendientes citasPendientes = new JAXBCitasPendientes();
		List<JAXBCita> citas = new ArrayList<JAXBCita>();
		JAXBCita cita = new JAXBCita();
		
		cita.setApellidoMaterno("Flores");
		cita.setApellidoPaterno("Bernal");
		cita.setEstatus(JAXBEstatusCita.URGENTE);
		try{
			cita.setHoraCita(DatatypeFactory.newInstance().newXMLGregorianCalendar());
		}catch(DatatypeConfigurationException e){
			logger.debug("Error al crear la hora de la cita",e);
		}
		cita.setNombre("Edgar");
		cita.setObservaciones("usuario dormido");
		cita.setSexo("H");
		citas.add(cita);
		cita.setApellidoMaterno("Flores");
		cita.setApellidoPaterno("Bernal");
		cita.setEstatus(JAXBEstatusCita.ORDINARIA);
		try{
			cita.setHoraCita(DatatypeFactory.newInstance().newXMLGregorianCalendar());
		}catch(DatatypeConfigurationException e){
			logger.debug("Error al crear la hora de la cita",e);
		}
		
		cita.setNombre("Edgar");
		cita.setSexo("H");
		
		citas.add(cita);
		
		citasPendientes.setTotalCitas(citas.size());
		citasPendientes.getCitas().addAll(citas);
		return citasPendientes;
	}

}

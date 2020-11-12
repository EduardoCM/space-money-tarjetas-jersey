package org.codigorupestre.repository;

import java.util.List;

import org.codigorupestre.model.Tarjeta;

public interface TarjetaRepository {

	Tarjeta creartarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTarjetas();
	
	Tarjeta obtenerTarjeta(String numeroTarjeta);
	
	void eliminarTarjeta(String numeroTarjeta);
	
	Tarjeta actualizarTarjeta(String numeroTarjeta, Tarjeta tarjeta);
	
	void eliminarTodos();
	
	

}

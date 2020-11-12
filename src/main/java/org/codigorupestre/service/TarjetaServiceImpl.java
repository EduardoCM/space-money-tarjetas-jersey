package org.codigorupestre.service;

import java.util.List;

import org.codigorupestre.model.Tarjeta;
import org.codigorupestre.repository.TarjetaRepository;
import org.codigorupestre.repository.TarjetaRepositoryImpl;


public class TarjetaServiceImpl implements TarjetaService {
	
	private TarjetaRepository repository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		return repository.creartarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return repository.obtenerTarjetas();
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return repository.obtenerTarjeta(numeroTarjeta);
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		repository.eliminarTarjeta(numeroTarjeta);
	}

	@Override
	public Tarjeta actualizarTarjeta(String numeroTarjeta, Tarjeta tarjeta) {
		return repository.actualizarTarjeta(numeroTarjeta, tarjeta);
	}

	@Override
	public void eliminarTodos() {
		repository.eliminarTodos();
		
	}

}

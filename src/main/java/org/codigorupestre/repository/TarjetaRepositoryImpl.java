package org.codigorupestre.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.codigorupestre.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private Logger LOG = Logger.getLogger(TarjetaRepositoryImpl.class.getName());

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<Tarjeta>();

	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setId(1);
		tarjeta.setNombreTitular("Eduardo Castillo Mendoza");
		tarjeta.setNombreEntidad("Banco Maya");
		tarjeta.setNumeroTarjeta("5645-2345-2367-3242");
		tarjeta.setMarca("MAYA-VISA");
		tarjeta.setFechaCaducidad("20/26");
		tarjeta.setCvv("234");
		tarjetasDigitales.add(tarjeta);
	}

	@Override
	public Tarjeta creartarjeta(Tarjeta tarjeta) {
		LOG.info("Creacion de tarjeta "+ tarjeta);
		tarjeta.setId(tarjetasDigitales.size() + 1);
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		LOG.info("Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		LOG.info("Obtener tarjeta "+ numeroTarjeta);
		return tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		LOG.info("Eliminar tarjeta "+ numeroTarjeta);
		tarjetasDigitales.remove(
				tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get());
	}

	@Override
	public Tarjeta actualizarTarjeta(String numeroTarjeta, Tarjeta tarjeta) {
		LOG.info("Eliminar tarjeta " + tarjeta);
		Tarjeta resultado = tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get();
		return tarjetasDigitales.set(resultado.getId() - 1, tarjeta);
	}

	@Override
	public void eliminarTodos() {
		tarjetasDigitales.clear();
	}

}

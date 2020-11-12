package org.codigorupestre;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codigorupestre.model.Tarjeta;
import org.codigorupestre.service.TarjetaService;
import org.codigorupestre.service.TarjetaServiceImpl;

@Path("tarjetas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarjetaAPI {

	private TarjetaService tarjetaService = new TarjetaServiceImpl();

	@GET
	public List<Tarjeta> obtenerTarjetas() {
		return tarjetaService.obtenerTarjetas();
	}
	
	@GET
	@Path("/{numeroTarjeta}")
	public Tarjeta obtenerTarjetasId(@PathParam("numeroTarjeta") String numeroTarjeta) {
		return tarjetaService.obtenerTarjeta(numeroTarjeta);
	}
	
	@POST
	public Tarjeta guardarTarjeta(Tarjeta tarjeta) {
		tarjetaService.creartarjeta(tarjeta);
		return tarjeta;
	}
	
	@PUT
	@Path("/{numeroTarjeta}")
	public void actualizarTarjeta(@PathParam("numeroTarjeta") String numeroTarjeta, Tarjeta tarjeta) {
		tarjetaService.actualizarTarjeta(numeroTarjeta, tarjeta);
	}
	
	@DELETE
	@Path("/{numeroTarjeta}")
	public void eliminarTarjeta(@PathParam("numeroTarjeta") String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}


}
package constructor;

import java.time.LocalDate;

import dao.ClienteDaoImplementacion;
import dao.PedidoDaoImplementacion;
import model.Pedido;

public class PedidoBuilder {
	public static Pedido build (
			int codigoPedido,
			LocalDate fechaEntrega,
			int codigoCliente
	) throws Exception 
	{
		
		PedidoDaoImplementacion pedidoDao = new PedidoDaoImplementacion();
		
		if (!(pedidoDao.obtener(codigoPedido) == null)) {
			throw new Exception("Pedido duplicado");
		}
		
		ClienteDaoImplementacion clienteDao = new ClienteDaoImplementacion();

		if ((clienteDao.obtener(codigoCliente) == null)) {
			throw new Exception("No existe el cliente");
		}
		
		LocalDate fechaPedido = LocalDate.now();
		if (!fechaEntrega.isAfter(fechaPedido.plusDays(3))) {
			throw new Exception("La fecha de entrega no puede ser inferior a 3 dias despues de la fecha de pedido.");
		}
		
		System.out.println("El pedido con id: " + codigoPedido + " ha sido creado");
		
		
		return new Pedido(codigoPedido, fechaPedido, fechaEntrega, codigoCliente);
	}
}

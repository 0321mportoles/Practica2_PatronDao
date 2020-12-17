package app;

import java.time.LocalDate;

import constructor.ClienteBuilder;
import constructor.PedidoBuilder;
import dao.ClienteDaoImplementacion;
import dao.ProductoDaoImplementacion;
import exceptions.DuplicateException;
import exceptions.PossibleDuplicateClientException;
import model.Cliente;
import model.Producto;

public class App {

	public static void main(String[] args) {

		ClienteDaoImplementacion cDao = new ClienteDaoImplementacion();
		try {
			cDao.crear(ClienteBuilder.build(1, "Marta", "Portoles", 676555444));
			cDao.crear(ClienteBuilder.build(2, "Daniel", "Perez", 676555443));
			cDao.crear(ClienteBuilder.build(3, "Silvia", "Polo", 676555445));
			cDao.crear(ClienteBuilder.build(4, "Jose", "Ruiz", 676555448));
			cDao.crear(ClienteBuilder.build(5, "Carmen", "Royo", 676555449));
			cDao.crear(ClienteBuilder.build(6, "Ian", "Esteban", 676555442));
			cDao.crear(ClienteBuilder.build(6, "Ian", "Esteban", 676555442));
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			 
		} catch (PossibleDuplicateClientException e) {
			System.out.println(e.getMessage());
		}
		
		/* Imprimir todos los clientes */
		for (Cliente c : cDao.obtenerTodos()) {
			System.out.println(c);
		}
		
		try {
			cDao.crear(ClienteBuilder.build(7, "Ian2", "Esteban2", 676555442));
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			 
		} catch (PossibleDuplicateClientException e) {
			System.out.println(e.getMessage());
		}

		try {
			cDao.crear(ClienteBuilder.build(8, "Ian", "Esteban", 676555469));
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			 
		} catch (PossibleDuplicateClientException e) {
			System.out.println(e.getMessage());
		}

		try {
			cDao.crear(ClienteBuilder.build(9, "Ian3", "Esteban3", 676555442));
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			 
		} catch (PossibleDuplicateClientException e) {
			System.out.println(e.getMessage());
		}
		
		

		
		ProductoDaoImplementacion pDao = new ProductoDaoImplementacion();
		Producto p1 = null;
		try {
			p1 = PedidoBuilder.build(1, LocalDate.of(2020, 11, 30), 1);
			pDao.crear(p1);
			pDao.crear(PedidoBuilder.build(2, LocalDate.of(2020, 11, 30), 1));
			pDao.crear(PedidoBuilder.build(3, LocalDate.of(2020, 11, 30), 15));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
		try {
			pDao.crear(PedidoBuilder.build(4, LocalDate.of(2020, 11, 4), 1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		

		pDao.actualizar(p1);
		
		/* Imprimir todos los pedidos*/
		for (Producto p : pDao.obtenerTodos()) {
			System.out.println(p);
		}
	}

}

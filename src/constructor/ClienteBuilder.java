package constructor;

import dao.ClienteDaoImplementacion;
import exceptions.DuplicateException;
import exceptions.PossibleDuplicateClientException;
import model.Cliente;

public class ClienteBuilder {
		public static Cliente build (
				int id, 
				String nombreCliente, 
				String apellidoContacto, 
				long telefono 
		) throws DuplicateException, PossibleDuplicateClientException
		{
			Cliente cliente = new Cliente(id, nombreCliente, apellidoContacto, telefono);
			ClienteDaoImplementacion clienteDao = new ClienteDaoImplementacion();
			
			if (!(clienteDao.obtener(id) == null)) {
				throw new DuplicateException(cliente);
			}
						
			// System.out.println("El cliente con Id: " + id + " Nombre: " + nombreCliente + " ha sido creado correctamente");
			
			if ((clienteDao.tienePosibleDuplicado(cliente))) {
				throw new PossibleDuplicateClientException(cliente);
			}
			
		
			
			return cliente;
		}
}

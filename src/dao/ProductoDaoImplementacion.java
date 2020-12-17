package dao;

import java.nio.charset.CodingErrorAction;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import connection.Conexion;
import interfazDao.InterfazClienteDao;
import interfazDao.InterfazProductoDAO;
import model.Cliente;
import model.Producto;

public class ProductoDaoImplementacion implements InterfazProductoDAO {
	private List<Producto> pedidos = new ArrayList<>();
	
	private static Connection conecction;
	
	static {
        conecction = Conexion.conectar();
    }

	

	@Override
	public boolean añadeProducto(Producto producto) {
	
		return false;
	}

	@Override
	public Producto MostrarProducto(int id) {
		
		return null;
	}

	@Override
	public List<Producto> MostrarTodosProductos() {
		
		return null;
	}

	@Override
	public void editaProducto(Producto producto, String[] params) {
		
		
	}
	
	@Override
	public void eliminar(Producto pedido) {
		pedidos.remove(pedido);
	}

}

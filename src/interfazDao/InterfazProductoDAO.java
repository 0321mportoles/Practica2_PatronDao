package interfazDao;

import java.util.List;

import model.Producto;

public interface InterfazProductoDAO {
	
	public boolean añadeProducto(Producto producto);
	public Producto MostrarProducto(int id);
	public List<Producto> MostrarTodosProductos();
	
	public void editaProducto(Producto producto, String[] params);
	public void eliminar(Producto producto);
}

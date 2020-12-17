package model;



public class Producto {
	
	private int codigoProducto;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor; 
	private String descripcion; 
	private int cantidadStock;
	private int precioVenta;
	private int precioProveedor;
	
	
	public Producto(int codigoProducto, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, int cantidadStock, int precioVenta, int precioProveedor) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cantidadStock = cantidadStock;
		this.precioVenta = precioVenta;
		this.precioProveedor = precioProveedor;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGama() {
		return gama;
	}


	public void setGama(String gama) {
		this.gama = gama;
	}


	public String getDimensiones() {
		return dimensiones;
	}


	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}


	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}


	public int getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getPrecioProveedor() {
		return precioProveedor;
	}


	public void setPrecioProveedor(int precioProveedor) {
		this.precioProveedor = precioProveedor;
	}


	@Override
	public String toString() {
		return "Producto:  ID: " + this.codigoProducto + " Nombre del producto: " + this.nombre;
	}	 
}

package modelo;

public class ItemFactura {
	
	private Producto producto;
	private double iva;
	private double subtotal;
	private double descuento;
	private int cantidad;
	
	public ItemFactura(){
	}
	public ItemFactura(Producto producto, double iva, double subtotal, double descuento, int cantidad) {
		super();
		this.producto = producto;
		this.iva = iva;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}

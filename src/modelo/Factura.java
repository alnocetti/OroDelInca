package modelo;

import java.util.Date;
import java.util.Set;

public class Factura {
	
	private String emision;
	private String numero;
	private String tipo;
	private String letra;
	private Date fecha;
	private Cliente cliente;
	private Set<ItemFactura> items;
	private double bruto;
	private double neto;
	private double iva;
	
	public Factura(){
	}
	
	public Factura(String emision, String numero, String tipo, String letra, Date fecha, Cliente cliente,
			Set<ItemFactura> items, double bruto, double neto, double iva) {
		super();
		this.emision = emision;
		this.numero = numero;
		this.tipo = tipo;
		this.letra = letra;
		this.fecha = fecha;
		this.cliente = cliente;
		this.items = items;
		this.bruto = bruto;
		this.neto = neto;
		this.iva = iva;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ItemFactura> getItems() {
		return items;
	}

	public void setItems(Set<ItemFactura> items) {
		this.items = items;
	}

	public double getBruto() {
		return bruto;
	}

	public void setBruto(double bruto) {
		this.bruto = bruto;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public String getEmision() {
		return emision;
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLetra() {
		return letra;
	}
	
	
	
	
}

package paqueteTp;

public class Servicio {
	
	private String tipoDeServicio , domicilioDeServicio;
	private double CostosMaterial, FacturacionTotal;
	private int codigoServicio;
	private Cliente[] clientes;
	private Especialista[] especialistas;
	
	
	public Servicio(String tipoDeServicio, String domicilioDeServicio,  int codigoServicio) {
	
		this.tipoDeServicio = tipoDeServicio;
		this.domicilioDeServicio = domicilioDeServicio;
		this.codigoServicio = codigoServicio;
		
	}


	public String getTipoDeServicio() {
		return tipoDeServicio;
	}


	public int getCodigoServicio() {
		return codigoServicio;
	}
	
	
	
	

}

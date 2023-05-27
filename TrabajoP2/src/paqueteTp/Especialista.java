package paqueteTp;

public class Especialista {
	
	private int nroEspecialista;
	private String nombre, telefono, especialidad;
	
	
	public Especialista(int nroEspecialista, String nombre, String telefono, String especialidad) {
	
		this.nroEspecialista = nroEspecialista;
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public int getNroEspecialista() {
		return nroEspecialista;
	}
	
	

}

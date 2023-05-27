package paqueteTp;

import java.util.Map;



public class EmpresaDeServicios {
	
	private Cliente clientes[];
	private Servicio servicios[];
	private Especialista especialistas[];
	
	
	/**
	* Registra un nuevo cliente en el sistema dado su:
	* - dni,
	* - nombre y
	* - teléfono de contacto.
	*
	* Si el dni ya está en el sistema se debe generar una
	* excepción.
	*/
	public void registrarCliente(int dni, String nombre, String telefono) {
		
		if(clienteEstaRegistrado(dni)) {
			throw new RuntimeException("El cliente ya esta registrado");
		}else {
			Cliente cliente = new Cliente(dni, nombre, telefono);
		}
	}
	
	/**
	* Registra un nuevo especialista en el sistema dados su:
	* - nroEspecialista,
	* - nombre,
	* - teléfono y
	* - tipo De servicio en el que se especializa.
	*
	* Si el nroEspecialista ya está registrado en el sistema
	* se debe generar una excepción.
	*/
	public void registrarEspecialista(int nroEspecialista, String nombre, String telefono, String especialidad) {
		if(especialistaEstaRegistrado(nroEspecialista)) {
			throw new RuntimeException("El Especialista ya esta registrado");
		}else {
			Especialista especialista = new Especialista(nroEspecialista, nombre, telefono, especialidad);
		}
		
	}
	

	/**
	* Se registra la prestación de un servicio de tipo Electricidad en el sistema
	* ingresando los datos necesarios para solicitar un servicio y además:
	* - precio por hora de trabajo del especialista
	* - cantidad de horas estimadas que llevará realizar el trabajo.
	* 
	* Se devuelve el código único del servicio a realizar.
	*
	* Si el dni o el nroEspecialista no están registrados en el sistema se debe
	* generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	* una excepción.
	* Si el precio por hora o las horas de trabajo estimado son menores o
	* iguales a 0, se debe generar una excepción.
	*/
	public int solicitarServicioElectricidad(int dni, int nroEspecialista, String direccion, double precioPorHora,int horasTrabajadas) {
		
		if(!clienteEstaRegistrado(dni) || !especialistaEstaRegistrado(nroEspecialista)) {
			throw new RuntimeException("El DNI o el especialista no estan registrados");
		}
		if(!esElectricista(nroEspecialista)) {
			throw new RuntimeException("Este especialista no se especializa en este servicio");
		}
		if(horasInvalidas(precioPorHora, horasTrabajadas)) {
			throw new RuntimeException("El precio por hora o las horas trabajadas son menores o iguales a 0");
		}
		
		Servicio servicio = new servicio( "Electricidad" , direccion, precioPorHora , horasTrabajadas);
		
		
		return 0 ;
	}
	
	
	
	


	private boolean horasInvalidas(double precioPorHora, int horasTrabajadas) {
		return precioPorHora <= 0 || horasTrabajadas <=0;
	}
	

	private boolean esElectricista(int nroEspecialista) {
		for(Especialista e: especialistas) {
			if(e.getNroEspecialista() == nroEspecialista) {
				if(e.getEspecialidad().equals("Electricista"))
					return true;
			}
		}
		return false;
	}

	/**
	* Se registra la prestación de un servicio de tipo Pintura en el sistema
	* ingresando los datos necesarios para solicitar un servicio y además:
	* - precio por pintar un metro cuadrado
	* - cantidad de metros cuadrados a pintar.
	* 
	* Se devuelve el código único del servicio a realizar.
	*
	* Si el dni o el nroEspecialista no están registrados en el sistema se debe
	* generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	* una excepción.
	* Si el precio por metro cuadrado o los metros cuadrados son menores o
	* iguales a 0, se debe generar una excepción.
	5 de 7
	*/
	public int solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado) {
		
		return 0;
		
	}
	/**
	* Se registra la prestación de un servicio de tipo PinturaEnAltura en el
	* sistema ingresando los datos necesarios para solicitar un servicio y además:
	* - precio por pintar un metro cuadrado
	* - cantidad de metros cuadrados a pintar
	* - nro de piso en el que se realizará el trabajo.
	* - costo del seguro
	* - costo del alquiler de los andamios.
	* 
	* Se devuelve el código único del servicio a realizar.
	*
	* Si el dni o el nroEspecialista no están registrados en el sistema se debe
	* generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	* una excepción.
	* Si el precio por metro cuadrado o los metros cuadrados o el piso o el costo
	* del seguro o el costo del alquiler de los andamios son menores o iguales a 0,
	* se debe generar una excepción.
	*/
	public int solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado,
	int piso,double seguro, double alqAndamios) {
		
		return 0;
		
		
	}
	/**
	* Se registra la prestación de un servicio de tipo GasistaInstalacion en el
	* sistema ingresando los datos necesarios para solicitar un servicio y además:
	* - cantidad de artefactos a instalar
	* - precio por la instalación de un artefacto.
	* 
	* Se devuelve el código único del servicio a realizar.
	*
	* Si el dni o el nroEspecialista no están registrados en el sistema se debe
	* generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	* una excepción.
	* Si el precio de instalación o la cantidad de artefactos a instalar son
	* menores o iguales a 0, se debe generar una excepción.
	*/
	public int solicitarServicioGasistaInstalacion(int dni, int nroEspecialista,
	 String direccion, int cantArtefactos,
	 double precioPorArtefacto) {
		
		return 0;
		
	}
	
	/**
	* Se registra la prestación de un servicio de tipo GasistaRevison en el
	* sistema ingresando los datos necesarios para solicitar un servicio y además:
	* - cantidad de artefactos a revisar
	* - precio por la revisión de un artefacto.
	* 
	* Se devuelve el código único del servicio a realizar.
	*
	* Si el dni o el nroEspecialista no están registrados en el sistema se debe
	* generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	6 de 7
	* una excepción.
	* Si el precio de instalación o la cantidad de artefactos a revisar son
	* menores o iguales a 0, se debe generar una excepción.
	*/
	public int solicitarServicioGasistaRevision(int dni, int nroEspecialista,
	 String direccion, int cantArtefactos,
	 double precioPorArtefacto) {
		
		
		return 0;
	}
	/**
	* Se registra que el servicio solicitado ya fué concluido. Para esto se debe
	* ingresar el costo de los materiales utilizados para poder realizar el
	* trabajo.
	*
	* Se devuelve el precio que se debe facturar al cliente.
	* Este precio se obtiene sumando el costo de los materiales con el costo del
	* servicio realizado. Cada tipo de servicio tiene su forma de calcular el
	* costo del trabajo.
	* 
	* Si el código de servicio no está en el sistema o el mismo ya fué finalizado,
	* se debe generar una excepción.
	*
	* Se debe realizar esta operación en O(1).
	*/
	public double finalizarServicio(int codServicio, double costoMateriales) {
		
		return 1.6;
	}
	/**
	* Devuelve un diccionario cuya clave es el tipo de servicio y el valor es la
	* cantidad de servicios realizados de ese tipo.
	* Si un tipo de servicio no tuvo ninguna demanda, el valor de esa entrada debe
	* ser 0.
	*/
	public Map<String,Integer> cantidadDeServiciosRealizadosPorTipo(){
		
		return null;
		
	}
	/**
	* Devuelve la suma del precio facturado de todos los servicios finalizados que
	* son del tipo pasado por parámetro.
	* Si el tipo de servicio es invalido, debe generar una excepción.
	*
	* Se debe realizar esta operación en O(1).
	*/
	public double facturacionTotalPorTipo(String tipoServicio) {
		
		return 1.8;
		
	}
	/**
	* Devuelve la suma del precio facturado de todos los servicios finalizados que
	* realizó la empresa.
	*/
	public double facturacionTotal() {
		return 1.8;
		
	}
	/**
	* Debe cambiar el especialista responsable del servicio.
	* Si código de Servicio o el nroEspecialista no están registrados en el sistema
	* se debe generar una excepción.
	* Si el especialista no se especializa en este tipo de servicio se debe generar
	* una excepción.
	*
	*
	* Se debe realizar esta operación en O(1).
	*/
	public void cambiarResponsable(int codServicio, int nroEspecialista) {
		
	}
	
	/**
	* Devuelve un String con forma de listado donde cada renglón representa un
	* servicio realizado.
	* Cada renglón debe respetar el siguiente formato:
	* " + [ codServicio - GasistaInstalacion ] Dirección"
	* por ejemplo:
	* " + [ 1492 - GasistaInstalacion ] uan María Gutiérrez 1150"
	* Si el nroEspecialista no está registrado en el sistema, se debe generar una
	* excepción.
	* Si el especialista no ha realizado ningún servicio hasta el momento, se debe
	* devolver un String vacío.
	*/
	public String listadoServiciosAtendidosPorEspecialista(int nroEspecialista) {
		
		return "";
		
	}
	
	private boolean clienteEstaRegistrado(int dni) {
		for(Cliente c: clientes) {
			if(c.getDni() == dni)
				return true;
		}
		return false;
	}
	
	private boolean especialistaEstaRegistrado(int nroEspecialista) {
		for(Especialista e: especialistas) {
			if(e.getNroEspecialista()== nroEspecialista)
				return true;
		}
		return false;
	}
	

}

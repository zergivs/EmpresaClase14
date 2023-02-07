
public class Cliente {
	// Atributos

	private String rut, sistemaSalud, edad, nombre, apellido, telefono, afp, direccion, comuna;

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", sistemaSalud=" + sistemaSalud + ", edad=" + edad + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", afp=" + afp + ", direccion=" + direccion
				+ ", comuna=" + comuna + "]";
	}

	/**
	 * 
	 */
	public Cliente() {
		super();
	}

	/**
	 * @param rut
	 * @param sistemaSalud
	 * @param edad
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param afp
	 * @param direccion
	 * @param comuna
	 */
	public Cliente(String rut, String sistemaSalud, String edad, String nombre, String apellido, String telefono,
			String afp, String direccion, String comuna) {
		super();
		if (rut.matches("[0-9]{6,8}")) {
			this.rut = rut;
		}
		if (sistemaSalud == "1") {
			this.sistemaSalud = "Fonasa";
		}
		if (sistemaSalud == "2") {
			this.sistemaSalud = "Isapre";
		}
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the sistemaSalud
	 */
	public String getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String obtenerNombre() {
		return nombre + apellido;

	}

	public String obtenerSistemaSalud() {
		return sistemaSalud;
	}

	public String mostarEdad() {
		return ("El usuario tiene " + edad + "anos.");
	}
}

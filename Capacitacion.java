
public class Capacitacion {

	private int capacitacionID, cantidadAsistentes;
	private String rut, dia, hora, lugar, duracion;

	@Override
	public String toString() {
		return "Capacitacion [capacitacionID=" + capacitacionID + ", cantidadAsistentes=" + cantidadAsistentes
				+ ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
				+ "]";
	}

	/**
	 * 
	 */
	public Capacitacion() {
		super();
	}

	/**
	 * @param capacitacionID
	 * @param cantidadAsistentes
	 * @param rut
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 */
	public Capacitacion(int capacitacionID, int cantidadAsistentes, String rut, String dia, String hora, String lugar,
			String duracion) {
		super();
		this.capacitacionID = capacitacionID;
		this.cantidadAsistentes = cantidadAsistentes;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
	}

	/**
	 * @return the capacitacionID
	 */
	public int getCapacitacionID() {
		return capacitacionID;
	}

	/**
	 * @param capacitacionID the capacitacionID to set
	 */
	public void setCapacitacionID(int capacitacionID) {
		this.capacitacionID = capacitacionID;
	}

	/**
	 * @return the cantidadAsistentes
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	/**
	 * @param cantidadAsistentes the cantidadAsistentes to set
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
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
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String mostrarDetalle() {

		return ("La capacitación será en " + lugar + "a las " + hora + "del día " + dia + "y durará " + duracion
				+ "minutos");
	}
}

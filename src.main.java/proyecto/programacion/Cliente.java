package proyecto.programacion;

public final class Cliente extends Usuario {

	private String cedula;

	// Métodos SET y GET
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return " Cliente [ Cedula:  " + cedula + "]";
	}

}

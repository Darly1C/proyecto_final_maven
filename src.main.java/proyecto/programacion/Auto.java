package proyecto.programacion;

import java.time.LocalDate;

public class Auto {

	private String nombreModelo;
	private String nombreMarca;
	private String placaAuto;
	private String paisOrigenAuto;
	private String cilindraje;
	private int anioFabricacion;
	private int precioAuto;
	private String estadoAuto;
	private String tipoAuto;

	// Métodos SET y GET
	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getPlacaAuto() {
		return placaAuto;
	}

	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}

	public String getPaisOrigenAuto() {
		return paisOrigenAuto;
	}

	public void setPaisOrigenAuto(String paisOrigenAuto) {
		this.paisOrigenAuto = paisOrigenAuto;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getPrecioAuto() {
		return precioAuto;
	}

	public void setPrecioAuto(int precioAuto) {
		this.precioAuto = precioAuto;
	}

	public String getEstadoAuto() {
		return estadoAuto;
	}

	public void setEstadoAuto(String estadoAuto) {
		this.estadoAuto = estadoAuto;
	}

	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	@Override
	public String toString() {
		return "Auto [Placa: " + placaAuto + ", Modelo: " + nombreModelo + ", Marca: " + nombreMarca + ","
				+ " País Origen: " + paisOrigenAuto + ", Año: " + anioFabricacion + ", Precio: $" + precioAuto
				+ ", Estado: " + estadoAuto + "]";
	}

}

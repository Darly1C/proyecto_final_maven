package proyecto.programacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MainMetrocar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);

		int menuOpcion;
		String cedula;
		String literal;
		String literalEmpleado;
		String auto = "";
		String marcaA = "Chevrolet";
		String marcaB = "Mazda";
		String marcaC = "Toyota";
		String marcaD = "Renault";
		String marcaE = "KIA";
		String placa;
		String placaIngresar;
		String modelo;
		String marca;
		int anioFabricacion;
		String paisFabricacion;
		String cilindraje;
		int precioAuto;
		int numPuertas;
		int numAuto;

		LocalDate diaReserva = LocalDate.now();
		LocalDate diaEntrega = diaReserva.plusDays(2);
		LocalDate diaEntrega1 = diaReserva.plusDays(1);

		List<Auto> listAuto = new ArrayList<Auto>();

		do {
			Cliente cliente1 = new Cliente();
			Cliente cliente2 = new Cliente();

			Auto vehiculo1 = new Auto();
			vehiculo1.setNombreModelo("Spark GT");
			vehiculo1.setNombreMarca("Chevrolet");
			vehiculo1.setPlacaAuto("SPK-9471");
			vehiculo1.setEstadoAuto("Disponible");
			vehiculo1.setAnioFabricacion(2019);
			vehiculo1.setPaisOrigenAuto("Corea");
			vehiculo1.setCilindraje("Motor 1.2L 4 cilindros");
			vehiculo1.setPrecioAuto(13399);
			vehiculo1.setTipoAuto("Automóvil");

			Auto vehiculo2 = new Auto();
			vehiculo2.setNombreModelo("Sedán");
			vehiculo2.setNombreMarca("Mazda");
			vehiculo2.setPlacaAuto("SDN-4564");
			vehiculo2.setEstadoAuto("Alquilado");
			vehiculo2.setAnioFabricacion(2015);
			vehiculo2.setPaisOrigenAuto("México");
			vehiculo2.setCilindraje("Motor SkyActiv-G 1.5L con 106HP 4 cilindros");
			vehiculo2.setPrecioAuto(19990);
			vehiculo2.setTipoAuto("Automóvil");

			Auto vehiculo3 = new Auto();
			vehiculo3.setNombreModelo("Picanto");
			vehiculo3.setNombreMarca("KIA");
			vehiculo3.setPlacaAuto("PCT-5210");
			vehiculo3.setEstadoAuto("Disponible");
			vehiculo3.setAnioFabricacion(2020);
			vehiculo3.setPaisOrigenAuto("Malasia");
			vehiculo3.setCilindraje("Motor de 1.2L y 85CV 4 cilindros");
			vehiculo3.setPrecioAuto(18899);
			vehiculo3.setTipoAuto("Automóvil");

			Auto vehiculo4 = new Auto();
			vehiculo4.setNombreModelo("Sail Sedan");
			vehiculo4.setNombreMarca("Chevrolet");
			vehiculo4.setPlacaAuto("SSN-1434");
			vehiculo4.setEstadoAuto("Disponible");
			vehiculo4.setAnioFabricacion(2018);
			vehiculo4.setPaisOrigenAuto("China");
			vehiculo4.setCilindraje("Motor de 1.5L 4 cilindros");
			vehiculo4.setPrecioAuto(14299);
			vehiculo4.setTipoAuto("Automóvil");

			Auto vehiculo5 = new Auto();
			vehiculo5.setNombreModelo("Renault Logan");
			vehiculo5.setNombreMarca("Renault");
			vehiculo5.setPlacaAuto("RNT-5012");
			vehiculo5.setEstadoAuto("Reservado");
			vehiculo5.setAnioFabricacion(2021);
			vehiculo5.setPaisOrigenAuto("Francia");
			vehiculo5.setCilindraje("Motor de 1.6L CVT 4 cilindros");
			vehiculo5.setPrecioAuto(21199);
			vehiculo5.setTipoAuto("Automóvil");
			vehiculo5.setDiaEntrega(diaEntrega);

			Auto vehiculo6 = new Auto();
			vehiculo6.setNombreModelo("D-Max High Power");
			vehiculo6.setNombreMarca("Chevrolet");
			vehiculo6.setPlacaAuto("DMX-1281");
			vehiculo6.setEstadoAuto("Reservado");
			vehiculo6.setAnioFabricacion(2020);
			vehiculo6.setPaisOrigenAuto("Ecuador");
			vehiculo6.setCilindraje("Motor 2.5L Turbo Diésel CRDI");
			vehiculo6.setPrecioAuto(32599);
			vehiculo6.setTipoAuto("Camioneta");
			vehiculo6.setDiaEntrega(diaEntrega1);

			Auto vehiculo7 = new Auto();
			vehiculo7.setNombreModelo("Hilux");
			vehiculo7.setNombreMarca("Toyota");
			vehiculo7.setPlacaAuto("HLX-6526");
			vehiculo7.setEstadoAuto("Disponible");
			vehiculo7.setAnioFabricacion(2018);
			vehiculo7.setPaisOrigenAuto("Japón");
			vehiculo7.setCilindraje("Motor a gasolina 2.7L de 163HP y 245Nm");
			vehiculo7.setPrecioAuto(29999);
			vehiculo7.setTipoAuto("Camioneta");

			Auto vehiculo8 = new Auto();
			vehiculo8.setNombreModelo("D-Max Hi-Ride");
			vehiculo8.setNombreMarca("Chevrolet");
			vehiculo8.setPlacaAuto("DMX-2485");
			vehiculo8.setEstadoAuto("Alquilado");
			vehiculo8.setAnioFabricacion(2019);
			vehiculo8.setPaisOrigenAuto("Ecuador");
			vehiculo8.setCilindraje("Motor 2.5L Turbo Diésel CRDI");
			vehiculo8.setPrecioAuto(31599);
			vehiculo8.setTipoAuto("Camioneta");

			Auto vehiculo9 = new Auto();
			vehiculo9.setNombreModelo("Colorado");
			vehiculo9.setNombreMarca("Chevrolet");
			vehiculo9.setPlacaAuto("CRL-8621");
			vehiculo9.setEstadoAuto("Alquilado");
			vehiculo9.setAnioFabricacion(2020);
			vehiculo9.setPaisOrigenAuto("Estados Unidos");
			vehiculo9.setCilindraje("Motor 2.8L Turbo Diésel Duramax");
			vehiculo9.setPrecioAuto(46999);
			vehiculo9.setTipoAuto("Camioneta");

			Auto vehiculo10 = new Auto();
			vehiculo10.setNombreModelo("D-Max Premiere");
			vehiculo10.setNombreMarca("Chevrolet");
			vehiculo10.setPlacaAuto("DMX-4562");
			vehiculo10.setEstadoAuto("Disponible");
			vehiculo10.setAnioFabricacion(2021);
			vehiculo10.setPaisOrigenAuto("Ecuador");
			vehiculo10.setCilindraje("Motor 2.5L Turbo Diésel CRDI");
			vehiculo10.setPrecioAuto(43999);
			vehiculo10.setTipoAuto("Camioneta");

			Automovil auto1 = new Automovil();
			Camioneta camioneta1 = new Camioneta();

			listAuto.add(vehiculo1);
			listAuto.add(vehiculo2);
			listAuto.add(vehiculo3);
			listAuto.add(vehiculo4);
			listAuto.add(vehiculo5);
			listAuto.add(vehiculo6);
			listAuto.add(vehiculo7);
			listAuto.add(vehiculo8);
			listAuto.add(vehiculo9);
			listAuto.add(vehiculo10);
			listAuto.add(auto1);
			listAuto.add(camioneta1);

			System.out.println("****************************************************");
			System.out.println("_______________Bienvenido a metrocar_______________");
			System.out.println();
			System.out.print("1. Usuario: Cliente             ");
			System.out.println("2. Usuario: Empleado");
			System.out.println("                     3. SALIR");
			System.out.println("****************************************************");
			System.out.println("Elija la opción del usuario al que pertenece:");
			menuOpcion = tecladoInt.nextInt();

			switch (menuOpcion) {

			case 1:
				do {
					System.out.println("CLIENTE");
					System.out.println("a. Consultar auto");
					System.out.println("b. Reservar auto");
					System.out.println();
					System.out.println("Ingrese -1 si desea volver al menú de inicio");
					literal = teclado.nextLine();

					switch (literal) {

					case "a":
						System.out.print("Ingrese el modelo y/o marca del auto: ");
						auto = teclado.nextLine();

						if (auto.contains(marcaA)) {
							System.out.println("Vehículos Chevrolet");
							System.out.println(vehiculo1);
							System.out.println(vehiculo4);
							System.out.println(vehiculo6);
							System.out.println(vehiculo8);
							System.out.println(vehiculo9);
							System.out.println(vehiculo10);
							System.out.println();
						}

						if (auto.contains(marcaD)) {
							System.out.println("Vehículo Renault");
							System.out.println(vehiculo5);
							System.out.println();
						}

						if (auto.contains(marcaC)) {
							System.out.println("Vehículo Toyota");
							System.out.println(vehiculo7);
							System.out.println();
						}

						if (auto.contains(marcaE)) {
							System.out.println("Vehículo KIA");
							System.out.println(vehiculo3);
							System.out.println();
						}

						if (auto.contains(marcaB)) {
							System.out.println("Vehículo Mazda");
							System.out.println(vehiculo2);
							System.out.println();
						}

						if (auto.contains(vehiculo1.getNombreModelo())) {
							System.out.println(vehiculo1);
							System.out.println();
						}

						if (auto.contains(vehiculo2.getNombreModelo())) {
							System.out.println(vehiculo2);
							System.out.println();
						}

						if (auto.contains(vehiculo3.getNombreModelo())) {
							System.out.println(vehiculo3);
							System.out.println();
						}

						if (auto.contains(vehiculo4.getNombreModelo())) {
							System.out.println(vehiculo4);
							System.out.println();
						}

						if (auto.contains(vehiculo5.getNombreModelo())) {
							System.out.println(vehiculo5);
							System.out.println();
						}

						if (auto.contains(vehiculo6.getNombreModelo())) {
							System.out.println(vehiculo6);
							System.out.println();
						}

						if (auto.contains(vehiculo7.getNombreModelo())) {
							System.out.println(vehiculo7);
							System.out.println();
						}

						if (auto.contains(vehiculo8.getNombreModelo())) {
							System.out.println(vehiculo8);
							System.out.println();
						}

						if (auto.contains(vehiculo9.getNombreModelo())) {
							System.out.println(vehiculo9);
							System.out.println();
						}

						if (auto.contains(vehiculo10.getNombreModelo())) {
							System.out.println(vehiculo10);
							System.out.println();
						}

						break;

					case "b":
						System.out.print("Ingrese la placa del auto que desea reservar: ");
						placa = teclado.nextLine();
						System.out.print("Ingrese su número de cédula: ");
						cedula = teclado.nextLine();
						System.out.println();
						if ((placa.equals(vehiculo1.getPlacaAuto()) || placa.equals(vehiculo2.getPlacaAuto())
								|| placa.equals(vehiculo3.getPlacaAuto()) || placa.equals(vehiculo4.getPlacaAuto())
								|| placa.equals(vehiculo5.getPlacaAuto()) || placa.equals(vehiculo6.getPlacaAuto())
								|| placa.equals(vehiculo7.getPlacaAuto()) || placa.equals(vehiculo8.getPlacaAuto())
								|| placa.equals(vehiculo9.getPlacaAuto()) || placa.equals(vehiculo10.getPlacaAuto()))) {

							System.out.println("Auto encontrado");
							System.out.println(
									"Los autos en estado *Reservado o Alquilado* no están disponibles para reservar");
							System.out.println();

							if ((vehiculo1.getEstadoAuto().equals("Disponible"))
									|| (vehiculo2.getEstadoAuto().equals("Disponible"))
									|| (vehiculo3.getEstadoAuto().equals("Disponible"))
									|| (vehiculo4.getEstadoAuto().equals("Disponible"))
									|| (vehiculo5.getEstadoAuto().equals("Disponible"))
									|| (vehiculo6.getEstadoAuto().equals("Disponible"))
									|| (vehiculo7.getEstadoAuto().equals("Disponible"))
									|| (vehiculo8.getEstadoAuto().equals("Disponible"))
									|| (vehiculo9.getEstadoAuto().equals("Disponible"))
									|| (vehiculo10.getEstadoAuto().equals("Disponible"))) {

								if (placa.equals(vehiculo1.getPlacaAuto())) {
									System.out.print("El auto se encuentra en estado: " + vehiculo1.getEstadoAuto());
									System.out.println();
									System.out.println(vehiculo1);
									System.out.println("El auto se ha reservado con los siguientes datos: ");
									vehiculo1.setEstadoAuto(
											"Reservado " + "-" + " Reservado al cliente - cédula:" + cedula);
									System.out.println(vehiculo1);
									System.out.println("Pase a retirarlo en el patio de autos");
									System.out.println();
								}

								if (placa.equals(vehiculo3.getPlacaAuto())) {
									System.out.print("El auto se encuentra en estado: " + vehiculo3.getEstadoAuto());
									System.out.println();
									System.out.println(vehiculo3);
									System.out.println("El auto se ha reservado con los siguientes datos: ");
									vehiculo3.setEstadoAuto(
											"Reservado " + "-" + " Reservado al cliente - cédula:" + cedula);
									System.out.println(vehiculo3);
									System.out.println("Pase a retirarlo en el patio de autos");
									System.out.println();
								}

								if (placa.equals(vehiculo4.getPlacaAuto())) {
									System.out.print("El auto se encuentra en estado: " + vehiculo4.getEstadoAuto());
									System.out.println();
									System.out.println(vehiculo4);
									System.out.println("El auto se ha reservado con los siguientes datos: ");
									vehiculo4.setEstadoAuto(
											"Reservado " + "-" + " Reservado al cliente - cédula:" + cedula);
									System.out.println(vehiculo4);
									System.out.println("Pase a retirarlo en el patio de autos");
									System.out.println();
								}

								if (placa.equals(vehiculo7.getPlacaAuto())) {
									System.out.print("El auto se encuentra en estado: " + vehiculo7.getEstadoAuto());
									System.out.println();
									System.out.println(vehiculo7);
									System.out.println("El auto se ha reservado con los siguientes datos: ");
									vehiculo7.setEstadoAuto(
											"Reservado " + "-" + " Reservado al cliente - cédula:" + cedula);
									System.out.println(vehiculo7);
									System.out.println("Pase a retirarlo en el patio de autos");
									System.out.println();
								}

								if (placa.equals(vehiculo10.getPlacaAuto())) {
									System.out.print("El auto se encuentra en estado: " + vehiculo10.getEstadoAuto());
									System.out.println();
									System.out.println(vehiculo10);
									System.out.println("El auto se ha reservado con los siguientes datos: ");
									vehiculo10.setEstadoAuto(
											"Reservado " + "-" + " Reservado al cliente - cédula:" + cedula);
									System.out.println(vehiculo10);
									System.out.println("Pase a retirarlo en el patio de autos");
									System.out.println();
								}

							}

						} else {
							System.out.println("La placa ingresada no es correcta");
							System.out.println();
						}

						break;

					default:
						System.out.println("Elija literal/opción correcto");
						System.out.println();
						break;
					}

				} while (!literal.equals("-1"));

				break;

			case 2:
				do {
					System.out.println("EMPLEADO");
					System.out.println("a. Registrar auto");
					System.out.println("b. Validar información");
					System.out.println();
					System.out.println("Digite -1 si desea volver al menú de inicio");
					literalEmpleado = teclado.nextLine();

					switch (literalEmpleado) {

					case "a":
						do {
							System.out.println("Elija que tipo de auto desea registrar");
							System.out.println("1. Automóvil");
							System.out.println("2. Camioneta");
							System.out.println();
							System.out.println("Digite -1 si desea volver al menú de inicio");
							numAuto = tecladoInt.nextInt();

							switch (numAuto) {
							case 1:

								System.out.print("Placa: ");
								placaIngresar = teclado.nextLine();
								System.out.print("Modelo: ");
								modelo = teclado.nextLine();
								System.out.print("Marca: ");
								marca = teclado.nextLine();
								System.out.print("Año de fabricación: ");
								anioFabricacion = tecladoInt.nextInt();
								System.out.print("País de fabricación: ");
								paisFabricacion = teclado.nextLine();
								System.out.print("Cilindraje: ");
								cilindraje = teclado.nextLine();
								System.out.print("Precio de auto: ");
								precioAuto = tecladoInt.nextInt();
								System.out.print("Número de puertas: ");
								numPuertas = tecladoInt.nextInt();

								auto1.setNombreModelo(modelo);
								auto1.setNombreMarca(marca);
								auto1.setPlacaAuto(placaIngresar);
								auto1.setAnioFabricacion(anioFabricacion);
								auto1.setPaisOrigenAuto(paisFabricacion);
								auto1.setCilindraje(cilindraje);
								auto1.setPrecioAuto(precioAuto);
								auto1.setTipoAuto("Automóvil");
								auto1.setNumeroPuertas(numPuertas);
								System.out.println();

								listAuto.add(auto1);

								System.out.print(auto1);
								System.out.print(" # Puertas: " + auto1.getNumeroPuertas());
								System.out.println();
								System.out.println();

								System.out.println("El automóvil ha sido guardado exitosamente");

								break;

							case 2:

								System.out.print("Placa: ");
								placaIngresar = teclado.nextLine();
								System.out.print("Modelo: ");
								modelo = teclado.nextLine();
								System.out.print("Marca: ");
								marca = teclado.nextLine();
								System.out.print("Año de fabricación: ");
								anioFabricacion = tecladoInt.nextInt();
								System.out.print("País de fabricación: ");
								paisFabricacion = teclado.nextLine();
								System.out.print("Cilindraje: ");
								cilindraje = teclado.nextLine();
								System.out.print("Precio de auto: ");
								precioAuto = tecladoInt.nextInt();
								System.out.print("Peso que soporta: ");
								double peso = tecladoInt.nextInt();

								camioneta1.setNombreModelo(modelo);
								camioneta1.setNombreMarca(marca);
								camioneta1.setPlacaAuto(placaIngresar);
								camioneta1.setAnioFabricacion(anioFabricacion);
								camioneta1.setPaisOrigenAuto(paisFabricacion);
								camioneta1.setCilindraje(cilindraje);
								camioneta1.setPrecioAuto(precioAuto);
								camioneta1.setTipoAuto("Camioneta");
								camioneta1.setPesoSoporta(peso);
								System.out.println();

								listAuto.add(camioneta1);

								System.out.print(camioneta1);
								System.out.print(" Peso que soporta: " + camioneta1.getPesoSoporta() + "kg");
								System.out.println();
								System.out.println();

								System.out.println("La camioneta ha sido guardado exitosamente");

								break;

							default:

								System.out.println("Elija literal/opción correcto");
								System.out.println();

								break;
							}

						} while (numAuto != -1);

						break;

					case "b":

						System.out.print("Ingrese la placa del auto que desea validar: ");
						placa = teclado.nextLine();
						if ((placa.equals(vehiculo1.getPlacaAuto()) || placa.equals(vehiculo2.getPlacaAuto())
								|| placa.equals(vehiculo3.getPlacaAuto()) || placa.equals(vehiculo4.getPlacaAuto())
								|| placa.equals(vehiculo5.getPlacaAuto()) || placa.equals(vehiculo6.getPlacaAuto())
								|| placa.equals(vehiculo7.getPlacaAuto()) || placa.equals(vehiculo8.getPlacaAuto())
								|| placa.equals(vehiculo9.getPlacaAuto()) || placa.equals(vehiculo10.getPlacaAuto()))) {

							System.out.println("Auto encontrado");
							System.out.println();

							if ((vehiculo1.getEstadoAuto().equals("Reservado"))
									|| (vehiculo2.getEstadoAuto().equals("Reservado"))
									|| (vehiculo3.getEstadoAuto().equals("Reservado"))
									|| (vehiculo4.getEstadoAuto().equals("Reservado"))
									|| (vehiculo5.getEstadoAuto().equals("Reservado"))
									|| (vehiculo6.getEstadoAuto().equals("Reservado"))
									|| (vehiculo7.getEstadoAuto().equals("Reservado"))
									|| (vehiculo8.getEstadoAuto().equals("Reservado"))
									|| (vehiculo9.getEstadoAuto().equals("Reservado"))
									|| (vehiculo10.getEstadoAuto().equals("Reservado"))) {

								vehiculo5.setEstadoAuto("Reservado " + " - " + cliente1.getCedula());
								System.out.println(vehiculo5);
							}
						}
						break;

					default:
						System.out.println("Elija literal/opción correcto");
						System.out.println();
						break;
					}

				} while (!literalEmpleado.equals("-1"));

				break;

			case 3:
				System.out.println("            Cerrando el sistema metrocar");
				System.out.println("____________________Vuelva pronto___________________");
				System.out.println();
				System.out.println("****************************************************");

				break;

			default:
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("         Elija una opción válida para continuar");
				System.out.println("----------------------------------------------------");
				System.out.println();

				break;
			}

		} while (menuOpcion != 3);

	}

}

//if ((vehiculo1.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo1.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo2.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo2.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo3.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo3.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo4.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo4.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo5.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo5.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo6.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo6.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo7.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo7.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo8.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo8.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo9.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo9.getEstadoAuto().equals("Alquilado"))
//		|| (vehiculo10.getEstadoAuto().equals("Reservado"))
//		|| (vehiculo10.getEstadoAuto().equals("Alquilado"))) {
//
//	System.out.println("El auto se encuentra en estado: Reservado o Alquilado");
//	System.out.println();
//}

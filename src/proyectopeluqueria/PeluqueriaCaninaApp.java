package proyectopeluqueria;

import proyectopeluqueria.model.*;

import java.util.Scanner;
import java.util.logging.Logger;


public class PeluqueriaCaninaApp {
  public static final Logger log = Logger.getLogger(PeluqueriaCaninaApp.class.getName());

  public static void main(String[] args) {
    Mascota[] arrayMascota = new Mascota[3];
    Turno[] arrayTurnos = new Turno[3];
    Servicio[] arrayServicios = new Servicio[3];
    log.info("Bienvenido, por favor complete los siguientes campos");
    FuncionesMascota.agregarMascota(arrayMascota);
    FuncionesMascota.agregarServicios(arrayServicios);
    FuncionesMascota.agregarTurno(arrayTurnos, arrayMascota, arrayServicios);
    int opcion;
    do {
      log.info("--- Menú ---");
      log.info("1. Ver cantidad de mascotas por especie");
      log.info("2. Buscar mascota por nombre");
      log.info("3. Calcular precion final de los servicios");
      log.info("4. Mostrar turnos por estado");
      log.info("5. Mostrar servicios largos");
      log.info("6. Mostrar turnos activos");
      log.info("0. Salir");
      log.info("Seleccione una opción:");
      Scanner sc = new Scanner(System.in);
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          Mascota.contarMascotaPorEspecie(arrayMascota);
          break;
        case 2:
          FuncionesMascota.buscarMascotaPorNombre(arrayMascota);
          break;
        case 3:
          Servicio.calcularIVA(arrayServicios);
          break;
        case 4:
          Turno.contarTurnosPorEstado(arrayTurnos);
          break;
        case 5:
          Servicio.mostrarServiciosLargos(arrayServicios);
          break;
        case 6:
          Turno.mostrarTurnosActivos(arrayTurnos);
          break;
        case 0:
          log.info("Saliendo del programa...");
          break;
        default:
          log.info("Opción inválida. Intente nuevamente.");
      }
    } while (opcion != 0);


  }

}
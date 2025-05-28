package proyectopeluqueria.model;


import java.util.Scanner;
import java.util.logging.Logger;

public class FuncionesMascota {
  public static final Logger log = Logger.getLogger(FuncionesMascota.class.getName());

  //funcion agregar mascota
  public static void agregarMascota(Mascota[] mascotaArray) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < mascotaArray.length; i++) {
      log.info("Ingrese el nombre de la mascota:");
      String guardarNombreMasc = sc.nextLine();

      log.info("Ingrese la raza:");
      String guardarRaza = sc.nextLine();

      Especie especie = null;
      while (especie == null) {
        log.info("Ingrese la especie (perro o gato):");
        String entradaEspecie = sc.nextLine();

        for (Especie e : Especie.values()) {
          if (e.name().equalsIgnoreCase(entradaEspecie)) {
            especie = e;
            break;
          }
        }

        if (especie == null) {
          log.info("Especie inválida. Solo se permite PERRO o GATO.");
        }
      }

      log.info("Ingrese la edad:");
      int guardarEdad = sc.nextInt();
      sc.nextLine(); // limpiar buffer

      log.info("Ingrese el nombre del dueño:");
      String guardarNomDuenio = sc.nextLine();

      Mascota mascota = new Mascota(guardarNombreMasc, guardarRaza, especie, guardarEdad, guardarNomDuenio);
      mascotaArray[i] = mascota;

    }
  }

  //funcion agregar turnos
  public static void agregarTurno(Turno[] arrayTurnos, Mascota[] mascotas, Servicio[] servicios) {
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger(FuncionesMascota.class.getName());

    for (int i = 0; i < arrayTurnos.length; i++) {
      String fecha;
      // Validar fecha con espacio disponible
      do {
        log.info("Ingrese la fecha del turno:");
        fecha = sc.nextLine();
        if (!Turno.validarTurnosPorDia(arrayTurnos, fecha)) {
          log.info("Ya se alcanzó el máximo de turnos (" + Turno.MAX_TURNOS_DIARIOS + ") para esta fecha. Intente con otra.");
        }
      } while (!Turno.validarTurnosPorDia(arrayTurnos, fecha));

      log.info("Ingrese la hora del turno:");
      String hora = sc.nextLine();

      // Validación de estado
      Estado estado = null;
      while (estado == null) {
        log.info("Ingrese el estado del turno (programado, cancelado o realizado):");
        String entradaEstado = sc.nextLine();
        for (Estado e : Estado.values()) {
          if (e.name().equalsIgnoreCase(entradaEstado)) {
            estado = e;
            break;
          }
        }
        if (estado == null) {
          log.info("Estado inválido.");
        }
      }

      // Seleccionar mascota
      log.info("Seleccione la mascota:");
      for (int j = 0; j < mascotas.length; j++) {
        if (mascotas[j] != null) {
          log.info(j + ": " + mascotas[j].mostrarMascota());
        }
      }
      int indiceMascota = sc.nextInt();
      sc.nextLine(); // limpiar buffer
      Mascota mascota = mascotas[indiceMascota];

      // Seleccionar servicio
      log.info("Seleccione el servicio:");
      for (int k = 0; k < servicios.length; k++) {
        if (servicios[k] != null) {
          log.info(k + ": " + servicios[k].mostrarServicio());
        }
      }
      int indiceServicio = sc.nextInt();
      sc.nextLine(); // limpiar buffer
      Servicio servicio = servicios[indiceServicio];

      Turno turno = new Turno(fecha, hora, estado, mascota, servicio);
      arrayTurnos[i] = turno;
    }
  }

  //buscar mascota por nombre
  public static void buscarMascotaPorNombre(Mascota[] arrayMascota) {
    log.info("Por favor ingrese el nombre de la mascota que quiere buscar:");
    Scanner sc = new Scanner(System.in);
    String buscarMascota = sc.nextLine();

    boolean encontrada = false;

    for (int i = 0; i < arrayMascota.length; i++) {
      if (arrayMascota[i] != null && arrayMascota[i].getNombre().equalsIgnoreCase(buscarMascota)) {
        log.info("Mascota encontrada en la posición " + (i + 1) + ":\n" + arrayMascota[i].mostrarMascota());
        encontrada = true;
      }
    }

    if (!encontrada) {
      log.info("No se encontró ninguna mascota con ese nombre.");
    }
  }
}

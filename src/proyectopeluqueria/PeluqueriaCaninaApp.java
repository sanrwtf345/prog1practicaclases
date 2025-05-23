package proyectopeluqueria;

import proyectopeluqueria.model.*;

import java.util.logging.Logger;

public class PeluqueriaCaninaApp {
  public static final Logger log = Logger.getLogger(PeluqueriaCaninaApp.class.getName());

  public static void main(String[] args) {
    Mascota[] arrayMascota = new Mascota[5];
    Turno[] arrayTurnos = new Turno[10];
    Servicio[] arrayServicios = new Servicio[10];

    FuncionesMascota.agregarMascota(arrayMascota);
    FuncionesMascota.agregarServicios(arrayServicios);
    FuncionesMascota.agregarTurno(arrayTurnos, arrayMascota, arrayServicios);

    for (int i = 0; i < arrayMascota.length; i++) {
      if (arrayMascota[i] != null) {
        log.info(arrayMascota[i].mostrarMascota());
      } else {
        log.info("No hay mascota cargada en la posición " + i);
      }
    }


  }
}
package proyectopeluqueria;

import proyectopeluqueria.model.*;

import java.util.logging.Logger;

public class PeluqueriaCaninaApp {
  public static final Logger log = Logger.getLogger(PeluqueriaCaninaApp.class.getName());

  public static void main(String[] args) {
    Mascota[] arrayMascota = new Mascota[3];
    Turno[] arrayTurnos = new Turno[3];
    Servicio[] arrayServicios = new Servicio[3];

    FuncionesMascota.agregarMascota(arrayMascota);
    FuncionesMascota.agregarServicios(arrayServicios);
    FuncionesMascota.agregarTurno(arrayTurnos, arrayMascota, arrayServicios);
    Servicio.calcularIVA(arrayServicios);
    FuncionesMascota.buscarMascotaPorNombre(arrayMascota);
    Mascota.contarMascotaPorEspecie(arrayMascota);

    for (int i = 0; i < arrayMascota.length; i++) {
      if (arrayMascota[i] != null) {
        log.info(arrayMascota[i].mostrarMascota());
      } else {
        log.info("No hay mascota cargada en la posición " + i);
      }
    }


  }
}
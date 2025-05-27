package proyectopeluqueria.model;

import java.util.logging.Logger;

public class Turno {
  public static final Logger log = Logger.getLogger(Turno.class.getName());

  private int id;
  private String fecha;
  private String hora;
  private Estado estado;
  private static int idTurnoIncremento;
  private Mascota mascota;
  private Servicio servicio;

  public Turno(String fecha, String hora, Estado estado, Mascota mascota, Servicio servicio) {
    idTurnoIncremento++;
    this.id = idTurnoIncremento;
    this.fecha = fecha;
    this.hora = hora;
    this.estado = estado;
    this.mascota = mascota;
    this.servicio = servicio;
  }

  //seters
  public void setId(int id) {
    this.id = id;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  //getters
  public int getId() {
    return this.id;
  }

  public String getFecha() {
    return this.fecha;
  }

  public String getHora() {
    return this.hora;
  }

  public Estado getEstado() {
    return this.estado;
  }

  //metodos
  public String setToStringTurno() {
    return
        "\n id: " + this.id +
            "\n Fecha del turno: " + this.fecha +
            "\n Hora: " + this.hora +
            "\n Estado: " + this.estado +
            "\n Mascota: " + mascota +
            "\n Servicio: " + servicio;

  }

  public String mostrarDatos() {
    return "Turno : " + id + "\n"
        + "Fecha: " + fecha + " a las " + hora + "\n"
        + "Estado: " + estado + "\n"
        + "Mascota: " + mascota.getNombre() + " (" + mascota.getEspecie() + ")\n"
        + "Nombre del dueño/a: " + mascota.getNombDuenio() + "\n"
        + "Servicio: " + servicio.getTipoServicio() + " - " + servicio.getDescripcion() + "\n"
        + "Precio: $" + servicio.getPrecio();
  }

  public boolean esTurnoActivo() {
    return this.estado == Estado.PROGRAMADO;
  }
  public static void mostrarTurnosActivos(Turno[] arrayTurnos) {
    for (int i = 0; i < arrayTurnos.length; i++) {
      if (arrayTurnos[i] != null) {
        boolean esActivo = arrayTurnos[i].esTurnoActivo();
        log.info("Turno #" + (i + 1) + ": " + arrayTurnos[i].mostrarDatos()
            + " - ¿Es turno activo?: " + esActivo);
      }
    }
  }
  public static void contarTurnosPorEstado(Turno[] arrayTurnos) {
    int contadorProgramado = 0;
    int contadorCancelado = 0;
    int contadorRealizado = 0;

    for (int i = 0; i < arrayTurnos.length; i++) {
      if (arrayTurnos[i] != null) {
        Estado estado = arrayTurnos[i].getEstado();

        if (estado == Estado.PROGRAMADO) {
          contadorProgramado++;
        } else if (estado == Estado.CANCELADO) {
          contadorCancelado++;
        } else if (estado == Estado.REALIZADO) {
          contadorRealizado++;
        }
      }
    }

    Logger log = Logger.getLogger(Turno.class.getName());
    log.info("Cantidad de turnos PROGRAMADOS: " + contadorProgramado);
    log.info("Cantidad de turnos CANCELADOS: " + contadorCancelado);
    log.info("Cantidad de turnos REALIZADOS: " + contadorRealizado);
  }
}

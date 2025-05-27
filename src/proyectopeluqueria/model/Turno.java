package proyectopeluqueria.model;

public class Turno {
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

  public boolean esTurnoActivo(Turno[] arrayTurnos) {
    for (int i=0; i<arrayTurnos.length; i++){

    }
    return this.estado == Estado.PROGRAMADO;
  }

}

package proyectopeluqueria.model;

public class Turno {
  private int id;
  private String fecha;
  private String hora;
  private int estado;
  private static int idTurnoIncremento;

  Turno() {
    idTurnoIncremento++;
    this.id = idTurnoIncremento;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public int getId() {
    return this.id;
  }

  public String getFecha() {
    return this.fecha;
  }

  public String getHora() {
    return this.hora;
  }

  public int getEstado() {
    return this.estado;
  }

}

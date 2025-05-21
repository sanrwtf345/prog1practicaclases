package proyectopeluqueria.model;

public class Servicio {
  private int id;
  private String tipoServicio;
  private String descripcion;
  private int duracion;
  private double precio;
  private static int idServicioIncremento;

  Servicio() {
    idServicioIncremento++;
    this.id = idServicioIncremento;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTipoServicio(String tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getId() {
    return this.id;
  }

  public String getTipoServicio() {
    return this.tipoServicio;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public int getDuracion() {
    return this.duracion;
  }

  public double getPrecio() {
    return this.precio;
  }
}

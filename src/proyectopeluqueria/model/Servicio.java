package proyectopeluqueria.model;

public class Servicio {
  private int id;
  private TipoServicio tipoServicio;
  private String descripcion;
  private int duracion;
  private double precio;
  private static int idServicioIncremento;

  public Servicio(TipoServicio tipoServicio, String descripcion, int duracion, double precio) {
    this.tipoServicio = TipoServicio.BANIO;
    this.descripcion = descripcion;
    this.duracion = duracion;
    this.precio = precio;
    idServicioIncremento++;
    this.id = idServicioIncremento;

  }

  //seters
  public void setId(int id) {
    this.id = id;
  }

  public void setTipoServicio(TipoServicio tipoServicio) {
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

  //getters
  public int getId() {
    return this.id;
  }

  public TipoServicio getTipoServicio() {
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

  //metodos
  public String setToStringServicio() {
    return
        "\n id: " + this.id +
            "\n Tipo de servicio: " + this.tipoServicio +
            "\n Descripcion: " + this.descripcion +
            "\n Duracion: " + this.duracion +
            "\n Precio: " + this.precio;
  }

  public String mostrarDatos() {
    return "ID: " + id + "\n"
        + "Tipo de servicio: " + tipoServicio + "\n"
        + "Descripcion: " + descripcion + "\n"
        + "Duracion: " + duracion + "\n"
        + "Precio: " + precio;
  }

}

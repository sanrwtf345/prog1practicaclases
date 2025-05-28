package proyectopeluqueria.model;

import java.util.logging.Logger;

public class Servicio {
  public static final Logger log = Logger.getLogger(Servicio.class.getName());
  private int id;
  private TipoServicio tipoServicio;
  private String descripcion;
  private int duracion;
  private double precio;
  private static int idServicioIncremento;

  public Servicio(TipoServicio tipoServicio, String descripcion, int duracion, double precio) {
    this.tipoServicio = tipoServicio;
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

  public String mostrarServicio() {
    return "ID: " + id + "\n"
        + "Tipo de servicio: " + tipoServicio + "\n"
        + "Descripcion: " + descripcion + "\n"
        + "Duracion: " + duracion + "\n"
        + "Precio: " + precio;
  }
  //metodo para calcular iva
  public static void calcularIVA(Servicio[] arrayServicios) {
    for (Servicio arrayServicio : arrayServicios) {
      double totalFinalConIva = arrayServicio.getPrecio() * 1.21;
      log.info(arrayServicio.mostrarServicio() + "\nEl precio final con IVA es de: " + totalFinalConIva + "\n");

    }
  }
  //boolean para determinar si el servicio es largo
  public boolean esServicioLargo() {
    return this.duracion > 60;
  }
  //mostrar turnos activos con boolean
  public static void mostrarServiciosLargos(Servicio[] arrayServicios) {
    for (int i = 0; i < arrayServicios.length; i++) {
      if (arrayServicios[i] != null) {
        boolean esLargo = arrayServicios[i].esServicioLargo();
        log.info("Servicio #" + (i + 1) + ": " + arrayServicios[i].mostrarServicio()
            + " - ¿Es servicio largo?: " + esLargo);
      }
    }
  }
}
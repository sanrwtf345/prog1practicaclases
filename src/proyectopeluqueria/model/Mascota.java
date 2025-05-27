package proyectopeluqueria.model;

import java.util.logging.Logger;

public class Mascota {
  public static final Logger log = Logger.getLogger(Mascota.class.getName());

  private int id;
  private String nombre;
  private Especie especie;
  private String raza;
  private int edad;
  private String nombDuenio;
  private static int idMascotasIncremento;

  public Mascota(String nombre, String raza, Especie especie, int edad, String nombDuenio) {
    idMascotasIncremento++;
    this.id = idMascotasIncremento;
    this.nombre = nombre;
    this.raza = raza;
    this.especie = especie;
    this.edad = edad;
    this.nombDuenio = nombDuenio;

  }

  //seters
  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombDuenio(String nombDuenio) {
    this.nombDuenio = nombDuenio;
  }

  //getters
  public int getId() {
    return this.id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public Especie getEspecie() {
    return this.especie;
  }

  public String getRaza() {
    return this.raza;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombDuenio() {
    return this.nombDuenio;
  }

  //metodos
  public String setToStringMascota() {
    return "\n id: " + this.id +
        "\n Nombre: " + this.nombre +
        "\n Especie: " + this.especie +
        "\n Raza: " + this.raza +
        "\n Edad: " + this.edad +
        "\n Nombre del dueño/a: " + this.nombDuenio;

  }

  public String mostrarMascota() {
    return "ID: " + id + "\n"
        + "Nombre: " + nombre + "\n"
        + "Especie: " + especie + "\n"
        + "Edad: " + edad + "\n"
        + "Raza: " + raza + "\n"
        + "Nombre del dueño: " + nombDuenio;
  }

  public static void contarMascotaPorEspecie(Mascota[] arrayMascota) {
    int contadorPerros = 0;
    int contadorGatos = 0;

    for (int i = 0; i < arrayMascota.length; i++) {
      if (arrayMascota[i] != null) {
        if (arrayMascota[i].getEspecie().equals(Especie.PERRO)) {
          contadorPerros++;
        } else if (arrayMascota[i].getEspecie().equals(Especie.GATO)) {
          contadorGatos++;
        }
      }
    }

    log.info("Hay " + contadorPerros + " perros");
    log.info("Hay " + contadorGatos + " gatos");
  }

}

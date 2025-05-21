package proyectopeluqueria.model;

public class Mascota {
  private int id;
  private String nombre;
  private String especie;
  private String raza;
  private int edad;
  private String nombDueño;
  private static int idMascotasIncremento;

  Mascota() {
    idMascotasIncremento++;
    this.id = idMascotasIncremento;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  //cambiar por enum
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombDueño(String nombDueño) {
    this.nombDueño = nombDueño;
  }

  public int getId() {
    return this.id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getEspecie() {
    return this.especie;
  }

  public String getRaza() {
    return this.raza;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombDueño() {
    return this.nombDueño;
  }


}

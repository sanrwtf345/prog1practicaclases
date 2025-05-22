package proyectopeluqueria;

import proyectopeluqueria.model.*;

public class PeluqueriaCaninaApp {

  public static void main(String[] args) {
    //crear mascotas
    Mascota mascota1 = new Mascota("Tom", "Dalmata", Especie.PERRO, 18, "Santiago Romero");
    Mascota mascota2 = new Mascota("Olivia", "Calle con vereda", Especie.PERRO, 5, "Trinidad Romero");
    Mascota mascota3 = new Mascota("Timy", "Naranjoso", Especie.GATO, 6, "Carina Castañeda");

    //crear servicios
    Servicio servicio1 = new Servicio(TipoServicio.BANIO, "Baño normal", 30, 8000);
    Servicio servicio2 = new Servicio(TipoServicio.CORTEPELO, "Corte de pelo y cepillado", 40, 10000);
    Servicio servicio3 = new Servicio(TipoServicio.LIMPIEZAOIDOS, "Limpieza de oidos normal", 20, 5000);

    //crear turno
    Turno turno1 = new Turno("22/5/25", "16:00", Estado.REALIZADO, mascota1, servicio1);
    Turno turno2 = new Turno("23/05/25", "16:00", Estado.PROGRAMADO, mascota2, servicio2);
    Turno turno3 = new Turno("23/05/25", "16:45", Estado.PROGRAMADO, mascota3, servicio3);

    //mostrar datos
    System.out.println(turno1.mostrarDatos());
    System.out.println(turno2.mostrarDatos());
    System.out.println(turno3.mostrarDatos());


  }
}
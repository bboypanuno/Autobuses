package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linea {
  private int numLinea;

  private ArrayList<Asignacion> asignaciones;
  private ArrayList<ConductorVeterano> conductorVeteranos;
  private ArrayList<Autobus> bus;

  public Linea(int numLinea) {
    this.numLinea = numLinea;
  }
}

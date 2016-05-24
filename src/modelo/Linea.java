package modelo;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linea {
  private int numLinea;

  private ArrayList<Asignacion> asignaciones;
  private ArrayList<ConductorVeterano> conductorVeteranos;
  private ArrayList<Autobus> bus;
  private ArrayList<ParadaEnLinea> paradas;

  public Linea(int numLinea) throws Exception {
    if (numLinea < 0) {
      throw new Exception();
    }
    this.numLinea = numLinea;

    asignaciones = new ArrayList<>();
    conductorVeteranos = new ArrayList<>();
    bus = new ArrayList<>();
    paradas = new ArrayList<>();
  }

  public void addAutobus(Autobus bus) throws Exception {
    if (bus == null) {
      throw new Exception();
    }
    this.bus.add(bus);
  }
}

package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Veterano extends Conductor {
  private ArrayList<Linea> lineas;

  public Veterano(String dni, String nombre) {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }
}

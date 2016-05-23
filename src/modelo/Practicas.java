package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Practicas extends Conductor {

  private ArrayList<Linea> lineas;

  public Practicas(String dni, String nombre) {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }


}

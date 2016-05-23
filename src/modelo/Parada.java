package modelo;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.ArrayList;

public class Parada {
  private String nomParada;


  private ArrayList<ParadaEnLinea> paradaslinea;

  public Parada(String nomParada) {
    this.nomParada = nomParada;

    paradaslinea = new ArrayList<>();
  }

  public void addParadas(ParadaEnLinea posParada) throws Exception {
    if (posParada == null) {
      throw new Exception();
    }
    paradaslinea.add(posParada);
  }
}

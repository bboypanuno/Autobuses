package modelo;

import java.util.ArrayList;

/**
 * Creado por Andrés
 */

public class Bus {
  private String  matricula;
  private int plazas;

  private Linea linea;
  private ArrayList<BusTurno> busTurnos;

  public Bus(String matricula, int plazas, Linea linea) {
    this.matricula = matricula;
    this.plazas = plazas;
    this.linea = linea;

    busTurnos = new ArrayList<>();
  }

}

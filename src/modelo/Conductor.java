package modelo;

import java.util.ArrayList;

public class Conductor {
  private String dni;
  private String nombre;

  private ArrayList<Turno> turno;

  public Conductor(String dni, String nombre) throws Exception {
    if (dni == null || nombre == null) {

    }
    this.dni = dni;
    this.nombre = nombre;

    turno = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void addTurno(Turno turno1) throws Exception {
    if (turno == null) {
      throw new Exception();
    }

    turno.add(turno1);
  }

  public String toString() {
    return "Nombre: " + this.nombre + ", DNI: " + this.dni;
  }

}

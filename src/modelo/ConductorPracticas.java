package modelo;

import java.util.ArrayList;

public class ConductorPracticas extends Conductor {

  private ArrayList<Asignacion> lineas;

  public ConductorPracticas(String dni, String nombre) throws Exception {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }

  public void addAsignacion(Asignacion linea) throws Exception {
    if (linea == null || lineas.size() >= 4) {
      throw new Exception();
    }

    lineas.add(linea);
  }
}

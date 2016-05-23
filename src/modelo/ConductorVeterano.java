package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorVeterano extends Conductor {
  private Linea nolinea;

  public ConductorVeterano(String dni, String nombre) throws Exception {
    super(dni, nombre);
  }

  public void setNolineas(Linea nolinea) throws Exception {
    if (nolinea == null) {
      throw new Exception();
    }
    this.nolinea = nolinea;
  }
}

package modelo;

import java.time.LocalDate;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Turno {

  private Conductor conductor;
  private LocalDate fecha;
  private TipoTurno tipoTurno;
  private Autobus autobus;

  public Turno(Conductor conductor, LocalDate fecha,
      TipoTurno tipoTurno, Autobus autobus) throws Exception {
    if (conductor == null || fecha  == null || autobus == null) {
      throw new Exception();
    }

    this.conductor = conductor;
    this.fecha = fecha;
    this.tipoTurno = tipoTurno;
    this.autobus = autobus;
  }
}

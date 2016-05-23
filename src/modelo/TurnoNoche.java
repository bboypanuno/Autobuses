package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class TurnoNoche extends Turno{

  private ArrayList<Incidencia> incidencias;

  public TurnoNoche(Conductor conductor, LocalDate fecha,
                    TipoTurno tipoTurno, Autobus autobus) throws Exception {
    super(conductor, fecha, tipoTurno, autobus);

    if(tipoTurno != TipoTurno.NOCHE) {// restricion uml
      throw new Exception();
    }
    incidencias = new ArrayList<>();

  }

  public void addIncidencias (Incidencia incidencia) throws Exception {
    if (incidencia == null) {
      throw new Exception();
    }

    incidencias.add(incidencia);
  }
}

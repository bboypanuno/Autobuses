package modelo;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Incidencia {
  private int codigo;
  private String nombre;
  private LocalDate fecha;

  private TurnoNoche turnoNoche;

  public Incidencia(int codigo, String nombre, LocalDate fecha, TurnoNoche turnoNoche) throws Exception {
    if(nombre == null || fecha == null || turnoNoche == null) {
      throw new Exception();
    }
    this.codigo = codigo;
    this.nombre = nombre;
    this.fecha = fecha;
    this.turnoNoche =turnoNoche;
  }
}

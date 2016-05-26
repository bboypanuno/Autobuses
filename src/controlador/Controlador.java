package controlador;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import modelo.Autobus;
import modelo.Conductor;
import modelo.Linea;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

public class Controlador {

  private HashMap<String, Conductor> conductores;
  private HashMap<Integer, Linea> lineas;
  private HashMap<String, Autobus> autobuses;

  public Controlador() {
    this.conductores = new HashMap<>();
    this.lineas = new HashMap<>();
    this.autobuses = new HashMap<>();
  }

  public HashMap<Integer, Linea> getLineas() {
    return lineas;
  }

  public void addConductor(String dni, String nombre) throws Exception {
    this.conductores.put(dni, new Conductor(dni, nombre));
  }

  public void addLinea(int numLinea) throws Exception {
    if (lineas.get(numLinea) != null) {
      throw new Exception();
    }

    this.lineas.put(numLinea, new Linea(numLinea));
  }

  public void addAutobus(String matricula, int plazas, int numLinea) throws Exception {
    Linea linea = this.lineas.get(numLinea);
    if (linea == null) {
      throw new Exception();
    }

    Autobus a = this.autobuses.get(matricula);

      if (a != null) {
        throw new Exception();
      }
      a = new Autobus(matricula, plazas, linea);
      autobuses.put(matricula, a);
      linea.addAutobus(a);

  }

}

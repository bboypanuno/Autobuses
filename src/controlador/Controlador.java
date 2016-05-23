package controlador;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

import modelo.Conductor;

public class Controlador {

  private HashMap<String, Conductor> conductores = new HashMap();


  public void addConductor(String dni, String nombre) throws Exception {
    this.conductores.put(dni, new Conductor(dni, nombre));
  }


}

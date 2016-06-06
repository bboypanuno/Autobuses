package controlador;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import modelo.Autobus;
import modelo.Conductor;
import modelo.Linea;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;
import java.io.File;
import java.io.PrintWriter;

public class Controlador {

  private HashMap<String, Conductor> conductores;
  private HashMap<Integer, Linea> lineas;
  private HashMap<String, Autobus> autobuses;
  private Connection conn = null;

  public Controlador() {
    this.conductores = new HashMap<>();
    this.lineas = new HashMap<>();
    this.autobuses = new HashMap<>();
  }

  public Integer[] listarLineas() {
    return lineas.keySet().toArray(new Integer[0]);
  }

  public  void guardarLinea() throws SQLException {

    conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/personas?useSSL=false&serverTimezone=CET", // para evitar warning conexion ssl
        "root",
        "");
    // Pas 2: creacion de la consulta
    String consultaSql =  "INSERT INTO linea VALUE('1')";
    Statement sentencia = conn.createStatement();

    sentencia.execute(consultaSql);
    System.out.println("Consulta ejecutada con exito");

    //rs.close();
    sentencia.close();
    conn.close();
  }
  public void addConductor(String dni, String nombre) throws Exception {
    this.conductores.put(dni, new Conductor(dni, nombre));
  }
  public void GuardarAutobus() throws SQLException {
     conn = DriverManager.getConnection(
         "jdbc:mysql://localhost/personas?useSSL=false&serverTimezone=CET", // para evitar warning conexion ssl
         "root",
         "");
     // Pas 2: creacion de la consulta
     String consultaSql =  "INSERT INTO autobus VALUES ('1234ABC', 55, 2)";
     Statement sentencia = conn.createStatement();

     sentencia.execute(consultaSql);
     System.out.println("Consulta ejecutada con exito");

     //rs.close();
     sentencia.close();
     conn.close();
   }

  public void addLinea(int numLinea) throws Exception {
    if (lineas.get(numLinea) != null) {
      throw new Exception();
    }
    this.lineas.put(numLinea, new Linea(numLinea));
    guardarLinea();
  }

  public void addAutobus(String matricula, int plazas, Integer numLinea) throws Exception {
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

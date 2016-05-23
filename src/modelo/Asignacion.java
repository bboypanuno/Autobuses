package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Asignacion {
  private float horas;

  private Practicas practicas;
  private Linea linea;

  public Asignacion(float horas, Practicas practicas, Linea linea) throws Exception {
    if (horas <= 100){
      throw new Exception();
    }

    this.horas = horas;
    this.practicas = practicas;
    this.linea = linea;
  }
}

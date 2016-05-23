package modelo;


public class Asignacion {
  private float horas;

  private ConductorPracticas conductorPracticas;
  private Linea linea;

  public Asignacion(float horas, ConductorPracticas conductorPracticas, Linea linea) throws Exception {
    if (horas <= 100 || conductorPracticas == null || linea == null){
      throw new Exception();
    }

    this.horas = horas;
    this.conductorPracticas = conductorPracticas;
    this.linea = linea;
  }
}

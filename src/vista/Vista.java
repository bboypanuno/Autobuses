package vista;

import controlador.Controlador;

import java.util.Scanner;


public class Vista {
  private Controlador controlador = new Controlador();
  private Scanner entrada;

  public Vista() {
    this.entrada = new Scanner(System.in);
  }

  public void pedirConductor() {
    boolean var1 = true;
      while(var1) {
        try {
          System.out.print("Introduce un nombre del Conductor: ");
          String var2 = this.entrada.nextLine();
          System.out.print("Introduce su DNI: ");
          String var3 = this.entrada.nextLine();
          this.controlador.addConductor(var2, var3);
          var1 = false;
          } catch (Exception var5) {
             System.err.println("Los parametros no son correctos\n");
          }
      }
  }

  public void pedirLinea() {
    boolean var1 = true;
    while(var1) {
      try {
        System.out.print("Introduce el numero de linea: ");
        int var2 = Integer.parseInt(entrada.nextLine());
        var1 = false;
      } catch (Exception var5) {
        System.err.println("Los parametros no son correctos\n");
      }
    }
  }

  public void Menu(){
    while(true) {
      try {
        System.out.println();
        System.out.println("1. Dar de alta lineas");
        System.out.println("2. Dar de alta Conductores");
        System.out.println("3. Salir");     //Falta hacer k pida los condutores en el case
        System.out.println();
        System.out.print("Introduce una opcion: ");
        int var1 = Integer.parseInt(this.entrada.nextLine());
        switch(var1) {
          case 1:
            this.pedirLinea();
            break;
          case 2:
          return;
            default:
              System.err.println("Opcion no valida\n");
            }
      } catch (Exception var2) {
          System.err.println("Introduce un numero\n");
      }
    }
  }

  public static void main(String[] args) {
    Vista vis = new Vista();
    vis.Menu();
  }
}

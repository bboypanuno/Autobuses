package vista;

import com.sun.org.apache.xpath.internal.SourceTree;
import static  javax.swing.JOptionPane.showMessageDialog;

import controlador.Controlador;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * 24/05/2016
 * Swing la forma mas java (javaFX, swingX --> para mas pro)
 * Todo viene por herencia
 */


public class VistaGrafica extends JFrame implements ActionListener { //
  private Controlador controlador;
  private JTextField texto;
  private Scanner entrada;

  public VistaGrafica() {
    super("Autobuses");  // se le puede pasar un string o ningun parametro
    controlador = new Controlador();
    this.entrada = new Scanner(System.in);
    setSize(500, 600);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se cierra la app cada vez k le demos a cerrar
/**
 * // creamos el layout
 *  GridLayout g = new GridLayout(2, 1);
 *   setLayout(g);
 *
 *   // Añadimos texto
 *   JTextField texto = new JTextField();
 *   add(texto);
 *
 *   // Añadimos el boton
 *   JButton boton = new JButton("Haz click");
 *   boton.setSize(100, 100);
 *   add(boton);             // No sale todo xk hace falta un layout
 */
    // forma compacta
    setLayout(new GridLayout(2, 1));
    texto = new JTextField();
    add(texto);

    //add(new JButton("Haz click"));

    JButton boton = new JButton("Haz click");
    boton.setSize(100, 100);
    add(boton);
    boton.addActionListener(this);
    // en un metodo estatico nunca se puede referenciar a un this porque hace referencia a los atributos

    setVisible(true); //  se crea una ventana
  }

  public static void main(String[] args) {
    VistaGrafica marco = new VistaGrafica();
    // marco.Vista.Menu();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      controlador.addLinea(Integer.parseInt(texto.getText()));
      showMessageDialog(this, "Guardado"); // this ligado a la ventana, null ligado a la pantalla
    } catch (Exception error) {
      //System.out.println("error");
      showMessageDialog(this, "Error al introducir datos");
    }
    //System.out.println(Integer.parseInt(texto.getText());  // imprimos el texto clickando al boton

  }
}

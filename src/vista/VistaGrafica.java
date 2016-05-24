package vista;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 24/05/2016
 * Swing la forma mas java (javaFX, swingX --> para mas pro)
 * Todo viene por herencia
 */


public class VistaGrafica extends JFrame implements ActionListener { //
  private JTextField texto;

  public VistaGrafica() {
    super("Autobuses");  // se le puede pasar un string o ningun parametro
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

    setVisible(true); //  se crea una ventana
  }

  public static void main(String[] args) {
    VistaGrafica marco = new VistaGrafica();
    Vista vis = new Vista();
    vis.Menu();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(texto.getText());  // imprimos el texto clickando al boton
  }
}

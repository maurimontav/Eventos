/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo18;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ejemplo18 {

   private JFrame frame;

   // primero se ejecuta ésto…

   public static void main(String[] args) {

      // en un hilo de ejecución aparte hace todo

      // porque todo lo hace en un new Runnable

      // a continuación…

      EventQueue.invokeLater(new Runnable() {

         // run es el método que se ejecuta

         // al arrancar el hilo

         public void run() {

            try {

               // crea una variable de la clase y se inicializa

               // con el constructor de la misma              

               Ejemplo18 window = new Ejemplo18();

               // muestra la ventana

               window.frame.setVisible(true);

            } catch (Exception e) {

               e.printStackTrace();

            }

         }

      });

   }

   // éste es el constructor de la clase

   public Ejemplo18() {

      initialize();

   }

   // la función que inicializa

   private void initialize() {

      // crea el frame

      frame = new JFrame();

      // coordenadas de la ventana

      frame.setBounds(100, 100, 450, 300);

      // establece la operación a ejecutar cuando

      // se cierra el JFrame

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

}


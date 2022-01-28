/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo21;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Ejemplo21 extends JInternalFrame {

   // arranca en un hilo el formulario hijo

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {

         public void run() {

            try {

               JInternalFrame frame = new JInternalFrame();

               frame.setVisible(true);

            } catch (Exception e) {

               e.printStackTrace();

            }

         }

      });

   }

   // aquí estará construida la ventana

   public Ejemplo21() {

      setBounds(100, 100, 450, 300);

   }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo20;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

// la clase extiende de JFrame, realmente ES un JFrame

public class Ejemplo20 extends JFrame {

   private JPanel contentPane;

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {

         public void run() {

            try {

               Ejemplo20 frame = new Ejemplo20();

               frame.setVisible(true);

            } catch (Exception e) {

               e.printStackTrace();

            }

         }

      });

   }

   public Ejemplo20() {

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setBounds(100, 100, 450, 300);

       // añade el panel…

      contentPane = new JPanel();

      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      contentPane.setLayout(new BorderLayout(0, 0));

      setContentPane(contentPane);

   }

}

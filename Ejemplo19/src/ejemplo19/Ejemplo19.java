/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo19;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;

import javax.swing.JDialog;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

// la clase que extiende de JDialog,

// que a su vez extiende de Dialog,

// y ésta de Window…

public class Ejemplo19 extends JDialog {

   private final JPanel contentPanel = new JPanel();

   public static void main(String[] args) {

      try {

         // crea un nuevo objeto de la clase

         Ejemplo19 dialog = new Ejemplo19();

         // operacion al cerrar

         dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

         // lo muestra

         dialog.setVisible(true);

      } catch (Exception e) {

         e.printStackTrace();

      }

   }

   // constructor de la clase

   public Ejemplo19() {

      // propiedades de la ventana

      setBounds(100, 100, 450, 300);

      getContentPane().setLayout(new BorderLayout());

      contentPanel.setLayout(new FlowLayout());

      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

      getContentPane().add(contentPanel, BorderLayout.CENTER);

      

      // los botones para confirmar o cancelar

      {

         JPanel buttonPane = new JPanel();

         buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));

         getContentPane().add(buttonPane, BorderLayout.SOUTH);

         {

            JButton okButton = new JButton("OK");

            okButton.setActionCommand("OK");

            buttonPane.add(okButton);

            getRootPane().setDefaultButton(okButton);

         }

         {

            JButton cancelButton = new JButton("Cancel");

            cancelButton.setActionCommand("Cancel");

            buttonPane.add(cancelButton);

         }

      }

   }

}


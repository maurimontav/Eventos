/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo17;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.*;

public class Ejemplo17 extends JFrame implements ItemListener{

    private JComboBox combo1;
    private JLabel label1;

    public Ejemplo17() {

        setLayout(null);

        //Añado el ComboBox con sus items y su ItemListener, así como la etiqueta

        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItemListener(this);

        label1 = new JLabel("Color seleccionado: ninguno");
        label1.setBounds(10,80,200,30);
        add(label1);

    }

    //Implemento el método itemStateChanged

    public void itemStateChanged(ChangeEvent e){

        String texto = "Color seleccionado: ";

        if (e.getSource() == combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            texto += seleccionado;
            label1.setText(texto);
        }

    }

    public static void main(String[] ar) {

        Ejemplo17 formularioCombobox = new Ejemplo17();
        formularioCombobox.setDefaultCloseOperation(EXIT_ON_CLOSE);
        formularioCombobox.setBounds(0,0,300,200);
        formularioCombobox.setVisible(true);

    }   

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
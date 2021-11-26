/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo16;

import javax.swing.*;
import javax.swing.event.*;

public class Ejemplo16 extends JFrame implements ChangeListener{

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoBotones;

    public Ejemplo16() {
       
        setLayout(null);

        //Creo un nuevo grupo de botones

        grupoBotones = new ButtonGroup();

        //Añado los 3 radioButton con su ChangeListener

        radio1=new JRadioButton("640*480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupoBotones.add(radio1);
        radio2=new JRadioButton("800*600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupoBotones.add(radio2);
        radio3=new JRadioButton("1024*768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupoBotones.add(radio3);

    }

    //Implemento el método stateChanged

    public void stateChanged(ChangeEvent e){

        if (radio1.isSelected()) {
            setSize(640,480);
        }

        if (radio2.isSelected()) {
            setSize(800,600);
        }

        if (radio3.isSelected()) {
            setSize(1024,768);
        }   

    }

    public static void main(String[] ar) {

        Ejemplo16 formularioRadio =new Ejemplo16();
        formularioRadio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        formularioRadio.setBounds(0,0,350,230);
        formularioRadio.setVisible(true)

    }   

}
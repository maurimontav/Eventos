/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author pc
 */

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Principal extends JFrame implements ActionListener {
    
    private JButton boton1;
    private JLabel label1,label2;
    private static JSpinner spinner;
    private static int valor;
    
    public Principal() {

        setLayout(null);
        setBounds(10,10,410,210);
        setTitle("Ejercicio 2");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        SpinnerModel value =  new SpinnerNumberModel(0,0,5,1);  
        spinner = new JSpinner(value);   
        spinner.setBounds(180,60,40,30);    
        add(spinner);    
                       
        label1 = new JLabel("Elige un número del 1 al 5");
        label1.setBounds(125,20,200,30);
        add(label1);
        
        label2 = new JLabel();
        label2.setBounds(125,70,200,30);
        add(label2);
        
        spinner.addChangeListener(new ChangeListener() {  
            public void stateChanged(ChangeEvent e) {  
                valor = (Integer)((JSpinner)e.getSource()).getValue();
            }  
        });
         
        boton1 = new JButton("Jugar");
        boton1.setBounds(100,110,200,40);
        add(boton1);
      
        boton1.addActionListener(this);
       
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
                
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
            
            if (valor==0) {
                System.out.println("Debes elegir un número diferente de 0");
            } else {
                
                Resultado secundaria = new Resultado(this,true);
                secundaria.setVisible(true);
                
            }
  
        }

    }
 
    public static void main(String[] args) {

        new Principal();
           
    }
 
    public int getValor() {
        return valor;
    }
        
}
     
    

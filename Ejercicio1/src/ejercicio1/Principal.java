/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author pc
 */

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

/* Nuevo JFrame que implementa el interface ActionListener */
public class Principal extends JFrame implements ActionListener{

    /* Declaro variables */

    static private JButton boton1,boton2;
    private JLabel label1,label2,label3;
    

    /* Constructor */

    public Principal() {

        //Layout absoluto

        setLayout(null);

        //Tamaño de la ventana

        setBounds(10,10,1024,800);

        //Título

        setTitle("Ejercicio 1");

        //No redimensionable

        setResizable(false);

        //Cerrar proceso al cerrar la ventana

        setDefaultCloseOperation(HIDE_ON_CLOSE);

        //Etiqueta

        label1 = new JLabel("Ana");
        label1.setBounds(100,50,200,30);
        add(label1);
        label2 = new JLabel("Carlos");
        label2.setBounds(100,75,200,30);
        add(label2);
        label3 = new JLabel("Felisa");
        label3.setBounds(100,100,200,30);
        add(label3);
        
        
        //Botón

        boton1 = new JButton("carne");
        boton1.setBounds(105,150,200,40);
        add(boton1);
        boton2 = new JButton("pescado");
        boton2.setBounds(325,150,200,40);
        add(boton2);

        /* Inicializo escuchador del botón */

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        //Muestro JFrame (lo último para que lo pinte todo correctamanete)

        setVisible(true);
        setResizable(false);

    }

    /* Método que implementa la acción del botón */

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
                
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
         
            Carne secundaria = new Carne(this,true);
            secundaria.setVisible(true);
            
        } else if (e.getSource() == boton2) {
            
            Pescado terciaria = new Pescado(this,true);
            terciaria.setVisible(true);
            
        }
    }

    /* Incializo el formulario */
    
    public static void main(String[] args) {

        new Principal();
        
        
    }
    
    public String getTextoBoton1() {
        return boton1.getText();
    }
    
    public String getTextoBoton2() {
        return boton2.getText();
    }
    
}
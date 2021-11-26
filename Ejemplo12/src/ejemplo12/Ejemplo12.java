/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo12;

import javax.swing.*;

public class Ejemplo12 extends JFrame{

    /* Definimos variables. */

    private JTextField textfield1;
    private JTextArea textarea1;

    public Ejemplo12() {

        /* Configuración del JFrame */

        setLayout(null);
        setBounds(0,0,540,400);
        setTitle("Ejemplo 7: JTextArea");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Campo de email */

        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        /* Cuerpo de mensaje */

        textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);

        /* Muestro el JFrame */

        setVisible(true);

    }

    public static void main(String[] args) {

        new Ejemplo12();

    }

}


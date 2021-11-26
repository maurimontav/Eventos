/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo13;

import javax.swing.*;

public class Ejemplo13 extends JFrame{

    /* Definimos variables. */

    private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;

    public Ejemplo13() {

        /* Configuración del JFrame */

        setLayout(null);
        setBounds(0,0,540,400);
        setTitle("Ejemplo 7: JTextArea con JScrollPane");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Campo de email */

        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        /* Cuerpo de mensaje en scrollPane*/

        textarea1=new JTextArea();
        textarea1.setLineWrap(true); //Para que salte de línea al llegar al final del ancho del jTextArea
        scrollpane1=new JScrollPane(textarea1);
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);

        /* Muestro el JFrame */

        setVisible(true);

    }

    public static void main(String[] args) {

        new Ejemplo13();

    }

}
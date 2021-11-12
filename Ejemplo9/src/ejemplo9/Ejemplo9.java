/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo9;

/**
 *
 * @author pc
 */

import java.awt.*;
import static java.awt.Font.PLAIN;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ejemplo9 extends JFrame{

    JButton boton[], botonResultado; //array de botones y botón de resultado
    JLabel display; //display de operaciones
    JPanel panelBotones; //panel para los botones (salvo el de resultado)
    int ancho = 50, alto = 50; //para posicionar botones
    FlowLayout miFlowLayout;
    GridLayout miGridLayout;

    public Ejemplo9(){

        initDisplay();
        initBotones();
        initBotonResultado();
        initPantalla();
    }

    private void initDisplay(){

        display = new JLabel("0");
        display.setPreferredSize(new Dimension(230,60));
        display.setOpaque(true);
        display.setBackground(Color.black);
        display.setForeground(Color.green);
        display.setBorder(new LineBorder(Color.DARK_GRAY));
        display.setFont(new Font("MONOSPACED",PLAIN,24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display);
        
    }

    private void initBotones(){

        //Inicializo panel de botones y su gridlayout de 4 columnas y 4 filas

        panelBotones = new JPanel();
        panelBotones.setBackground(Color.black);
        miGridLayout = new GridLayout(4,4,10,10);
        panelBotones.setLayout(miGridLayout);
        add(panelBotones);
        
        //Array de textos de los botones

        String[] texto_boton = new String[]{"0",".","C","+","1","2","3","-","4","5","6","*","7","8","9","/"};

        //Inicializo array de botones

        boton = new JButton[16];

        for (int i=0; i<=15; i++){

            //Inicializo botón con su texto

            boton[i] = new JButton(texto_boton[i]);
            boton[i].setPreferredSize(new Dimension(ancho,alto));
            boton[i].setFont(new Font("MONOSPACED",PLAIN,16));
            boton[i].setOpaque(true);
            boton[i].setFocusPainted(false);
            boton[i].setBackground(Color.DARK_GRAY);
            boton[i].setBorder(new LineBorder(Color.DARK_GRAY));
            boton[i].setForeground(Color.WHITE);
            
            //añado botón al panel de botones

            panelBotones.add(boton[i]);

        }

    }

    private void initBotonResultado(){

        botonResultado = new JButton("RESULTADO");
        botonResultado.setPreferredSize(new Dimension(230,alto));
        botonResultado.setFont(new Font("MONOSPACED",PLAIN,16));
        botonResultado.setOpaque(true);
        botonResultado.setFocusPainted(false);
        botonResultado.setBackground(Color.DARK_GRAY);
        botonResultado.setBorder(new LineBorder(Color.DARK_GRAY));
        botonResultado.setForeground(Color.WHITE);
        add(botonResultado);
        
    }

    private void initPantalla(){
        
        miFlowLayout = new FlowLayout(FlowLayout.CENTER,10,10);
        setLayout(miFlowLayout);
        setTitle("Ejercicio 1");
        setMinimumSize(new Dimension(255,405));
        setResizable(false);
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main( String args[] ) {

        new Ejemplo9();

    }

}



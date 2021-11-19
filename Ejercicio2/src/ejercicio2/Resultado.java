/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author pc
 */

/* Importo las clases necesarias */

import ejercicio2.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/* Nuevo JDialog que implementa el interface ActionListener */

public class Resultado extends JDialog implements ActionListener{

    /* Declaro variables */

    private JButton boton2;
    private static JLabel label1,label2,label3;
    

    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */

    public Resultado(Principal parent, boolean modal) {

        /* Invoco al constructor de la clase superior */

        super(parent, modal);

        /* Layout absoluto y límites*/

        setLayout(null);
        setBounds(440,10,410,210);

        //Etiqueta
        
        
        
        label1 = new JLabel();
        label1.setBounds(135,25,200,30);
        add(label1);
        label2 = new JLabel();
        label2.setBounds(120,45,200,30);
        add(label2);
        label3 = new JLabel();
        label3.setBounds(160,65,200,30);
        add(label3);
        
        Principal principal = new Principal();
        
        int pares = principal.getValor();
        int nones = (int)(Math.random()*5+1);
        
        label1.setText("Tú elegiste el número: " + pares);
        label2.setText("La máquina eligió el número: " + nones);
        
        mostrarGanador(pares,nones);
        
        //Botón

        boton2 = new JButton("Volver");
        boton2.setBounds(105,110,200,40);
        add(boton2);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        /* Inicializo escuchador del botón */

        boton2.addActionListener(this);

    }

    /* Método que implementa la acción del botón */

    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton2) {
                //Cierro la pantalla
                setVisible(false);
            }
        } 
 
    
    private static void mostrarGanador(int pares, int nones) {
                
        if ((pares+nones)%2==0) {
            label3.setText("Ha ganado: pares");
        } else {
            label3.setText("Ha ganado: nones");
        }
            
    }

}
    


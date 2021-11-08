/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author pc
 */

/* Importo las clases necesarias */

import ejercicio1.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/* Nuevo JDialog que implementa el interface ActionListener */

public class Pescado extends JDialog implements ActionListener{

    /* Declaro variables */

    private JButton boton2;
    private JLabel label1;

    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */

    public Pescado(Principal parent, boolean modal) {

        /* Invoco al constructor de la clase superior */

        super(parent, modal);

        /* Layout absoluto y límites*/

        setLayout(null);
        setBounds(440,10,410,210);

        //Etiqueta
        
        Principal principal = new Principal();
        String texto = principal.getTextoBoton2();
        
        label1 = new JLabel("Has pulsado el botón '" + texto + "'" );
        label1.setBounds(115,60,200,30);
        add(label1);

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

}

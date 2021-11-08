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
    private JLabel label1;
    

    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */

    public Resultado(Principal parent, boolean modal) {

        /* Invoco al constructor de la clase superior */

        super(parent, modal);

        /* Layout absoluto y límites*/

        setLayout(null);
        setBounds(440,10,410,210);

        //Etiqueta
        
        
        
        label1 = new JLabel();
        label1.setBounds(150,50,200,30);
        add(label1);
    
        
        
        String texto = obtenerTexto(); 
        
        label1.setText(texto);
                
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
 
    
    private String obtenerTexto() {
        
        String texto = null;
        
        Principal principal = new Principal();
        
        int pares = principal.getValor();
        int nones = (int)(Math.random()*5+1);
        
        if (pares>nones) {
            texto = "¡Enhorabuena, has ganado!";
        
        } else if (nones>pares) {
            texto = "Ha ganado nones";
        
        } else if (pares==nones) {
            texto = "Habéis empatado";
        }
        
        return texto;
            
    }

}
    


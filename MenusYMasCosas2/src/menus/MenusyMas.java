/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author politecnica
 */
public class MenusyMas extends javax.swing.JFrame {
    JFrame ventana;
    /**
     * Creates new form MenusyMas
     */
    public MenusyMas() {
        initComponents();
        ventana = this;
        
        // parte de personalizar
        // construyo los menus de look&feel
        
        ButtonGroup grupoLF = new ButtonGroup();
        for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            JRadioButtonMenuItem op = new JRadioButtonMenuItem(info.getName());
            if(info.getClassName().equals(UIManager.getSystemLookAndFeelClassName())){
                op.setSelected(true);
            }

            op.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        SwingUtilities.updateComponentTreeUI(ventana);
                        SwingUtilities.updateComponentTreeUI(jPopupMenu1);
                        ventana.pack();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MenusyMas.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(MenusyMas.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(MenusyMas.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(MenusyMas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            grupoLF.add(op);
            menuLF.add(op);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesTextoMenu = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        opcionesTextoPopup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        menuLF = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu5.setText("Tamaño texto...");

        opcionesTextoPopup.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Pequeño");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem4);

        opcionesTextoPopup.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Mediano");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem5);

        opcionesTextoPopup.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setText("Grande");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem6);

        jPopupMenu1.add(jMenu5);

        jMenuItem7.setText("Color");
        jPopupMenu1.add(jMenuItem7);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menús y más cosas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Archivo:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setMnemonic('A');
        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_send_ic_20a.gif"))); // NOI18N
        jMenuItem1.setMnemonic('N');
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_send_ic_20a.gif"))); // NOI18N
        jMenuItem2.setMnemonic('A');
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_clear_ic_20a.gif"))); // NOI18N
        jMenuItem3.setMnemonic('C');
        jMenuItem3.setText("Cerrar");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_edit_ic_20a.gif"))); // NOI18N
        jMenuItem8.setMnemonic('G');
        jMenuItem8.setText("Guardar");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_edit_ic_20a.gif"))); // NOI18N
        jMenuItem9.setMnemonic('G');
        jMenuItem9.setText("Guardar como...");
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_capture_ic_20a.gif"))); // NOI18N
        jMenuItem4.setMnemonic('I');
        jMenuItem4.setText("Importar");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_capture_ic_20a.gif"))); // NOI18N
        jMenuItem5.setMnemonic('E');
        jMenuItem5.setText("Exportar");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menus/fax_config_ic_20a.gif"))); // NOI18N
        jMenuItem6.setMnemonic('S');
        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('E');
        jMenu2.setText("Editar");

        jMenuItem12.setText("Copiar");
        jMenu2.add(jMenuItem12);

        jMenuItem10.setText("Cortar");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Pegar");
        jMenu2.add(jMenuItem11);
        jMenu2.add(jSeparator4);

        jMenu4.setText("Tamaño texto...");

        opcionesTextoMenu.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Pequeño");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem1);

        opcionesTextoMenu.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Mediano");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem2);

        opcionesTextoMenu.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Grande");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem3);

        jMenu2.add(jMenu4);

        jMenuItem13.setText("Color");
        jMenu2.add(jMenuItem13);
        jMenu2.add(jSeparator5);

        jMenuItem15.setText("Opciones");
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        menuLF.setText("Look&Feel");
        jMenuBar1.add(menuLF);

        jMenu3.setMnemonic('y');
        jMenu3.setText("<html><b>Ayuda");

        jMenuItem14.setText("Manual de usuario");
        jMenu3.add(jMenuItem14);

        jMenuItem16.setText("Acerca de...");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.out.println("Has pulsado la opción Nuevo.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16));
        jRadioButtonMenuItem5.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12));
        jRadioButtonMenuItem4.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 20));
        jRadioButtonMenuItem6.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed
        presentarMenúContextual(evt);
    }//GEN-LAST:event_jTextArea1MousePressed

    private void jTextArea1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseReleased
        presentarMenúContextual(evt);
    }//GEN-LAST:event_jTextArea1MouseReleased

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12));
        jRadioButtonMenuItem1.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16));
        jRadioButtonMenuItem2.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 20));
        jRadioButtonMenuItem3.setSelected(true);
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        JOptionPane.showMessageDialog(this, "Ejemplo de uso de menús.\n"
                + "\nRealizado por: Jesús Sánchez\n"
                + "UAX - 2013",
                "Acerca de menús...",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int opción = JOptionPane.showConfirmDialog(this,
                "<html>¿Está seguro de que desea<br>"
                + "<b>terminar</b> la aplicación?<br>"
                + "<ul><li>Cierro los archivos</li>"
                + "<li color=#CCFF00>Borro los datos</li>"
                + "<li>...otras cosas...",
                "Salir de la aplicación...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(opción == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        jMenuItem6ActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(new FileNameExtensionFilter("Archivo jpg", "jpg", "jpeg", "jpg2000"));
        jfc.setFileFilter(new FileNameExtensionFilter("Archivo de texto", "txt"));
        jfc.setFileFilter(new FileNameExtensionFilter("Imágenes usuales", "gif", "jpg", "png"));
        jfc.setAcceptAllFileFilterUsed(false);
        
        int opción = jfc.showOpenDialog(this);
        if(opción == JFileChooser.APPROVE_OPTION){
            File[] archivos = jfc.getSelectedFiles();
            System.out.println("Ha seleccionado:");
            for(File f:archivos){
                System.out.println(f.getAbsolutePath() + " " + f.length());
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            System.out.println(info);
        }
        
        
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenusyMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenusyMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenusyMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenusyMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenusyMas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menuLF;
    private javax.swing.ButtonGroup opcionesTextoMenu;
    private javax.swing.ButtonGroup opcionesTextoPopup;
    // End of variables declaration//GEN-END:variables

    private void presentarMenúContextual(MouseEvent evt) {
        if(evt.isPopupTrigger()){
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homologaciones;

import com.sun.awt.AWTUtilities;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOHN EDWAR
 */
public class Registrar_equivalencias_interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_equivalencias_interfaz
     */
    int x,y;
    conexionBD conexion = new conexionBD();

    public Registrar_equivalencias_interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        
       
         String sql1 = "Select codigoAsignatura From Asignaturas";
        ArrayList<String[]> datos = conexion.consulta(sql1);
        
         jComboBox1.removeAllItems();

        for(int i=0; i<datos.size(); i++){           
            System.out.println("fila: " + datos.get(i).toString());
            
            String [] auxiliar =datos.get(i); // me trae el primer arreglo del arraylist en esta variable auxiliar
            
            for (int j = 0; j < auxiliar.length; j++) {
                
                String dato = auxiliar[j];
                
                jComboBox1.addItem(dato);
            }
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

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLTexto_superior = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLCerrar = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUnivalle.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton1.setText("Programas");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, 60));

        jLTexto_superior.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLTexto_superior.setForeground(new java.awt.Color(255, 0, 0));
        jLTexto_superior.setText("UNIVERSIDAD DEL VALLE");
        jLTexto_superior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLTexto_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLTexto_superiorMouseDragged(evt);
            }
        });
        jLTexto_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLTexto_superiorMousePressed(evt);
            }
        });
        getContentPane().add(jLTexto_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 40, 60));

        jButton2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton2.setText("Facultades");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 40, 60));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton3.setText("Asignaturas");
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 110, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 40, 60));

        jButton6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        jButton5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton5.setText("Equivalencias");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recuadro_base.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 40, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLTexto_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTexto_superiorMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLTexto_superiorMouseDragged

    private void jLTexto_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTexto_superiorMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLTexto_superiorMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setFont(new Font("Arial",Font.PLAIN,30));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        // TODO add your handling code here:
       int opcion = JOptionPane.showConfirmDialog(null,"¿Desea salir del programa?");
       if(opcion ==JOptionPane.YES_OPTION) {
        System.exit(0);
       }
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Asignaturas_interfaz asignaturas ;

        asignaturas = new Asignaturas_interfaz();
        this.dispose();
        asignaturas.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar_equivalencias_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_equivalencias_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_equivalencias_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_equivalencias_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //hace parte de lo del marco de la interfaz
                    
                } catch (Exception ex) {
                    System.out.println("Error de recuadro interfaz");
                } 
                new Registrar_equivalencias_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLTexto_superior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}

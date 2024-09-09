/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.TreeMap;
import javax.swing.ImageIcon;

/**
 *
 * @author salon
 */
public class vistaMenuPrincipal extends javax.swing.JFrame {
    protected static TreeMap<Long,Producto> mapaProductos;
    /**
     * Creates new form vistaMenuPrincipal
     */
    public vistaMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        mapaProductos = new TreeMap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon( getClass().getResource( "/imagenes/fondo1.jpg"));
        Image miImagen =icono.getImage();
        jdPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(miImagen, 0,0,getWidth(), getHeight(),this);
            }
        };
        jmbMain = new javax.swing.JMenuBar();
        jmAdmin = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmiPrecio = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado DeTodo S.A");
        setFocusableWindowState(false);

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        jmbMain.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmbMain.setOpaque(true);

        jmAdmin.setText("Administracion");
        jmAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAdminMouseClicked(evt);
            }
        });
        jmbMain.add(jmAdmin);

        jmConsultas.setText("  Consultas");
        jmConsultas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jmiPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiPrecio.setText("Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPrecio);

        jmiNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiNombre.setText("Nombre");
        jmConsultas.add(jmiNombre);

        jmiRubro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiRubro.setText("Rubro");
        jmConsultas.add(jmiRubro);

        jmbMain.add(jmConsultas);

        setJMenuBar(jmbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiPrecioActionPerformed

    private void jmAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAdminMouseClicked
        // TODO add your handling code here:
        jdPrincipal.removeAll();
        jdPrincipal.repaint();
        VistasAdministracion vaInterno = new VistasAdministracion();
        vaInterno.setVisible(true);
        jdPrincipal.add(vaInterno);
        jdPrincipal.moveToFront(vaInterno);   
    }//GEN-LAST:event_jmAdminMouseClicked

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
            java.util.logging.Logger.getLogger(vistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenu jmAdmin;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
    
}

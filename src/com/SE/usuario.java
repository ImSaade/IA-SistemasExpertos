/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.SE;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author saaen
 */
public class usuario extends javax.swing.JFrame {

    /**
     * Creates new form experto
     */
    public usuario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        String mensaje = "Bienvenido a el menú para el usuario";
        mensaje += "\nPor favor, selecciona una opción \nen el menú para comenzar.";
        jTextArea1.setText(mensaje);
        jTextArea1.setEditable(false);
        establecerIconoEnBoton(btnAtras, "src/com/images/anterior.png", 40, 40);
        establecerIconoEnBoton(btnAdelante, "src/com/images/siguiente.png", 40, 40);
        establecerIconoEnBoton(btnExplicacion, "src/com/images/explicacion.png", 40, 40);
        establecerIconoEnBoton(btnSalir, "src/com/images/salir.png", 40, 40);
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        btnExplicacion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("\"MENÚ USUARIO\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(650, 650, 650))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 270));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cerrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
        });

        btnAdelante.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/caracteristica.png"))); // NOI18N
        btnAdelante.setText("BUSQUEDA HACIA DELANTE");
        btnAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdelanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdelanteMouseEntered(evt);
            }
        });

        btnExplicacion.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        btnExplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cuadro.png"))); // NOI18N
        btnExplicacion.setText("MODULO DE EXPLICACION");
        btnExplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExplicacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExplicacionMouseEntered(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/pez.png"))); // NOI18N
        btnAtras.setText("BUSQUEDA HACIA ATRAS");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExplicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdelante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addGap(81, 81, 81)
                        .addComponent(btnAdelante))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnExplicacion)
                .addGap(71, 71, 71)
                .addComponent(btnSalir)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1920, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        menu j1 = new menu();
        j1.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        // TODO add your handling code here:
        busquedaAtras busqueda = new busquedaAtras();
        busqueda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered
        // TODO add your handling code here:
        String mensaje = "Haz clic para acceder a la interfaz \nde busqueda hacia atras.";
        jTextArea1.setText(mensaje);
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_btnAtrasMouseEntered

    private void btnAdelanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdelanteMouseEntered
        // TODO add your handling code here:
        String mensajeCaracteristicas = "Haz clic para acceder a la interfaz \nbusqueda hacia delante.";
        jTextArea1.setText(mensajeCaracteristicas);
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_btnAdelanteMouseEntered

    private void btnExplicacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExplicacionMouseEntered
        // TODO add your handling code here:
        String mensajeCuadroMorfologico = "Haz clic para poder ingresar al \nmodulo de explicacion";
        jTextArea1.setText(mensajeCuadroMorfologico);
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_btnExplicacionMouseEntered

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        String mensajeSalirMenuExperto = "Haz clic para salir de la interfaz \nde menú de usuario.";
        jTextArea1.setText(mensajeSalirMenuExperto);
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdelanteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdelanteMouseClicked

    private void btnExplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExplicacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExplicacionMouseClicked

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }
    
    public void establecerIconoEnBoton(JButton boton, String rutaIcono, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(rutaIcono);
        Image imagen = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH); // Puedes cambiar SCALE_SMOOTH a otro método de escala si lo prefieres
        ImageIcon iconoEscalado = new ImageIcon(imagen);
        boton.setIcon(iconoEscalado);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnExplicacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
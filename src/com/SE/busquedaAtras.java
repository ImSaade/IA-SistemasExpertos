/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.SE;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author saaen
 */
public class busquedaAtras extends javax.swing.JFrame {

    /**
     * Creates new form busquedaAtras
     */
    ArrayList<Object[]> carac;
    int idCaract = 0;
    String nombreCaract;
    int posicion = 0;
    int[] idCarac = new int[5];
    String[] nombreSeleccionado = new String[5];

    public busquedaAtras() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        establecerIconoEnBoton(btnAñadir, "src/com/images/nuevo.png", 40, 40);
        establecerIconoEnBoton(btnEliminar, "src/com/images/borrar.png", 40, 40);
        establecerIconoEnBoton(btnSalir, "src/com/images/salir.png", 40, 40);
        establecerIconoEnBoton(btnInferir, "src/com/images/inferir.png", 40, 40);

        carac = obtenerCaracteristicas();
        jCCar.setModel(new DefaultComboBoxModel<>(carac.stream()
                .map(item -> (String) item[0])
                .toArray(String[]::new)));
        jCCar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jCCar.getSelectedIndex();
                if (selectedIndex >= 0) {
                    nombreCaract = (String) carac.get(selectedIndex)[0];
                    idCaract = (int) carac.get(selectedIndex)[1];
                }
            }
        });

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
        labelCar = new javax.swing.JLabel();
        jCCar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCar = new javax.swing.JTextArea();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInferir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("BUSQUEDA HACIA ATRÁS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addComponent(jLabel3)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 250));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        labelCar.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        labelCar.setForeground(new java.awt.Color(255, 255, 255));
        labelCar.setText("Caracteristicas:");

        jCCar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jCCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        areaCar.setColumns(20);
        areaCar.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        areaCar.setRows(5);
        jScrollPane1.setViewportView(areaCar);

        btnAñadir.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnInferir.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnInferir.setText("INFIERE");
        btnInferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInferirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(508, 508, 508))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(jCCar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(623, 623, 623)
                        .addComponent(labelCar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(679, 679, 679)
                        .addComponent(btnInferir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCar)
                .addGap(18, 18, 18)
                .addComponent(jCCar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAñadir)
                        .addGap(90, 90, 90)
                        .addComponent(btnEliminar)
                        .addGap(100, 100, 100)
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18)
                .addComponent(btnInferir)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1920, 830));

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

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        if (posicion < 5) {
            if (nombreCaract != null) {
                // Encuentra la primera posición disponible en los arreglos
                int index = 0;
                while (index < posicion && nombreSeleccionado[index] != null) {
                    index++;
                }

                if (index < 5) {
                    // Añade la característica en la posición disponible
                    nombreSeleccionado[index] = nombreCaract;
                    idCarac[index] = idCaract;

                    // Actualiza el JTextArea
                    areaCar.append(nombreCaract + "\n");

                    // Incrementa la variable posicion si es necesario
                    if (index == posicion) {
                        posicion++;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una característica en el combo box");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Solo puedes agregar 5 características");
        }
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        try {
            int caretPosition = areaCar.getCaretPosition();
            int lineIndex = areaCar.getLineOfOffset(caretPosition);

            if (lineIndex < posicion) {
                // Elimina la línea en el JTextArea
                int start = areaCar.getLineStartOffset(lineIndex);
                int end = areaCar.getLineEndOffset(lineIndex);
                try {
                    areaCar.getDocument().remove(start, end - start);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }

                // Elimina la entrada correspondiente en los arreglos
                for (int i = lineIndex; i < posicion - 1; i++) {
                    nombreSeleccionado[i] = nombreSeleccionado[i + 1];
                    idCarac[i] = idCarac[i + 1];
                }

                // Decrementa la variable posicion
                posicion--;
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(busquedaAtras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        usuario usuario = new usuario();
        usuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnInferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInferirMouseClicked
        String[] registros = areaCar.getText().split("\n");
        if (registros.length > 0) {
            StringBuilder mensaje = new StringBuilder();
            for (int i = 0; i < registros.length; i++) {
                mensaje.append("idCaract: ").append(idCarac[i]).append(", nombreSeleccionado: ").append(nombreSeleccionado[i]).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Registros", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros para mostrar.", "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInferirMouseClicked

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
            java.util.logging.Logger.getLogger(busquedaAtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedaAtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedaAtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedaAtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busquedaAtras().setVisible(true);
            }
        });
    }

    public void establecerIconoEnBoton(JButton boton, String rutaIcono, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(rutaIcono);
        Image imagen = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH); // Puedes cambiar SCALE_SMOOTH a otro método de escala si lo prefieres
        ImageIcon iconoEscalado = new ImageIcon(imagen);
        boton.setIcon(iconoEscalado);
    }

    public ArrayList<Object[]> obtenerCaracteristicas() {
        ArrayList<Object[]> caracteristicas = new ArrayList<>();
        ConexionDB conexionDB = new ConexionDB();
        Connection connection = conexionDB.obtenerConexion();

        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT DISTINCT c.id_caracteristica, c.caracteristica "
                + "FROM relacion r "
                + "JOIN caracteristicas c ON r.id_caracteristica = c.id_caracteristica"); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_caracteristica");
                String nombre = resultSet.getString("caracteristica");
                Object[] caracData = {nombre, id};
                caracteristicas.add(caracData);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener las características: " + e.getMessage());
        }
        return caracteristicas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInferir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jCCar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCar;
    // End of variables declaration//GEN-END:variables
}
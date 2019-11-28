/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Vista;

import biblioteca.Controlador.Controlador;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Solicitud_Prestamo extends javax.swing.JFrame {

    Controlador controlador;
    
    int idUsuario;

    /**
     * Creates new form Solicitud_Prestamo
     */
    public Solicitud_Prestamo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel() {

            @Override
            public void paint(Graphics g){
                Dimension tamanio = getSize();
                ImageIcon imagenFondo = new ImageIcon(getClass().getResource("solicitud.jpg"));
                g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
                setOpaque(false);
                super.paintComponent(g);
                super.paint(g);
            }
        };
        btnsolicitud = new javax.swing.JButton();
        btnprestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsolicitud.setText("SOLICITUD");
        btnsolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolicitudActionPerformed(evt);
            }
        });

        btnprestamo.setText("PRESTAMO");
        btnprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsolicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnprestamo)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolicitudActionPerformed
        // TODO add your handling code here:
        SolicitudLibro solicitudLib = new SolicitudLibro();
        solicitudLib.setVisible(true);
        solicitudLib.setCapLibro(controlador);
        solicitudLib.setIdUsuario(idUsuario);
        this.setVisible(false);
    }//GEN-LAST:event_btnsolicitudActionPerformed

    private void btnprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprestamoActionPerformed
        // TODO add your handling code here:

        SolicitudPrestamo solicitudLibPres = new SolicitudPrestamo();
        solicitudLibPres.setVisible(true);
        solicitudLibPres.setControlador(controlador);
        solicitudLibPres.setIdUsuario(idUsuario);
        this.setVisible(false);
    }//GEN-LAST:event_btnprestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprestamo;
    private javax.swing.JButton btnsolicitud;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
  

}

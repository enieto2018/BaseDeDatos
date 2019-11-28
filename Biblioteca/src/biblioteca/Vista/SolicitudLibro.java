/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Vista;

import biblioteca.Controlador.Controlador;
import biblioteca.Modelo.Libro;
import biblioteca.Modelo.ConexionBD;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class SolicitudLibro extends javax.swing.JFrame {

    private Controlador controlador;
    
    int idUsuario;
    /**
     * @return the controlador
     */
    public Controlador getCapLibro() {
        return controlador;
    }

    /**
     * @param capLibro the controlador to set
     */
    public void setCapLibro(Controlador capLibro) {
        this.controlador = capLibro;
    }

    /**
     * Creates new form solicitudLibro
     */
    public SolicitudLibro() {
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

        lblnombreLibro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombreLibro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablibros = new javax.swing.JTable();
        btnregistrar = new javax.swing.JButton();
        lblfechadesde = new javax.swing.JLabel();
        txtfechaDesde = new javax.swing.JTextField();
        txtfechaHasta = new javax.swing.JTextField();
        lblfechaHasta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnombreLibro.setText("Nombre Libro");

        jLabel2.setText("SOLICITUD DE LIBRO");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtablibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Biblioteca", "Id_Libro", "Id_Satelite", "Titulo", "Edicion", "Disponible"
            }
        ));
        jtablibros.setToolTipText("");
        jScrollPane1.setViewportView(jtablibros);

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        lblfechadesde.setText("Fecha Desde");

        txtfechaDesde.setToolTipText("DD/MM/AAAA");

        txtfechaHasta.setToolTipText("DD/MM/AAAA");

        lblfechaHasta.setText("Fecha Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblnombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblfechadesde, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblfechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreLibro)
                    .addComponent(txtnombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfechadesde)
                    .addComponent(txtfechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechaHasta)
                    .addComponent(txtfechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnregistrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        ConexionBD vc = new ConexionBD();
        vc.setConexionOracleXDefecto();
        controlador.setConexion(vc);
        String nombreLibro = txtnombreLibro.getText();

        List<Libro> list = getCapLibro().listaLibros(nombreLibro);
        if (list.isEmpty()) {
            System.out.println("No se encontro");
        } else {
            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i).getTitulo());

            }

            String[][] celdas = new String[list.size()][6];

            for (int i = 0; i < celdas.length; i++) {
                celdas[i][3] = list.get(i).getTitulo();
                celdas[i][1]= String.valueOf(list.get(i).getId_libro());

            }

            DefaultTableModel tmTablaLibros = new DefaultTableModel(celdas, new String[]{
                "Id_Biblioteca", "Id_Libro", "Id_Satelite", "Titulo", "Edicion", "Disponible"
            }) {

                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
                
            };

            jtablibros.setModel(tmTablaLibros);
//            tmTablaLibros.fireTableDataChanged();
//            jtablibros.repaint();

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        ConexionBD vc = new ConexionBD();
        vc.setConexionOracleXDefecto();
        controlador.setConexion(vc);
        
        int indexFilSelect=jtablibros.getSelectedRow();
        
        if(indexFilSelect!=-1){
            String idlibro = String.valueOf(jtablibros.getModel().getValueAt(jtablibros.getSelectedRow(), 1));
        String fechadesde= txtfechaDesde.getText();
        String fechahasta= txtfechaHasta.getText();
        
        controlador.registrarSolicitud(Integer.parseInt(idlibro), fechadesde, fechahasta,
                idUsuario, 1, 1);
        }else
        {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila");
        }
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablibros;
    private javax.swing.JLabel lblfechaHasta;
    private javax.swing.JLabel lblfechadesde;
    private javax.swing.JLabel lblnombreLibro;
    private javax.swing.JTextField txtfechaDesde;
    private javax.swing.JTextField txtfechaHasta;
    private javax.swing.JTextField txtnombreLibro;
    // End of variables declaration//GEN-END:variables

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

   
    
    

}

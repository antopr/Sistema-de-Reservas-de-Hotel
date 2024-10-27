package vistas;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.entities.Pasajero;
import model.storage.implementations.PasajeroDaoImp;

public class PrincipalPanel extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;
    
    public PrincipalPanel() {
        initComponents();
        //this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initTable();
        cargarPasajeros();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCambiante = new javax.swing.JPanel();
        InicioSistema = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHabitaciones = new javax.swing.JButton();
        btnPasajeros = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        VerPasajeros = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        listadoPasajeros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePasajeros = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        IngresarPasajero = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnGuardarPasajero = new javax.swing.JButton();
        btnBorrarPasajero = new javax.swing.JButton();
        btnCancelarPasajero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCambiante.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Nunito Sans 10pt ExtraLight", 0, 18)); // NOI18N
        jLabel1.setText("Inicio");

        jLabel2.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 24)); // NOI18N
        jLabel2.setText("Sistema Reservas Hotel");

        btnHabitaciones.setText("Habitaciones");

        btnPasajeros.setText("Pasajeros");
        btnPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasajerosActionPerformed(evt);
            }
        });

        btnReservas.setText("Reservas");

        javax.swing.GroupLayout InicioSistemaLayout = new javax.swing.GroupLayout(InicioSistema);
        InicioSistema.setLayout(InicioSistemaLayout);
        InicioSistemaLayout.setHorizontalGroup(
            InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSistemaLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSistemaLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSistemaLayout.createSequentialGroup()
                        .addComponent(btnPasajeros)
                        .addGap(79, 79, 79)
                        .addComponent(btnHabitaciones)
                        .addGap(70, 70, 70)
                        .addComponent(btnReservas)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSistemaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(246, 246, 246))))
        );
        InicioSistemaLayout.setVerticalGroup(
            InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSistemaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addGroup(InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabitaciones)
                    .addComponent(btnPasajeros)
                    .addComponent(btnReservas))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        PanelCambiante.add(InicioSistema, "card2");

        jLabel3.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel3.setText("Administración de Pasajros");

        listadoPasajeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablePasajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablePasajeros);

        javax.swing.GroupLayout listadoPasajerosLayout = new javax.swing.GroupLayout(listadoPasajeros);
        listadoPasajeros.setLayout(listadoPasajerosLayout);
        listadoPasajerosLayout.setHorizontalGroup(
            listadoPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoPasajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        listadoPasajerosLayout.setVerticalGroup(
            listadoPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listadoPasajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel4.setText("Listado de Pasajeros");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnGuardar.setText("Guardar");

        btnCancelar.setText("Cancelar");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VerPasajerosLayout = new javax.swing.GroupLayout(VerPasajeros);
        VerPasajeros.setLayout(VerPasajerosLayout);
        VerPasajerosLayout.setHorizontalGroup(
            VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPasajerosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(VerPasajerosLayout.createSequentialGroup()
                        .addComponent(listadoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir)
                            .addGroup(VerPasajerosLayout.createSequentialGroup()
                                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        VerPasajerosLayout.setVerticalGroup(
            VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPasajerosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listadoPasajeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(VerPasajerosLayout.createSequentialGroup()
                        .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(VerPasajerosLayout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(13, 13, 13)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addGap(0, 222, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)))
                .addGap(26, 26, 26))
        );

        PanelCambiante.add(VerPasajeros, "card3");

        jLabel5.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel5.setText("Información del Pasajero");

        jLabel6.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel9.setText("Documento");

        jLabel10.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel11.setText("Dirección");

        jLabel12.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel12.setText("Ciudad");

        jLabel13.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel13.setText("País");

        btnGuardarPasajero.setText("Guardar");
        btnGuardarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPasajeroActionPerformed(evt);
            }
        });

        btnBorrarPasajero.setText("Borrar");
        btnBorrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPasajeroActionPerformed(evt);
            }
        });

        btnCancelarPasajero.setText("Cancelar");
        btnCancelarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPasajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarPasajeroLayout = new javax.swing.GroupLayout(IngresarPasajero);
        IngresarPasajero.setLayout(IngresarPasajeroLayout);
        IngresarPasajeroLayout.setHorizontalGroup(
            IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarPasajeroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(IngresarPasajeroLayout.createSequentialGroup()
                        .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(37, 37, 37)
                        .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtDocumento)
                            .addGroup(IngresarPasajeroLayout.createSequentialGroup()
                                .addComponent(btnGuardarPasajero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrarPasajero)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelarPasajero)))))
                .addGap(245, 351, Short.MAX_VALUE))
        );
        IngresarPasajeroLayout.setVerticalGroup(
            IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarPasajeroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresarPasajeroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarPasajeroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPasajero)
                    .addComponent(btnBorrarPasajero)
                    .addComponent(btnCancelarPasajero))
                .addGap(26, 26, 26))
        );

        PanelCambiante.add(IngresarPasajero, "card4");

        getContentPane().add(PanelCambiante, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasajerosActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card3"); // "card3" es el identificador de VerPasajeros
    }//GEN-LAST:event_btnPasajerosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
       cardLayout.show(PanelCambiante, "card2"); // "card2" es el identificador del panel de Inicio
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card4"); // "card4" es el identificador de Ingresar Pasajeros
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPasajeroActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card3"); // "card3" es el identificador de VerPasajeros
    }//GEN-LAST:event_btnCancelarPasajeroActionPerformed
    
//PANEL INGRESAR PASAJERO
    //Guardar pasajeros, panel Ingresar pasajero
    private void btnGuardarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPasajeroActionPerformed
        guardarPasajero();
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarPasajeroActionPerformed

    private void btnBorrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPasajeroActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnBorrarPasajeroActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IngresarPasajero;
    private javax.swing.JPanel InicioSistema;
    private javax.swing.JPanel PanelCambiante;
    private javax.swing.JPanel VerPasajeros;
    private javax.swing.JButton btnBorrarPasajero;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarPasajero;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarPasajero;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPasajeros;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listadoPasajeros;
    private javax.swing.JTable tablePasajeros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void guardarPasajero() { 
        try {
            //instancia de PasajeroDaoImp
            PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();

            //instancia de pasajero
            Pasajero pasajero = new Pasajero();

            pasajero.setNombre(txtNombre.getText());
            pasajero.setApellido(txtApellido.getText());
            pasajero.setEmail(txtEmail.getText());
            pasajero.setDni(Integer.parseInt(txtDocumento.getText()));
            pasajero.setDireccion(txtDireccion.getText());
            pasajero.setCiudad(txtCiudad.getText());
            pasajero.setPais(txtPais.getText());
            pasajero.setTelefono(txtTelefono.getText());

            //inserto pasajero 
            pasajeroDao.insertar(pasajero);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Pasajero guardado correctamente.");
            limpiarCampos();
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar el pasajero. Intente nuevamente.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtDocumento.setText("");
        txtDireccion.setText("");
        txtCiudad.setText("");
        txtPais.setText("");
        txtTelefono.setText("");
    }

    private void initTable() {
        String[] columnNames = {"Id", "Nombre", "Apellido", "Documento"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tablePasajeros.setModel(tableModel);
    }

    private void cargarPasajeros() {
        
        tableModel.setRowCount(0);  // limpia datos
        PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();
        List<Pasajero> pasajeros = pasajeroDao.obtenerTodos();  
        
        for (Pasajero pasajero : pasajeros) {
            Object[] row = {
                pasajero.getIdPasajero(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDni()
            };
            tableModel.addRow(row);
        }
    }

}

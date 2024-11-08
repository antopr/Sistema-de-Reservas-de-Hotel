package vistas;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entities.Habitacion;
import model.entities.Pasajero;
import model.exceptions.NotFoundException;
import model.storage.implementations.HabitacionesDaoImp;
import model.storage.implementations.PasajeroDaoImp;

public class PrincipalPanel extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;
    private int pasajeroSeleccionadoId = -1;
    private DefaultTableModel tableModelHab;
    private int habitacionSelectedId = -1;
    
    public PrincipalPanel() {
        initComponents();
        //this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initTable();
        initTableHab();
        initTableDatos();
        cargarPasajeros();
    }
    //************ Ver final para el num de card en initComponents ***********
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
        btnSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDatosPasajero = new javax.swing.JTable();
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
        VerHabitaciones = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregarHab = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaHab = new javax.swing.JTable();
        btnSalirHab = new javax.swing.JButton();
        btnModificarHab = new javax.swing.JButton();
        btnEliminarHab = new javax.swing.JButton();
        IngresarHabitacion = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNumHab = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPisoHab = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cmbCategoriaHab = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDescripcionHab = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        txtPrecioHab = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbConfiguracionHab = new javax.swing.JComboBox<>();
        btnGuardarHab = new javax.swing.JButton();
        btnBorrarHab = new javax.swing.JButton();
        btnCancelarHab = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCambiante.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Nunito Sans 10pt ExtraLight", 0, 18)); // NOI18N
        jLabel1.setText("Inicio");

        jLabel2.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 24)); // NOI18N
        jLabel2.setText("Sistema Reservas Hotel");

        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnPasajeros.setText("Pasajeros");
        btnPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasajerosActionPerformed(evt);
            }
        });

        btnReservas.setText("Reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioSistemaLayout = new javax.swing.GroupLayout(InicioSistema);
        InicioSistema.setLayout(InicioSistemaLayout);
        InicioSistemaLayout.setHorizontalGroup(
            InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSistemaLayout.createSequentialGroup()
                .addGroup(InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioSistemaLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1))
                    .addGroup(InicioSistemaLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2))
                    .addGroup(InicioSistemaLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnPasajeros)
                        .addGap(79, 79, 79)
                        .addComponent(btnHabitaciones)
                        .addGap(70, 70, 70)
                        .addComponent(btnReservas)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        InicioSistemaLayout.setVerticalGroup(
            InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSistemaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addGroup(InicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabitaciones)
                    .addComponent(btnPasajeros)
                    .addComponent(btnReservas))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        PanelCambiante.add(InicioSistema, "card2");

        jLabel3.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel3.setText("Administración de Pasajeros");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel14.setText("Datos del pasajero");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane2.setViewportView(tableDatosPasajero);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VerPasajerosLayout = new javax.swing.GroupLayout(VerPasajeros);
        VerPasajeros.setLayout(VerPasajerosLayout);
        VerPasajerosLayout.setHorizontalGroup(
            VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPasajerosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VerPasajerosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VerPasajerosLayout.createSequentialGroup()
                        .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VerPasajerosLayout.createSequentialGroup()
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listadoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir))))
                .addContainerGap())
        );
        VerPasajerosLayout.setVerticalGroup(
            VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPasajerosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerPasajerosLayout.createSequentialGroup()
                        .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VerPasajerosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(listadoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VerPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addGap(245, 384, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(IngresarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPasajero)
                    .addComponent(btnBorrarPasajero)
                    .addComponent(btnCancelarPasajero))
                .addGap(26, 26, 26))
        );

        PanelCambiante.add(IngresarPasajero, "card4");

        jLabel15.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel15.setText("Administración de Habitaciones");

        btnAgregarHab.setText("Agregar Habitación");
        btnAgregarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane4.setViewportView(tablaHab);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        btnSalirHab.setText("Salir");
        btnSalirHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirHabActionPerformed(evt);
            }
        });

        btnModificarHab.setText("Modificar");
        btnModificarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHabActionPerformed(evt);
            }
        });

        btnEliminarHab.setText("Eliminar");
        btnEliminarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VerHabitacionesLayout = new javax.swing.GroupLayout(VerHabitaciones);
        VerHabitaciones.setLayout(VerHabitacionesLayout);
        VerHabitacionesLayout.setHorizontalGroup(
            VerHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerHabitacionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(VerHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(VerHabitacionesLayout.createSequentialGroup()
                        .addComponent(btnAgregarHab)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarHab)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarHab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirHab))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        VerHabitacionesLayout.setVerticalGroup(
            VerHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerHabitacionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VerHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarHab)
                    .addComponent(btnModificarHab)
                    .addComponent(btnEliminarHab)
                    .addComponent(btnSalirHab))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PanelCambiante.add(VerHabitaciones, "card5");

        jLabel16.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 14)); // NOI18N
        jLabel16.setText("Agregar una nueva habitación");

        jLabel17.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel17.setText("N° de Habitación");

        jLabel18.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel18.setText("Piso");

        jLabel19.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel19.setText("Categoría");

        cmbCategoriaHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Standar", "Superior", "Lujo" }));

        jLabel20.setText("Descripción");

        txaDescripcionHab.setColumns(20);
        txaDescripcionHab.setRows(5);
        jScrollPane3.setViewportView(txaDescripcionHab);

        jLabel21.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel21.setText("Precio");

        jLabel22.setFont(new java.awt.Font("Nunito Sans 10pt Medium", 0, 12)); // NOI18N
        jLabel22.setText("Configuración");

        cmbConfiguracionHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Matrimonial", "Twin", "Matrimonial & Twin", "Triple Twin" }));

        btnGuardarHab.setText("Guardar");
        btnGuardarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHabActionPerformed(evt);
            }
        });

        btnBorrarHab.setText("Borrar");
        btnBorrarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarHabActionPerformed(evt);
            }
        });

        btnCancelarHab.setText("Cancelar");
        btnCancelarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarHabitacionLayout = new javax.swing.GroupLayout(IngresarHabitacion);
        IngresarHabitacion.setLayout(IngresarHabitacionLayout);
        IngresarHabitacionLayout.setHorizontalGroup(
            IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                        .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20))
                                .addGap(75, 75, 75)
                                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrecioHab, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumHab, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPisoHab, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCategoriaHab, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbConfiguracionHab, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel16))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                        .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                                .addComponent(btnGuardarHab)
                                .addGap(37, 37, 37)
                                .addComponent(btnBorrarHab)
                                .addGap(34, 34, 34)
                                .addComponent(btnCancelarHab))
                            .addComponent(jLabel22)
                            .addComponent(jLabel17))
                        .addGap(0, 54, Short.MAX_VALUE))))
        );
        IngresarHabitacionLayout.setVerticalGroup(
            IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarHabitacionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPisoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbCategoriaHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cmbConfiguracionHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(28, 28, 28)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(IngresarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarHab)
                    .addComponent(btnBorrarHab)
                    .addComponent(btnCancelarHab))
                .addGap(62, 62, 62))
        );

        PanelCambiante.add(IngresarHabitacion, "card6");

        getContentPane().add(PanelCambiante, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//PANEL PRINCIPAL BTN PASAJERO
    private void btnPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasajerosActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card3"); // "card3" es el identificador de VerPasajeros
    }//GEN-LAST:event_btnPasajerosActionPerformed

    private void btnCancelarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPasajeroActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card3"); // "card3" es el identificador de VerPasajeros
    }//GEN-LAST:event_btnCancelarPasajeroActionPerformed
    
//PANEL INGRESAR PASAJERO
    //Guardar pasajeros, panel Ingresar pasajero
    private void btnGuardarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPasajeroActionPerformed
        guardarPasajero();
        limpiarCampos();
        actualizarTablaPasajeros();
    }//GEN-LAST:event_btnGuardarPasajeroActionPerformed
//btn borrar txt en ingresar pasajeros
    private void btnBorrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPasajeroActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnBorrarPasajeroActionPerformed
//btn salir verPasajero
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card2"); // "card2" es el identificador del panel de Inicio
    }//GEN-LAST:event_btnSalirActionPerformed
// PANEL ADMINISTRACION PASAJERO
    //btn ingresar pasajero
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card4"); // "card4" es el identificador de Ingresar Pasajeros
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        int selectedRow = tablePasajeros.getSelectedRow();
        if (selectedRow != -1) {            
            int pasajeroId = (int) tableModel.getValueAt(selectedRow, 0); 
            System.out.println("ID seleccionado en la tabla: " + pasajeroId);
            try {
                //pasajero completo desde la base de datos
                PasajeroDaoImp pasajeroDaoM = new PasajeroDaoImp();
                Pasajero pasajero = pasajeroDaoM.obtenerPorId(pasajeroId);
                    
                ModificarPasajeroDialog modificarDialog = new ModificarPasajeroDialog(this, pasajero);
                modificarDialog.setVisible(true); // esto muestra el cuadro de dialog
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Selecciona un pasajero para modificar.");
            }
            
        }
        
        /*
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card5"); //  Modificar Pasajeros */
    }//GEN-LAST:event_btnModificarActionPerformed
//btn eliminar en ver pasajeros
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarPasajero();
    }//GEN-LAST:event_btnEliminarActionPerformed
//PANEL PRINCIPAL BTN HABITACION
    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card5"); // "card5" es el identificador de VerHabitaciones
    }//GEN-LAST:event_btnHabitacionesActionPerformed
//PANEL PRINCIPAL BTN RESERVA
    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservasActionPerformed
//btn salir en verHabitaciones
    private void btnSalirHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirHabActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card2"); // "card2" es el identificador del panel de Inicio
    }//GEN-LAST:event_btnSalirHabActionPerformed
//btn agregarHabitacion (en panel verHabitacion) (voy a panel IngresarHab)
    private void btnAgregarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card6"); // "card6" es el identificador de Ingresar Hab
    }//GEN-LAST:event_btnAgregarHabActionPerformed
//btn borrar txt en panel ingresar hab
    private void btnBorrarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarHabActionPerformed
        limpiarCamposHabitacion();
    }//GEN-LAST:event_btnBorrarHabActionPerformed
//btn cancelar, salir del panel ingresar hab (voy a panel verHab)
    private void btnCancelarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarHabActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) PanelCambiante.getLayout();
        cardLayout.show(PanelCambiante, "card5"); 
    }//GEN-LAST:event_btnCancelarHabActionPerformed
//btn guardar Habitacion, en panel Ingresar hab
    private void btnGuardarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHabActionPerformed
        guardarHabitacion();
        limpiarCamposHabitacion();
        actualizarTablaHab();
    }//GEN-LAST:event_btnGuardarHabActionPerformed
//btn modificar habitacion, en panel verHabitaciones
    private void btnModificarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHabActionPerformed
        int selectedRowH = tablaHab.getSelectedRow();
        if (selectedRowH != -1) {            
            int habitId = (int) tableModelHab.getValueAt(selectedRowH, 0); 
            System.out.println("ID seleccionado en la tabla habitaciones: " + habitId);
            try {
                //habitacion completa
                HabitacionesDaoImp habDaoM = new HabitacionesDaoImp();
                Habitacion habitacioon = habDaoM.obtenerPorId(habitId);
                    
                ModificarHabDialog modificarHDialog = new ModificarHabDialog(this, habitacioon);
                modificarHDialog.setVisible(true); 
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Selecciona una habitación para modificar.");
            }
            
        }
    }//GEN-LAST:event_btnModificarHabActionPerformed
//btn eliminar habitacion, en panel verHab
    private void btnEliminarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabActionPerformed
        eliminarHabitacion();
    }//GEN-LAST:event_btnEliminarHabActionPerformed

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
    private javax.swing.JPanel IngresarHabitacion;
    private javax.swing.JPanel IngresarPasajero;
    private javax.swing.JPanel InicioSistema;
    private javax.swing.JPanel PanelCambiante;
    private javax.swing.JPanel VerHabitaciones;
    private javax.swing.JPanel VerPasajeros;
    private javax.swing.JButton btnAgregarHab;
    private javax.swing.JButton btnBorrarHab;
    private javax.swing.JButton btnBorrarPasajero;
    private javax.swing.JButton btnCancelarHab;
    private javax.swing.JButton btnCancelarPasajero;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarHab;
    private javax.swing.JButton btnGuardarHab;
    private javax.swing.JButton btnGuardarPasajero;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarHab;
    private javax.swing.JButton btnPasajeros;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirHab;
    private javax.swing.JComboBox<String> cmbCategoriaHab;
    private javax.swing.JComboBox<String> cmbConfiguracionHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel listadoPasajeros;
    private javax.swing.JTable tablaHab;
    private javax.swing.JTable tableDatosPasajero;
    private javax.swing.JTable tablePasajeros;
    private javax.swing.JTextArea txaDescripcionHab;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumHab;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPisoHab;
    private javax.swing.JTextField txtPrecioHab;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

//pasajeros
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

        tablePasajeros.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && tablePasajeros.getSelectedRow() != -1) {
                
                // obtiene el id desde la fila seleccionada
                int selectedRow = tablePasajeros.getSelectedRow();
                pasajeroSeleccionadoId = (int) tablePasajeros.getValueAt(selectedRow, 0);
                
                System.out.println("El id del pasajero es: " + pasajeroSeleccionadoId);
                
                try {
                    //pasajero completo desde la base de datos
                    PasajeroDaoImp pasajeroD = new PasajeroDaoImp();
                    Pasajero pasajero = pasajeroD.obtenerPorId(pasajeroSeleccionadoId);

                    // limpia datos anteriores en tableDatosPasajero
                    DefaultTableModel datosModel = (DefaultTableModel) tableDatosPasajero.getModel();
                    datosModel.setRowCount(0);

                    // agrega filas con los atributos del pasajero seleccionado
                    datosModel.addRow(new Object[]{
                        pasajero.getIdPasajero(),
                        pasajero.getNombre(),
                        pasajero.getApellido(),
                        pasajero.getDni(),
                        pasajero.getDireccion(),
                        pasajero.getTelefono(), 
                        pasajero.getEmail()
                    });             
                } catch (NotFoundException e) {
                    JOptionPane.showMessageDialog(this, "Pasajero no encontrado en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private void initTableDatos() {
        String[] columnNames = {"Id", "Nombre", "Apellido", "Documento", "Direccion", "Telefono", "Email"};        
        DefaultTableModel datosModel = new DefaultTableModel(columnNames, 0);        
        tableDatosPasajero.setModel(datosModel);           
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
                pasajero.getDni(),
                pasajero.getTelefono(),
                pasajero.getEmail(),
                pasajero.getDireccion(),
                pasajero.getCiudad(),
                pasajero.getPais()
            };
            tableModel.addRow(row);
        }
    }

    private void eliminarPasajero() {
        
        int filaSeleccionada = tablePasajeros.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un pasajero para eliminar.");
            return;
        }

        // obtengo datos de la tabla
        //int idPasajero = (int) tablePasajeros.getValueAt(filaSeleccionada, 0); //por id
        int dniPasajero = (int) tablePasajeros.getValueAt(filaSeleccionada, 3);
        
        //mensaje de confirmacion
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este pasajero?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            //llamo al daoo
            PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();
            try {
                pasajeroDao.eliminar(dniPasajero); // por id (idPasajero)
                JOptionPane.showMessageDialog(this, "Pasajero eliminado con éxito.");

                // Actualizar la tabla después de eliminar
                actualizarTablaPasajeros();
                //actualizarTablaDatosPasajeros();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el pasajero: " + ex.getMessage());
            }
        }
    }
    
////// actualizar datos borrados en tableDatosPasajeros despues
    
    private void actualizarTablaPasajeros() {
        try {
            PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();
            List<Pasajero> pasajeros = pasajeroDao.obtenerTodos();

            DefaultTableModel modeloTabla = (DefaultTableModel) tablePasajeros.getModel();
            modeloTabla.setRowCount(0);

            for (Pasajero p : pasajeros) {
                Object[] fila = {
                    p.getIdPasajero(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getDni(),
                    p.getEmail(),
                    p.getTelefono(),
                    p.getDireccion(),
                    p.getCiudad(),
                    p.getPais()
                };
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la tabla: " + e.getMessage());
        }
    }

//Habitciones
    private void limpiarCamposHabitacion() {
        txtNumHab.setText("");
        txtPisoHab.setText("");
        cmbCategoriaHab.setSelectedIndex(-1);
        cmbConfiguracionHab.setSelectedIndex(-1);
        txtPrecioHab.setText("");
        txaDescripcionHab.setText("");
         
    }
    //(btn guardar)
    private void guardarHabitacion() {
        try {
            //instancia de HabitacionesDaoImp
            HabitacionesDaoImp habitacionDao = new HabitacionesDaoImp();
            
            //instancia de habitaciones
            Habitacion hab = new Habitacion();
            
            hab.setNumero(Integer.parseInt(txtNumHab.getText()));
            hab.setPiso(txtPisoHab.getText());
            hab.setCategoria((String) cmbCategoriaHab.getSelectedItem());
            hab.setConfiguracion((String) cmbConfiguracionHab.getSelectedItem());            
            hab.setDescripcion(txaDescripcionHab.getText());
            hab.setPrecio(Integer.parseInt(txtPrecioHab.getText()));
            
            //inserto habitacion
            habitacionDao.insertar(hab);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Habitación guardada correctamente.");
            limpiarCamposHabitacion();
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar la habitación. Intente nuevamente.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //para cargar en la tabla las habitaciones:
    private void cargarHabitaciones(){
        try {
            HabitacionesDaoImp habitacionDao = new HabitacionesDaoImp();
            List<Habitacion> habitaciones = habitacionDao.obtenerTodos();
            
            for (Habitacion hab : habitaciones) {
                
                tableModelHab.addRow(new Object[]{
                    hab.getIdHabitacion(), 
                    hab.getNumero(), 
                    hab.getPiso(), 
                    hab.getCategoria(), 
                    hab.getConfiguracion(), 
                    hab.getDescripcion(), 
                    hab.getPrecio()
                });
            }
            
        } catch (Exception e) {
        }   
    }

    private void initTableHab() {
        String[] columnName = {"Id", "N° Hab.", "Piso", "Categoría", "Configuración", "Descripción", "Precio"};
        tableModelHab = new DefaultTableModel(columnName, 0);
        tablaHab.setModel(tableModelHab);
        
        cargarHabitaciones();
        
        //listener para seleccion
        tablaHab.getSelectionModel().addListSelectionListener(event ->{
            if (!event.getValueIsAdjusting() && tablaHab.getSelectedRow() != -1){
                
                //obtengo id de la fila seleccionada
                int selectedFila = tablaHab.getSelectedRow();
                habitacionSelectedId = (int) tablaHab.getValueAt(selectedFila, 0);
                
                System.out.println("Id de la habitacion seleccionada: " + habitacionSelectedId);
                
                try {
                    //habitacion desde la base de datos
                    HabitacionesDaoImp habitacionD = new HabitacionesDaoImp();
                    Habitacion hab = habitacionD.obtenerPorId(habitacionSelectedId);
                    System.out.println("Habitacion seleccionada: " + hab);
                    
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Habitación no encontrada en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
            }
        });
    }

    private void eliminarHabitacion() {
        int filaSelected = tablaHab.getSelectedRow();
        System.out.println("fila seleccionada " + filaSelected);
        
        int numeroHabitacion = (int) tablaHab.getValueAt(filaSelected, 1);
        System.out.println("numero de habitacion " + numeroHabitacion);
        
        int confirma = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta habitación?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
            HabitacionesDaoImp habitDao = new HabitacionesDaoImp();
            try {
                habitDao.eliminar(numeroHabitacion);
                JOptionPane.showMessageDialog(this, "Habitación eliminada.");
                //actualizar tabla
                actualizarTablaHab();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar la habitación.");
            }
        }
    }

    private void actualizarTablaHab() {
        try {
            HabitacionesDaoImp hDao = new HabitacionesDaoImp();
            List<Habitacion> hab = hDao.obtenerTodos();
            
            DefaultTableModel modeloT = (DefaultTableModel) tablaHab.getModel();
            modeloT.setRowCount(0);
            for (Habitacion h : hab){
                Object[] fila = {
                    h.getIdHabitacion(),
                    h.getNumero(),
                    h.getPiso(),
                    h.getCategoria(),
                    h.getConfiguracion(),
                    h.getIdHabitacion(),
                    h.getPrecio()
                };
                modeloT.addRow(fila);
            }
            
        } catch (Exception e) {
        }
    }
    

}

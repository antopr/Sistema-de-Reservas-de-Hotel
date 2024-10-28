package vistas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.entities.Pasajero;
import model.storage.implementations.PasajeroDaoImp;

public class ModificarPasajeroDialog extends JDialog {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEmail;
    private JTextField txtDocumento;
    private JTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtCiudad;
    private JTextField txtPais;
    
    private Pasajero pasajero;
    
    public ModificarPasajeroDialog(JFrame parent, Pasajero pasajero) {
        super(parent, "Modificar Pasajero", true);
        this.pasajero = pasajero;
        
        initComponents();
        
        System.out.println("Id en constructor de modificarPasajeroDialog" + pasajero.getIdPasajero());
        
        //aca carga los campos con los datos del pasajero
        txtNombre.setText(pasajero.getNombre());
        txtApellido.setText(pasajero.getApellido());
        txtEmail.setText(pasajero.getEmail());
        txtDocumento.setText(String.valueOf(pasajero.getDni()));
        txtTelefono.setText(pasajero.getTelefono());
        txtDireccion.setText(pasajero.getDireccion());
        txtCiudad.setText(pasajero.getCiudad());
        txtPais.setText(pasajero.getPais());
        
        // Ajustar el tamaño y posición del diálogo
        pack();
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
    private void initComponents() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtEmail = new JTextField(20);
        txtDocumento = new JTextField(20);
        txtTelefono = new JTextField(20);
        txtDireccion = new JTextField(20);
        txtCiudad = new JTextField(20);
        txtPais = new JTextField(20);
        
        add(new JLabel("Nombre"));
        add(txtNombre);
        add(new JLabel("Apellido"));
        add(txtApellido);
        add(new JLabel("Email"));
        add(txtEmail);
        add(new JLabel("Documento"));
        add(txtDocumento);
        add(new JLabel("Telefono"));
        add(txtTelefono);
        add(new JLabel("Direccion"));
        add(txtDireccion);
        add(new JLabel("Ciudad"));
        add(txtCiudad);
        add(new JLabel("País"));
        add(txtPais);
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarCambios());
        add(btnGuardar);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> cancelarCambios());
        add(btnCancelar);
        
    }
    
    private void guardarCambios() {
    try {
        //instancia de PasajeroDaoImp
        PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();

        System.out.println("ID a enviar al método modificar: " + pasajero.getIdPasajero());
        
        //actualizo con los nuevos valores
        pasajero.setNombre(txtNombre.getText());
        pasajero.setApellido(txtApellido.getText());
        pasajero.setEmail(txtEmail.getText());
        pasajero.setDni(Integer.parseInt(txtDocumento.getText()));
        pasajero.setTelefono(txtTelefono.getText());
        pasajero.setDireccion(txtDireccion.getText());
        pasajero.setCiudad(txtCiudad.getText());
        pasajero.setPais(txtPais.getText());

        //guardar los cambios en la base de datos
        pasajeroDao.modificar(pasajero);

        JOptionPane.showMessageDialog(this, "Los cambios se han guardado exitosamente.");
        
        //cierra
        dispose();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "DNI debe ser un número válido.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar los cambios: " + e.getMessage());
    }
}

    private void cancelarCambios() {
        dispose();
    }

    //actualizar datos dsp de modificar en tableDatosPasajeros
}

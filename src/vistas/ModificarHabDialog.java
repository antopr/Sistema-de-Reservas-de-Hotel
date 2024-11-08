package vistas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.entities.Habitacion;
import model.storage.implementations.HabitacionesDaoImp;

public class ModificarHabDialog extends JDialog{
    private JTextField txtNumHab;
    private JTextField txtPisoHab;
    private JComboBox<String> cmbCategoriaHab;
    private JComboBox<String> cmbConfiguracionHab;
    private JTextField txtPrecioHab;
    private JTextArea txaDescripcionHab;
    
    private Habitacion hab;
    
    public ModificarHabDialog(JFrame parent, Habitacion hab) {
        super(parent, "Modificar Habitación", true);
        this.hab = hab;
        
        initComponents();
        System.out.println("Id en constructor de modificarHabDialog" + hab.getIdHabitacion());
        
        //cargo los campos
        txtNumHab.setText(String.valueOf(hab.getNumero()));
        txtPisoHab.setText(hab.getPiso());
        cmbCategoriaHab.setSelectedItem(hab.getCategoria());
        cmbConfiguracionHab.setSelectedItem(hab.getConfiguracion());
        txtPrecioHab.setText(String.valueOf(hab.getPrecio()));
        txaDescripcionHab.setText(hab.getDescripcion());
        
        pack();
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    
    }

    private void initComponents() {
       setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
             
       txtNumHab = new JTextField(10);
       txtPisoHab = new JTextField(10);
       cmbCategoriaHab = new JComboBox<>(new String[] { "-", "Standar", "Superior", "Lujo" });
       cmbConfiguracionHab = new JComboBox<>(new String[] { "-", "Matrimonial", "Twin", "Matrimonial & Twin", "Triple Twin"});
       txtPrecioHab = new JTextField(10);
       txaDescripcionHab = new JTextArea(10, 20);
       
       
       add(new JLabel("N° Habitación"));
       add(txtNumHab);
       add(new JLabel("Piso"));
       add(txtPisoHab);
       add(new JLabel("Categoría"));
       add(cmbCategoriaHab);
       add(new JLabel("Configuración"));
       add(cmbConfiguracionHab);
       add(new JLabel("Precio"));
       add(txtPrecioHab);
       add(new JLabel("Descripción"));
       add(txaDescripcionHab);
       
       JButton btnGuardarMHab = new JButton("Guardar");
       btnGuardarMHab.addActionListener(e -> guardarCambiosHab());
       add(btnGuardarMHab);
       
       JButton btnCancelarMHab = new JButton("Cancelar");
       btnCancelarMHab.addActionListener(e -> cancelarCambiosHab());
       add(btnCancelarMHab);       
    }

    private void guardarCambiosHab() {
        try {
            
            //instancia
            HabitacionesDaoImp habDao = new HabitacionesDaoImp();

            System.out.println("ID a enviar al método modificar: " + hab.getIdHabitacion());
        
            //actualizo con los nuevos valores
            hab.setNumero(Integer.parseInt(txtNumHab.getText()));
            hab.setPiso(txtPisoHab.getText());
            hab.setCategoria((String) cmbCategoriaHab.getSelectedItem());
            hab.setConfiguracion((String) cmbConfiguracionHab.getSelectedItem());
            hab.setPrecio(Double.parseDouble(txtPrecioHab.getText()));
            hab.setDescripcion(txaDescripcionHab.getText());

            //guardar los cambios 
            habDao.modificar(hab);

            //actualizar

            JOptionPane.showMessageDialog(this, "Los cambios se han guardado exitosamente.");

            dispose();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar los cambios.");
        }
    }

    private void cancelarCambiosHab() {
        dispose();
    }
    
    
}

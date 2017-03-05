import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.awt.event.ActionListener; 
import javax.swing.*;
import javax.swing.border.*;
/**
 * Diseño una interfaz que contiene la informacion de los medicamentos, con texfields que mostraran dicha información luego de digitar el nombre en la InterfazBusqueda.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class InterfazMedicamentos extends JPanel
        // implements ActionListener
{
    private InterfazFarmacia main;  
    private JLabel Nombre;
    private JLabel Tipo;
    private JLabel Ubicacion;
    private JLabel Casillero;
    private JTextField txtNombre;
    private JTextField txtTipo;
    private JTextField txtUbicacion;
    private JTextField txtCasillero;
    private JButton cierre;

    public InterfazMedicamentos(InterfazFarmacia main1)
    {
       main = main1;
       setLayout(new GridLayout(7,3)); 
       setPreferredSize(new Dimension(0,100));
       
       TitledBorder border = BorderFactory.createTitledBorder("Información del medicamento:");
       border.setTitleColor(Color.BLACK);
       setBorder(border);
       
       Nombre = new JLabel("Nombre:");
       Tipo = new JLabel("Tipo:");
       Ubicacion = new JLabel("Estante:");
       Casillero = new JLabel("Casillero:");

       txtNombre = new JTextField();
       txtNombre.setForeground(Color.red);
       txtNombre.setEditable(false);
       
       txtTipo = new JTextField();
       txtTipo.setForeground(Color.red);
       txtTipo.setEditable(false);
       
       txtUbicacion = new JTextField();
       txtUbicacion.setForeground(Color.red);
       txtUbicacion.setEditable(false);
       
       txtCasillero = new JTextField();
       txtCasillero.setForeground(Color.red);
       txtCasillero.setEditable(false);
       
       add(Nombre);
       add(new JLabel(""));
       add(txtNombre);
       add(new JLabel(""));
       add(new JLabel(""));
       add(new JLabel(""));
       
       add(Tipo);
       add(new JLabel(""));
       add(txtTipo);
       add(new JLabel(""));
       add(new JLabel(""));
       add(new JLabel(""));
         
       add(Ubicacion);
       add(new JLabel(""));
       add(txtUbicacion);
       add(new JLabel(""));
       add(new JLabel(""));
       add(new JLabel(""));
       
       add(Casillero);
       add(new JLabel(""));
       add(txtCasillero);
       
        //        cierre=new JButton("He terminado");
        //        add(new JLabel(""));
        //        add(cierre);
        //        add(new JLabel(""));
        //        cierre.addActionListener(this);
    }
    
        //     public void actionPerformed(ActionEvent a) {
        //         if(a.getSource() == cierre) {
        //             System.exit(0);
        //         }
        //     }
    
    public String getNombre()
    {
       return txtNombre.getText();
    }
    
    public void setNombre(String nombre)
    {
        txtNombre.setText(nombre);
    }
    
    public void setTipo(String tipo)
    {
        txtTipo.setText(tipo);
    }
    
    public void setUbicacion(String ubicacion)
    {
        txtUbicacion.setText(ubicacion);
    }
    
    public void setCasillero(String casillero)
    {
        txtCasillero.setText(casillero);
    }
}
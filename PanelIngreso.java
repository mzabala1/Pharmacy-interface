import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Creo la interfaz de ingreso.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class PanelIngreso extends JPanel implements ActionListener
{
   private InterfazLogin principal;
   private JLabel labUsuario;
   private JLabel labPass;
   private JTextField txtUsuario;
   private JPasswordField pwfPass;
   private JButton butIngresar;
   private String Ingresar = "Ingresar";

   public PanelIngreso(InterfazLogin principal)
   {
       this.principal = principal;
       setLayout (new GridLayout(4,2)); 
       setPreferredSize(new Dimension(0,105));
       
        //        TitledBorder border = BorderFactory.createTitledBorder("Inicio de sesion");
        //        border.setTitleColor(Color.BLACK);
        //        setBorder(border);
       
       labUsuario = new JLabel("Usuario:");
       labPass = new JLabel("Contraseña:");
       
       txtUsuario = new JTextField();
       pwfPass = new JPasswordField();
       
       butIngresar = new JButton("Ingresar");
       butIngresar.setActionCommand(Ingresar);
       butIngresar.addActionListener(this);
       
       add(labUsuario);
       add(txtUsuario);
       add(labPass);
       add(pwfPass);
       add(new JLabel(" "));
       add(new JLabel(" "));
       add(new JLabel(" "));
       add(butIngresar);
   }
  
   public String getUsuario()
   {
     return txtUsuario.getText();
   }
   
   public String getContraseña()
   {
     String pass = new String(pwfPass.getPassword());
     return pass;
   }
   
   public void actionPerformed(ActionEvent a)
   {
     String comando = a.getActionCommand();
     if(comando.equals(Ingresar))
     {
       principal.validacion();
     }
   }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.awt.event.ActionListener; 
import javax.swing.*;
import javax.swing.border.*;
/**
 * Creo la interfaz de inicio de sesion que lleva directamente al main si el login es correcto.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class InterfazLogin extends JFrame
{
    private PanelIngreso panIng;
    
    public InterfazLogin()
    {
       setTitle("MB-Farmacia");
       setSize(250,150);
       setResizable(false);
       setDefaultCloseOperation( EXIT_ON_CLOSE );
       setLayout(new BorderLayout());
       
       panIng = new PanelIngreso(this);
       add(panIng, BorderLayout.SOUTH);
    }

    public void validacion()
    { 
        String[] usuario = {"Administrador", "Manuel", "Daniela", "David", "Maria"};
        String contraseña = "farm1";
        String user = panIng.getUsuario();
        String pass = panIng.getContraseña();
        boolean encontrado = false;
        
        for(int i=0;i<usuario.length;i++)
        {
          if(user.equals(usuario[i]) && pass.equals(contraseña))
          {
             encontrado = true;
          }
        }
        
        if(encontrado == true)
        {
           InterfazFarmacia interfaz = new InterfazFarmacia();
           interfaz.setVisible(true);
           dispose();
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Te has equivocaste", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }
    } 
   
    public static void main(String[] args)
    {
        InterfazLogin interfaz = new InterfazLogin();
        interfaz.setVisible(true);
    } 
}
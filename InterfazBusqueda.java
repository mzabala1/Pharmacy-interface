import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Creo una interfaz que tenga un textfield donde pueda escribir el medicamento 
 * que deseo buscar y un boton que me permita encontrarlo. 
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class InterfazBusqueda extends JPanel
{
   private InterfazFarmacia main;
   private JLabel lblMedicamento;
   private JTextField txtMedicamento;
   private JButton butBuscar;
   private Farmacia farm;
   
   public InterfazBusqueda(InterfazFarmacia main1)
   {
     main = main1;
     farm = new Farmacia();
     
     setLayout(new GridLayout(3,3)); 
     setPreferredSize(new Dimension(0,100));
     TitledBorder border = BorderFactory.createTitledBorder("Buscar Medicamento:");
     border.setTitleColor(Color.BLACK);
     setBorder(border);
     lblMedicamento = new JLabel("Ingrese el medicamento:");
     txtMedicamento = new JTextField();
     
     butBuscar = new JButton("Buscar");
     butBuscar.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent a)
       {
           if (a.getSource()== butBuscar) {
            String txtDeMed = txtMedicamento.getText();
            Medicamento[] array = farm.getMedicamentos();
            boolean encontrado = false;
            main.mostrarNombre();
            for(int i = 0; i<array.length; i++)
            {
                if(txtDeMed.equals(array[i].getNombre())){
                    encontrado = true;
                } 
            }
            
            if(encontrado == true)
            {
                //                 JOptionPane.showMessageDialog(null, txtDeMed + " fue encontrado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, txtDeMed + " no fue encontrado.", "Información", JOptionPane.WARNING_MESSAGE);
            } 
          }
         }
     });
     
     add(lblMedicamento);
     add(new JLabel(""));
     add(txtMedicamento);
     add(butBuscar);
     add(new JLabel(""));
     add(new JLabel(""));
   }
   
   public String getMedicamento()
   {
       return txtMedicamento.getText();
   }
}
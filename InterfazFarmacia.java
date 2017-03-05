import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.Container.*;
import java.util.ArrayList;
/**
 * Creo una interfaz general, que use las demas clases y las ordene.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class InterfazFarmacia extends JFrame
{
    private InterfazMedicamentos interfazMed;
    private InterfazImagen interfazImg;
    private InterfazBusqueda interfazBus;

    public InterfazFarmacia()
    {
       setTitle("Medical Bionic - Farmacia");
       setLayout(new GridLayout(3,1)); 
       setSize(480, 495);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setPreferredSize(new Dimension(468,500));
       setResizable(false);
       
       TitledBorder border = BorderFactory.createTitledBorder("Medical Bionic - Farmacia");
       border.setTitleColor(Color.BLACK);

       interfazImg = new InterfazImagen();
       add(interfazImg,BorderLayout.SOUTH);
       
       interfazBus = new InterfazBusqueda(this);
       add(interfazBus,BorderLayout.CENTER);
                
       interfazMed = new InterfazMedicamentos(this);
       add(interfazMed,BorderLayout.SOUTH);
    }
    
    public static void main(String[]args)
    {
        InterfazFarmacia interfaz = new InterfazFarmacia();
        interfaz.setVisible(true);
    }
    
    public Medicamento[] llamadaMedicamento()
    {
      Farmacia farmacia = new Farmacia();
      Medicamento[] array = farmacia.getMedicamentos();
      return array;
    } 
    
    public void mostrarNombre()
    {
      Medicamento[] array = llamadaMedicamento();
     
      if(interfazBus.getMedicamento().equals("") || interfazBus.getMedicamento().equals(" "))
      {
         JOptionPane.showMessageDialog(null, "Campo vacio o incorrecto");
      }
      else
      {
        for(int i=0;i<array.length;i++){
          if(interfazBus.getMedicamento().equals(array[i].getNombre()))
          {
            String nombre = array[i].getNombre();
            interfazMed.setNombre(nombre);
            String tipo = array[i].getTipo();
            interfazMed.setTipo(tipo);
            String ubicacion = array[i].getUbicacion();
            interfazMed.setUbicacion(ubicacion);
            String casillero = array[i].getCasillero();
            interfazMed.setCasillero(casillero);
          }
        }
      }
    }
}
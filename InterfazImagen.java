import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Image;
/**
 * Pondré una imagen con el logotipo de la farmacia.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class InterfazImagen extends JPanel
{
    public InterfazImagen()
    {
       setLayout(new GridLayout(1,1)); 
       setPreferredSize(new Dimension(500,83));
    }

    public void paint(Graphics grafico)
    {
      Dimension height = getSize();
      ImageIcon Img = new ImageIcon(getClass().getResource("/Imgs/img1.jpg"));                                 
      grafico.drawImage(Img.getImage(), 0, 20, 470, 400, null);
      
      setOpaque(false);
      super.paintComponent(grafico);
    }
}
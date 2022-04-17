import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
// color listener to change the colors randomly
public class ColorListener implements ActionListener
{
  private JLabel label1;
  // constructor
  public ColorListener(JLabel label)
  {
    label1 = label;  
  }
  // action event to change color of label
  @Override
  public void actionPerformed(ActionEvent e)
    {
      int red = (int)(Math.random()* 256);
      int green = (int)(Math.random()* 256);
      int blue = (int)(Math.random()* 256);
      Color random = new Color(red, green, blue);
      label1.setForeground(random);
    }


}
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
// panel class 
public class ColorTextPanel extends JPanel
{
  // timer 
  private Timer timer;
  // constructor for the panel
  public ColorTextPanel()
  {
    this.setBackground(Color.yellow);
    this.setPreferredSize(new Dimension(120,100));
    // label that changes colors
    JLabel label = new JLabel("Go Owls!");
    // button
    JButton button =  new JButton();
    // setting it to Start
    button.setText("Start");
    ColorListener listener = new ColorListener(label);
    // timer w/ color listener
    timer = new Timer(500, listener);
    // Button listener to start the timer with changing button(start,stop)
    button.addActionListener(new ActionListener() {             
    @Override
    public void actionPerformed(ActionEvent e) {
      JButton btn = (JButton)e.getSource();
      String text = btn.getText();
      System.out.println(text);
      if(text.equals("Start"))
      {
        if(!timer.isRunning())
        {
         timer.start();
         btn.setText("Stop"); 
        }
      }
      else
      {
        if(timer.isRunning())
        {
          timer.stop();
          btn.setText("Start");
        }
      }
        
    }
 
});
    this.add(label);
    this.add(button);
  }
}
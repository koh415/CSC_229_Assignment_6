import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

// clas for the app
public class App extends JFrame
{
  // app constructor
  public App()
  {
    super();
    ColorTextPanel panel = new ColorTextPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    this.add(panel);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
  }
}
package view;
import java.awt.Dimension; 
import javax.swing.JFrame;
 
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame {

  public Window() {
    this.setTitle("Casse brique");
    this.setSize(300, 300);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //this.setLocationRelativeTo(null);
    
    this.setVisible(true);
  }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class javaGUI {
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	
	
	
	public javaGUI() {
		
		gui();
	}
	
	public void gui(){
		f = new JFrame("Creativity");
		f.setVisible(true);
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		p = new JPanel();
		Color myColor = new Color(200,220,240);
		p.setBackground(myColor);
		
		b1 = new JButton("Action listener");
		p.add(b1);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Its working");
			}
		});
		//lab = new JLabel("This is test");
		
		
		//p.add(lab);
		
		f.add(p);
	}
	

	
	public static void main(String args[]){
		new javaGUI();
	}
}
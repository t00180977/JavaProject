//gui.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;

public class gui extends JFrame {
	JMenu FileMenu, MainMenu;
	JTextField nameField;
        JTextField snameField;
        JTextField dobField;
        JTextField addressField;
        JTextField phoneField;
	ArrayList<String> Destinations = new ArrayList<String>();
	
	public static void main( String[] args ) {
       
        gui frame = new gui();
		frame.setVisible(true);
		FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        
        
        
    }
    
     
	public void gui(){
		//set the frame default properties
		
		/*JTextField nameField;
        JTextField snameField;
        JTextField dobField;
        JTextField addressField;
        JTextField phoneField;*/
        
        
		setTitle("My window");
		setSize(300,200);
		setLocation(150,250);
		Container pane = getContentPane();
		Color myColor = new Color(200,220,240);
        pane.setBackground(myColor);
        pane.add(nameField);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	
	}

}
        
        
        
        /*newSystem();
        //set the frame default properties
        setTitle("Book a flight");
	    setSize(300,200);
	    setLocation(150,250);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane = getContentPane();
      //  pane.setBackground(Color.blue);
        pane.setBackground(new Color(240,210,240));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        createFileMenu();
        createMainMenu();
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(FileMenu);
        menuBar.add(MainMenu);

    }
    
    public void newSystem() {
      	Destionations = new ArrayList<String>();
        }
}*/
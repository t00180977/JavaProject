import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import javax.imageio.*;


public class mainGUI extends JFrame{
	
	private JFrame f;
	private JButton b1;
	private JButton b2;
	private JMenu file;
	private JMenu flight;
	private JPanel p;
	private JMenuBar mb;
	private JLabel lab;
	
	public mainGUI(){
		gui();
	}
	
    
	
	public void gui(){
		
		f = new JFrame("Main menu");
		f.setVisible(true);
		f.setSize(600,600);
		setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		p = new JPanel();
		Color myColor = new Color(200,220,240);
		p.setBackground(myColor);
		
		mb = new JMenuBar();
		flight = new JMenu("Flight");
		mb.add(flight);
		JMenuItem add = new JMenuItem("Add flight");
		flight.add(add);
		JMenuItem remove = new JMenuItem("Remove flight");
		flight.add(remove);
		JMenuItem update = new JMenuItem("Update flight");
		flight.add(update);
		JMenuItem book = new JMenuItem("Book flight");
		flight.add(book);
		JMenuItem saveFlight = new JMenuItem("Save flight");
		flight.add(saveFlight);
		
		
		file = new JMenu("File");
		mb.add(file);
		JMenuItem save = new JMenuItem("Save");
		file.add(save);
		JMenuItem exitPro = new JMenuItem("Exit");
		file.add(exitPro);
		
		//image
		/*
		try{
			f.setConentPane(new JLabel( ImageIcon(ImageIO.read(plane.PNG))));
		}
		
		catch(IOException e){
			JOptionPane.showMessageDialog(null,"Image does not exsist");
		}
		
		f.setResizable(false);
		f.pack();
		f.setVisible(true);*/
		
		JLabel lab = new JLabel();
		lab.setIcon(new ImageIcon("plane.PNG"));
		p.add(lab);
		
		validate();
		
		//JMenuItem
		
		f.setJMenuBar(mb);
		
		//exit 
		class exitaction implements ActionListener{
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		}
		
		exitPro.addActionListener(new exitaction());
		
		class addBooking implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String forename, surname,addressStreet, addressTown,addressCounty, addressCountry, DOB, PhoneNo, email;
				ArrayList <String> Destinations = new ArrayList<String>();
				person P1 = new person();
				
		forename = JOptionPane.showInputDialog("Please enter your first name: ");
		surname = JOptionPane.showInputDialog("Please enter your surname: ");
		addressStreet = JOptionPane.showInputDialog("Please enter the name of your street: ");
		addressTown = JOptionPane.showInputDialog("Please enter the name of your town: ");
		addressCounty = JOptionPane.showInputDialog("Please enter your county: ");
		addressCountry = JOptionPane.showInputDialog("Please enter your country: ");
		DOB = JOptionPane.showInputDialog("Please enter your date of birth: ");
		PhoneNo = JOptionPane.showInputDialog("Please enter your phone Number: ");
		email = JOptionPane.showInputDialog("Please enter your email: ");
		
		P1.setForename(forename);
		P1.setSurname(surname);
		P1.setAddressStreet(addressStreet);
		P1.setAddressTown(addressTown);
		P1.setAddressCounty(addressCounty);
		P1.setAddressCountry(addressCountry);
		P1.setDOB(DOB);
		P1.setPhoneNo(PhoneNo);
		P1.setEmail(email);
		
		JOptionPane.showMessageDialog(null,P1.toString());
			}
		}
		
		add.addActionListener(new addBooking());
		
		/*b1 = new JButton("Ok");
		p.add(b1);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Its working");
			}
		});
		b2 = new JButton("Quit");
		p.add(b2);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				JOptionPane.showMessageDialog(null, "Its defo working");
			}
		});*/
		
		f.add(p);

}
public static void main(String args[]){
		new mainGUI();
		
		String forename, surname, address, DOB, PhoneNo, email;
		
		Flight F1 = new Flight();
		
	}
}
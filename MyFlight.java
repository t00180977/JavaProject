import javax.swing.*;

public class MyFlight{
	public static void main(String args[]){
		String forename, surname, address, DOB, PhoneNo, email;
		
		
		Flight F1 = new Flight();
		
		forename = JOptionPane.showInputDialog("Please enter your first name: ");
		surname = JOptionPane.showInputDialog("Please enter your surname: ");
		address = JOptionPane.showInputDialog("Please enter your address: ");
		DOB = JOptionPane.showInputDialog("Please enter your date of birth: ");
		PhoneNo = JOptionPane.showInputDialog("Please enter your phone Number: ");
		email = JOptionPane.showInputDialog("Please enter your email: ");
		
		F1.setForename(forename);
		F1.setSurname(surname);
		F1.setAddress(address);
		F1.setDOB(DOB);
		F1.setPhoneNo(PhoneNo);
		F1.setEmail(email);
		
		
		JOptionPane.showMessageDialog(null,F1.toString());
	}
}
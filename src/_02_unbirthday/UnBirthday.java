package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
String birthday=JOptionPane.showInputDialog("When is your birthday?");	
if(birthday.equals("8/24/19")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday.");
}
else {
	JOptionPane.showMessageDialog(null, "Happy UnBirthday.");
}
}
}

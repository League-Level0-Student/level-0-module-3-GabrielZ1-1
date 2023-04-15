package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String q1 = JOptionPane.showInputDialog("ARE YOU HAPPY?");

		if(q1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU ARE DOING.");	

			System.exit(0);


		}
		else if(q1.equalsIgnoreCase("no")) {
			String q2 = JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY?");

			if(q2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING.");
				System.exit(0);

			}


			else if(q2.equalsIgnoreCase("no")){
				JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU ARE DOING.");
				System.exit(0);

			}





		}

	}
}

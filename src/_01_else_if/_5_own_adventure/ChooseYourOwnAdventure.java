package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {

		String q1 =	JOptionPane.showInputDialog("Once upon a time, there was a man who wanted to cross a lake. There were piranha's in this lake, waiting for prey to feast on. Should the man swim across the lake?");

		if (q1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "The man jumped in the lake and was quickly eaten by the piranhas. The end.");


		}
		else if(q1.equalsIgnoreCase("no")) {
			String q2 = JOptionPane.showInputDialog("The man went around the lake and found a wooden bridge to cross. The bridge led into a jungle with a canyon just ahead. There is a mysterious fruit on a tree near the cliff, should he check it out?");

			if (q2.equalsIgnoreCase("yes")){
				JOptionPane.showInputDialog("The man slipped on a rock and fell down a cliff, falling on his head. The end.");

			}
			else if(q2.equalsIgnoreCase("no")) {
				String q3 = JOptionPane.showInputDialog("The man decided not to risk it and found a suspicious-looking temple far ahead, should he go inside?");

				if(q3.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "The man carefully entered the temple and found a ton of gold which he brought back home! The end.");

				}

				else if (q3.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "The man decided not to go in the temple, but it was too late and the traps around the temple had killed him. The end");

				}

			}


		}










	}
}

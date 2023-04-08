
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;



public class RobotColorChooser {
	public static void main(String[] args) {



		Random ran = new Random();

		//1. Create a new Robot

		Robot rob = new Robot();

		//2. Make the robot draw a shape (this will take more than one line of code)

		//done below

		//3. Set the pen width to 10
		rob.setPenWidth(10);


		rob.setSpeed(40);

		for(;;) {

			//4. Ask the user what color pen they would like the robot to draw with

			String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with? (red, orange, yellow, green, blue, or purple)");

			//5. Use an if/else statement to set the pen color that the user requested

			if(color.equals("red")) {
				rob.setPenColor(255,0,0);	
			}
			else if(color.equals("orange")) {
				rob.setPenColor(255, 165, 0);	

			}
			else if(color.equals("yellow")) {
				rob.setPenColor(255, 255, 0);	

			}
			else if(color.equals("green")) {
				rob.setPenColor(0, 255, 0);	

			}
			else if(color.equals("blue")) {
				rob.setPenColor(0, 0, 255);	

			}
			else if(color.equals("purple")) {
				rob.setPenColor(255, 0, 255);	

			}

			//6. If the user doesn't enter anything, choose a random color

			else {
				rob.setRandomPenColor();	


			}

			rob.penDown();

			rob.setAngle(45);
			rob.move(200);
			rob.setAngle(135);
			rob.move(200);
			rob.setAngle(270);
			rob.move(283);

			rob.penUp();


			//this is to move the robot to a random position after drawing the triangle
			int randomAngle = ran.nextInt(360-1+1) + 1; //angle is a number between 1-360
			rob.setAngle(randomAngle);
			rob.move(100);


		}


		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them






	}
}

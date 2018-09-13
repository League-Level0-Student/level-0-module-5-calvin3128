import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

		String dimestring = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimenum = Integer.parseInt(dimestring);

		// Tell them how many cents they have (hint multiply by 10)

		JOptionPane.showMessageDialog(null, "you have " + (dimenum * 10) + " cents.");

		// Ask the user how tall they are (inches)
		String tallstring = JOptionPane.showInputDialog("How tall are you (in inches)?");
		int tallnum = Integer.parseInt(tallstring);

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (tallnum < 36) {
			JOptionPane.showMessageDialog(null, "tell them to eat their Wheaties");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 0; i < 90;) {
			i = i + 3;
			System.out.println(i);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console

		Random rand = new Random();
		int rand20 = rand.nextInt(20);
		System.out.println(rand20);

		// Get another random number that is less than 10 and print it to the console

		int rand10 = rand.nextInt(10);
		System.out.println(rand10);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, (rand20 - rand10));

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equalsIgnoreCase("san diego")) {
			JOptionPane.showMessageDialog(null, "You live in america's finest city");
		} else {
			JOptionPane.showMessageDialog(null, "move to san diego");
		}
		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String carstring = JOptionPane.showInputDialog("How many cars do you have?");
		// If there is 1 car, use a pop-up to display the make/model of the car
		if (Integer.parseInt(carstring) == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		} else if (Integer.parseInt(carstring) == 1) {
			JOptionPane.showMessageDialog(null, "your car is a 2004 civic");
		} else if (Integer.parseInt(carstring) > 1) {
			JOptionPane.showMessageDialog(null,
					"Your cars have " + (Integer.parseInt(carstring) * 4) + " wheels between them.");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}

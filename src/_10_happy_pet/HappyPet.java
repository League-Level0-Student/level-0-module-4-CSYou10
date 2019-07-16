package _10_happy_pet;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 100; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			if (happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "You love you pet!");
				break;
			}
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Happy Pet",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "feed", "pet", "walk" }, null);
			
			
			// 5. Use user input to call the appropriate method created in step 4.
			
			 if (task == 1) {
				PetPet();
			}else if (task == 2) {                                                             
				WalkPet();
			
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			
			}else if (task == 0) {
				FeedPet();
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	private static void FeedPet() {
		Random random = new Random();
		int FIncrease = random.nextInt(15);
		JOptionPane.showMessageDialog(null, "Your pet's happiness has increased by " + FIncrease);
		happinessLevel += FIncrease;
		JOptionPane.showMessageDialog(null, "Your pets happiness is " + happinessLevel);
	}

	private static void PetPet() {
		Random random = new Random();
		int FIncrease = random.nextInt(15);
		JOptionPane.showMessageDialog(null, "Your pet's happiness has increased by " + FIncrease);
		happinessLevel += FIncrease;
		JOptionPane.showMessageDialog(null, "Your pets happiness is " + happinessLevel);
	}

	private static void WalkPet() {
		Random random = new Random();
		int FIncrease = random.nextInt(15);
		JOptionPane.showMessageDialog(null, "Your pet's happiness has increased by " + FIncrease);
		happinessLevel += FIncrease;
		JOptionPane.showMessageDialog(null, "Your pets happiness is " + happinessLevel);
	}
}
package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet myVirtualPet = new VirtualPet(100, 100, 100);

		System.out.println("Hello, my name is Georgie the Giraffe! I love eating, sleeping and playing!");
		System.out.println();

		System.out.println("My hunger level is " + myVirtualPet.getHunger());
		System.out.println("My boredom level is " + myVirtualPet.getActivity());
		System.out.println("My sleepiness level is " + myVirtualPet.getTired());
		System.out.println();
		System.out.println("The closer each level is to 0 the happier I will be...and the more I will love you!!");

		String choice;

		do {
			System.out.println("What are we going to do today?! Choose from the menu.");
			System.out.println("1 - Tree Leaves (eat)");
			System.out.println("2 - Run (play)");
			System.out.println("3 - Zzz (sleep)");
			System.out.println("4 - I'm happy (do nothing)");
			System.out.println("5 - Goodbye! (exit)");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("I'm hungry, feed me! ");
				myVirtualPet.feed(50);

			} else if (choice.equals("2")) {
				System.out.println("I'm bored, play with me!");
				myVirtualPet.activity(50);  
				
			} else if (choice.equals("3")) {
				System.out.println("I'm tired, put me to bed!");
				myVirtualPet.tired100(); 
				
			} else if (choice.equals("4")) {
				System.out.println("I'm happy! I love you!");

			} else {
				System.out.println(("Goodbye! I'll miss you!"));
			}
			
			System.out.println("My hunger level is " + myVirtualPet.getHunger());
			System.out.println("My boredom level is " + myVirtualPet.getActivity());
			System.out.println("My sleepiness level is " + myVirtualPet.getTired());

		} while (!choice.equals("5"));
	}

}
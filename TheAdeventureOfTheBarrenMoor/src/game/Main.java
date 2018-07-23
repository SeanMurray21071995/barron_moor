package game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>LocationDescriptions = new ArrayList();
		LocationDescriptions.add("Its is Dark and the trees are dead");
		LocationDescriptions.add("There is a tree in teh middle of the path");
		LocationDescriptions.add("Thre is a wooden bridge going accross the water");
		
		ArrayList<String>EventDescription = new ArrayList();
		EventDescription.add("There is a Gold Coin on the ground");
		EventDescription.add("You have found a chest"); 
		
		Swamp TheSwamp = new Swamp(EventDescription,LocationDescriptions);

	}

}

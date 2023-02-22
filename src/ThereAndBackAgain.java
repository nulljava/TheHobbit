import java.util.ArrayList;
import java.util.Iterator;

public class ThereAndBackAgain 
{

	public static void main(String[] args) 
	{
		
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		
		// Create a traveling party called party1 by creating an array of Travelers 
		// and filling it with frodo, sam, and gimli
		// Then, use a loop to make all travelers go a distance of 50 miles  
		// Then, for each Traveler in the travelingParty, print their name and how far they've
		//    traveled in miles.  (In the next piece, you'll do this in methods, but 
		//    for a first pass, just do it in main and print to the console.)
		// Expected output:  Frodo has traveled 50 miles.
		//                   Sam has traveled 50 miles.
		//                   Gimli has traveled 50 miles.
		
		Traveler[] party1 = {frodo, sam, gimli};
		
		for(int i = 0; i<party1.length; i++) {
			party1[1].travel(50);
			System.out.println(party1[i].getName() + " has traveled " + party1[i].getDistanceTraveled() + " miles.");
			System.out.println();
		}
		
		System.out.println("PART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin",
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};
		
		ArrayList<Traveler> party2 = new ArrayList<>();
		Hobbit bilbo = new Hobbit("Bilbo");
		Wizard gandalf = new Wizard("Gandalf", "grey");
		party2.add(bilbo);
		party2.add(gandalf);
		
		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		// Make a new Hobbit called "Bilbo" and add him to party2

		// Make a new Wizard called "Gandalf" and add him to party2.
		
		createParty(dwarfNames, party2);
		//write createParty
		// Call the createParty method and pass it, party2, and the dwarfNames array.

		// create party should add all the new dwarves to party2,
		
		for (int i = 0; i<party2.size()-1; i++) {
			System.out.print(party2.get(i).getName() + ", ");
		}
		
		System.out.println();
		
		allTravel(party2, 100);
		//Write allTravel
		// Finally, call the allTravel method passing it party2 and 100 (representing
		// the 100 miles that party2 has traveled together.
		
		//Make sure your code prints out the name and distances party2 has traveled.
		
		for (int i = 0; i<
				party2.size()-1; i++) {
			System.out.print(party2.get(i).getDistanceTraveled() + ", ");
		}
		
	}
	
	public static void createParty(String[] extName, ArrayList<Traveler> liName){
		for(int i = 0; i<extName.length-1; i++) {
			Dwarf newDwarf = new Dwarf(extName[i]);
			liName.add(newDwarf);
		}
	}
	
	public static void allTravel(ArrayList<Traveler> liName, int miles) {
		for(int i = 0; i<liName.size()-1; i++) {
			liName.get(i).travel(miles);
		}
	}
	
}

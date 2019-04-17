import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class GameEnvironment {
	
	// initialize
	private int numDays;
	private int numPieces;
	private int numPlanets;
	private int currentDay = 1;
	private int crewSize;
	
	private ArrayList<String> crewTypes;
	
	private Crew crew;
	private Outpost outpost;
	
	public void initTypes() {
		crewTypes.add("Cyborg");
		crewTypes.add("Mechanic");
		crewTypes.add("Scout");
		crewTypes.add("Haggler");
		crewTypes.add("Medic");
		crewTypes.add("Pilot");
	}

	
	// getters
	public int getDays() {
		return numDays;
	}

	public int getPieces() {
		return numPieces;
	}
	
	public int getPlanets() {
		return numPlanets;
	}
	
	public int getCurrentDay() {
		return currentDay;
	}
	
	public ArrayList<String> getTypes() {
		return crewTypes;
	}
	
	public int getCrewSize() {
		return crewSize;
	}
	
	public Crew getCrew() {
		return crew;
	}
	
	public Outpost viewOutpost() {
		return outpost;
	}
	

	// setters
	public void setDays(int days) {
		numDays = days;
	}
	
	public void setPieces() {
		numPieces = Math.round(numDays * (2 / 3));
	}
	
	public void setCrewSize(int size) {
		crewSize = size;
	}
	
//	public void setCrew(String name) {
//		crew.Crew(name, crewSize);
//	}
	
//	public void addMember(String name, String type) {
//		CrewMember member = new CrewMember(name, type);
//		
//		crew.addMember(member);
//	}
	
	
	
	// game mechanics
	public void nextDay() {
		currentDay += 1;
		/* if (currentDay == numDays) {
		 * 		game.endGame();
		 */
	}
	
	
	// JUST FOUND OUT THAT WE CAN'T DO THESE ACTIONS TO CHANGE THE VALUES IN A LIST
	// WE NEED TO DO THE ARITHMETIC OPERATIONS INSIDE THEIR RESPECTIVE CLASSES
	
//	public void buyFood() {
//		int money = crew.currentMoney();
//		crew.addFood(outpost.buyFood(0));
//	}
	
	public void buyMedKit() {
		int money = crew.currentMoney();
		MedKit itemToBuy = outpost.buyMedKit(0);
		if (money >= itemToBuy.getCost()) {
			crew.addMedKit(itemToBuy);
			crew.decreaseMoney(itemToBuy.getCost());
		}
		else {
			System.out.println("Not enough money!");
		}
	}
	
	public void feedMember(int index, int quality) {
		crew.getMembers().get(index).eatFood(quality);
	}
	
	public void healMember(int index, int quality) {
		crew.getMembers().get(index).healSelf(quality);
	}
	
	public void increaseShieldLevel(int index) {
		crew.repairShields(index);
	}
	
	// SPACE FOR GUI CLASSES
	
	/*public void launchMenuScreen() {
	*	MenuScreen menuScreen = new MenuScreen(this);
	*
	* ^ this acts kinda like inheritance, where MenuScreen can initialize
 	* all the necessary variables, such as days, crew size, and crew members
 	* 
	*/
	
	public void endGame() {
		// GameOverScreen endScreen = new GameOverScreen(this);
		// (need to somehow calculate a score?)
	}
	
	
	
	
//	public static void main(String[] args) {
//		GameEnvironment game = new GameEnvironment();
//		game.initTypes();
//		System.out.println("Welcome! Create your crew.");
//		System.out.println(game.getTypes());
//		Scanner prompt = new Scanner(System.in);
//		System.out.println(prompt.nextLine());
////		 game.launchMenuScreen();
//		
//	}
	
}

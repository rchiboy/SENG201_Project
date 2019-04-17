import java.util.ArrayList;
import java.util.Arrays;


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
	
	public void setCrew(String name) {
		crew.Crew(name, crewSize);
	}
	
	public void addMember(CrewMember member) {
		crew.getMembers().add(member);
	}
	
	
	// game mechanics
	public void nextDay() {
		currentDay += 1;
		/* if (currentDay == numDays) {
		 * 		game.endGame();
		 */
	}
	
	public void feedMember(int index, int quality) {
		crew.getMembers().get(index).eatFood(quality);
	}
	
	public void healMember(int index, int quality) {
		crew.getMembers().get(index).healSelf(quality);
	}
	
	public void increaseShieldLevel() {
		CrewMember member = crew.getMembers().get(index);
		int bonus = 0;
		if (member.viewType() == "Mechanic") {
			bonus = 15;
		}
		crew.ship.increaseShields(member.viewRepairValue() + bonus);
		member.repairedShields();
	}
	
	public void endGame() {
		// GameOverScreen endScreen = new GameOverScreen(this);
		// (need to somehow calculate a score?)
	}
	
	// SPACE FOR GUI CLASSES
	
	/*public void launchMenuScreen() {
	*	MenuScreen menuScreen = new MenuScreen(this);
	*
	* ^ this acts kinda like inheritance, where MenuScreen can initialize
 	* all the necessary variables, such as days, crew size, and crew members
 	* 
	*/
	
	
	public static void main(String args[]) {
		GameEnvironment game = new GameEnvironment();
		game.initTypes();
		// game.launchMenuScreen();
		
	}
	
}

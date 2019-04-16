import java.util.ArrayList;
import java.util.Arrays;


public class GameEnvironment {
	
	private int numDays;
	private int numPieces;
	private int numPlanets;
	private int crewSize;
	
	//WILL HAVE TO INSTANTIATE TYPE NAMES
	private String[] crewTypes;
	
	private Crew crew;
	private Outpost outpost;
	
	

	public int getDays() {
		return numDays;
	}

	public int getPieces() {
		return numPieces;
	}
	
	public int getPlanets() {
		return numPlanets;
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
	

	public void setDays(int days) {
		numDays = days;
	}
	
	public void setPieces() {
		numPieces = Math.round(numDays * (2 / 3));
	}
	
	//MIGHT HAVE TO CHANGE THIS?
	public void setPlanets(int planets) {
		numPlanets = numPieces;
	}
	
	public void setCrewSize(int size) {
		crewSize = size;
	}
	
	public void addMember(CrewMember member) {
		crew.getMembers().add(member);
	}
	
	public void feedMember(int index, int quality) {
		crew.getMembers().get(index).eatFood(quality);
	}
	
	public void healMember(int index, int quality) {
		crew.getMembers().get(index).healSelf(quality);
	}
	
	//manual test
	public static void main(String args[]) {
		
		int test = 2 / 3;
		System.out.println("test value: " + test + " rounded value: "
				+ Math.round(test));
		
	}
	
}

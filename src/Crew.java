import java.util.ArrayList;


public class Crew {

	private String crewName;
	private Rocketship crewShip = new Rocketship();
	private ArrayList<CrewMember> crewMembers;
	private ArrayList<MedKit> medkitList;
	private ArrayList<Food> foodList;
	private int money = 200; // is starting money good enough?
	
	// do we need this?
	public Crew(String name) {
		crewName = name;
	}
	
	public String getName() {
		return crewName;
	}
	
	public Rocketship getRocketship() {
		return crewShip;
	}
	
	public ArrayList<CrewMember> getMembers() {
		return crewMembers;
	}
	
	public ArrayList<MedKit> getMedKits() {
		return medkitList;
	}
	
	public ArrayList<Food> getFoods() {
		return foodList;
	}
	
	// we might actually need to implement a class that does the necessary changes
	// for a crew member's attributes, or just do them in here? or CrewMember?
	public int currentMoney() {
		return money;
	}
	
	public Rocketship getShip() {
		return crewShip;
	}
	
	
	// setters
	public void setName(String name) {
		crewName = name;
	}
	
	public void addMember(CrewMember member) {
		if (crewMembers.size() <= 4) {
			crewMembers.add(member);
		}
		else {
			System.out.println("Crew is full! Maximum num. of crew members is 4.");
		}
	}
	
	// Say you bought multiple Small medkits. Should this store the number of
	// small medkits or should we just leave it as an unordered list, where
	// "Small MedKit" appears multiple times?
	// I've currently chosen the latter implementation.
	public void addMedKit(MedKit medkit) {
		medkitList.add(medkit);
	}
	
	public void addFood(Food food) {
		foodList.add(food);
	}
	
	
	// I feel like these two classes are redundant...
	public void increaseMoney(int amount) {
		money += amount;
	}
	
	public void decreaseMoney(int amount) {
		money -= amount;
	}
	
	public void repairShields(int index) {
		CrewMember member = crewMembers.get(index);
		int repairValue = member.viewRepairValue();
		if (member.viewType() == "Mechanic") {
			repairValue += 15;
		}
		boolean canRepair = member.repairedShields();
		if (canRepair) {
			crewShip.repairShields(repairValue);
			crewMembers.set(index, member);
		}
		else {
			System.out.println("Ship not repaired.");
		}
	}
	
	
}

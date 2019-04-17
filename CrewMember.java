

public class CrewMember {

	private int hunger = 0;
	private int tiredness = 0;
	private int health = 100;
	private String type;
	private int numActions = 2;
	private boolean infectState = false;
	private int repairValue = 25;
	private String name;
	
	public CrewMember(String newName, String newType) {
		name = newName;
		type = newType;
		if (newType == "Mechanic") {
			repairValue += 15;
		}
		else{
			health += 100;
		}
//		else if (newType == "Haggler") {
//			// Future implenatation cheaper items in the outpost
//		}
//		else if (newType == "Scavenger") {
//			// Future implementation Higher chance of finding a trasporter/ else double the item found.
//		}
//		else if (newType == "Pilot") {
//			// Lower chance of getting hit by an asteroid belt.
//		}
//		else {
//			// Lower chance of getting hit by an asteroid belt.
//		}
	}
		
	
	
	public int viewHunger() {
		return this.hunger;
	}
	
	public int viewTiredness() {
		return this.tiredness;
	}
	
	public int viewHealth() {
		return this.health;
	}
	
	public String viewType() {
		return type;
	}
	
	public int viewNumActions() {
		return numActions;
	}
	
	public boolean viewInfectState() {
		return infectState;
	}
	
	public boolean eatFood(int quality) {
		boolean result = false;
		if (tiredness < 100) {
			if (numActions > 0) {
				hunger -= quality;
				result = true;
				if (hunger < 0) {
					hunger = 0;
				}
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		} else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
		return result;
	}
	
	public boolean sleep() {
		boolean result = false;
		if (numActions > 0) {
			tiredness = 0;
			result = true;
		} else {
			System.out.println("Sorry can't do this. This member has no more actions left.");
		}
		return result;
	}
	
	public boolean healSelf(int quality) {
		boolean result = false;
		if (tiredness < 100) {
			if (numActions > 0) {
				health += quality;
				result = true;
				if (health > 100) {
					health = 100;
				}
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		} else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
		return result;
	}
	
	public boolean repairedShields() {
		boolean result = false;
		if (tiredness < 100) {
			if (numActions > 0) {
				numActions -= 1;
				result = true;
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		}else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
		return result;
		
	}
	
	public boolean takeDamage(int quality) {
		health -= quality;
		boolean isDead = false;
		if (health < 0) {
			health = 0;
			isDead = true;
			System.out.println("Crew member " + name + " has died from the plague.");
		}
		return isDead;
	}
	
	public void searchPlanet() {
//		if (tiredness < 100) {
//			if (numActions > 0) {
//				numActions -= 1;
//			} else {
//				System.out.println("Sorry can't do this. This member has no more actions remaining.");
//			}
//		} else {
//			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
//		}
	}
	
	public void pilotShip() {
		if (tiredness < 100) {
			if (numActions > 0) {
				numActions -= 1;
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		} else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
	}

//	
//	public static void main(String[] args) {
//		Scanner test = new Scanner(System.in);
//		System.out.println("What is your name?");
//		
//		System.out.println("Hello, " + test.nextLine());
//	}
}

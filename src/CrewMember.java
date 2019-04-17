
public class CrewMember {

	private String name;
	private String type;
	private int hunger = 0;
	private int tiredness = 0;
	private int health = 100;
	private int numActions = 2;
	private boolean infectState = false;
	private int repairValue = 25;
	
	
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
	
	public void eatFood(int quality) {
		if (tiredness < 100) {
			if (numActions > 0) {
				hunger -= quality;
				if (hunger < 0) {
					hunger = 0;
				}
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		} else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
	}
	
	public void sleep() {
		if (numActions > 0) {
			tiredness = 0;
		} else {
			System.out.println("Sorry can't do this. This member has no more actions left.");
		}
	}
	
	public void healSelf(int quality) {
		if (tiredness < 100) {
			if (numActions > 0) {
				health += quality;
				if (health > 100) {
					health = 100;
				}
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		} else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
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
	
	public void repairedShields() {
		if (tiredness < 100) {
			if (numActions > 0) {
				numActions -= 1;
			} else {
				System.out.println("Sorry can't do this. This member has no more actions remaining.");
			}
		}else {
			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
		}
		
	}
	
	public void setRepairValue(int value) {
		repairValue = value;
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
//		if (tiredness < 100) {
//			if (numActions > 0) {
//				numActions -= 1;
//			} else {
//				System.out.println("Sorry can't do this. This member has no more actions remaining.");
//			}
//		} else {
//			System.out.println("Sorry can't do this. This member is tired. Please Sleep");
//		}
//	}
	
}

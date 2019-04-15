
public class Rocketship {

	private int shieldLevel = 100;
	private int partsFound = 0;
	
	public int getShield() {
		return shieldLevel;
	}
	
	public int getParts() {
		return partsFound;
	}
	
	public void repairShields(int amount) {
		shieldLevel += amount;
		if (shieldLevel > 100) {
			shieldLevel = 100;
		}
		System.out.println("Shields have been repaired by " + amount
				+ ". Shield level is now " + shieldLevel);
	}
	
	public void damageShields(int amount) {
		shieldLevel -= amount;
		if (shieldLevel < 100) {
			shieldLevel = 0;
		}
		System.out.println("Shields have been damaged by asteroid belt for " + amount
				+ ". Shield level is now " + shieldLevel);
	}
	
	public static void main(String args[]) {
		
	}
	
}

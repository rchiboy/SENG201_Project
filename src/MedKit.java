
public class MedKit extends Item{
	
	private int healValue;
	private boolean healPlague;
	
	public MedKit(String name, int cost, int _heal, boolean canCure) {
		super(name, cost);
		healValue = _heal;
		healPlague = canCure;
	}
	
	public int getValue() {
		return healValue;
	}
	
	public boolean canCure() {
		return healPlague;
	}

	public static void main(String args[]) {
		
	}

}

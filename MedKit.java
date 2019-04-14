
public class MedKit extends Item{
	
	private int healValue;
	private boolean healPlague;
	
	public MedKit(String name, int cost, int _heal) {
		super(name, cost);
		healValue = _heal;
	}
	
	public int getValue() {
		return healValue;
	}
	
	public boolean canCure() {
		return healPlague;
	}
	
	public void healMember(Crewmember member, int quality) {
		member.healSelf(quality);
	}
	
	

}

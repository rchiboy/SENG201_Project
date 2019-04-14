
public class Food extends Item {
	
	private int foodValue;
	
	public Food(String name, int cost, int _feed) {
		super(name, cost);
		foodValue = _feed;
	}
	
	public int getValue() {
		return foodValue;
	}
	
	public void feedMember(Crewmember member, int quality) {
		member.eatFood(quality);
	}
	
	
}

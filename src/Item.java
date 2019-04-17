
public class Item {

	private int itemCost;
	private String name;
	
	public Item(String _name, int cost) {
		name = _name;
		itemCost = cost;
	}
	
	public void setCost(int newCost) {
		itemCost = newCost;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getCost() {
		return itemCost;
	}
	
	public String getName() {
		return name;
	}
}

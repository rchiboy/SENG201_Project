import java.util.ArrayList;

public class Outpost {

	private ArrayList<MedKit> medkitList;
	private ArrayList<Food> foodList;
	
	public void initItems() {
		MedKit smallMedKit = new MedKit("Small MedKit", 30, 25, false);
		MedKit mediumMedKit = new MedKit("Medium MedKit", 60, 50, false);
		MedKit largeMedKit = new MedKit("Large Medkit", 100, 100, false);
		MedKit antidote = new MedKit("Antidote", 80, 0, true);
		medkitList.add(smallMedKit);
		medkitList.add(mediumMedKit);
		medkitList.add(largeMedKit);
		medkitList.add(antidote);
		
		Food smallMeal = new Food("Small Meal", 15, 20);
		Food mediumMeal = new Food("Medium Meal", 35, 40);
		Food largeMeal = new Food("Large Meal", 50, 60);
		Food buffet = new Food("Buffet", 100, 100);
//		Food boost = new Food("Action Boost", 0, 200);
//		Food energyDrink = new Food("Energy Drink", 10, 50);
		
		foodList.add(smallMeal);
		foodList.add(mediumMeal);
		foodList.add(largeMeal);
		foodList.add(buffet);
		
		//THINKING ABOUT ADDING VARIABLES FOR Food THAT CHECKS IF FOOD IS ABLE TO
		//REPLENISH TIREDNESS LEVEL OR INCREASE NUM OF ACTIONS BY 1
		
//		foodList.add(boost);
//		foodList.add(energyDrink);
	
	}
	
	public ArrayList<MedKit> getMedKit() {
		return medkitList;
	}
	
	public ArrayList<Food> getFood() {
		return foodList;
	}
	
	public Food buyFood(int index) {
		return foodList.get(index);
	}
	
	public MedKit buyMedKit(int index) {
		return medkitList.get(index);
	}
		
	public static void main(String args[]) {
		Outpost outpost = new Outpost();
		outpost.initItems();
		
	}
	
}


public class LocalDough extends Pizza{

	int amount = 50;
	public LocalDough() {
		// TODO Auto-generated constructor stub
		System.out.println("The Price of Local Dough is " + amount);
	}
	
	@Override
	int cost() {
		// TODO Auto-generated method stub
		return amount;
	}

}

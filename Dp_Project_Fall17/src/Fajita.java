
public class Fajita extends Topping{

	int amount = 1500;
	
	public Fajita(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
		System.out.println("The Price of Fajita is " + amount);
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return super.pizza.cost() + amount;
	}
	
}

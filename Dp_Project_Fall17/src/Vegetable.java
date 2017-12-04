
public class Vegetable extends Topping{

	public Vegetable(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
		System.out.println("The Price of Vegetable is 850");
	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return super.pizza.cost() + 850;
	}

}

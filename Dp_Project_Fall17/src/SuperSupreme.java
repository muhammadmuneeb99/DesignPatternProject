
public class SuperSupreme extends Topping{

	public SuperSupreme(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
		System.out.println("The Price of Super Supreme is 1200");
	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return super.pizza.cost()+1200;
	}

}

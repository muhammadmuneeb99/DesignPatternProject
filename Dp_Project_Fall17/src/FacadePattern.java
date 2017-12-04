
public class FacadePattern {

	//Hiding any thing is called Facade
	// Facade is a another Pattern 
	//This is Pizza Maker Class
	
	public void getVegetableFajitaItalian() {
		Pizza pizza = new Fajita(new Vegetable(new ItalianDough()));
		System.out.println( "The total price is " + pizza.cost());
	}
	
	public void getVegetableSuperSupremeItalian() {
		Pizza pizza = new SuperSupreme(new Vegetable(new ItalianDough()));
		System.out.println( "The total price is " + pizza.cost());
	}
	
	public void getFajitaSuperSupremeLocal() {
		Pizza pizza = new SuperSupreme(new Fajita(new LocalDough()));
		System.out.println( "The total price is " + pizza.cost());
	}
	
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu implements IObservable {

	
	String[] itemMenu = new String[]{"Pizza", "CHINESE", "STEAK", "BIRYANI", "DRINKS", "Update new deal arrival"};
	ArrayList<Customer> customers = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void showMenu() {
		for (int i = 0; i < itemMenu.length; i++) {
			System.out.println(i+1 +" )" + itemMenu[i]);
		}
	}
	
	public void showManagerMenu() {
		for (int i = 0; i < itemMenu.length - 2; i++) {
			System.out.println(i+1 +" )" + itemMenu[i]);
		}
	}
	
	List<IFoodItems> foodItems;
	public void selectedChoice(String choice) {
		switch (choice) {
		case "4":
			Biryani biryani = new Biryani();
			foodItems = biryani.biryanilist;
			int count = 1;
			for (IFoodItems iFoodItems : foodItems) {
				System.out.println(count + ")" + iFoodItems);
				count ++;
			}
			System.out.println("Select Option");
			int opt = scanner.nextInt();
			System.out.println(foodItems.get(opt-1).foodName()+"\n"+foodItems.get(opt-1).foodPrice());
			break;
		case "1":
			FacadePattern facadePattern = new FacadePattern();
			int count1 = 1;
			String[] pizzaArr = new String[] {"Vegetable Pizza with Italian Dough","Super Supreme with Italian Dough","Super Supreme Fajita with Local Dough"};
			for (String pizza : pizzaArr) {
				System.out.println(count1 +")"+pizza);
				count1 ++;
			}	
			System.out.println("Select Option");
			int opt1 = scanner.nextInt();
			if (opt1 == 1) {
				facadePattern.getVegetableFajitaItalian();
				break;
			}else if (opt1 == 2) {
				facadePattern.getVegetableSuperSupremeItalian();
				break;
			}else if (opt1== 3) {
				facadePattern.getFajitaSuperSupremeLocal();
				break;
			}
			break;
			
		case "6":
			System.out.println("Enter new Deal");
			Scanner cScanner = new Scanner(System.in);
			String xString = cScanner.nextLine();	
			broadcast(xString);
			break;
			
		case "5":
			IChain chain = new Fanta_Handler();
			IChain chain1 = new SevenUp_Handler();
			IChain chain2 = new Cocacola_Handler();
			
			chain.goToNext_Handler(chain1);
			chain1.goToNext_Handler(chain2);
			
			String[] drink = new String[] {"Fanta","Seven Up","Cocacola"};
			int count2 = 1;
			for (String drinks : drink) {
				System.out.println(count2 + ")" + drinks);
				count2++;
			}
			System.out.println("Select Option");
			int opt2 = scanner.nextInt();
			if (opt2 == 1) {
				Drink_Handler drink_Handler = new Drink_Handler("Fanta");
				chain.getHandler(drink_Handler);
			}else if (opt2 == 2) {
				Drink_Handler drink_Handler = new Drink_Handler("7 Up");
				chain.getHandler(drink_Handler);
			}else if (opt2 == 3) {
				Drink_Handler drink_Handler = new Drink_Handler("Cocacola");
				chain.getHandler(drink_Handler);
			}
			break;
		default:
			break;
		}
	}

	@Override
	public void broadcast(String message) {
		for(Customer c: customers) {
			c.update(message);
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	@Override
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
}

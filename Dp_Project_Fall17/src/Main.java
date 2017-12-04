import java.util.Scanner;

import javax.swing.plaf.synth.SynthInternalFrameUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		System.err.println("Enter User Name : ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.err.println("Enter User Password : ");
		Scanner scanner2 = new Scanner(System.in);
		String password = scanner.nextLine();
		Customer customer;
		if (username.equals("admin")) {
			if (password.equals("12345")) {
				System.out.println("You are Logged In \n");
				while (true) {
					customer = new Customer();
					System.out.println("Enter Customer Name : ");
					Scanner scanner3 = new Scanner(System.in);
					String customerName = scanner.nextLine();
					menu.addCustomer(customer);
					customer.CustomerName = customerName;
					System.out.println("\nCustomer Name : " + customer.CustomerName);
					menu.showMenu();
					System.out.println("\nEnter " + customerName + " Order");
					Scanner scanner4 = new Scanner(System.in);
					String selectedChoice = scanner4.nextLine();
					menu.selectedChoice(selectedChoice);
					if (menu.equals(selectedChoice)) {
						break;
					}
				}
			} else {
				menu.showManagerMenu();
				System.out.println("Enter E to exit");
				Scanner scanner5 = new Scanner(System.in);
				String exit = scanner5.nextLine();
				if (exit.equals("E")) {
					System.out.close();
				}
			}
		}
	}

}

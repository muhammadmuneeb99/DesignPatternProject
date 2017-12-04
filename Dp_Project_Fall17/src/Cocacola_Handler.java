
public class Cocacola_Handler implements IChain{
	IChain chain;
int price=30;
	@Override
	public void goToNext_Handler(IChain next) {
		// TODO Auto-generated method stub
		chain = next;
	}

	@Override
	public void getHandler(Drink_Handler drink_Handler) {
		// TODO Auto-generated method stub
		if (drink_Handler.getHandler() == "Cocacola") {
			System.out.println("CoCa Cola\nPrice : "+price+"\n");

		} else {
			chain.getHandler(drink_Handler);
		}
	}

}

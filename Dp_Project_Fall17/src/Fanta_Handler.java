import java.util.function.Predicate;

public class Fanta_Handler implements IChain{
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
		if (drink_Handler.getHandler() == "Fanta") {
			System.out.println("Fanta\nPrice : " +price +"\n");

		} else {
			chain.getHandler(drink_Handler);
		}
	}

}

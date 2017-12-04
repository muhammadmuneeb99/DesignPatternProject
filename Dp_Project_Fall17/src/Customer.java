


public class Customer implements IObserver {

    public String CustomerName;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

	@Override
	public void update(String message) {
		System.out.println(getCustomerName()+": Alert: "+message);
	}
}

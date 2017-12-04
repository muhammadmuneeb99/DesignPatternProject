
public interface IObservable {
	public void broadcast(String message);
	public void addCustomer(Customer customer);
	public void removeCustomer(Customer customer);
}

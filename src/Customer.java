import java.util.*;

public class Customer extends RandomGen {
	/* -----------------------Fields----------------------- */
	private final String userID;
	private String name;
	private String email;
	private String password;
	private String phoneNum;
	private String address;
	private int age;

	//	This will be implemented in its own function in a future update. Instantiated customer by customer for now.
	public static final List<Customer> customerCollection = new ArrayList<>();

	/* -----------------------Methods----------------------- */

	// NULL Constructor
	public Customer() {
		this.userID = null;
		this.name = null;
		this.email = null;
		this.password = null;
		this.phoneNum = null;
		this.address = null;
		this.age = 0;
	}

	/**
	 * Registers a new customer. Obj of RandomGen(Composition) is used 
	 * to assign a unique ID to the customer
	 * 
	 * @param name		name of customer
	 * @param email		email of customer
	 * @param password	password
	 * @param phone		customer's phone no.
	 * @param address	home address
	 * @param age		customer's age
	 */
	public Customer(String _name, String _email, String _password, String _phone, String _address, int _age) {
		this.userID = randIDGen();
		this.name = _name;
		this.email = _email;
		this.password = _password;
		this.phoneNum = _phone;
		this.address = _address;
		this.age = _age;
	}
}


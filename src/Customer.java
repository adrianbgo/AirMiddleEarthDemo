import java.util.*;

/** Refers to a Customer or Passenger
 * 
 * @author adrian.go
 */
public class Customer extends RandomGen implements CRUD {
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

	/* ---------------------CRUD----------------------- */

	/**
	 * Takes user input for new customer and adds them to app memory.
	 */
	@Override
	public void create () {
		System.out.printf("\n\n\n%60s ************* Welcome to Customer Registration *************", "");

		Scanner read = new Scanner(System.in);
		System.out.print("\nPlease enter your name: \t");
		String name = read.nextLine();

		System.out.print("\nPlease enter your email address: \t");
		String email = read.nextLine();
		while (!isUnique(email)) {
			System.out.println("ERROR::This email already exists.");
			System.out.print("Please enter your email address: \t");
			email = read.nextLine();
		}

		System.out.print("\nPlease enter your password: \t");
		String password = read.nextLine();

		System.out.print("\nPLease enter your phone number: \t");
		String phoneNum = read.nextLine();

		System.out.print("\nPlease enter your age: \t");
		int age = read.nextInt();

		customerCollection.add(new Customer(name, email, password, phoneNum, address, age));
	}
	
	@Override
	public void read(String userID) {
		boolean isFound = false;
		Customer cust = customerCollection.get(0);
		for (Customer c : customerCollection) {
			if (userID.equals(c.getUserID())) {
				System.out.printf("%-50sCustomer Found...\n\n\n", " ");
				displayHeader();
				isFound = true;
				cust = c;
				break;
			}
		}
		if (isFound) {
			System.out.println(cust.toString(1));
            System.out.printf("%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n", "");
		} else {
			System.out.printf("%50sNo Customer with the ID %s Found...\n", " ", userID);
		}
	}

	@Override
	public void update(String userID) {
		boolean isFound = false;
		Customer cust = customerCollection.get(0);
		Scanner read = new Scanner(System.in);
		for (Customer c : customerCollection) {
			if (userID.equals(c.getUserID())) {
				System.out.print("\nEnter trhe new name of the Passenger: \t");
				String name = read.nextLine();
				c.setName(name);
				
				System.out.print("\nEnter the new email of the Passenger: \t");
				String email = read.nextLine();
				c.setEmail(email);
				
				System.out.print("\nEnter the new phone number of the Passenger: \t");
				String phoneNum = read.nextLine();
				c.setPhoneNum(phoneNum);
				
				System.out.print("\nEnter the new address of the Passenger: \t");
				String address = read.nextLine();
				c.setAddress(address);
				
				System.out.print("\nEnter the new age of the Passenger: \t");
				int age = read.nextInt();
				c.setAge(age);
			}
		}
		if (!isFound) {
			System.out.printf("%50sNo Customer with the ID %s Found...\n", " ", userID);
		}
	}

	@Override
	public void delete(String userID) {

	}

	/* ----------------Utilities------------- */

	/**
	 * Displays formatted user ID string
	 * 
	 * @param userID
	 * @return formatted userID string
	 */
	public String randomIdRead(String userID) {
		StringBuilder userString = new StringBuilder();
		for (int i = 0; i < userID.length(); i++) {
			if (i == 3) {
				userString.append(" ").append(userID.charAt(i));
			} else if (i < userID.length()) {
				userString.append(userID.charAt(i));
			}
		}
		return userString.toString();
	}

	/**
	 * Returns String with all User data
	 * @see randomIDDisplay()
	 * 
	 * @param i for serial numbers
	 * @return customer data in String
	 */
	private String toString(int i) {
		return String.format("%10s| %-10d | %-10s | %-32s | %-7s | %-27s | %-35s | %-23s |", "", i, randomIdRead(userID), name, age, email, address, phoneNum);
	}
	
	/**
	 * Takes an email address and determines whether it
	 * is unique.
	 * 
	 * @param emailID is the email address
	 * @return true if unique, otherwise false
	 */
	public boolean isUnique(String emailID) {
		boolean _isUnique = true;
		for (Customer c : customerCollection) {
			if (emailID.equals(c.getEmail())) {
				_isUnique = false;
				break;
			}
		}
		return _isUnique;
	}
	
	/**
	 * Displays visual header
	 */
	void displayHeader() {
        System.out.println();
        System.out.printf("%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n", "");
        System.out.printf("%10s| SerialNum  |   UserID   | Passenger Names                  | Age     | EmailID\t\t       | Home Address\t\t\t     | Phone Number\t       |%n", "");
        System.out.printf("%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n", "");
        System.out.println();
    }
	
	/* -------------- Getters & Setters ------------- */
	public String getName() {
		return name;
	}
	public String getUserID() {
		return userID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}


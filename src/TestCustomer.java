import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Customer Object")
class TestCustomer {
	
	static Customer defCust;
	static Customer undefCust;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		defCust = new Customer("name", "email@email.com", "password", "4444444444", "123 Sesame Street", 25);
		undefCust = new Customer();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test Creation with no arguments")
	void testUndefCustomer() {
		assertAll("Null Customer",
			() -> assertEquals(undefCust.getName(), null, "Non-Null Name"),
			() -> assertEquals(undefCust.getEmail(), null, "Non-Null Email"),
			() -> assertEquals(undefCust.getPassword(), null, "Non-Null Password"),
			() -> assertEquals(undefCust.getPhoneNum(), null, "Non-Null Phone Number"),
			() -> assertEquals(undefCust.getAddress(), null, "Non-Null Address"),
			() -> assertEquals(undefCust.getAge(), 0, "Non-Zero Age")
		);
		
	}

	@Test
	@DisplayName("Test Creation with defined arguments")
	void testDefCustomer() {
		assertAll("Defined Customer",
				() -> assertEquals(defCust.getName(), "name", "Improperly Defined Name"),
				() -> assertEquals(defCust.getEmail(), "email@email.com", "Improperly Defined Email"),
				() -> assertEquals(defCust.getPassword(), "password", "Improperly Defined Password"),
				() -> assertEquals(defCust.getPhoneNum(), "4444444444", "Improperly Defined Phone Number"),
				() -> assertEquals(defCust.getAddress(), "123 Sesame Street", "Improperly Defined Address"),
				() -> assertEquals(defCust.getAge(), 25, "Improperly Defined Age")
		);
	}
	
	/**
	 * TODO Test CRUD Functions
	 */
	@Disabled("Ignored")
	@Test
	void testCreate() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testRead() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testRandomIdRead() {
		fail("Not yet implemented"); // TODO Test RandomIdRead Function
	}

	@Disabled("Ignored")
	@Test
	void testIsUnique() {
		fail("Not yet implemented"); // TODO Test Uniqueness Function
	}

	@Disabled("Ignored")
	@Test
	void testDisplayHeader() {
		fail("Not yet implemented"); // TODO Test Header Display
	}
	
	/**
	 * TODO Test Getters & Setters
	 */
	@Disabled("Ignored")
	@Test
	void testGetName() {
		fail("Not yet implemented"); 
	}

	@Disabled("Ignored")
	@Test
	void testGetUserID() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testGetEmail() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testGetPassword() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testGetPhoneNum() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testGetAddress() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testGetAge() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testSetEmail() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testSetPhoneNum() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testSetAddress() {
		fail("Not yet implemented");
	}

	@Disabled("Ignored")
	@Test
	void testSetAge() {
		fail("Not yet implemented");
	}

}

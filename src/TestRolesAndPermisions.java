import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestRolesAndPermisions extends User{
	static RolesAndPermissions testRAP;
	
	@BeforeAll
	static void setUpBeforeClass() {
		testRAP = new RolesAndPermissions();
		adminUserAndPass[0][0] = "root";
		adminUserAndPass[0][1] = "root";
	}
	
	@Test
	void testIsPrivileged() {
		assertEquals(0, testRAP.isPrivileged("root", "root"), "Admin User Does Not Exist");
		assertEquals(-1, testRAP.isPrivileged("fake", "admin"), "Fake Admin Allowed In");
	}
	
	@Disabled("Not properly implemented yet")
	@Test
	void testIsRegistered() {
		fail("Not yet implemented"); // TODO
	}

}

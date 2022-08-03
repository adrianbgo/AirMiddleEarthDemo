
/**
 * Checks Roles and Permissions of users
 * 
 * @author adrian.go
 */
public class RolesAndPermissions extends User {
	/**
	 * Returns index of admin if user is privileged
	 * 
	 * @param username the user's username
	 * @param password the user's password
	 * @return index of admin array
	 */
	public int isPrivileged(String username, String password) {
		int _privilege = -1;
		for (int i = 0; i < 10; i++) {
			_privilege = (adminUserAndPass[i][0] == username && adminUserAndPass[i][1] == password) ? i : _privilege;
		}
		return _privilege;
	}

	/**
	 * Returns UserID if the user exists
	 * 
	 * @param email    user's email
	 * @param password user's password
	 * @return UID of the user
	 */
	public String isRegistered(String email, String password) {
		String _uid = "0";
		for (Customer c : Customer.customerCollection) {
			if (email.equals(c.getEmail()) && password.equals(c.getPassword())) {
				_uid = "1-" + c.getUserID();
				break;
			}
		}
		return _uid;
	}
}

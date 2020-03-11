package pfriends;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FriendsTest {

	/*
	 * @Test void testFriendsStringString() { Friends friend = new Friends("Cullan",
	 * "Hare"); System.out.println(friend.getFirstName());
	 * System.out.println(friend.getLastName());
	 * System.out.println(friend.getDateEntered()); }
	 */

	@Test
	void testFriendsStringStringIntIntInt() {
		Friends friend = new Friends("Cullan", "Hare",1999,10,2);
		System.out.println(friend.getFirstName());
		System.out.println(friend.getLastName());
		System.out.println(friend.getDateEntered());
		System.out.println(friend.getBirthDate());
	}

	@Test
	void testFriendsStringStringIntIntIntGenderStringStringRelationshipStatus() {
		fail("Not yet implemented");
	}

}

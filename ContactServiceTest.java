package All.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactService cs = new ContactService();
		assert(cs != null);
	}

	@Test
	void testAddAndGet() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop,Leesburg FL";
		
		ContactService cs = new ContactService();
		String UUID = cs.add(firstName, lastName, phoneNumber, address);
		assert(UUID != null);
		
		Contact contact = cs.get(UUID);
		assert(contact != null);
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNumber, contact.getPhoneNumber());
		assertEquals(address, contact.getAddress());
	}

	@Test
	void testRemove() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop, Leesburg FL";
		
		ContactService cs = new ContactService();
		String UUID = cs.add(firstName, lastName, phoneNumber, address);
		assert(UUID != null);
		
		Contact contact = cs.get(UUID);
		assert(contact != null);
		
		cs.remove(UUID);
		assert(cs.get(UUID) == null);
	}

	@Test
	void testSetField() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop, Leesburg FL";
		final String newValue = "ThisIsTen!";
		
		ContactService cs = new ContactService();
		String UUID = cs.add(firstName, lastName, phoneNumber, address);
		assert(UUID != null);
		
		Contact contact = cs.get(UUID);
		assert(contact != null);
		
		cs.setField(UUID, "firstName", newValue);
		assertEquals(newValue, contact.getFirstName());
		
		cs.setField(UUID, "lastName", newValue);
		assertEquals(newValue, contact.getLastName());
		
		cs.setField(UUID, "phoneNumber", newValue);
		assertEquals(newValue, contact.getLastName());
		
		cs.setField(UUID, "address", newValue);
		assertEquals(newValue, contact.getAddress());
	}

}
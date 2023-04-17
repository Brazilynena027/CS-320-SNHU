package All.Service;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class ContactTest {


	@Test
	void testContactStringStringStringString() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop";
		Contact contact = new Contact(firstName,lastName,phoneNumber, address);
		
		equals(contact.getID() != null);
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNumber, contact.getPhoneNumber());
		assertEquals(address, contact.getAddress());
	}
	

	@Test
	void testGetID() {
		Contact contact = new Contact();
		equals(contact.getID() != null);
		equals(contact.getID().length() == 10);
		equals(contact.getID().length()>= 10);
	}

	@Test
	void testGetFirstName() {
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop";
		
		Contact contact = new Contact(null,lastName,phoneNumber, address);
		assert(contact.getFirstName() != null);
		assert(contact.getFirstName().length() <= 10);
		
		contact = new Contact("98765432100",lastName,phoneNumber, address);
		assert(contact.getFirstName() != null);
		assert(contact.getFirstName().length() <= 10);
	}
	

	@Test
	void testGetLastName() {
		final String firstName = "Edwin";
		final String phoneNumber = "3212979196";
		final String address = "2108 Aitkin Loop";
		
		Contact contact = new Contact(firstName, null, phoneNumber, address);
		assert(contact.getLastName() != null);
		assert(contact.getLastName().length() <= 10);
		
		contact = new Contact(firstName, "98765432100", phoneNumber, address);
		assert(contact.getLastName() != null);
		assert(contact.getLastName().length() <= 10);
	}
	
	@Test
	void testGetPhoneNumber() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String address = "2109 Aitkin Loop";
		
		Contact contact = new Contact(firstName,lastName, null, address);
		assert(contact.getPhoneNumber() != null);
		assert(contact.getPhoneNumber().length() == 10);
		
		contact = new Contact(firstName, lastName, "98765432100", address);
		assert(contact.getPhoneNumber() != null);
		assert(contact.getPhoneNumber().length() == 10);
		
	}

	
	@Test
	void testGetAddress() {
		final String firstName = "Edwin";
		final String lastName = "Nelson";
		final String phoneNumber = "3212979196";
		
		Contact contact = new Contact(firstName,lastName, phoneNumber, null);
		assert(contact.getAddress() != null);
		assert(contact.getAddress().length() <= 30);
		
		contact = new Contact(firstName,lastName, phoneNumber, "01234567890123456789012345678910");
		assert(contact.getAddress() != null);
		assert(contact.getAddress().length() <= 30);
	}

	
}

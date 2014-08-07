package addressbook.Interface;

import java.util.List;

import addressbook.Model.Contact;

public interface IDataStoreService
{
	List<Contact> getContacts();

	Contact saveContact(Contact contact);

	List<Contact> searchContacts(String firstName, String lastName);
}

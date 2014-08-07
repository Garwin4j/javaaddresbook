package addressbook.Services;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import addressbook.Interface.IContactRepository;
import addressbook.Interface.IDataStoreService;
import addressbook.Model.Contact;

@Service
public class DataStoreService implements IDataStoreService
{
	@Autowired
	public DataStoreService(IContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	private IContactRepository contactRepository;

	@Override
	public List<Contact> getContacts()
	{
		return IteratorUtils
				.toList((Iterator<? extends Contact>) contactRepository
						.findAll().iterator());
	}

	@Override
	public Contact saveContact(Contact contact)
	{
		return contactRepository.save(contact);
	}

	@Override
	public List<Contact> searchContacts(String firstName, String lastName)
	{
		return contactRepository
				.findByFirstNameAndLastName(firstName, lastName);
	}

}

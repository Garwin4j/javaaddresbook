package addressbook.web.controlller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import addressbook.Interface.IDataStoreService;
import addressbook.Model.Contact;
import addressbook.Model.Email;
import addressbook.Model.EmailType;

@RestController
public class ContactRestController
{
	IDataStoreService dataStoreService;

	@Autowired
	public ContactRestController(IDataStoreService dataStoreService) {
		this.dataStoreService = dataStoreService;

		Contact newTestContact = new Contact();
		newTestContact.setFirstName("Garwin");
		newTestContact.setLastName("Pryce");
		newTestContact.setEmails(new ArrayList<Email>());
		newTestContact.getEmails().add(
				new Email(0L, "gpryce@work.com", EmailType.work));

		dataStoreService.saveContact(newTestContact);
	}

	@RequestMapping("/")
	public java.util.List<Contact> Index()
	{
		return dataStoreService.getContacts();
	}

}

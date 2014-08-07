package addressbook.Interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import addressbook.Model.Contact;

public interface IContactRepository extends CrudRepository<Contact, Long>
{
	List<Contact> findByFirstNameAndLastName(String firstName, String lastName);

}

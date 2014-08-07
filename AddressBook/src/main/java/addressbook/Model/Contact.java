package addressbook.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact
{
	public Contact() {
		emails = new ArrayList<Email>();

	}

	@Id
	@GeneratedValue
	private long Id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Email> emails;

	public long getId()
	{
		return Id;
	}

	public void setId(long id)
	{
		Id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public List<Email> getEmails()
	{
		return emails;
	}

	public void setEmails(List<Email> emails)
	{
		this.emails = emails;
	}
}

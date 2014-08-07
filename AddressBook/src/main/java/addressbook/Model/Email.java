package addressbook.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Email
{
	public Email() {
	}

	public Email(long id, String address, EmailType type) {
		super();
		Id = id;
		this.address = address;
		this.type = type;
	}

	@Id
	@GeneratedValue
	private long Id;
	@Column
	private String address;

	private EmailType type;

	public long getId()
	{
		return Id;
	}

	public void setId(long id)
	{
		Id = id;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public EmailType getType()
	{
		return type;
	}

	public void setType(EmailType type)
	{
		this.type = type;
	}

}

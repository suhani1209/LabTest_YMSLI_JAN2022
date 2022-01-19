package ques2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {}
	
	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}
	
	Owner(Owner o1)
	{
		this.name=o1.name;
		this.dateOfBirth=new Date(o1.dateOfBirth.getDate(),o1.dateOfBirth.getMonth(),o1.dateOfBirth.getYear());
		this.nic=o1.nic;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
	}
	
	public void display() {
		this.toString();
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNic() {
		return nic;
	}
	
	
}

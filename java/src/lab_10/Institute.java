package lab_10;

import java.lang.String;

public class Institute {

	private java.lang.String name;
	private java.lang.String address;

	private ResearchAssociate[] employees;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

    public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public void setEmployees(ResearchAssociate[] employees) {
		this.employees = employees;
	}

	public ResearchAssociate[] getEmployees() {
		return this.employees;
	}

}
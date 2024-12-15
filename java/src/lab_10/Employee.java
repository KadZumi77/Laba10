package lab_10;

import java.lang.String;

public abstract class Employee {

    protected int ssNo;
    private int socialSecurityNumber;
	protected java.lang.String name;
	private java.lang.String email;
	private int counter;

	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
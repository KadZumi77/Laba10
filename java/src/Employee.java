public abstract class Employee {

	private int socialSecurityNumber;
	protected int ssNo;
	protected String name;
	private String email;
	private int counter;

	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	/**
	 * 
	 * @param socialSecurityNumber
	 */
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(int name) {
		// TODO - implement Employee.setName
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(int email) {
		// TODO - implement Employee.setEmail
		throw new UnsupportedOperationException();
	}

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

}
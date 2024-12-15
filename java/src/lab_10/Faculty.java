package lab_10;

import java.lang.String;

public class Faculty {

	private java.lang.String name;
	private Institute[] institutes;

	public Faculty(String name) {
		this.name = name;
	}

    public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

}
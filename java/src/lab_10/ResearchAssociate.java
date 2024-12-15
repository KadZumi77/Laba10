package lab_10;

import java.lang.String;

public class ResearchAssociate extends Employee {

	private java.lang.String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String fieldOfStudy) {
		this.ssNo = ssNo;
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
	}

	public void setFieldOfStudy(java.lang.String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

}
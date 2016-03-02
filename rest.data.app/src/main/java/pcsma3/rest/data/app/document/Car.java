package pcsma3.rest.data.app.document;

import org.springframework.data.annotation.Id;

public class Car {

	@Id
	private String id;
	
	private String model;

	private String company;	
	
	private int drive;
	
	public int getDrive() {
		return drive;
	}
	public void setDrive(int drive) {
		this.drive = drive;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}


}
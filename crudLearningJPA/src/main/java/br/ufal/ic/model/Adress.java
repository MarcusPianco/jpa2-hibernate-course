package br.ufal.ic.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {

	private String street;
	private String state;
	private Integer number;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	

}

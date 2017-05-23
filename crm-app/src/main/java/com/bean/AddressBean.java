package com.bean;

public class AddressBean {

	private int addressId;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String id_number;

	public AddressBean()
	{}

	public AddressBean(String street, String city, String state, String zip,String id_number) 
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.id_number = id_number;
	}


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}




}

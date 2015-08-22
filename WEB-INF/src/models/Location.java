package models;


public class Location {
	public int id;
	public String name;
	public String entity;
	public String timetable;
	public String transport;
	public String description;
	public String accessibility;
	public String url;
	public String street;
	public String streettype;
	public String number;
	public String postalcode;
	public String neighborhood;
	public String district;
	public String latitude;
	public String longitude;
	public String phone;
	public String email;

	public Location (
		int id, 
		String name, 
		String entity, 
		String timetable, 
		String transport, 
		String description, 
		String accessibility, 
		String url, 
		String street, 
		String streettype, 
		String number, 
		String postalcode, 
		String neighborhood, 
		String district, 
		String latitude, 
		String longitude, 
		String phone, 
		String email
		) 
	{
		
		this.id = id;
		this.name = name;
		this.entity = entity;
		this.timetable = timetable;
		this.transport = transport;
		this.description = description;
		this.accessibility = accessibility;
		this.url = url;
		this.street = street;
		this.streettype = streettype;
		this.number = number;
		this.postalcode = postalcode;
		this.neighborhood = neighborhood;
		this.district = district;
		this.latitude = latitude;
		this.longitude = longitude;
		this.phone = phone;
		this.email = email;
	}
}
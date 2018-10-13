package hibernate_prc.classes.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address2 {

	String city;

	public String getCity() {
		return city;
	}

	public Address2 setCity(String city) {
		this.city = city;
		return this;
	}
	
}

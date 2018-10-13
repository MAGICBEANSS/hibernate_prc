package hibernate_prc.classes.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address2 {

	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}

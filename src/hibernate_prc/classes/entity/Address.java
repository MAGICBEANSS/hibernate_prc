package hibernate_prc.classes.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	String city;
	Integer pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}

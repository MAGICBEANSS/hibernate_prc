package hibernate_prc.classes.entity;

import javax.annotation.Generated;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id @GeneratedValue
	Integer addressId;
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
	@Override
	public String toString() {
		return "Address111 [city=" + city + ", pincode=" + pincode + "]";
	}
	
}

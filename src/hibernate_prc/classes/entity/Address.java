package hibernate_prc.classes.entity;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Address {
	@Id @GeneratedValue
	Integer addressId;
	String city;
	Integer pincode;
	
	@ManyToMany
	Set<UserDetails> user = new HashSet<>();
	
	
	
	public Set<UserDetails> getUser() {
		return user;
	}
	public void setUser(Set<UserDetails> user) {
		this.user = user;
	}
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

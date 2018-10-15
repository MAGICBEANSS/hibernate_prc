package hibernate_prc.classes.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity()
public class UserDetails {
	

	int userId;

	@Id
	@Column(name = "User_id")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	Address aa;
	
	@OneToOne(fetch = FetchType.LAZY)
	public Address getAa() {
		return aa;
	}
	public void setAa(Address aa) {
		this.aa = aa;
	}

	
	
	
	
	List<Address> add = new ArrayList<>();
	
	
	
	@OneToMany()	
	public List<Address> getAdd() {
		return add;
	}
	public void setAdd(List<Address> add) {
		this.add = add;
	}

	String city;
	
	@Column(name = "citi")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	String userName;	
	@Column()
	public String getUserName() {
		
		return "dd "+userName+"kljfdkl";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", add=" + add + ", city=" + city + ", userName=" + userName + "]";
	}
	

	
	

}

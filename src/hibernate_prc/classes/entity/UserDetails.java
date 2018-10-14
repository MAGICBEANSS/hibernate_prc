package hibernate_prc.classes.entity;

import java.util.HashMap;
import java.util.HashSet;
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
import javax.persistence.OneToOne;

@Entity
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
	

	Address add;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id_")
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", city=" + city + ", userName=" + userName + ", add=" + add + "]";
	}
	

}

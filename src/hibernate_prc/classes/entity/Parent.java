package hibernate_prc.classes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;

@Entity(name = "users")
public class Parent {

	@Id @GeneratedValue
	Integer uid;
	String name;
	String Nickname;
	@Override
	public String toString() {
		return "Parent [uid=" + uid + ", name=" + name + ", Nickname=" + Nickname + ", city=" + city + ", add=" + add
				+ "]";
	}
	String city;
	
	
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "kuchbhi")
	List<Aadhar> add = new ArrayList<>();
	

Aadhar aaa;

	
	public Aadhar getAaa() {
	return aaa;
}
public void setAaa(Aadhar aaa) {
	this.aaa = aaa;
}
	public List<Aadhar> getAdd() {
		return add;
	}
	public void setAdd(List<Aadhar> add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

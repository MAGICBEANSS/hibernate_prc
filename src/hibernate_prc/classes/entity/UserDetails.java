package hibernate_prc.classes.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Column()
	int userId;
	String userName;

	@Id
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

	Set<Address2> hsadd = new HashSet<>();
	Map<Integer,Address3> hsmap = new HashMap<>();
	
@ElementCollection
@AttributeOverrides({
	@AttributeOverride(name = "zipcode" , column = @Column(name = "ziiiiipcode"))
})

	public Map<Integer, Address3> getHsmap() {
		return hsmap;
	}
	public void setHsmap(Map<Integer, Address3> hsmap) {
		this.hsmap = hsmap;
	}
	@AttributeOverrides({
		
		@AttributeOverride(name = "city" , column = @Column(name = "citybity"))
	})
	@ElementCollection()
	public Set<Address2> getHsadd() {
		return hsadd;
	}
	public void setHsadd(Set<Address2> hsadd) {
		this.hsadd = hsadd;
	}
	
	



	Address add;
//	Address2 add2;
	
	/*public Address2 getAdd2() {
		return add2;
	}
	public void setAdd2(Address2 add2) {
		this.add2 = add2;
	}*/
	@AttributeOverrides(
			{
			@AttributeOverride(name = "city", column = @Column( name = "cityyy"))
			}
			)
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Column()
	public String getUserName() {
		
		return "dd "+userName+"kljfdkl";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + "]";
	}

}

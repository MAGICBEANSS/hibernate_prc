import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import hibernate_prc.classes.entity.Address;
@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Emp_Id=" + Emp_Id + ", dept=" + dept + ", add=" + add + "]";
	}


	String name;
	
	@Id @GeneratedValue
	Integer Emp_Id;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="empdept")
	Department dept;

	
	@OneToMany(cascade = CascadeType.PERSIST ,fetch = FetchType.EAGER)
	@JoinTable(
			name = "_user_address_",
			joinColumns = {@JoinColumn(name = "E_ID" ,referencedColumnName = "Emp_Id")},
			inverseJoinColumns = {@JoinColumn(name = "A_ID" , referencedColumnName = "addressId")}
			)
	List<Address> add = new ArrayList<>();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public List<Address> getAdd() {
		return add;
	}


	public void setAdd(List<Address> add) {
		this.add = add;
	}
}

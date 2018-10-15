import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

	String name;
	@Id @GeneratedValue
	Integer deptid;
	@Override
	public String toString() {
		return "Department [name=" + name + ", deptid=" + deptid + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

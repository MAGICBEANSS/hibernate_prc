package hibernate_prc.classes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdvancedUser extends UserDetails{

	
	Integer Aadharno;
	
	String VIllage;

	

	public Integer getAadharno() {
		return Aadharno;
	}

	public void setAadharno(Integer aadharno) {
		Aadharno = aadharno;
	}

	public String getVIllage() {
		return VIllage;
	}

	public void setVIllage(String vIllage) {
		VIllage = vIllage;
	}
}

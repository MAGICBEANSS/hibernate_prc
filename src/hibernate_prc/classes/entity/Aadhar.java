package hibernate_prc.classes.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Aadhar {

	Integer aadharNO;
	String vill;
	public Integer getAadharNO() {
		return aadharNO;
	}
	public void setAadharNO(Integer aadharNO) {
		this.aadharNO = aadharNO;
	}
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharNO=" + aadharNO + ", vill=" + vill + "]";
	}
	
}

package hibernate_prc.classes.entity;

import javax.persistence.Embeddable;

	@Embeddable
	public class Address3 {
	
		@Override
		public String toString() {
			return "Address3 [zipcode=" + zipcode + "]";
		}

		Integer zipcode;
	
		public Integer getZipcode() {
			return zipcode;
		}
	
		public Address3 setZipcode(Integer zipcode) {
			this.zipcode = zipcode;
			return this;
		
	}
	}

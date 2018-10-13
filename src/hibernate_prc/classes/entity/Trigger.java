package hibernate_prc.classes.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails u = new UserDetails();
		u.setUserId(1);
		u.setUserName("MB");
		Address a = new Address();
		//Address2 a2 = new Address2();
		u.setCity("Delhi");
		a.setCity("Bangalore");
		a.setPincode(123456);
		u.setAdd(a);
		Set<Address2> hsadd = new HashSet<>();
		Map<Integer,Address3> hsmap = new HashMap<>();
		hsadd.add(new Address2().setCity("aaaaa"));
		hsadd.add(new Address2().setCity("bbbbb"));
		hsmap.put(1, new Address3().setZipcode(1234));
		hsmap.put(1, new Address3().setZipcode(45435));
		u.setHsadd(hsadd);
		u.setHsmap(hsmap);
		System.out.println("dxxxxxx\n\n\n\n");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		System.out.println("ggggggggggggggggg\n\n\n\n");
		// Session ss = sf.openSession();
		Session ss = sf.getCurrentSession();
		ss.beginTransaction();
		System.out.println("dddddddd\n\n\n\n");
		ss.save(u);
		ss.getTransaction().commit();
		ss.close();
		ss = sf.getCurrentSession();
		ss.beginTransaction();
		UserDetails u1 = ss.get(UserDetails.class, 1);
		System.out.println(" u1 "+u1.getUserName());
		System.out.println(" u1 "+u1);
		
		ss.getTransaction().commit();
	//	new Trigger().m1();

	}
	
	void m1() {
		System.out.println("____");
		int a = 10;
		int b =20;
		List<Integer> al = new ArrayList();
		al.add(45);al.add(56);
		 m2(al);
		 System.out.println(" al "+al);
		// System.out.println(" b "+b);
	}
	

	private void m2(List<Integer> al) {
		// TODO Auto-generated method stub
		 System.out.println("2 a "+al);
	//	 System.out.println("2 b "+b);
		 al.add(999);
	//	 b = 56;
		 System.out.println("3 a "+al);
	//	 System.out.println("3 b "+b); 
	}

}

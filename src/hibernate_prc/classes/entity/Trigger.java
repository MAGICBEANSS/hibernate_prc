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
		Address a2 = new Address();
		//Address2 a2 = new Address2();
		u.setCity("Delhi");
		a.setCity("Bangalore");
		System.out.println("______a_____________");
		a.setPincode(123456);
		a2.setCity("Delhi");
		a2.setPincode(56789);
		System.out.println("______b_____________");
		u.getAdd().add(a);
		System.out.println("______c_____________");
	u.getAdd().add(a2);
	
		a.setUser(u);
		Address a3 = new Address();
		a3.setCity("Ejipura");
		
		System.out.println("dxxxxxx\n\n\n\n");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		System.out.println("ggggggggggggggggg\n\n\n\n");
		// Session ss = sf.openSession();
		Session ss = sf.getCurrentSession();
		ss.beginTransaction();
		System.out.println("dddddddd\n\n\n\n");
		ss.save(u);
		ss.save(a);
		System.out.println("______done_____________");
	
		ss.getTransaction().commit();
		System.out.println("______commited_____________");
	//	new Trigger().m1();
		ss.close();
		sf.close();
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

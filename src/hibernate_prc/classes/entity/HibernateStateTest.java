package hibernate_prc.classes.entity;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateStateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails u = new UserDetails();
		u.setCity("city1");
		u.setUserId(123);
		Address a = new Address();
		a.setCity("city");
		a.setPincode(45678);
		u.getAdd().add(a);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		ss.beginTransaction();
		u.setAa(a);
		ss.save(u);
		ss.save(a);
		
		// UserDetails u1 = new UserDetails();
		UserDetails u1 = ss.get(UserDetails.class, new Integer(123));
		System.out.println("_________");
//		 System.out.println(u1);
	//	 List<UserDetails> u1 = (List<UserDetails>) ss.createQuery("From UserDetails").list();
		
		ss.getTransaction().commit();
		ss.close();
		ss = sf.getCurrentSession();
		ss.beginTransaction();
		 u1 = ss.get(UserDetails.class, new Integer(123));
		 
		 ss.close();
		sf.close();
		
	//	 u1 = ss.get(UserDetails.class, 123);
			System.out.println("_________");
			 System.out.println(u1.getUserId());
			 System.out.println(u1.getAa());
		//	 System.out.println(u1.getAdd());
	}

}

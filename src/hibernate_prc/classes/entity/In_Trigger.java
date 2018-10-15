package hibernate_prc.classes.entity;

import  org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class In_Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new In_Trigger().m1();
	}
	
	void m1() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.getCurrentSession();
	Transaction tr = 	ss.beginTransaction();
		UserDetails u = new UserDetails();
		u.setCity("Bengaluru");
		u.setUserId(123456);
		u.setUserName("mb");
		AdvancedUser au = new AdvancedUser();
		au.setVIllage("ddd");
		au.setCity("zzz");
		ss.persist(au);
		ss.persist(u);
		tr.commit();
		ss.close();
		sf.close();
		
		
	}

}

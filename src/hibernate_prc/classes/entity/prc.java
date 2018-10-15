package hibernate_prc.classes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class prc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session ss = sf.getCurrentSession();
		ss.beginTransaction();
		for(int i =0 ;i<10;i++) {
			Parent p = new Parent();
			p.setName("MB"+i);
			p.setCity("Bangalore "+i);
			p.setNickname("Nick "+i);
			Aadhar a = new Aadhar();
			
			a.setAadharNO(123456+i);
			a.setVill("vill -abc"+i);
			System.out.println("inserting 1");
			p.getAdd().add(a);
			p.setAaa(a);
			ss.save(p);
			a.setAadharNO(23456+i);
			a.setVill("vill - xyz"+i);
			System.out.println("inserting 2");
			p.getAdd().add(a);
		}
				
		ss.getTransaction().commit();
		ss.close();
		List<Object[]> lpp ;
		ss = sf.getCurrentSession();
		ss.beginTransaction();
		
		Query nq = ss.createNamedQuery("select users_uid,aadharNo,vill from kuchbhi ");
		
	//	String zz = "vill - xyz0";
		Query query = ss.createQuery("select add from users ");
		//query.setParameter("id",zz);
		 lpp =  nq.list();
		
		ss.getTransaction().commit();
		ss.close();
		System.out.println(" lpp => "+lpp.get(0));
		System.out.println(" lpp => "+lpp.size());
		
		sf.close();
		
	}

}

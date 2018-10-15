import java.util.List;

// import org.hibernate.Query;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate_prc.classes.entity.Address;

public class Java_hibernate_config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
	      Transaction transaction = null;
	      try {
	         session = HibernateUtil.getSessionFactory().openSession();
	         transaction = session.beginTransaction();
	         for(int i = 0 ;i<10;i++)
	         {
	        	 Employee e = new Employee();
	        	 Address a1 = new Address();
	        	 Department d1= new Department();
	        	 a1.setCity("Bangalore "+i);
	        	 a1.setPincode(11111+i);
	        	 d1.setName("ECE "+i);
	        	 e.setName("Piyush "+i);
	        	 e.getAdd().add(a1);
	        	 e.setDept(d1);
	        	 session.persist(e);
	         }
	         transaction.commit();
	         session.close();
	         session = HibernateUtil.getSessionFactory().openSession();
	         List<Object[]> a;
	         transaction = session.beginTransaction();
	         
	         Query query = session.createQuery("select e.add,e.dept from Employee e where e.Emp_Id > :temp_emp_id");
	         query.setParameter("temp_emp_id",3);
	         a= query.list();
	         transaction.commit();
	         session.close();
	         System.out.println("____________");
	         Integer x = 0;
	         Department dd;
	         Address aa;
	         for(Object[] e : a)
	         {
	        	 
	        	 dd = (Department) e[1];
	        	 System.out.println("dept = > "+dd);
	        	 
	        	
	        	 aa = (Address) e[0];
	        	 System.out.println("address => "+aa);
	        	 
	        	 x++;
	        	 }
	      }
	      catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
	      }
	}

}

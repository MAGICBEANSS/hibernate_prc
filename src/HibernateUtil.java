
import java.util.*;
import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.*;

import hibernate_prc.classes.entity.Address;

public class HibernateUtil {
   private static StandardServiceRegistry registry;
   private static SessionFactory sessionFactory;

   public static SessionFactory getSessionFactory() {
      if (sessionFactory == null) {
         try {
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

            //Configuration properties
            Map<String, Object> settings = new HashMap<>();
            settings.put(Environment.DRIVER, "org.postgresql.Driver");
            settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/testdb1");
            settings.put(Environment.USER, "youruser");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            settings.put(Environment.PASS, "yourpass");
            settings.put(Environment.HBM2DDL_AUTO, "create");
            settings.put(Environment.SHOW_SQL, true);
            
            registryBuilder.applySettings(settings);
            registry = registryBuilder.build();
            
            MetadataSources sources = new MetadataSources(registry);
            sources.addAnnotatedClass(Department.class);
            sources.addAnnotatedClass(Employee.class);
            sources.addAnnotatedClass(Address.class);
            Metadata metadata = sources.getMetadataBuilder().build();
            
            sessionFactory = metadata.getSessionFactoryBuilder().build();
         } catch (Exception e) {
            if (registry != null) {
               StandardServiceRegistryBuilder.destroy(registry);
            }
            e.printStackTrace();
         }
      }
      return sessionFactory;
   }

   public static void shutdown() {
      if (registry != null) {
         StandardServiceRegistryBuilder.destroy(registry);
      }
   }
}
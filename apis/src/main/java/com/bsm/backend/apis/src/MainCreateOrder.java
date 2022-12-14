import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateOrder {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
				                 configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Order.class).
				                 addAnnotatedClass(Product.class).
				                 buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			session.beginTransaction();
			Order order1 = new Order(formatter.parse("1/1/2022"), "Archana");
			session.save(order1);
			
			Product product1 = new Product("Laptop");
			Product product2 = new Product("Book");
			
			order1.addProducts(product1);
			order1.addProducts(product2);
			
			session.save(product1);
			session.save(product2);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}		
		
		
	}

}

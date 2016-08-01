package br.ufal.ic.extra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Marcus");
		
		CellPhone cellphone = new CellPhone();
		
		cellphone.setModelo("Motorolla");
		
		CellPhone cellphone2 = new CellPhone();
		
		cellphone.setModelo("IMoto");	
		
		person.getCells().add(cellphone);
		person.getCells().add(cellphone2);
		
		
		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml").buildSessionFactory();
	
		Session session= sessionFactory.openSession();
		
		
		session.beginTransaction();
		
		session.save(person);
		session.save(cellphone);
		session.save(cellphone2);
		
		session.close();

		
	}

}

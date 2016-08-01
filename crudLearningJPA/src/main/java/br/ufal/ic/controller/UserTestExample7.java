package br.ufal.ic.controller;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.Machine;
import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//@OneToMany
//Maneira de não criara 3 tabela usando o mappedby
public class UserTestExample7 {

	public static void main(String[] args) {

		// Criando Novo Usuário
		User user = new User();

		// Generation Automatic
		// user.setId(3);

		user.setName("Baldoino Neto");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);
		//
		 Machine machine = new Machine();
		 machine.setMarca("Dell");
		 machine.setModelo("15 r 7520");
		 
		 Machine machine2 = new Machine();
		 machine2.setMarca("Dell");
		 machine2.setModelo("15 r 7520");
		 
//		 user.getMachines().add(machine);
//		 user.getMachines().add(machine2);
//		 
		 


		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);
		//session.save(machine);
		//session.save(machine2);

		session.getTransaction().commit();

		session.close();

	}

}

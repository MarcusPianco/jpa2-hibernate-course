package br.ufal.ic.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.User;

@SuppressWarnings("rawtypes")
public class CRUDImpl implements CRUD {

	final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	final SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml").buildSessionFactory();
	Session session = threadLocal.get();

	public void addInstance(Object instance) {

	}

	public void updateInstance(Object instance) {

	}

	public void removeInstance(Object instance) {

	}

	public void removeInstance(int identify) {

	}

	@SuppressWarnings("unchecked")
	public List<User> getAllInstances() {
		session = sessionFactory.openSession();
		List<User> list = null;

		try {
			session.beginTransaction();
			list = session.createCriteria(User.class).list();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

		return list;

	}
	
	public static CRUDImpl getInstance() {
		return new CRUDImpl();
	}

}

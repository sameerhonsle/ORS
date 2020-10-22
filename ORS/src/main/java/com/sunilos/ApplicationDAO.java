package com.sunilos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	public Application get(long id) {

		// Session session = entityManager.unwrap(Session.class);
		// SessionFactory sessionFactory =
		// entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);

		Session session = entityManager.unwrap(Session.class);
		Application o = session.get(Application.class, id);
		return o;
	}

	public Application delete(long id) {
		Session session = entityManager.unwrap(Session.class);
		Application o = session.get(Application.class, id);
		session.delete(o);
		return o;
	}

	public long add(Application o) {
		Session session = entityManager.unwrap(Session.class);
		session.save(o);
		return o.getId();
	}

	public long update(Application o) {
		Session session = entityManager.unwrap(Session.class);
		session.update(o);
		return o.getId();
	}

	public List<Application> search(Application o) {
		Session session = entityManager.unwrap(Session.class);
		Criteria c = session.createCriteria(Application.class);
		if (o.getRelatedOffer() != null) {
			c.add(Expression.like("jobTitle", o.getRelatedOffer()));
		}
		

		List<Application> list = c.list();

		return list;
	}
}

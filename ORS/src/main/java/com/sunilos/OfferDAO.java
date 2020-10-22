package com.sunilos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;

@Repository
public class OfferDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	public Offer get(long id) {

		// Session session = entityManager.unwrap(Session.class);
		// SessionFactory sessionFactory =
		// entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);

		Session session = entityManager.unwrap(Session.class);
		Offer o = session.get(Offer.class, id);
		return o;
	}

	public Offer delete(long id) {
		Session session = entityManager.unwrap(Session.class);
		Offer o = session.get(Offer.class, id);
		session.delete(o);
		return o;
	}

	public long add(Offer o) {
		Session session = entityManager.unwrap(Session.class);
		session.save(o);
		return o.getId();
	}

	public long update(Offer o) {
		Session session = entityManager.unwrap(Session.class);
		session.update(o);
		return o.getId();
	}

	public List<Offer> search(Offer o) {
		Session session = entityManager.unwrap(Session.class);
		Criteria c = session.createCriteria(Offer.class);
		if (o.getJobTitle() != null) {
			c.add(Expression.like("jobTitle", o.getJobTitle()));
		}
		if (o.getApplication() != null) {
			c.add(Expression.eq("application", o.getApplication()));
		}
		

		List<Offer> list = c.list();

		return list;
	}
}

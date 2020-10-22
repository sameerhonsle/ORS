package com.sunilos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

	@Autowired
	private OfferDAO dao = null;

	@Transactional
	public Offer get(long id) {
		return dao.get(id);
	}

	@Transactional
	public long add(Offer o) {
		return dao.add(o);
	}

	@Transactional
	public long update(Offer o) {
		return dao.update(o);
	}

	@Transactional
	public Offer delete(long id) {
		return dao.delete(id);
	}

	@Transactional
	public List<Offer> search(Offer o) {
		return dao.search(o);
	}

}

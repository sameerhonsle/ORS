package com.sunilos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationDAO dao = null;

	@Transactional
	public Application get(long id) {
		return dao.get(id);
	}

	@Transactional
	public long add(Application o) {
		return dao.add(o);
	}

	@Transactional
	public long update(Application o) {
		return dao.update(o);
	}

	@Transactional
	public Application delete(long id) {
		return dao.delete(id);
	}

	@Transactional
	public List<Application> search(Application o) {
		return dao.search(o);
	}

}

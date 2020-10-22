package com.sunilos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Offer")
public class OfferCtl {

	@Autowired
	private OfferService service = null;

	@GetMapping("get/{id}")
	public Map<String, Object> get(@PathVariable Long id) {

		Offer o = service.get(id);

		Map<String, Object> response = new HashMap<String, Object>();

		if (o != null) {
			response.put("success", true);
			response.put("data", o);
		} else {
			response.put("success", false);
			response.put("message", "Account not found");
		}

		return response;
	}

	@GetMapping("delete/{id}")
	public Map<String, Object> delete(@PathVariable Long id) {

		Offer o = service.get(id);

		Map<String, Object> response = new HashMap<String, Object>();

		if (o == null) {
			response.put("success", false);
			response.put("message", "Account not found");
		} else {
			service.delete(id);
			response.put("success", true);
			response.put("data", o);
		}
		return response;
	}

	@PostMapping("save")
	public Map<String, Object> save(@RequestBody Offer o) {

		Long id = o.getId();

		if (id > 0) {
			service.update(o);
		} else {
			service.add(o);
		}

		Map<String, Object> response = new HashMap<String, Object>();
		response.put("success", true);
		response.put("message", "Data is saved");
		response.put("data", o);
		return response;
	}

	@PostMapping("search")
	public Map<String, Object> search(@RequestBody Offer o) {
		List<Offer> list = service.search(o);

		Map<String, Object> response = new HashMap<String, Object>();
		response.put("success", true);
		response.put("data", list);

		return response;
	}

}

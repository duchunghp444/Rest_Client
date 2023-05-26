package frontend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import frontend.model.Lop;
@Service

public class LopServiceImp implements LopService{
@Autowired
	RestTemplate restTemplate;
	private String url;
	
	
	public LopServiceImp(RestTemplate restTemplate, @Value("${url}") String url) {

		this.restTemplate = restTemplate;
		this.url = url;
	}

	public List<Lop> findAll() {
		ResponseEntity<List<Lop>> response = restTemplate.exchange(url,HttpMethod.GET,null, 
				new ParameterizedTypeReference<List<Lop>>() {
				});
		List<Lop> list = response.getBody();
		return list;
	}

	public void save(Lop clazz) {
		if (clazz.getId() != 0) {
			restTemplate.put(url, clazz);
		} else
			restTemplate.postForEntity(url, clazz, Lop.class);
	}

	public void delete(int id) {
		restTemplate.delete(url + "/" + id);
	}

	public Lop getbyId(int id) {
		return restTemplate.getForEntity(url + "/" + id, Lop.class).getBody();

	}

	public void update(Lop lop) {
		
		
	}

	public Lop getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package frontend.service;

import java.util.List;

import frontend.model.Lop;



public interface LopService {

	public List<Lop> findAll();
	
	public void save (Lop lop);
	public void update (Lop lop);
	
	public void delete(int id );
	public Lop getById(int id);
}

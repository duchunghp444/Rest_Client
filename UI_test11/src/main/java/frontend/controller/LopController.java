package frontend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import frontend.model.Lop;
import frontend.service.LopServiceImp;

@Controller
@RequestMapping("/lop")
public class LopController {
	@Autowired
	private LopServiceImp lopService;
	
	@RequestMapping("/list")
	public String get(HttpServletRequest request) {
		//	System.out.println( lopService.findAll().get(0).getName());
		request.setAttribute("list", lopService.findAll());
		return "list";
	}
	@RequestMapping("/add")
	public String add() {

		return "add";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute Lop lop) {
		System.out.println(lop.getName());
		lopService.save(lop);
		return "redirect:/lop/list";
	}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, HttpServletRequest request) {
		request.setAttribute("clazz", lopService.getbyId(id));
		return "update";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute Lop clazz) {
		lopService.save(clazz);
		return "redirect:/clazz/list";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {

		lopService.delete(id);
		return "redirect:/lop/list";
	}
}

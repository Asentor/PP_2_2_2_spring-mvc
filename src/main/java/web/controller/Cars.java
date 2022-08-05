package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {
	@Autowired
	CarDao carDao;


	@GetMapping(value = "/cars")
	public String printCar(ModelMap model, @RequestParam(required = false) Long count) {

		List messages;
		carDao.addTestData();

		if(count != null) {
			messages = carDao.getAllLimitedByCount(count);
		} else {
			messages = carDao.getAll();
		}
		model.addAttribute("messages", messages);
		return "Cars";

	}
	
}
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService cs;
	
	@PostMapping("/add")
	public void add(@RequestBody College college) {
		 cs.add(college);
	}
	@GetMapping("/display")
	public List<College> display(){
		return cs.display();
	}


}

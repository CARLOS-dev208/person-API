package com.personapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "persons")
public class PersonController {
	
	@GetMapping
	public String resultado() {
		return "Hello Word";
	}

}

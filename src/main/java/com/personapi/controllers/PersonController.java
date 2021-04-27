package com.personapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Persons")
public class PersonController {
	
	public String resultado() {
		return "Hello Word";
	}

}

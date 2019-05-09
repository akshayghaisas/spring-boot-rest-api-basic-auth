package com.basicauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to test the authentication
 * 
 * @author akshay.ghaisas
 *
 */
@RequestMapping("/authcontroller")
@RestController
public class BasicAuthDemoController {

	@GetMapping(value = "/getData")
	public ResponseEntity<String> getData() {

		return new ResponseEntity<>("Authentication Successfull!!!", HttpStatus.OK);
	}

}

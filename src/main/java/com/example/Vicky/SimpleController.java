package com.example.Vicky;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
@RequestMapping("/api/tutorials")
public class SimpleController {
	
	
	
	@GetMapping("/published")
	public ResponseEntity<List<Tutorial>> findByPublished() {
		
		List<Tutorial> tutorials = new  ArrayList<Tutorial>();
		
		tutorials.add( new Tutorial());
		return new ResponseEntity<>(tutorials, HttpStatus.OK);
 
	}


}

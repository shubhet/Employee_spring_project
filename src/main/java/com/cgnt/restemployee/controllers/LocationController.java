package com.cgnt.restemployee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cgnt.restemployee.models.Location;
import com.cgnt.restemployee.services.LocationService;


@RestController
@RequestMapping("/loc")
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@PostMapping(value="/location")
	@ResponseStatus(HttpStatus.CREATED)
	public int location(@RequestBody Location location)
	{
		return locationService.createNewLocation(location);		
	}
	

}

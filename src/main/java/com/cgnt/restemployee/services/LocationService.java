package com.cgnt.restemployee.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cgnt.restemployee.exceptions.BadResourceRequestException;
import com.cgnt.restemployee.models.Location;
import com.cgnt.restemployee.repositories.LocationRepository;




@Service
public class LocationService {
	
	//create
	private LocationRepository locationRepository;
	@Transactional
	public int createNewLocation(Location location)
	{
		Optional<Location> existingLocation=locationRepository.findById(location.getLcode());
		if(existingLocation.isPresent())
		{
			throw new BadResourceRequestException("Duplicate Location");
		}
		else
		{
		Location loc=locationRepository.save(location);
		return loc.getLcode();
		}
		
	   
		
	}

}

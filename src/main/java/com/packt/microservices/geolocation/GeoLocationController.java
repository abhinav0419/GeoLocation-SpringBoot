package com.packt.microservices.geolocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geolocation")
public class GeoLocationController {
	
	@Autowired
	private GeoLocationServiceImpl service;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public GeoLocation create(@RequestBody GeoLocation geoLocation){
		return service.create(geoLocation);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<GeoLocation> findAll(){
		return service.findAll();
	}

}

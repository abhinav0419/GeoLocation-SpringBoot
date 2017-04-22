package com.packt.microservices.geolocation;

import java.util.List;

public interface GeoLocationServiceInterface {

	public GeoLocation create(GeoLocation geoLocation);
	public List<GeoLocation> findAll();
}

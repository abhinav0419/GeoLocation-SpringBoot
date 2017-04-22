package com.packt.microservices.geolocation;

import java.io.Serializable;
import java.util.UUID;

public class GeoLocation implements Serializable{
	private static final long serialVersionUID = 1L;
	private double latitude;
	private double longitude;
	private long timeStamp;
	private UUID userId;
	
	public void setLatitude(double latitude){
		this.latitude = latitude;
	}
	public double getLatitude(){
		return this.latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

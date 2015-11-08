package com.miggy.dataMiningStern.spring.service;

import java.math.BigDecimal;
import java.util.List;

import com.google.maps.model.GeocodingResult;
import com.miggy.dataMiningStern.spring.model.StudentMealData;

public interface GoogleMapService {
	public void setName(String name);
	public String sayHello();
	public double getDistance(String zipCode);
}

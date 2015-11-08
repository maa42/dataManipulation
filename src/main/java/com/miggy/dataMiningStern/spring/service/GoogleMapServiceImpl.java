package com.miggy.dataMiningStern.spring.service;

import org.springframework.stereotype.Service;
import com.google.maps.*;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.TransitMode;
import com.google.maps.model.TransitRoutingPreference;
import com.google.maps.model.TravelMode;
import com.google.maps.model.Unit;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import java.util.concurrent.TimeUnit;
import com.google.maps.model.DistanceMatrixElement;
import com.google.maps.model.DistanceMatrixElementStatus;
import com.google.maps.model.DistanceMatrixRow;
import com.google.maps.DirectionsApi.RouteRestriction;

@Service("googleMapService")
public class GoogleMapServiceImpl implements GoogleMapService {

	private String name;
	private GeoApiContext context = null;
	private GeocodingResult[] sternAddress = null;

	public GoogleMapServiceImpl() throws RuntimeException {
		System.out.println("GoogleMapServiceImpl Instatiated");
		context = new GeoApiContext().setApiKey("AIzaSyCJ5eWD9LMm7TiX5WrtYVIWMAnrHYPncb0");
		try {
			sternAddress = GeocodingApi.geocode(context, "44 West 4th Street, New York, NY 10012").await();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello " + name;
	}

	public double getDistance(String zipCode) {
		try {
			GeocodingResult[] origin = GeocodingApi.geocode(context, zipCode).await();
			GeocodingResult[] sternAddress = GeocodingApi.geocode(context, "44 West 4th Street, New York, NY 10012")
					.await();
			System.out.println("ZipCode= "+zipCode);
			return getDistanceAndDurationForDirection(origin, sternAddress);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	private double getDistanceAndDurationForDirection(GeocodingResult[] origin, GeocodingResult[] stern) {
		LatLng latOrigin = origin[0].geometry.location;
		LatLng latDestination = stern[0].geometry.location;
		try {
			DistanceMatrix distanceMatrix = DistanceMatrixApi.newRequest(context).origins(latOrigin)
					.destinations(latDestination).mode(TravelMode.TRANSIT).language("en-AU")
					.avoid(RouteRestriction.TOLLS).units(Unit.IMPERIAL).departureTime(new DateTime().plusMinutes(2))
					.await();
			String distanceStr = distanceMatrix.rows[0].elements[0].distance.toString();

			double distanceOnly = Double.parseDouble(distanceStr.replaceAll("[^0-9\\.]+", ""));
			System.out.println(distanceOnly);
			return distanceOnly;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
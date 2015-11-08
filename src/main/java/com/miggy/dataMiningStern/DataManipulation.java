package com.miggy.dataMiningStern;

import java.math.BigDecimal;
import java.util.List;
import org.apache.log4j.Logger;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.miggy.dataMiningStern.spring.service.GoogleMapService;
import com.miggy.dataMiningStern.spring.configuration.AppConfig;
import com.miggy.dataMiningStern.spring.model.StudentMealData;
import com.miggy.dataMiningStern.spring.service.StudentMealService;

public class DataManipulation {

	
	final static Logger logger = Logger.getLogger(StudentMealService.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// loading the definitions from the given XML file
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
        StudentMealService studentMealservice = (StudentMealService) context.getBean("studentMealService");
 

		GoogleMapService googleService = (GoogleMapService) context.getBean("googleMapService");
		//String message = service.sayHello();
		//System.out.println(message);

		// set a new name
		googleService.setName("Spring");
		String message = googleService.sayHello();
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + message);
		}
		System.out.println(message);

		List<String> zipCodeList = studentMealservice.findAllDistinctZipCodes();
        double distance =0.0;	
		for (String zipCode : zipCodeList) {
			if(zipCode != null && !"null".equals(zipCode) && !"0-0".equals(zipCode)){
				distance=googleService.getDistance(zipCode);
				//studentMealservice.updateStudentMealDistance(zipCode, distance);

			}
		}
		
		

	}
}
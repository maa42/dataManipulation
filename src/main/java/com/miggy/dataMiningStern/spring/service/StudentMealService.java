package com.miggy.dataMiningStern.spring.service;

import java.math.BigDecimal;
import java.util.List;

import com.miggy.dataMiningStern.spring.model.StudentMealData;

public interface StudentMealService {
	public StudentMealData findByStudentId(BigDecimal studentMealDataId);
	public List<StudentMealData> findAllStudents();
	
	public List<String> findAllDistinctZipCodes();
	public void updateStudentMealDistance (String zipCode, double distance);
}

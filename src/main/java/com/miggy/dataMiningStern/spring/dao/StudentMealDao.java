package com.miggy.dataMiningStern.spring.dao;

import com.miggy.dataMiningStern.spring.model.StudentMealData;
import java.math.BigDecimal;
import java.util.List;

public interface StudentMealDao
{
	public void saveStudentMeal(StudentMealData studentMeal);
	public StudentMealData findByStudentId(BigDecimal studentMealDataId);
	public List<StudentMealData> findAllStudents();
	
	public List<String> findAllDistinctZipCodes();
	public void updateStudentMealDistance (String zipCode, double distance);
}
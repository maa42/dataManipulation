package com.miggy.dataMiningStern.spring.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miggy.dataMiningStern.spring.dao.StudentMealDao;
import com.miggy.dataMiningStern.spring.model.StudentMealData;

import com.miggy.dataMiningStern.spring.service.StudentMealService;

@Service("studentMealService")
@Transactional
public class StudentMealServiceImpl implements StudentMealService {


	@Autowired
	private StudentMealDao dao;
	
	public void saveStudentMeal(StudentMealData studentMeal) {
		dao.saveStudentMeal(studentMeal);
	}

	public List<StudentMealData> findAllStudents() {
		return dao.findAllStudents();
	}

	public StudentMealData findByStudentId(BigDecimal studentMealDataId) {
		return dao.findByStudentId(studentMealDataId);

	}

	public List<String> findAllDistinctZipCodes() {
		return dao.findAllDistinctZipCodes();
	}

	public void updateStudentMealDistance(String zipCode, double distance) {
		 dao.updateStudentMealDistance(zipCode, distance);

	}

	
}

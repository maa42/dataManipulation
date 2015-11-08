package com.miggy.dataMiningStern.spring.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.miggy.dataMiningStern.spring.model.StudentMealData;
import com.miggy.dataMiningStern.spring.dao.StudentMealDao;
import com.miggy.dataMiningStern.spring.dao.AbstractDao;

import java.math.BigDecimal;

@Repository("studentMealDao")
public class StudentMealDaoImpl extends AbstractDao implements StudentMealDao {

	
	public StudentMealDaoImpl(){
		System.out.println("StudentMeal Instatiated");
		
	}
	
	public void saveStudentMeal(StudentMealData studentMeal) {
		persist(studentMeal);
	}

	@SuppressWarnings("unchecked")
	public List<StudentMealData> findAllStudents() {
		Criteria criteria = getSession().createCriteria(StudentMealData.class);
		return (List<StudentMealData>) criteria.list();
	}

	public StudentMealData findByStudentId(BigDecimal studentMealDataId) {

		Criteria criteria = getSession().createCriteria(StudentMealData.class);
		criteria.add(Restrictions.eq("studentMealDataId", studentMealDataId));
		return (StudentMealData) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<String> findAllDistinctZipCodes() {
		Session session = getSession();

		//session.getTransaction().begin();

		Criteria criteria = session.createCriteria(StudentMealData.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("zipCode"));
		criteria.add(Restrictions.isNotNull("zipCode"));

		criteria.setProjection(Projections.distinct(projList));
		List<String> list =  criteria.list();
		//session.getTransaction().commit();
		return list;
	
	
	}
		

	public void updateStudentMealDistance(String zipCode, double distanceInMiles) {

		Session session = getSession();

	//	session.getTransaction().begin();
		
		Query query = session.createQuery("update StudentMealData set distanceInMiles = :distanceInMiles" 
		                               + " where zipCode = :zipCode and validStatusId = :validStatusId");

		query.setParameter("zipCode", zipCode);
		query.setParameter("distanceInMiles", distanceInMiles);
		query.setParameter("validStatusId", 1);

		int result = query.executeUpdate();

	//	session.getTransaction().commit();

	}

}
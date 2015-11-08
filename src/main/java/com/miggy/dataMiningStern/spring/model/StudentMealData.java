package com.miggy.dataMiningStern.spring.model;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
 
@Entity
@Table(name="studentMealData")
public class StudentMealData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal studentMealDataId;
    
    @Column(name = "YEAR", nullable = true)
    private int year;

    @Column(name = "NYUID", nullable = true)
    private String nyuID;

    @Column(name = "YEARWITHID", nullable = true)
    private String yearWithID;
    
    @Column(name = "CLASSIFICATION", nullable = true)
    private  String classification;
    
    
    @Column(name = "MEALPLANDESCFULL", nullable = true)
    private String mealPlanDescFull;
	
    @Column(name = "ROOMLOCATIONDESC", nullable = true)
    private String roomLocationDesc;
	
    @Column(name = "DATEOFBIRTH", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate dateOfBirth;

    @Column(name = "SEX", nullable = true)
    private String sex;
    
    @Column(name = "ACADPROGPRIMARYCODE", nullable = true)
    private String acadProgPrimaryCode;

    @Column(name = "STRM", nullable = true)
    private int strm;
	
    @Column(name = "ACADEMICLOAD", nullable = true)    
    private String academicLoad;
	
    @Column(name = "PERMZIP", nullable = true)
    private String  permZip;
	
    @Column(name = "FOREIGNSTUDENT", nullable = true)
    private String foreignStudent;
    
    @Column(name = "PERMCOUNTRYDESCR", nullable = true)    
    private String permCountryDescr;
    
    @Column(name = "CHECKINDATE", nullable = true)    
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate checkInDate;
    
    @Column(name = "CHECKOUTDATE", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate checkOutDate;

    @Column(name = "ZIPCODE", nullable = true)
    private String zipCode;
    
    @Column(name = "COSTPERSEMESTER", nullable = true)
    private Double costPerSemester;
    
    @Column(name = "ANNUALCOST", nullable = true)
    private Double annualCost;
    
    @Column(name = "STATUS", nullable = true)
	String status;
    
    @Column(name = "DESCISIONTARGET", nullable = true)
	int decisionTarget;
    
    @Column(name = "ENDINGBALANCE", nullable = true)
	Double endingBalance;
    
    @Column(name = "DISTANCEINMILES", nullable = true)
	Double distanceInMiles;
    
    @Column(name = "LASTUPDATEDUSERID", nullable = true)
	BigDecimal lastUpdatedUserId;
    
    @Column(name = "LASTUPDATEDDATE", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate lastUpdatedDate;
    
   
    @Column(name = "VALIDSTATUSID", nullable = true)
    private int validStatusId;
    
    @Column(name = "GRADUATED", nullable = true)
    private int graduated;
	
	
    
    
    
    
    
	public StudentMealData(BigDecimal studentMealDataId){
		this.studentMealDataId = studentMealDataId;
		
	}
	
	
	public BigDecimal getStudentMealDataId() {
		return studentMealDataId;
	}





	public void setStudentMealDataId(BigDecimal studentMealDataId) {
		this.studentMealDataId = studentMealDataId;
	}





	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	public String getNyuID() {
		return nyuID;
	}





	public void setNyuID(String nyuID) {
		this.nyuID = nyuID;
	}





	public String getYearWithID() {
		return yearWithID;
	}





	public void setYearWithID(String yearWithID) {
		this.yearWithID = yearWithID;
	}





	public String getClassification() {
		return classification;
	}





	public void setClassification(String classification) {
		this.classification = classification;
	}





	public String getMealPlanDescFull() {
		return mealPlanDescFull;
	}





	public void setMealPlanDescription(String mealPlanDescFull) {
		this.mealPlanDescFull = mealPlanDescFull;
	}





	public String getRoomLocationDesc() {
		return roomLocationDesc;
	}





	public void setRoomLocationDesc(String roomLocationDesc) {
		this.roomLocationDesc = roomLocationDesc;
	}





	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}





	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}





	public String getSex() {
		return sex;
	}





	public void setSex(String sex) {
		this.sex = sex;
	}





	public String getAcadProgPrimaryCode() {
		return acadProgPrimaryCode;
	}





	public void setAcadProgPrimaryCode(String acadProgPrimaryCode) {
		this.acadProgPrimaryCode = acadProgPrimaryCode;
	}





	public int getStrm() {
		return strm;
	}





	public void setStrm(int strm) {
		this.strm = strm;
	}





	public String getAcademicLoad() {
		return academicLoad;
	}





	public void setAcademicLoad(String academicLoad) {
		this.academicLoad = academicLoad;
	}





	public String getPermZip() {
		return permZip;
	}





	public void setPermZip(String permZip) {
		this.permZip = permZip;
	}





	public String getForeignStudent() {
		return foreignStudent;
	}





	public void setForeignStudent(String foreignStudent) {
		this.foreignStudent = foreignStudent;
	}





	public String getPermCountryDescr() {
		return permCountryDescr;
	}





	public void setPermCountryDescr(String permCountryDescr) {
		this.permCountryDescr = permCountryDescr;
	}





	public LocalDate getCheckInDate() {
		return checkInDate;
	}





	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}





	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}





	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}





	public String getZipCode() {
		return zipCode;
	}





	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}





	public Double getCostPerSemester() {
		return costPerSemester;
	}





	public void setCostPerSemester(Double costPerSemester) {
		this.costPerSemester = costPerSemester;
	}





	public Double getAnnualCost() {
		return annualCost;
	}





	public void setAnnualCost(Double annualCost) {
		this.annualCost = annualCost;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public int getDecisionTarget() {
		return decisionTarget;
	}





	public void setDecisionTarget(int decisionTarget) {
		this.decisionTarget = decisionTarget;
	}





	public Double getEndingBalance() {
		return endingBalance;
	}





	public void setEndingBalance(Double endingBalance) {
		this.endingBalance = endingBalance;
	}





	public Double getDistanceInMiles() {
		return distanceInMiles;
	}





	public void setDistanceInMiles(Double distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}





	public BigDecimal getLastUpdatedUserId() {
		return lastUpdatedUserId;
	}





	public void setLastUpdatedUserId(BigDecimal lastUpdatedUserId) {
		this.lastUpdatedUserId = lastUpdatedUserId;
	}





	public LocalDate getLastUpdatedDate() {
		return lastUpdatedDate;
	}





	public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}





	public int getValidStatusId() {
		return validStatusId;
	}





	public void setValidStatusId(int validStatusId) {
		this.validStatusId = validStatusId;
	}





	public int getGraduated() {
		return graduated;
	}



	public void setGraduated(int graduated) {
		this.graduated = graduated;
	}
 
    
   
 
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentMealDataId == null) ? 0 : studentMealDataId.hashCode());
		result = prime * result + ((yearWithID == null) ? 0 : yearWithID.hashCode());
		return result;
	}
 
    
    
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMealData other = (StudentMealData) obj;
		if (studentMealDataId == null) {
			if (other.studentMealDataId != null)
				return false;
		} else if (!studentMealDataId.equals(other.studentMealDataId))
			return false;
		if (yearWithID == null) {
			if (other.yearWithID != null)
				return false;
		} else if (!yearWithID.equals(other.yearWithID))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "StudentMeal [studentMealDataId=" + studentMealDataId + ", year=" + year + ", nyuID=" + nyuID
				+ ", yearWithID=" + yearWithID + ", classification=" + classification + ", mealPlanDescFull="
				+ mealPlanDescFull + ", roomLocationDesc=" + roomLocationDesc + ", dateOfBirth=" + dateOfBirth
				+ ", sex=" + sex + ", acadProgPrimaryCode=" + acadProgPrimaryCode + ", strm=" + strm + ", academicLoad="
				+ academicLoad + ", permZip=" + permZip + ", foreignStudent=" + foreignStudent + ", permCountryDescr="
				+ permCountryDescr + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", zipCode="
				+ zipCode + ", costPerSemester=" + costPerSemester + ", annualCost=" + annualCost + ", status=" + status
				+ ", decisionTarget=" + decisionTarget + ", endingBalance=" + endingBalance + ", distanceInMiles="
				+ distanceInMiles + ", lastUpdatedUserId=" + lastUpdatedUserId + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", validStatusId=" + validStatusId + ", graduated=" + graduated + "]";
	}
 
 
    
     
     
     
 
}
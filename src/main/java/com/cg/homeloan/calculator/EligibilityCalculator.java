package com.cg.homeloan.calculator;
//Home loan is dependent on factors like monthly income, current age, credit score, 
//fixed monthly financial obligations, credit history, retirement age etc
public class EligibilityCalculator {
	//Reference - bajaj finserv
	private int age;
	private int creditScore;
	private int workExperience;		//in months
	private int businessExperience;	//in months
	private float monthlySalary;
	private float businessIncome;	//As mentioned in ITR
	private String nationality;
	private String occupation;
	enum employementStatus{
		SALARIED,
		SELF_EMPLOYED,
		UMEMPLOYED
	}
	
	public EligibilityCalculator() {
		
	}
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getCreditScore() {
		return creditScore;
	}



	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}



	public int getWorkExperience() {
		return workExperience;
	}



	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}



	public int getBusinessExperience() {
		return businessExperience;
	}



	public void setBusinessExperience(int businessExperience) {
		this.businessExperience = businessExperience;
	}



	public float getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(float monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	public float getBusinessIncome() {
		return businessIncome;
	}



	public void setBusinessIncome(float businessIncome) {
		this.businessIncome = businessIncome;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String getOccupation() {
		return occupation;
	}



	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}



	public boolean checkEligibilty() {
		if(creditScore<750) {
			return false;
		}
		if(!nationality.equals("Indian")) {
			return false;
		}
		
		if(occupation.equals(employementStatus.SALARIED)) {
			if(age<23||age>62) {
				return false;
			}
			if(monthlySalary<25000) {
				return false;
			}
			if(workExperience<36) {
				return false;
			}
		}
		else if(occupation.equals(employementStatus.SELF_EMPLOYED)){
			if(age<25||age>70) {
				return false;
			}
			if(businessIncome<500000) {
				return false;
			}			
			if(businessExperience<60) {
				return false;
			}
		}
		else if(occupation.equals(employementStatus.UMEMPLOYED)){
			return false;
		}
		
		return true;
		
	}
	
}

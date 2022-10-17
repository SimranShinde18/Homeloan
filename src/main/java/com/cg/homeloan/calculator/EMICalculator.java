package com.cg.homeloan.calculator;

public class EMICalculator {
	private double loanAmount;
	private double rateOfInterest;
	private int tenure;
	public EMICalculator() {
		
	}
	public EMICalculator(double loanAmount, double rateOfInterest, int tenure) {
		super();
		this.loanAmount = loanAmount;
		this.rateOfInterest = rateOfInterest;
		this.tenure = tenure;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	//P x R x (1+R)^N / [(1+R)^N-1]
	public double getEMIAmount() {
		double emi = loanAmount*rateOfInterest*Math.pow((1+rateOfInterest), tenure)/(Math.pow((1+rateOfInterest), tenure)-1);
		return emi;
	}
	
}

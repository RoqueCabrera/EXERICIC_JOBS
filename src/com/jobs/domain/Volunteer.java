package com.jobs.domain;

//CREATING VOLUNTEER CLASS THAT EXTENDS FROM ABSTAFMEMBER
public class Volunteer extends AbsStaffMember 
{
	//COMMON VARIABLES FOR ALL VOLUNTEERS
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	//-----------------------------------
	
	
	//THIS IS THE VOLUNTEER BUILDER WITH EXCEPTION IF THE GAPS FOR THE NAMES/ADDRESS/PHONE ARE BLANK
	public Volunteer(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception 
	{
		super(name, address, phone);		
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	//----------------------------------------------------------------------------------------------
	
	//THIS CLASS ALSO HAS THE METHOD PAY, ALLTHOUGH IT IS TO DECLARE THAT VOLUNTEERS DON´T PERCEIVE SALARY
	@Override
	public void pay() 
	{
		totalPaid=paymentRate.pay(salaryPerMonth);
		System.out.println("The volunteers don´t perceive salary.");		
	}
	//----------------------------------------------------------------------------------------------------
}
//--------------------------------------------------------
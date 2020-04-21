package com.jobs.domain;

//CREATING EMPLOYEE CLASS THAT EXTENDS FROM ABSTAFMEMBER
public class Employee extends AbsStaffMember 
{
	//COMMON VARIABLES FOR ALL EPLOYEES
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	//---------------------------------
	
	//THIS IS THE EMPLOYEE BUILDER WITH EXCEPTION IF GAPS ARE NEGATIVE OR BLANK. ALL RANKS COME FROM EMPLOYEE, EXCEPT THE VOLUNTEER 
	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception 
	{
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	
	//DECLARING THE METHOD TO PAY THE EMPLOYEES
	@Override
	public void pay() 
	{
		totalPaid=paymentRate.pay(salaryPerMonth);
		System.out.println("The salary is: " + totalPaid);
	}
	//-----------------------------------------
}
//--------------------------------------------------
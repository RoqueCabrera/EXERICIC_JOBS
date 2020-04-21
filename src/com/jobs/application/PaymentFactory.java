package com.jobs.application;

import com.jobs.domain.IPaymentRate;

//THIS IS THE CLASS THAT GENERATES THE PROCESS OF EMPLOYEE´S PAYMENT
public class PaymentFactory 
{

	
	//METHOD TO INCREMENT THE PAYMENT FOR A BOSS OBJECT
	public static IPaymentRate createPaymentRateBoss()
	{
		return new IPaymentRate() 
		{	
			@Override
			public double pay(double salaryPerMonth) 
			{
				return salaryPerMonth*1.5;
			}
		};
	}
	//-------------------------------------------------
	
	
	//METHOD TO INCREMENT THE PAYMENT FOR A MANAGER OBJECT
	public static IPaymentRate createPaymentRateManager()
	{
		return new IPaymentRate() 
		{
			@Override
			public double pay(double salaryPerMonth) 
			{
				return salaryPerMonth*1.1;
			}
		};
	}
	//---------------------------------------------------
	
	
	//METHOD TO DECREMENT THE PAYMENT FOR AN EMPLOYEE OBJECT
	public static IPaymentRate createPaymentRateEmployee()
	{
		return new IPaymentRate() 
		{
			@Override
			public double pay(double salaryPerMonth) 
			{
				return salaryPerMonth*0.85;
			}
		};
	}
	//------------------------------------------------------
	
	
	//METHOD TO ESTABLISH THE SALARY OF THE VOLUNTEER ("0")
	public static IPaymentRate createPaymentRateVolunteer()
	{
		return new IPaymentRate() 
		{
			@Override
			public double pay(double salaryPerMonth) 
			{
				return 0;
			}
		};
	}
	//-----------------------------------------------------
}
//------------------------------------------------------------------
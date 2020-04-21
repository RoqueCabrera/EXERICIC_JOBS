package com.jobs.application;

import java.util.Iterator;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

//THIS IS THE CLASS THAT CREATES THE TYPES OF EMPLOYEES
public class JobsController 
{
	//DECLARING THE CLASS TO STACK THE EMPLOYEES
	private EmployeeRepository repository;
	//------------------------------------------
	
	
	//THIS IS THE BUILDER FOR THE REPOSITORY WHERE WE WILL STACK THE EMPLOYEES
	public JobsController()
	{
		repository = new EmployeeRepository();
	}
	//------------------------------------------------------------------------
	
	
	//THIS IS THE BUILDER FOR THE BOSS, EXTENDING FROM ABSTAFFMEMBER
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
	{		
		AbsStaffMember boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	//--------------------------------------------------------------
	
	//THIS IS THE BUILDER FOR THE EMPLOYEE, EXTENDING FROM ABSTAFFMEMBER
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
	{		
		AbsStaffMember employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}
	//------------------------------------------------------------------

	//THIS IS THE BUILDER FOR THE MANAGER, EXTENDING FROM ABSTAFFMEMBER
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
	{
		AbsStaffMember manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(manager);		
	}
	//-----------------------------------------------------------------
	
	//THIS IS THE BUILDER FOR THE VOLUNTEER, EXTENDING FROM ABSTAFFMEMBER
	public void createVolunteerEmployee(String name, String address, String phone) throws Exception
	{
		double salaryPerMonth = 0;
		AbsStaffMember volunteer = new Volunteer(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateVolunteer());
		repository.addMember(volunteer);		
	}
	//-------------------------------------------------------------------


	//THIS IS THE METHOD TO PAY THE EMPLOYEES. WE USE FOREACH TO GO THROUGH THE LIST
	public void payAllEmployees() 
	{
		List<AbsStaffMember> allMembers = repository.getAllMembers();
		
		for (AbsStaffMember absStaffMember : allMembers) 
		{
			System.out.println("NAME: " + absStaffMember.getName());
			absStaffMember.pay();
			System.out.println("");
		}
	}
	//---------------------------------------

	//THIS IS THE METHOD TO GET THE LIST OF EMPLOYEES ONE BY ONE THROUGH FOREACH
	public String getAllEmployees() 
	{		
		for (AbsStaffMember member : repository.getAllMembers()) 
		{
			System.out.println(member);
		}
		return repository.getAllMembers().toString();
	}
	//---------------------------------------------------------------------------
}
//-----------------------------------------------------
package com.jobs.view;

import java.util.List;

import com.jobs.application.JobsController;
import com.jobs.domain.AbsStaffMember;

public class Main 
{
	//CREATING A NEW JOBSCONTROLLER PANEL
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception 
	{
		//CREATING ABSTAFFMEMEBERS (EMPLOYEES AND VOLUNTEERS) AND ADDING DIRECTLY TO THE LIST
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteerEmployee("Juan Volunteer", "Dirección molona 4", "614266666");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);
		//-----------------------------------------------------------------
		
		//ACTION OF AUTOMATICALLY PAYING ALL ABSTAFFMEMBERS
		controller.payAllEmployees();
		//-------------------------------------------------
		
		//DECLARING THE VARIABLE ALLEMPLOYEES TO GET THE LIST FROM THE CONTROLLER
		String allEmployees=controller.getAllEmployees();
		//-----------------------------------------------------------------------
		
		//PRINT THE LIST OF EMPLOYEES
		//System.out.println("EMPLOYEES: " + controller.getAllEmployees() + " \n");
		//---------------------------
	}
	//-----------------------------------
}

package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

//THIS IS THE METHOD TO CREATE A REPOSITORY (LIST) TO STACK ALL THE EMPLOYEES
public class EmployeeRepository 
{
	//CREATING A LIST FOR THE ABSTAFFMEMBERS (EMPLOYEES AND VOLUNTEERS)
	private static List<AbsStaffMember> members=new ArrayList<>();
	//-----------------------------------------------------------------
	
	
	//CREATING A LIST FOR THE ABSTAFFMEMBERS
	public EmployeeRepository()
	{
		members = new ArrayList<>();
	}
	//--------------------------------------
	
	
	//GETTER METHOD TO GET THE LIST OF ABSTAFFMEMBERS
	public List<AbsStaffMember> getAllMembers()
	{
		return new ArrayList<>(members);
	}
	//-----------------------------------------------
	
	//METHOD TO INSERT ABSTAFFMEMBERS IN THE LIST WITH EXCEPTION IF GAP IS NULL
	public void addMember(AbsStaffMember member) throws Exception
	{
		if(member==null) throw new Exception();
		members.add(member);
	}
	//-------------------------------------------------------------------------
	
}
//--------------------------------------------------------------------------
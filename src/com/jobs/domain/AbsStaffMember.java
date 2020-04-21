package com.jobs.domain;

//THIS IS THE CLASS FROM WHICH ALL THE EMPLOYEES INHERIT 
public abstract class AbsStaffMember 
{
	//DECLARING COMMON VARIABLES FOR THE ABSTAFFMEMBERS OBJECTS
	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;
	//---------------------------------------------------------
	
	
	//DECLARING A COUNTER TO ID THE MEMBERS AUTOMATICALLY
	private static int COUNTER_MEMBERS = 1;
	//---------------------------------------------------

	//THIS IS THE BUILDER THAT CREATES ALL KIND OF EMPLOYEES
	public AbsStaffMember(String name, String address, String phone) throws Exception 
	{
		//Conditionals to avoid empty gaps
		if (name.equals(""))
			throw new Exception("You must write a name");
		if (address.equals(""))
			throw new Exception("You must write an adress");
		if (phone.equals(""))
			throw new Exception("You must write a number");
		//--------------------------------
		
		this.name = name;
		this.address = address;
		this.phone = phone;
		//autoincrement the counter to single id every member
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
		//---------------------------------------------------
	}
	//------------------------------------------------------
	
	
	//GENERATING GETTER & SETTER FOR ID
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	//---------------------------------
	
	
	//GENERATING GETTER & SETTER FOR NAME
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	//-----------------------------------
	

	//GENERATING GETTER & SETTER FOR ADDRESS
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	//--------------------------------------

	
	//GENERATING GETTER & SETTER FOR PHONE NUMBER
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	//-------------------------------------------
	
	
	//GENERATING GETTER & SETTER FOR TOTAL PAID
	public double getTotalPaid() 
	{
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) 
	{
		this.totalPaid = totalPaid;
	}
	//-----------------------------------------
	
	//DECLARING EMPTY ABSTRACT METHOD TO PAY
	public abstract void pay();
	//--------------------------------------
	
	
	//TURNING THE RESULT TOSTRING SO THAT THE CONSOLE CAN SHOW IT CORRECTLY
	@Override
	public String toString() 
	{
		return "AbsStaffMember [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", totalPaid=" + totalPaid + "]";
	}
	//---------------------------------------------------------------------
}
//------------------------------------------------------

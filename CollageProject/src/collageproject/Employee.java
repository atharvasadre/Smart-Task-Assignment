/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collageproject;

import java.util.Scanner;

/**
 *
 * @author Vidula
 */
public class Employee extends Person
{
    int employee_id;

	int work_experience_in_months;
	
	int points_of_employee;
	
	String domain_of_work;
	
	int hours_of_work_left; 
	
	boolean engaged_in_work;
	
	
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the prior work experience in months of the employee of the employee");
		
		work_experience_in_months=sc.nextInt();
		
		points_of_employee=50;
		
	
		System.out.println("please enter the domain of work of the employee of the employee");
		
		domain_of_work=sc.next();
		
		System.out.println("enter the employee id");
		
		employee_id=sc.nextInt();
		
		
		engaged_in_work=false;
		
		
	}
	
	
	public int get_Employee_id()
	{
		
		return employee_id;
		
	}
	
	public int get_Work_Experience()
	{
		return work_experience_in_months;
	}
	
	
	public String get_Domain()
	{
		return domain_of_work;
	}
	
	public int get_Hours_Of_Work_Left() 
	{
		return hours_of_work_left;
	}
	
	public boolean get_Status_Of_Work() 
	{
		return engaged_in_work;
	}
	
	
	public void update_Employee_id()
	{
		Scanner sc=new Scanner(System.in);
		
		int changed_employee_id=sc.nextInt();
		
		employee_id=changed_employee_id;
		
		System.out.println("the employee id has been updated");
		
	}
	

	public void update_Employee_Domain_Of_Work()
	{
		Scanner sc=new Scanner(System.in);
		
		String changed_domain_of_work=sc.next();
		
		domain_of_work=changed_domain_of_work;
		
		System.out.println("The domain of work of employee is updated");
		
	}
	
	
	public void update_Employee_Points(int change_in_points)
	{
		points_of_employee+=change_in_points;
		
	}
	
	public void update_Work_Experience_Of_Employee(int change_in_work_experience)
	{
		work_experience_in_months+=change_in_work_experience;
	}

	public void update_Hours_of_Work_Left(int change_in_hours_of_work_left)
	{
		hours_of_work_left-=change_in_hours_of_work_left;
	}
	
	///currently the value is fixed to 40 hours per week
	public void reset_Employee_Hours_Of_Work()
	{
		hours_of_work_left=40;  
	}
	
	public void set_employee_status_of_work()
	{
		engaged_in_work=true;
	}
	
	public void reset_employee_status_of_work()
	{
		engaged_in_work=false;
	}
    
    
}

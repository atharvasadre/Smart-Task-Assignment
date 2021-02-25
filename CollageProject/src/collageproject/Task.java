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
public class Task 
{
    String task_statement;
	
	int no_of_empoyees;
	
	int experience_required;
	
	//int points_required;
	
	String domain_of_task;
	
	int time_of_task;
	
	
	
	Task()
	{       /*
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the task statement");
		task_statement=sc.nextLine();
		
		System.out.println("Enter the minimum hours of experience required ");
		experience_required=sc.nextInt();
		
		System.out.println("Enter the number of employees required ");
		no_of_empoyees=sc.nextInt();
		
		System.out.println("Enter the domain of Task");
		domain_of_task=sc.next();
		
		System.out.println("enter the time required for task");
		time_of_task=sc.nextInt();
		
		*/
		
		
		
	}
	
	
	
	Task generate_Task()
	{
		return new Task();	
	}
	
	
	Employee [] select_employees_for_task(Employee[] array_of_employee)
	{
		int temp_no_emp=no_of_empoyees;
		
		
		Employee employees_on_task[]=new Employee[no_of_empoyees];
		
		
		for(int i=0 ; i<array_of_employee.length || temp_no_emp>0  ; i++)
		{
			
			if(!array_of_employee[i].get_Domain().equals(domain_of_task))
			{
				continue;
			}
			
			if(array_of_employee[i].get_Status_Of_Work()==true)
			{
				continue;
			}
			
			if(array_of_employee[i].get_Work_Experience() < experience_required )
			{
				continue;
			}
			
			
			
			employees_on_task[no_of_empoyees-temp_no_emp]=array_of_employee[i];
			
			temp_no_emp--;
			
		}
		
		if(temp_no_emp>0)
		{
			System.out.print("Could not assign task to the employes given number to people"); 
			
			return null;
			
		}
		
		
		for(int i=0;i<employees_on_task.length;i++ )
		{
			array_of_employee[i].set_employee_status_of_work();
		}
		
		return employees_on_task;
		
		
				
	}
	

	void competion_of_task(Employee[] employees_on_task,int points_gained)
	{

		for(int i=0;i<employees_on_task.length;i++)
		{
			
			employees_on_task[i].reset_employee_status_of_work();
			
			employees_on_task[i].update_Work_Experience_Of_Employee(time_of_task);
			
			employees_on_task[i].update_Hours_of_Work_Left(time_of_task);
			
			employees_on_task[i].update_Employee_Points(points_gained);
			
			
			
		}
			
			
	}
    
}

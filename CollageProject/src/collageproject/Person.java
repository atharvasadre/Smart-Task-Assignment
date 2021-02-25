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
public class Person {
    
    String name;
	
	int age;
	
	String address;
	
	char gender;
	
	
	
	Person()
	{
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Please enter the employee name");
		
		name=sc.nextLine();
		
		System.out.println("Please enter the age of the employee");
		
		age=sc.nextInt();
		
		System.out.println("Please enter the the adress of the empoyee");
		
		address=sc.nextLine();
		
		System.out.println("Please enter the gender of the employee");
		
		gender=sc.next().charAt(0);
		
		
	}
	
	
	
	String get_Employee_Name()
	{
		return name;
	}
	
	int get_Employee_Age()
	{
		return age;
	}
	
	
	String get_Employee_Address()
	{
		return address;
	}
	
	
	char get_Employee_Gender()
	{
		return gender;
	}
	
	
	void update_Information_Of_Person()
	{
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("The fienlds of the employee are  ");
		System.out.println("1.NAME\n2.AGE\n3.ADDRESS\n4.GENDER");
		
		int choice_update=-1;
		
		boolean exit =false; 
		
		do {
			
		System.out.println("please enter the choice which you want to Update");
		
		
		choice_update=sc.nextInt();
		
		switch(choice_update)
		{
		
		case 1:
			{
				String changed_name;
				
				System.out.println("Please enter the changed name");
				changed_name=sc.nextLine();
				
				name=changed_name;
				
				System.out.println("The request for the name change is acomplished");
				
			break;
			}
		
		case 2:
		{
			int changed_age;
			
			System.out.println("Please enter the changed age");
			changed_age=sc.nextInt();
			
			age=changed_age;
			
			System.out.println("The request for the age change is acomplished");
			
		break;
		}
	
		
		case 3:
		{
			String changed_address;
			
			System.out.println("Please enter the changed address");
			changed_address=sc.nextLine();
			
			address=changed_address;
			
			System.out.println("The request for the address change is acomplished");
			
		break;
		}
		
		
		case 4:
		{
			char changed_gender;
			
			System.out.println("Please enter the changed gender");
			changed_gender=sc.next().charAt(0);
			
			
			gender=changed_gender;
			
			System.out.println("The request for the gender change is acomplished");
			
		break;
		}
		
		default:
			{
				System.out.print("Please choose a walid choice");
				
			}
		
		}
		
		
		int temp=1;
		
		System.out.println("If you want to exit press 1 else press 0 to continue ");
		
		temp=sc.nextInt();
		
		if(temp==1)
		{
			exit=true;
			
			
		}
		else
		{
			exit=false;
		}
		
		
		
		}while(exit);
		
		
		
	}
	
	
	
	Person create_Object_Of_Person()
	{
		
		Person temp= new Person();
		
		return temp;
		
	}
    
    
}

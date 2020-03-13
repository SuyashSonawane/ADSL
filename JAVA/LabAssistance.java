import java.util.Scanner;

import support.salary;


public class LabAssistance {
	public void print(String s)
	{
		System.out.println(s);
	}
	public void print(int s)
	{
		System.out.println(s);
	}
	Employee em;
	salary s;
	public LabAssistance()
	{
		s = new salary(5000);
		 em=new Employee(); 
	}
	public void getInfo()
	{
		Scanner sc= new Scanner(System.in);
		print("Enter Lab Assistanc's name : ");
		String name = sc.next();
		
		print("Enter Lab Assistanc's qualification : ");
		String qual = sc.next();
		
		print("Enter Lab Assistanc's id : ");
		int id = sc.nextInt();
		
		print("Enter Lab Assistanc's salary : ");
		float sal = sc.nextFloat();
		
		em.setData(name, qual, id,sal);
		
	}
	public String  printBioData()
	{
		return em.biodata();
	}
}

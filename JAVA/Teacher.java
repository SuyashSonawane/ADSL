import java.util.*;
import support.salary;
public class Teacher extends Employee{
	salary s;
	public void print(String s)
	{
		System.out.println(s);
	}
	public void print(int s)
	{
		System.out.println(s);
	}
	Employee em;
	public Teacher()
	{
		s= new salary(10000);
		em=new Employee(); 
	}
	public void getInfo()
	{
		Scanner sc= new Scanner(System.in);
		print("Enter teacher name : ");
		String name = sc.next();
		
		print("Enter teacher qualification : ");
		String qual = sc.next();
		
		print("Enter teacher id : ");
		int id = sc.nextInt();
		
		print("Enter teacher salary : ");
		float sal = sc.nextFloat();
		
		em.setData(name, qual, id,sal);
		
	}
	public String printBioData()
	{
		return em.biodata();
	}
}

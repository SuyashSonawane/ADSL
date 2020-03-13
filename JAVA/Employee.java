import support.salary;
public class Employee implements Resume {
	String name="NULL" , qualification="NULL";
	int id=0;
	salary s =new salary(1000);
	public void setData(String n,String q,int i,float sal)
	{
		id=i;
		qualification=q;
		name=n;
		s.pm=sal;
	}
	public String biodata() {
		return "Name : "+name+"\nQualification : "+qualification+"\nID : "+id+"\nSalary :"+s.pm;
	}	
	
}

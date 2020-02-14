
import java.util.Scanner;
public class hello {
	
	public static void main(String args[])
	{
		Student s[] = new Student[50];
		int studentNumber=0;
		
		Scanner scanner = new Scanner(System.in);
		String name="None";
		int rollno=0;
		String menu="\n1.Add student\n2.Display Students\n3.Search\n4.Update\n99.Exit\n>>";
		int ui=0;
		
		while(true)
		{
			System.out.println(menu);
			ui = scanner.nextInt();
			switch(ui)
			{
				case 1:
					s[studentNumber]=new Student();
					System.out.println("Enter Roll number and Name : ");
					rollno =scanner.nextInt();
					name=scanner.nextLine();
					
					s[studentNumber].setinfo(name, rollno);
					studentNumber++;
					break;
				case 2:
					for(int i=0;i<studentNumber;i++)
					{					
						s[i].display();						
					}
					System.out.println("\nTotal Students "+Student.items+"\n");
					break;
				case 3:
					int target=0;
					System.out.println("Enter Roll number to search : ");
					target = scanner.nextInt();
					for(int i=0;i<studentNumber;i++)
					{
						if(s[i].rollNo==target)
						{
							s[i].display();
							break;
						}
						System.out.println("No such student!");
					}
					break;
				case 4:
					target=0;
					System.out.println("Enter Roll number to Upadte : ");
					target = scanner.nextInt();
					for(int i=0;i<studentNumber;i++)
					{
						if(s[i].rollNo==target)
						{
							System.out.println("Enter Roll number and Name : ");
							rollno =scanner.nextInt();
							name=scanner.nextLine();
							s[i].setinfo(name,rollno);
							System.out.println("Updated!! ");
							break;
						}
						System.out.println("No such student!");
					}
					break;
				case 99:
					return;
				default:
					System.out.println("Incorect Value\n");
			}
		}
		
		
		
		
		
		
//		
//		
//		
//		for(int i=0;i<5;i++)
//		{
//			
//			s[i]=new Student();
//			System.out.println("Enter Name : ");
//			String name=scanner.nextLine();
//			System.out.println("Enter Roll number : ");
//			String rollno=scanner.nextLine();
//			s[i].setinfo(name, Integer.parseInt(rollno));
//			s[i].display();
//			
//		}	
	}
}
class Student{
	String name;
	int rollNo;
	public static int items;
	
	Student()
	{
		items++;
	}
	
	void setinfo(String n,int r)
	{
		this.name = n;
		this.rollNo=r;
	}
	void display()
	{
		System.out.print("\nName of the student :"+this.name+"\nRoll number : "+this.rollNo+"\n");
	}
	
}
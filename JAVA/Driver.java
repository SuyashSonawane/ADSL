import java.util.*;
public class Driver extends College {
	public static void main(String args[])
	{
		department comp=new department("Computer"); 
		department entc=new department("ENTC");
		department civil=new department("Civil");
		department it=new department("IT");
		
		int ui;
		int temp;
		String menu="1.Add to Comp\n2.Add to ENTC\n" +
				"3.Add to Civil\n4.Add to IT\n5.Show Avg placed\n" +
				"99.Exit\n>>";
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println(menu);
			ui=sc.nextInt();
			switch(ui)
			{
			case 1:
				System.out.println("Enter number of placed students");
				temp=sc.nextInt();
				avgPlaced+= comp.addPlaced(temp);
				break;
			case 2:
				System.out.println("Enter number of placed students");
				temp=sc.nextInt();
				avgPlaced+= entc.addPlaced(temp);
				break;
			case 3:
				System.out.println("Enter number of placed students");
				temp=sc.nextInt();
				avgPlaced+= civil.addPlaced(temp);
				break;
			case 4:
				System.out.println("Enter number of placed students");
				temp=sc.nextInt();
				avgPlaced+= it.addPlaced(temp);
				break;
			case 5:
				System.out.println("Average students placed => " + avgPlaced/4);
				
				break;
				
			case 99:
				return;
				
			default:
				System.out.println("Enter correct option\n");
					
				
			}
		}
		
		
	}
}

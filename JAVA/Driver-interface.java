import java.util.*;
public class Driver {
	
	public static void main(String args[])
	{
		int  ti=0;
		int ai=0;
		Teacher[] tc = new Teacher[20];
		LabAssistance[] la = new LabAssistance[20];
		
		for(int i =0;i<20;i++)
		{
			tc[i]=new Teacher();
			la[i]=new LabAssistance();
		}
		
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Add new Teacher\n" +
					"2.Add new Lab Assistance\n" +
					"3.View Data of Teachers\n" +
					"4.View Data of Assistances\n99.Exit\n>>");
			
			int ui;
			ui=sc.nextInt();
			
			switch(ui)
			{
			case 1:
				tc[ti++].getInfo();
				break;
			case 2:
				la[ai++].getInfo();
				break;
			case 3:
				for(int i=0;i<ti;i++)
				{
					System.out.println(tc[i].printBioData()+"\n");
				}
				break;
				
			case 4:
				for(int i=0;i<ai;i++)
				{
					System.out.println(la[i].printBioData()+"\n");
				}
				break;
				
			case 99:
				return;
				
			default:
					System.out.println("Enter correct option");
				
			}
			
		}
		
		
		
	}
}

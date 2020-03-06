
public class department extends College implements dept{
	public int placed=0;
	public String name;
	
	public department(String n)
	{
		name=n;
	}
	public void displayInfo() {
		
		System.out.println("Total placed in "+name+ " Department => "+ placed);
		
		
	}
	public int  addPlaced(int x)
	{		
		placed+=x;
		displayInfo();
		return placed;
	}
	

}
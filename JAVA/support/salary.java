package support;

public class salary {
	public static float pm=0;
	public float calculate()
	{
		return (float) (pm*11.5);
		
	}
	public salary(int pm)
	{
		salary.pm=pm;
	}
	public float getSalary()
	{
		return pm;
	}
	
}

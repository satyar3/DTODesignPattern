package VOorTO;

public class StudentTOorVOClass
{
	private int rollNo;
	private String name;
	
	public StudentTOorVOClass(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}

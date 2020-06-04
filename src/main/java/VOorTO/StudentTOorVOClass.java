package VOorTO;

import java.io.Serializable;

public class StudentTOorVOClass implements Serializable
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

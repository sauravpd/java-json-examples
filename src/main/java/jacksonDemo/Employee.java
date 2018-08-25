package jacksonDemo;

import java.util.List;

public class Employee 
{
	private String employeeName;
	private int age;
	private String position;
	private long salary;
	private List<String> skills;

	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getPosition() 
	{
		return position;
	}
	public void setPosition(String position) 
	{
		this.position = position;
	}
	public long getSalary() 
	{
		return salary;
	}
	public void setSalary(long salary) 
	{
		this.salary = salary;
	}
	public List<String> getSkills() 
	{
		return skills;
	}
	public void setSkills(List<String> skills) 
	{
		this.skills = skills;
	}
}

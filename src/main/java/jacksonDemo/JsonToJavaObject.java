package jacksonDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObject 
{
	public static void main(String[] args) 
	{
		ObjectMapper mapper=new ObjectMapper();
		Employee employee;
		try
		{
			// json to object
			employee=mapper.readValue(new File("src//main//java//jacksonDemo//employee.json"),Employee.class);
			System.out.println("Employee Details");
			System.out.println("Name : "+employee.getEmployeeName());
			System.out.println("Age : "+employee.getAge());
			System.out.println("position : "+employee.getPosition());
			System.out.println("Salary : "+employee.getSalary());
			System.out.println("Skills : "+employee.getSkills());

			// json pretty print format
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

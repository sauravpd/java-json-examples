package googleGson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import jacksonDemo.Employee;


public class gsonDemo 
{
	public static void main(String[] args) throws JsonIOException, IOException 
	{
		try
		{
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		Employee employee=addEmployee();
		
		// object to json string
		String empJson=gson.toJson(employee);
		
		System.out.println(empJson);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	

	private static Employee addEmployee()
	{
		Employee emp=new Employee();
		emp.setEmployeeName("John");
		emp.setAge(25);
		emp.setPosition("Software Engineer");
		emp.setSalary(80000);

		List<String> skills=new ArrayList<String>();
		skills.add("java");
		skills.add("python");
		skills.add("javascript");
		skills.add("automation");
		emp.setSkills(skills);
		return emp;
	}
}

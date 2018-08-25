package jacksonDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJson 
{
	public static void main(String[] args) 
	{
		ObjectMapper mapper=new ObjectMapper();
		Employee employee=addEmployee();
		try
		{
			// object to json
			mapper.writeValue(new File("src//main//java//jacksonDemo//employee.json"),employee);

			// object to json string
			String jsonString=mapper.writeValueAsString(employee);
			System.out.println(jsonString);
			
			// json pretty print format
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee));
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

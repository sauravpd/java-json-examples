package jacksonDemo;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap
{
	public static void main(String[] args) 
	{
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			// json to object
			Map<String, Object> map = mapper.readValue(new File("src//main//java//jacksonDemo//employee.json"), new TypeReference<Map<String,Object>>(){});
			System.out.println("Employee Name :"+map.get("employeeName"));
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

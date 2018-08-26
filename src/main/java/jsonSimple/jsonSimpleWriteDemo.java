package jsonSimple;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonSimpleWriteDemo 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		try
		{
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("name", "Steve");
			jsonObject.put("age", 25);
			JSONArray jsonArray=new JSONArray();
			jsonArray.add("Maths");
			jsonArray.add("chemistry");
			jsonObject.put("subjects", jsonArray);
			
			FileWriter fw=new FileWriter("src//main//java//jsonSimple//student.json");
			fw.write(jsonObject.toJSONString());
			fw.flush();

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

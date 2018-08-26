package jsonSimple;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonSimpleReadDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			JSONParser jsonParser=new JSONParser();
			JSONObject jsonObject=(JSONObject) jsonParser.parse(new FileReader("src//main//java//jsonSimple//student.json"));
			System.out.println("*****Student details*****");
			System.out.println("Name : "+jsonObject.get("name"));
			System.out.println("Age : "+jsonObject.get("age"));
			System.out.println("Subjects : "+jsonObject.get("subjects"));

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

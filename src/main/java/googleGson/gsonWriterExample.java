package googleGson;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

import jacksonDemo.Student;

public class gsonWriterExample 
{
	public static void main(String[] args) 
	{
		JsonWriter writer;
		try
		{
			writer=new JsonWriter(new FileWriter("src//main//java//googleGson//student.json"));
			writer.beginObject();
			writer.name("name").value("Steve");
			writer.name("age").value(25);

			writer.name("subjects");
			writer.beginArray();

			writer.value("Maths");
			writer.value("Science"); 
			writer.value("physics"); 
			writer.value("chemistry");

			writer.endArray();
			writer.endObject(); 
			writer.close();
			
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
			Student student= gson.fromJson(new FileReader("src//main//java//googleGson//student.json"),Student.class);
			System.out.println(gson.toJson(student));
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

package jacksonDemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGeneratorExample 
{
	public static void main(String[] args) 
	{
		try 
		{
			ObjectMapper mapper=new ObjectMapper();
			
			JsonFactory jfactory = new JsonFactory();
			// write to file 
			JsonGenerator jGenerator = jfactory.createGenerator(new File("src//main//java//jacksonDemo//student.json"), JsonEncoding.UTF8);
			jGenerator.writeStartObject(); 

			jGenerator.writeStringField("name", "Steve");
			jGenerator.writeNumberField("age", 35);

			jGenerator.writeFieldName("subjects");
			jGenerator.writeStartArray(); 

			jGenerator.writeString("Maths");
			jGenerator.writeString("Science"); 
			jGenerator.writeString("physics"); 
			jGenerator.writeString("chemistry");

			jGenerator.writeEndArray(); 
			jGenerator.writeEndObject(); 
			jGenerator.close();
			Student student=mapper.readValue(new File("src//main//java//jacksonDemo//student.json"),Student.class);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();

		} catch (JsonMappingException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

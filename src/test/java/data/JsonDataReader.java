package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	
	
	public String username, password , email , name , msgtxt , country , city , card , month , year ;
	
	
	public void jsonReader () throws FileNotFoundException, IOException, ParseException
	
	{
		String filePath = System.getProperty("user.dir")+ "\\src\\test\\java\\data\\UserData.Json" ;
		File srcFile = new File(filePath) ;
		
		JSONParser parser = new  JSONParser() ;
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcFile)) ;
		
		for (Object jsonObject : jArray) {
			
			JSONObject person = (JSONObject) jsonObject ;
			
			username = (String)person.get("username") ;
			System.out.println(username);
			
			password = (String)person.get("password") ;
			System.out.println(password);
			
			email = (String)person.get("email") ;
			System.out.println(email);
			
			name = (String)person.get("name") ;
			System.out.println(name);
			
			msgtxt = (String)person.get("msgtxt") ;
			System.out.println(msgtxt);
			
			country = (String)person.get("country") ;
			System.out.println(country);
			
			city = (String)person.get("city") ;
			System.out.println(city);
			
			card = (String)person.get("card") ;
			System.out.println(card);
			
			month = (String)person.get("month") ;
			System.out.println(month);
			
			year = (String)person.get("year") ;
			System.out.println(year);
			
		}
		 
		
		}
	

}

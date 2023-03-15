package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.ContactPage;
import pages.HomePage;

public class ContactTest extends TestBase {
	
	
	HomePage homeObject ;
	ContactPage contactObject ;

	
	@Test (priority = 1)
	
	public void userCanContcatUs () throws FileNotFoundException, IOException, ParseException 
	
	{
		
		homeObject = new HomePage(driver) ;
		homeObject.goToContactUsPage();
		
		JsonDataReader JsonDataReader = new JsonDataReader () ;
		JsonDataReader.jsonReader();
		
		contactObject = new ContactPage(driver) ;
		contactObject.userCanContactUs(JsonDataReader.email , JsonDataReader.name , JsonDataReader.msgtxt);
		
	}
}

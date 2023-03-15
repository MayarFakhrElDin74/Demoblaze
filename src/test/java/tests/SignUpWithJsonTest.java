package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpWithJsonTest extends TestBase {
	
	
	HomePage homeObject ;
	SignUpPage signupObject ;
	
	
	@Test (priority = 1)
	
	public void userCanSignUp () throws FileNotFoundException, IOException, ParseException
	
	{
		homeObject = new HomePage(driver) ;
		homeObject.goTosignUpPage();
		
		JsonDataReader jsonReader = new JsonDataReader() ;
		jsonReader.jsonReader();
		
		signupObject = new SignUpPage(driver) ;
		signupObject.UserCanSignUp(jsonReader.username , jsonReader.password);
		
		assertTrue(homeObject.getLoginLinkTxt().equals("Log in")) ;
		
	}

}

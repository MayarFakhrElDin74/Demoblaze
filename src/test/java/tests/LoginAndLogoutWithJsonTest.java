package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.LoginPage;

public class LoginAndLogoutWithJsonTest extends TestBase {
	
	HomePage homeObject ;
	LoginPage loginObject ;
	
	
	@Test (priority = 1)
	
	public void registeredUserCanLogin () throws FileNotFoundException, IOException, ParseException
	
	{
		
		homeObject = new HomePage(driver) ;
		homeObject.goToLoginPage();
		
		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();
		
		loginObject = new LoginPage(driver) ;
		loginObject.registeredUserLogin(jsonDataReader.username , jsonDataReader.password);
		
		Assert.assertTrue(homeObject.getLogoutLinkTxt().equals("Log out")) ;
		
	}
	
	
	@Test (priority = 2)
	
	public void registeredUserCanLogout ()
	
	{
		homeObject = new HomePage(driver) ;
		homeObject.registeredUserCanLogout();
		
		assertTrue(homeObject.getLoginLinkTxt().equals("Log in"));
	}

}

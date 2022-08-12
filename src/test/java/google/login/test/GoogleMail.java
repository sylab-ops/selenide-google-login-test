package google.login.test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class GoogleMail {
	private final String baseUrl = "https://accounts.google.com";
	String gMail = "randomregalix@gmail.com";
	String passwd = "@Admin099";
	
	
	@Before
	public  void openUrl() {
		open(baseUrl);
	}
	
	
	@Test 
	public void canUserLogin() {
		$(By.xpath("//*[@id=\"identifierId\"]")).setValue(gMail);
		$(By.xpath("//*[@id=\"identifierNext\"]/div/button")).pressEnter();
		$(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).setValue(passwd);
		$(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		
		assertTrue(true);
	}
	
	@After
	public void endUp() {
		sleep(1000);
		closeWebDriver();
	}

}

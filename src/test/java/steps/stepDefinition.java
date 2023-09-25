package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Login;
import pageObjects.Superuser;
import pageObjects.registerPageObjects;
import utils.base;
public class stepDefinition extends base {

	private Properties properties;
	private base base;
	
	private Wait <WebDriver>wait;
	
	private JavascriptExecutor js;
	private Robot r;
	private Login login;
	private Superuser Hq;
	private registerPageObjects registerPageObjects;

//    WebDriverWait failedLoginWebDriverWait = new WebDriverWait(driver, 7);

	@Before
	public void setup() throws IOException, AWTException {

		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/data.properties");
		properties = new Properties();

		properties.load(fis1);
		// driver = initializeDriver("chrome", "x64", "Linux");
		driver = initializeDriver("chrome", "x64", "windows");
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		r = new Robot();

		login = new Login(driver);
		Hq = new Superuser(driver);
		registerPageObjects = new registerPageObjects(driver);
		wait = new FluentWait<>(driver)

                .withTimeout(Duration.ofSeconds(2l))
                .pollingEvery(Duration.ofMillis(500l))
                .ignoring(NoSuchElementException.class);
		String Name = RandomStringUtils.randomAlphabetic(2);
	List<WebElement>Count=driver.findElements(registerPageObjects.getCountryDropDownElements());
	for(int i=0; i<Count.size();i++) {
		WebElement element=Count.get(i);
		String list1=element.getText();
		if(list1.contains("India(+91)")) {
			element.click();
		}
	}
		
	}

	@After("@zkdigimax")
//Checks if the scenario fails then it will take a screenshot
	public void teardown(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.isFailed()) {
			scenario.attach(getByteScreenshot(driver), "image/png", "screenshot name");

		}
		driver.quit();
	}

	private byte[] getByteScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

//Sprint1 
//login ........

	@Given("I am on landing page of the application")
	public void i_am_on_landing_page_of_the_application() throws InterruptedException {
		driver.get(properties.getProperty("url"));
		Thread.sleep(2000);
		System.out.println("I Enter the URL");
	}

	@Then("I click on register button")
	public void i_click_on_register_button() throws InterruptedException {
		

		Assert.assertTrue(driver.findElement(registerPageObjects.getRegisterBtn()).isDisplayed());
		WebElement register = driver.findElement(registerPageObjects.getRegisterBtn());
		System.out.println(register.getText());
		Thread.sleep(1000);
		register.click();
	}
	@Then("I verify the registration page")
	public void i_verify_the_registration_page() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getRegisterPage()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getRegisterPage()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getFirstName()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getFirstName()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getLastName()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getLastName()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getCountryCode()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getCountryCode()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getMobile()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getMobile()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getEmail()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getEmail()).isDisplayed());
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getEmail()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getPasword()).isDisplayed());
	}
	@Then("I verify the field validation")
	public void i_verify_the_field_validation() {
		//firstname
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getFirstNameTextField()));
	Assert.assertTrue(driver.findElement(registerPageObjects.getFirstNameTextField()).isDisplayed());
	driver.findElement(registerPageObjects.getEmailTextFiled()).click();
	driver.findElement(registerPageObjects.getFirstNameTextField()).sendKeys(properties.getProperty("Firstname"));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getFirstnameErrorMsg()));
	Assert.assertTrue(driver.findElement(registerPageObjects.getFirstnameErrorMsg()).isDisplayed());
	System.out.println(driver.findElement(registerPageObjects.getFirstnameErrorMsg()).getText());
	
	//lastname 
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getLastName()));
	Assert.assertTrue(driver.findElement(registerPageObjects.getLastNameTextField()).isDisplayed());
	driver.findElement(registerPageObjects.getLastNameTextField()).click();
	driver.findElement(registerPageObjects.getLastNameTextField()).sendKeys(properties.getProperty("Lastname"));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getLastNameErrorMsg()));
	Assert.assertTrue(driver.findElement(registerPageObjects.getLastNameErrorMsg()).isDisplayed());
	System.out.println(driver.findElement(registerPageObjects.getLastNameErrorMsg()).getText());
	
	//Email
	
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getEmailTextFiled()));
	Assert.assertTrue(driver.findElement(registerPageObjects.getEmailTextFiled()).isDisplayed());
	driver.findElement(registerPageObjects.getEmailTextFiled()).click();
	driver.findElement(registerPageObjects.getEmailTextFiled()).sendKeys(properties.getProperty("Email"));
//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(registerPageObjects.getEmailErrorMsg()));
//	Assert.assertTrue(driver.findElement(registerPageObjects.getEmailErrorMsg()).isDisplayed());
//	System.out.println(driver.findElement(registerPageObjects.getEmailErrorMsg()).getText());
	}
	
	@Then("I verify the Sucess message")
	public void i_verify_the_sucess_message() throws InterruptedException {
		String email123=RandomStringUtils.randomAlphabetic(6)+"@gmail.com";
		  String name = RandomStringUtils.randomAlphabetic(4);
		  String number=RandomStringUtils.randomNumeric(10);
		driver.findElement(registerPageObjects.getEmailTextFiled()).click();
		driver.findElement(registerPageObjects.getFirstNameTextField()).sendKeys(name);
		Thread.sleep(100);
		driver.findElement(registerPageObjects.getLastNameTextField()).click();
		driver.findElement(registerPageObjects.getLastNameTextField()).sendKeys(name);
	   //Country
		 driver.findElement(registerPageObjects.getCountryDropDown()).click();
		 Thread.sleep(1000);
		 
		 
		List<WebElement>Count=driver.findElements(registerPageObjects.getCountryDropDownElements());
		for(int i=0; i<Count.size();i++) {
			WebElement element=Count.get(i);
			String list1=element.getText();
			if(list1.contains("India (+91)")) {
				element.click();
			}
		}
		
		driver.findElement(registerPageObjects.getMobileTextField()).click();
		driver.findElement(registerPageObjects.getMobileTextField()).sendKeys(number);
		Thread.sleep(2000);
	
		
		driver.findElement(registerPageObjects.getEmailTextFiled()).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getEmailTextFiled()));
		WebElement enterData=driver.findElement(registerPageObjects.getEmailTextFiled());
		enterData.sendKeys(email123);;
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getPasswordTextFiled()));
		driver.findElement(registerPageObjects.getPasswordTextFiled()).click();
		driver.findElement(registerPageObjects.getPasswordTextFiled()).sendKeys(properties.getProperty("password"));
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getconformPasswordTextField()));
		driver.findElement(registerPageObjects.getconformPasswordTextField()).click();
		driver.findElement(registerPageObjects.getconformPasswordTextField()).sendKeys(properties.getProperty("password"));
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getCreateBtn()));
		driver.findElement(registerPageObjects.getCreateBtn()).click();
		Thread.sleep(2000);

	}
	@Then("I verify the login link text is present in register page")
	public void i_verify_the_login_link_text_is_present_in_register_page() {
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getRegisterPageLoginBtn()));
		Assert.assertTrue(driver.findElement(registerPageObjects.getRegisterPageLoginBtn()).isDisplayed());
		driver.findElement(registerPageObjects.getRegisterPageLoginBtn()).click();
	}
	@Then("I verify the login page")
	public void i_verify_the_login_page() {
		System.out.println("wewe");
		wait.until(ExpectedConditions.presenceOfElementLocated(registerPageObjects.getLoginScreen()));
		System.out.println("wewe");
		//Assert.assertTrue(driver.findElement(registerPageObjects.getLoginScreen()).isDisplayed());
		System.out.println(driver.findElement(registerPageObjects.getLoginScreen()).getText());
		System.out.println("wewe");
	}






}
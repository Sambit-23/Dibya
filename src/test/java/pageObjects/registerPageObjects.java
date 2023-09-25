package pageObjects;

 

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

 

 

public class registerPageObjects {

 

    private WebDriver driver;
    Actions actions;
    Robot robot;
    JavascriptExecutor javascriptExecutor;

 

    public registerPageObjects(WebDriver driver) {
        this.driver = driver;

 

        actions = new Actions(driver);
        try {
            robot = new Robot();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        javascriptExecutor = (JavascriptExecutor) this.driver;
        PageFactory.initElements(driver, this);

 

    }
  //button[normalize-space()='Login']
 

    
    private final By registerBtn =By.xpath("//*[@id=\"root\"]/div[1]/div[1]/header/div/button[2]");
    private final By registerPage = By.cssSelector("body > div  div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation> div > p > strong");
    private final By firstname=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[1]/label");
    private final By lastname=By.cssSelector("body > div > div> div > div > div > div.MuiPaper-root > div > form > div > div:nth-child(2) > label");
    private final By countrycode=By.cssSelector("body > div.MuiDialog-root > div > div > div > div > div.MuiPaper-root > div > form > div > div:nth-child(3) > label");
    private final By mobile=By.cssSelector("body > div.MuiDialog-root > div > div > div > div > div.MuiPaper-root > div > form > div > div:nth-child(4) > label");
    private final By email=By.cssSelector("body > div.MuiDialog-root > div > div > div > div > div.MuiPaper-root > div > form > div > div:nth-child(5) > label");
    private final By password=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[6]/label");
    private final By conformpassword=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[7]/label");
    private final By createBtn=By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation6.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-8.MuiGrid-grid-md-7.css-4hwpmf > div > div.MuiGrid-root.MuiGrid-container.css-1d3bbye > button");
    private final By firstnametxtField=By.xpath("//input[@name='firstName']");
    private final By lastnametextField=By.xpath("//input[@name='lastName']");
    private final By emailTextField=By.xpath("//input[@name='email']");
    private final By passwordTextField=By.xpath("//input[@name='password']");
    private final By mobileTextField=By.xpath("//input[@name='mobile']");
    private final By firstNameErrormsg=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[1]/div/div[2]");
    private final By lastNameErrormsg=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]");
    private final By emailErrormsg=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/form/div/div[5]/div/div[2]");
    private final By countrydropdown=By.xpath("//*[@id=\":r4:\"]");
    private final By countrydropdownElemnts=By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li");
    private final By conformPasswordTextField=By.xpath("//*[@name=\"confirmPassword\"]");
    private final By registerpageLoginBtn=By.cssSelector("body > div > div > div > div > div > div> div > div > p > button");
    private final By loginScreen=By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/div/p/strong");
    
   
    
    
    public By getRegisterBtn() {
    	return registerBtn;
    }
    public By getRegisterPage() {
    	return registerPage; 
    }
    public By getFirstName() {
    	return firstname;
    }
    public By getLastName() {
    	return lastname;
    }
    public By getCountryCode() {
    	return countrycode;
    }
    public By getMobile() {
    	return mobile;
    }
    public By getEmail() {
    	return email;
    }
    public By getPasword() {
    	return password;
    }
    public By getConformPassword() {
    	return conformpassword;
    }
    public By getCreateBtn() {
    	return createBtn;
    }
    public By getFirstNameTextField() {
    	return firstnametxtField;
    }
    public By getLastNameTextField() {
    	return lastnametextField;
    }
    public By getEmailTextFiled() {
    	return emailTextField;
    }
    public final By getPasswordTextFiled() {
    	return passwordTextField;
    }
    public By getMobileTextField() {
    	return mobileTextField;
    }
    public By getFirstnameErrorMsg() {
    	return firstNameErrormsg;
    }
    public By getLastNameErrorMsg() {
    return lastNameErrormsg;	
    }
    public By getEmailErrorMsg() {
    	return emailErrormsg;
    }
    public By getCountryDropDown() {
    	return countrydropdown;
    }
    public By getCountryDropDownElements() {
    	return countrydropdownElemnts;
    }
    public By getconformPasswordTextField() {
    	return conformPasswordTextField;
    }
   public By getRegisterPageLoginBtn() {
	   return registerpageLoginBtn;
   }
   public By getLoginScreen() {
	   return loginScreen;
	
}
   
   
}

 
package pageObjects;

 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

 

 

import java.awt.*;

 

 

public class Login {

 

    private WebDriver driver;
    Actions actions;
    Robot robot;
    JavascriptExecutor javascriptExecutor;

 

    public Login(WebDriver driver) {
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
 

    //for  Landing login button
    private final By landlogin = By.xpath("//button[text()='Login']");
    //for login page
    private final By loginbutton=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]");
    //for username textfield
    private final By usernametextfield=By.xpath("//input[@name='userName']");
    //for password tetfield
    private final By passwordtextfield=By.xpath("//input[@id='outlined-adornment-password']");
    //for mask
    private final By masking = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]");
    //login button
//                 private final By loginbutton = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]");
    //autologin check box
    private final By autocheckbox= By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/p[1]/input[1]");
    //create account
    private final By createaccountlink = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/p[1]/button[1]");
    //error message for password
    private final By errormessagepass =By.xpath("//div[text()='Invalid username or password']");
    //error message for id
    private final By errormessageid =By.className("Toastify");
    //check box
    private final By checkbox=By.xpath("//input[@type='checkbox']");
    //registration page
    private final By registerpage=By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]");
    //cancel icon
    private final By cancelicon=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/img[1]");
    //idspace
    private final By idspacetoast =By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    //emptyspace
    private final By emptylogintoast=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]");


    //calling
    public By landlogin()
    {
        return landlogin;
    }

    public By loginbutton()
    {
        return loginbutton;
    }
    public By usernametextfield() 
    {
        return usernametextfield;
    }
    public By passwordtextfield()
    {
        return passwordtextfield;
    }
    public By masking()
    {
        return masking;
    }
//    public By loginbutton()
//    {
//        return loginbutton;
//    }
    public By autocheckbox()
    {
        return autocheckbox;
    }
    public By createaccountlink()
    {
        return createaccountlink;
    }
    public By errormessagepass()
    {
        return errormessagepass;
    }
    public By errormessageid()
    {
        return errormessageid;
    }
    public By checkbox()
    {
        return checkbox;
    }
    public By registerpage()
    {
        return registerpage;
    }
    public By cancelicon()
    {
        return cancelicon;
    }
    public By idspacetoast()
    {
        return idspacetoast;
    }
    public By emptylogintoast()
    {
        return idspacetoast;
    }
}

 
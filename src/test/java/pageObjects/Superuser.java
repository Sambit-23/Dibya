package pageObjects;

 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

 

 

import java.awt.*;

 

 

public class Superuser {

 

    private WebDriver driver;
    Actions actions;
    Robot robot;
    JavascriptExecutor javascriptExecutor;

 

    public Superuser(WebDriver driver) {
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
    ////////////for creating user..........................
    
    //collapsebutton
    private final By collapse = By.xpath("//*[@data-name='Union 426']");
    //home
    private final By homeoption = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[2]/span[1]");
    //user
    private final By useroption = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/div[2]");
    //template list
    private final By templatelist = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[3]/div[2]/span[1]");
    //add user button
    private final By adduser = By.xpath("//*[@data-name='Plus icon']");
    //HQ ,firstname
    private final By hqfirstname = By.xpath("//input[@name='firstName']");
    //HQ,lastname
    private final By hqlastname = By.xpath("//input[@name='lastName']");
    //country code
    private final By countrycode = By.xpath("//div[@id=':r91:']");
    //US option
    private final By uscode = By.cssSelector(".MuiButtonBase-root.MuiMenuItem-root.MuiMenuItem-gutters.MuiMenuItem-root.MuiMenuItem-gutters.css-bl6t04-MuiButtonBase-root-MuiMenuItem-root[tabindex='0']");
    //UK option
    private final By ukcode = By.cssSelector("div[id='menu-'] li:nth-child(2)");
    //India option
    private final By indiacode = By.cssSelector("div[id='menu-'] li:nth-child(3)");
    //HQ,Mobile number
    private final By hqMobileno = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]");
    //HQ,email
    private final By hqemail = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]");
    //user type
    private final By hqusertype = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]");
    //usertype graphic designer
    private final By typedesigner = By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[1]");
    //user type admin
    private final By typeadmin = By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[2]");
    //country
    private final By countrydropdown = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]");
    //country us
    private final By countryus = By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[1]");
    //country uk
    private final By countryuk = By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[2]");
    //coutry india
    private final By countryindia=By.xpath("/html[1]/body[1]/div[3]/div[3]/ul[1]/li[3]");
    //Password
    private final By createuserpassword = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/input[1]");
    //confirm password
    private final By createuserdefaultpassword = By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/input[1]");
    //HQ,cancel button 
    private final By hqcancelbutton = By.xpath("//button[text() ='Cancel']");
    //HQ,Save button
    private final By hqsavebutton = By.xpath("//button[text() ='Save']");
    //create page assertion
   private final By createuserassert=By.xpath("//div[text()='Create User']");
   //editbutton 
   private final By editbutton=By.cssSelector("//*[@data-name='Edit Icon']");
//   
     //calling 
    
    public By collapse()
    {
        return collapse;
    }

    public By homeoption()
    {
        return homeoption;
    }
    public By useroption()
    {
        return useroption;
    }
    public By templatelist()
    {
        return templatelist;
    }
    public By adduser()
    {
        return adduser;
    }
    public By hqfirstname()
    {
        return hqfirstname;
    }
    public By hqlastname()
    {
        return hqlastname;
    }
    public By countrycode()
    {
        return countrycode;
    }
    public By uscode()
    {
        return uscode;
    }
    public By ukcode()
    {
        return ukcode;
    }
    public By indiacode()
    {
        return indiacode;
    }
    public By hqMobileno()
    {
        return hqMobileno;
    }
    public By hqemail()
    {
        return hqemail;
    }
    public By hqusertype()
    {
        return hqusertype;
    }
    public By typedesigner()
    {
        return typedesigner;
    }
    public By typeadmin()
    {
        return typeadmin;
    } 
    public By countrydropdown()
    {
        return countrydropdown;
    } 
    public By countryus()
    {
        return countryus;
    } 
    public By countryuk()
    {
        return countryuk;
    } 
    public By createuserpassword()
    {
        return createuserpassword;
    }
    public By createuserdefaultpassword()
    {
        return createuserdefaultpassword;
    } 
    public By hqcancelbutton()
    {
        return hqcancelbutton;
    } 
    public By hqsavebutton()
    {
        return hqsavebutton;
    }
    public By createuserassert()
    {
        return createuserassert;
    }
    public By countryindia()
    {
        return countryindia;
    }
    public By editbutton()
    {
        return editbutton;
    }
    
    
}


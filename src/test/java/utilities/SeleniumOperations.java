package utilities;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
  //browser launch
	public static Hashtable<String,Object> browserLaunch(Object[] inputparameters)//passing 2parameters as browser name chrome or ff and exe path
	{
		try
		{
			String strBrouserName=(String) inputparameters[0];
		    String strBrowserExe=(String) inputparameters[1];
		
		if(strBrouserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", strBrowserExe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(strBrouserName.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", strBrowserExe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch , Input_data: " +inputparameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch , Input_data: " +inputparameters[1].toString());
		}
		return outputParameters;
	}
	//open application
	public static Hashtable<String,Object> openApplication(Object[] inputparameters)
	{
		try
		{
		String strUrl=(String) inputparameters[0];
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodUsed : openApplication , Input_Data : " +inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodUsed : openApplication , Input_Data : " +inputparameters[0].toString());
		}
		return outputParameters;
	}
	//click method
	public static Hashtable<String,Object> clickOnElement(Object[] inputparameters)      
	{
		try
		{
		String xpath= (String) inputparameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE","methodUsed : clickOnElement , Input_Data : " +inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodUsed: clickOnElement  , Input_Data: " +inputparameters[0].toString());
		}
		return outputParameters;
	}
	//navigate MoveToElement
	public static Hashtable<String,Object> navigateToElement(Object[] inputparameters)
	{
		try
		{
		   String Xpath=(String) inputparameters[0];
		   WebElement ele= driver.findElement(By.xpath(Xpath));
		   Actions act=new Actions(driver);
		   act.moveToElement(ele).build().perform();
		   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		   outputParameters.put("STATUS", "PASS");
		   outputParameters.put("MESSAGE", "methodUsed : navigateToElement, Input_Data :" +inputparameters[0].toString());
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE", "methodUsed : navigateToElement, Input_Data :" +inputparameters[0].toString());
		}
		return outputParameters;
		
	}
	//sendKeys Method
	public static Hashtable<String,Object> sendKeys(Object[] inputparameters)
	{
		try
		{
			String Xpath=(String) inputparameters[0];
			String elevalue=   (String) inputparameters[1];
			driver.findElement(By.xpath(Xpath)).sendKeys( elevalue);
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");      //Hashtable contains key and value pair here STATUS is key and value is pass  
			outputParameters.put("MESSAGE","methodUsed : sendKeys, Input_Data :" + inputparameters[1].toString()); //Hashtable contains key and value pair here MASSAGE is key and value is Method name 
		}
		catch(Exception e)
		 {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodUsed : sendKeys, Input_Data :" + inputparameters[1].toString());//array index at [1] contains uname and password
		 }
		return outputParameters;
		}
	//validation Login
	public static Hashtable<String,Object> validationLogin(Object[] inputparameters)
	{
		try
		{
			String givenText=(String) inputparameters[0];//after clicking on button login can user see his own profile with username that username we using here
			String xpath=   (String) inputparameters[1];//xpath for that username text on logged page
			String nameText=driver.findElement(By.xpath(xpath)).getText();
			if(givenText.equalsIgnoreCase(nameText))
			{
			 System.out.println("Test case Pass");	
			}else
			{
				System.out.println("Test case Fail");	
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE","methodUsed : validationLogin, Input_Data :" + inputparameters[1].toString());
			
		}
		catch(Exception e)
		 {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE","methodUsed : validationLogin, Input_Data :" + inputparameters[1].toString());
		 }
		return outputParameters;
		}
}

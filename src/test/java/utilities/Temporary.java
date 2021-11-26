package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temporary {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();//close login window
		Thread.sleep(3000);
		WebElement log=driver.findElementByXPath("//*[@class='_1_3w1N']");//login button
		Actions act=new Actions(driver);
		act.moveToElement(log).build().perform();//navigate to login button
		//log.click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();//click on my profile
		Thread.sleep(6000);
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9405047191");//enter mobile no
		Thread.sleep(6000);
		driver.findElementByXPath("//*[@type='password']").sendKeys("omsai@786");//enter password
		Thread.sleep(3000);
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();//click on Login
		Thread.sleep(6000);
		driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();//click on manage address
		Thread.sleep(6000);
		WebElement add=driver.findElementByXPath("//*[@class='_2KpZ6l _3lI646 _3dESVI']");////add address
		act.click(add).build().perform();
		
		Thread.sleep(6000);
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Priyanka");//filling name
		driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("9405047191");//phone no
		driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("400093");//enter pincode
        driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Mumbai");//enter locality
        driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("flat 102,Tolani naka,Andheri east");//enter address
      driver.findElementByXPath("(//*[@class='_2Fn-Ln _3iI7Qn'])[2]").click();//select radio button
        driver.findElementByXPath("(//*[@type='button'])[2]").click();//click on save button


	}

}

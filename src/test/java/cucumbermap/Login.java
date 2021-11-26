package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.HTMLReportGenerator;
import utilities.SeleniumOperations;

public class Login {
	@Given ("^User enter \"(.*)\" browser with exe as \"(.*)\"$")
	public void brouserL(String bname, String exe)
	{
		Object[] input1=new Object[2];
		input1[0]=bname;
		input1[1]=exe;
		SeleniumOperations.browserLaunch(input1);
	}
	@Given ("^User enter url as \"(.*)\"$")
	public void openURL(String url)
	{
		Object[] input2=new Object[1];
		input2[0]=url;
		SeleniumOperations.openApplication(input2);
	}
	@Given ("^User cancel initial Login window$")
	public void cancelLogin()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input3);
	}
	@Given ("^User move to Login button$")
	public void moveToLogin()
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.navigateToElement(input4);
	}
	@When ("^User click on Myprofile$")
	public void clickMyProfile()
	{
		Object[] input5=new Object[1];
		input5[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^User click on Myprofile$" , output5.get("MESSAGE").toString());
	}
	@When ("^User enter \"(.*)\" as username$")
	public void userName(String uname)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]=uname;
		Hashtable<String,Object> output6=SeleniumOperations.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^User enter \"(.*)\" as username$" ,output6.get("MESSAGE").toString());
	}
	@When ("^User enter \"(.*)\" as password$")
	public void userPassword(String password)
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@type='password']";
		input7[1]=password;
		Hashtable<String,Object> output7=SeleniumOperations.sendKeys(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^User enter \\\"(.*)\\\" as password$", output7.get("MESSAGE").toString());
	}
	@When ("^user click on Login buttton$")
	public void clickLogin()
	{
		Object[] input8=new Object[1];
		input8[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input8);	
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login buttton$", output8.get("MESSAGE").toString());
		
	}
	@Then ("^Application shows profile to user$")
	public void validateLogin()
	{
		Object[] input9=new Object[2];
		input9[0]="Priyanka Takale";
		input9[1]="//*[text()='Priyanka Takale']";
		Hashtable<String,Object> output9=SeleniumOperations.validationLogin(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^Application shows profile to user$", output9.get("MESSAGE").toString());
		
	}
	
	
}

package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.HTMLReportGenerator;
import utilities.SeleniumOperations;

public class ManageAddress {

	@When("User click on Manage Addresses")
	public void user_click_on_manage_addresses() 
	{
		Object[] input9=new Object[1];
		input9[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String,Object> output9=SeleniumOperations.clickOnElement(input9);	
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"User click on Manage Addresses",output9.get("MESSAGE").toString());
	}

	@When("User click on Add Address")
	public void user_click_on_add_address()
	{
		Object[] input=new Object[1];
		input[0]="//*[@class='_1QhEVk']";
		Hashtable<String,Object> output=SeleniumOperations.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"User click on Add Address",output.get("MESSAGE").toString());
	}

	@When("User enter {string} as name")
	public void user_enter_as_name(String name) 
	{
		Object[] input10=new Object[2];
		input10[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input10[1]=name;
		Hashtable<String,Object> output10=SeleniumOperations.sendKeys(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"User enter {string} as name", output10.get("MESSAGE").toString());
	}

	@When("User enter {string} as mobile number")
	public void user_enter_as_mobile_number(String mnumber)
	{
		Object[] input11=new Object[2];
		input11[0]="(//*[@type='text'])[3]";
		input11[1]=mnumber;
		Hashtable<String,Object> output11=SeleniumOperations.sendKeys(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"User enter {string} as mobile number" , output11.get("MESSAGE").toString());
	}

	@When("User enter {string} as pincode")
	public void user_enter_as_pincode(String pin) 
	{
		Object[] input12=new Object[2];
		input12[0]="(//*[@type='text'])[4]";
		input12[1]=pin;
		Hashtable<String,Object> output12=SeleniumOperations.sendKeys(input12);
		HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"User enter {string} as pincode" , output12.get("MESSAGE").toString());
	}

	@When("User enter {string} as locality")
	public void user_enter_as_locality(String locality1) 
	{
		Object[] input13=new Object[2];
		input13[0]="(//*[@type='text'])[5]";
		input13[1]=locality1;
		Hashtable<String,Object> output13=SeleniumOperations.sendKeys(input13);	
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(),"User enter {string} as locality" , output13.get("MESSAGE").toString());
		
	}

	@When("User enetr {string} as address")
	public void user_enetr_as_address(String address1) 
	{
		Object[] input14=new Object[2];
		input14[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input14[1]=address1;
		Hashtable<String,Object> output14=SeleniumOperations.sendKeys(input14);	
		HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(),"User enetr {string} as address" , output14.get("MESSAGE").toString());
		
	}

	@When("User select Home as address type")
	public void user_select_home_as_address_type()
	{
		Object[] input15=new Object[1];
		input15[0]="(//*[@class='_2Fn-Ln _3iI7Qn'])[2]";
		Hashtable<String,Object> output15=SeleniumOperations.clickOnElement(input15);
		HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"User select Home as address type" , output15.get("MESSAGE").toString());
	}

	@When("User click on Save button")
	public void user_click_on_save_button()
	{
		Object[] input16=new Object[1];
		input16[0]="(//*[@type='button'])[2]";
		Hashtable<String,Object> output16=SeleniumOperations.clickOnElement(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "User click on Save button", output16.get("MESSAGE").toString());
	}

	@Then("Application shows updated new address to user")
	public void application_shows_updated_new_address_to_user()
	{
	   Object[] input17=new Object[2];
	   input17[0]="//*[text()='7854365523']";
	   input17[1]="7854365523";
	   Hashtable<String,Object> output17=SeleniumOperations.clickOnElement(input17);
		HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"Application shows updated new address to user" , output17.get("MESSAGE").toString());
	}

}

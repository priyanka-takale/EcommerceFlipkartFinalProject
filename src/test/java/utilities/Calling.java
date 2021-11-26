package utilities;

public class Calling {
   public static void main(String[] args) throws InterruptedException
   {
	   //Launch browser
	Object[] input1=new Object[2];
	input1[0]="Chrome";
	input1[1]="D:\\Automation Support\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input1);
	
	//openapplication
	Object[] input2=new Object[1];
	input2[0]="https://www.flipkart.com/";
	SeleniumOperations.openApplication(input2);
	
	//click on cancel
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input3);
	
	//navigate moveToElement Login
	Object[] input4=new Object[1];
	input4[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.navigateToElement(input4);
	
	//click on Myprofile
	Object[] input5=new Object[1];
	input5[0]="(//*[@class='_3vhnxf'])[1]";
	SeleniumOperations.clickOnElement(input5);
	
	//send Keys Method for username
	Object[] input6=new Object[2];
	input6[0]="//*[@class='_2IX_2- VJZDxU']";
	input6[1]="9405047191";
	SeleniumOperations.sendKeys(input6);
	
	//send Keys Method for password
	Object[] input7=new Object[2];
	input7[0]="//*[@type='password']";
	input7[1]="om@786";
	SeleniumOperations.sendKeys(input7);
	
	//click on Login button
	Object[] input8=new Object[1];
	input8[0]="(//*[@type='submit'])[2]";
	SeleniumOperations.clickOnElement(input8);
		
	//click on Manage Addresses
	Object[] input9=new Object[1];
	input9[0]="(//*[@class='NS64GK'])[1]";
	SeleniumOperations.clickOnElement(input9);	
	
	//click on Add Addresses
		Object[] input=new Object[1];
		input[0]="//*[@class='_1QhEVk']";
		SeleniumOperations.clickOnElement(input);
	
	//send Keys Method for name
	Object[] input10=new Object[2];
	input10[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
	input10[1]="Abcdegg";
	SeleniumOperations.sendKeys(input10);
		
	//send Keys Method for mobile number
	Object[] input11=new Object[2];
	input11[0]="(//*[@type='text'])[3]";
	input11[1]="9467489890";
	SeleniumOperations.sendKeys(input11);
	
	//send Keys Method for pincode
	Object[] input12=new Object[2];
	input12[0]="(//*[@type='text'])[4]";
	input12[1]="400093";
	SeleniumOperations.sendKeys(input12);
	
	//send Keys Method for Locality
	Object[] input13=new Object[2];
	input13[0]="(//*[@type='text'])[5]";
	input13[1]="Mumbai";
	SeleniumOperations.sendKeys(input13);	
	
	//send Keys Method for Locality
	Object[] input14=new Object[2];
	input14[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
	input14[1]="Near Saint Dominic Savio High School Andheri east";
	SeleniumOperations.sendKeys(input14);	
	
	//click or select  Radio Button
	Object[] input15=new Object[1];
	input15[0]="(//*[@class='_2Fn-Ln _3iI7Qn'])[2]";
	SeleniumOperations.clickOnElement(input15);
		
	//click on save button
	Object[] input16=new Object[1];
	input16[0]="(//*[@type='button'])[2]";
	SeleniumOperations.clickOnElement(input16);
}


}
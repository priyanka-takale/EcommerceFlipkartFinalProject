package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.HTMLReportGenerator;

public class Hookable {
	
	@Before
	public void before(Scenario scenario) throws UnknownHostException 
	{
		HTMLReportGenerator.TestSuiteStart("D:\\ecommerce\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus().toString());
		
		
       	System.out.println("----------------------Scenerio Start---------------------------");
	}
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println("----------------------Scenerio End-----------------------------");
	    
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	
	}

}

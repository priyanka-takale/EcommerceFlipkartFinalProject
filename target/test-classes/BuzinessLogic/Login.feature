Feature: Login functionality

Background: User is on Flipkart main page and mouse hover on login button
Given User enter "chrome" browser with exe as "D:\\Automation Support\\chromedriver.exe"
Given User enter url as "https://www.flipkart.com/"
Given User cancel initial Login window
Given User move to Login button

@SmokeTest
Scenario: Login functionality with valid credentials
When User click on Myprofile
When User enter "9405047191" as username
When User enter "Omsai@786" as password
When user click on Login buttton
Then Application shows profile to user    
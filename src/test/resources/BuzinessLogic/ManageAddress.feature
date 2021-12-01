Feature: Manage Address functionality

Background: User is on Flipkart main page and mouse hover on login button
Given User enter "chrome" browser with exe as "D:\\Automation Support\\chromedriver.exe"
Given User enter url as "https://www.flipkart.com/"
Given User cancel initial Login window
Given User move to Login button
When User click on Myprofile
When User enter "9405047191" as username
When User enter "Omsai@786" as password
When user click on Login buttton
Then Application shows profile to user  


@RegressionTest
Scenario: Manage Address Functionality with valid data
When User click on Manage Addresses
When User click on Add Address
When User enter "PriyankaT" as name
When User enter "7854365523" as mobile number
When User enter "414001" as pincode
When User enter "Ahmednagar" as locality
When User enetr "Telephone Quarters, Nagar" as address
When User select Home as address type
When User click on Save button
Then Application shows updated new address to user
    
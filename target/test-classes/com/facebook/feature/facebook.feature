Feature: Message Accessing with Everyone

Scenario: Passing Incorrect Values

Given User Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button For Login To Page
But user Entered The Incorrect Data It Will Came To Login Page Again
Then user Click The Register Button And It Navigates To Signup Page


Scenario: Signup New Account

Given user Is Trying To Creating An Account
When user Enter The Firstname In Firstname Field
And user Enter The Surname In Surname Field
And user Enter The Mobil Number Or Email In Respected Field
And user Enter The Password In New Password Field
And user Select The Date Of Birth in Date Function
And user Select The Month Of Birth In Month Function
And user Select The Year Of Birth In Year Function
And user Click The Gender In Gender Selection Field
Then user Click The Signup Button
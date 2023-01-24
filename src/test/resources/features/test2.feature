
Feature: As a user that is trying to register a new account with an email address that already exists, I am notified that the email address is in use and I am prompted to perform the Forgot Password flow instead

Scenario: As a user that is trying to register a new account with an email address that already exists, I am notified that the email address is in use and I am prompted to perform the Forgot Password flow instead"

Given  Click the orange Get Started button in the upper-left part of the login page
When  Fill out the registration form, using an email address that is already in use (e.g. listed on the login page)
Then  The test is considered successful if the user sees an alert message containing a link to the Forgot Password page
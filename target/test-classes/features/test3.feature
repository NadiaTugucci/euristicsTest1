
Feature:As an administrator user, I can search for Members by Role and Status so that I can easily find accounts in various busines states

 @wip
Scenario: As an administrator user, I can search for Members by Role and Status so that I can easily find accounts in various busines states

Given On the login page, click on Arlene Admin to log in as an administrator
When  In the main nav bar, click on Admin -> Members
And   In the Role dropdown, select "Office Dog"
And   In the Status dropdown, select "Applicant"
And   Click Filter

And   "Barky McBarksALot" is included in the search results
Then  The filter criteria (Role and Status) retain their values after the results are shown
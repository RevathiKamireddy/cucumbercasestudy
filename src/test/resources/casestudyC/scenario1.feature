
Feature: Registration 

Scenario Outline: successful registration
Given User is on signup page
When User enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confrimpassword>" , "<email>" , "<mobilenumber>" , "<dob>" , "<address>" and click register button
Then User should be navigated to login page
Examples: 
      | username  | firstname | lastname  | password | confrimpassword | email | mobilenumber | dob | address |
      | Lalitha | Lalitha | kumar | Password123 | Password123 | abc@gmail.com | 9877665432 | 01/15/1997 | kiljhga,jhjhg |
      
Feature: login
This feature file describes the login information.....
Scenario Outline: Successful login
Given enduser is on the login page
When enduser enters "<username>" and "<password>" and click on submit button
Then user does successful login
Examples:
| username | password |
| Lalitha | Password123 |

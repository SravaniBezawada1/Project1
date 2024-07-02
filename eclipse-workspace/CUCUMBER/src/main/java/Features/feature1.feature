Feature: feature1
Scenario: multiplied number
Given check multiplication functionality
When entered
|2|3|
|6|5|
Then multiplication performed

Scenario Outline: Add number
Given check Addition functionality
When entered <a> and <b>
Then Addition performed
Examples:
|a|b|
|10|5|
|6|2|



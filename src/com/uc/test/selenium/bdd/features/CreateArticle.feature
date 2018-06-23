Feature: Create a new article

Scenario Outline: Free CRM Login Test Scenario

Given User is on home page
When title of home page is correct
Then user clicks on LoginLink
Then user enters username "<username>" and password "<password>"
Then user clicks new article link
Then user enters title "<title>" and body "<body>" and tags "<tags>"
Then user closes browser

Examples:

| username	| password      | title       | body     | tags      |
| UnityAdmin|UnityAdmin@2017| NewArticle  | NewBody  | _deleteme |
| UnityAdmin|UnityAdmin@2017| NewArticle2 | NewBody2 | _deleteme |
| UnityAdmin|UnityAdmin@2017| NewArticle3 | NewBody3 | _deleteme |
| UnityAdmin|UnityAdmin@2017| NewArticle4 | NewBody4 | _deleteme |

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("protection.feature");
formatter.feature({
  "line": 2,
  "name": "Protection Test",
  "description": "As user I want to verify \u0027Protect your broadcast content\u0027 text into friendMts website",
  "id": "protection-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 5360420200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to broadcast page successfully",
  "description": "",
  "id": "protection-test;user-should-navigate-to-broadcast-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on accept cookies",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on platfromprotection link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover and click to broadcastid tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should able to verify text",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 79759601,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 86964700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.iMouseHoverOnPlatfromprotectionLink()"
});
formatter.result({
  "duration": 186593600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.iMouseHoverAndClickToBroadcastidTab()"
});
formatter.result({
  "duration": 745146500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.iShouldAbleToVerifyText()"
});
formatter.result({
  "duration": 32195700,
  "status": "passed"
});
formatter.after({
  "duration": 623944399,
  "status": "passed"
});
});
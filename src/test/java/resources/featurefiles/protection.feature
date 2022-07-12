@Regression
Feature: Protection Test
  As user I want to verify 'Protect your broadcast content' text into friendMts website

  Scenario: User should navigate to broadcast page successfully
    Given I am on homepage
    And I click on accept cookies
    When I mouse hover on platfromprotection link
    And I mouse hover and click to broadcastid tab
    Then I should able to verify text
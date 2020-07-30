Feature: Login in Automation practice

  Scenario Outline: User can successfully login
    Given Im on the home page
    When Im enter in Authentication page
    And I enter email "<email>" and Password "<password>"
    And I click the Sign In button
    Then I go to the "My account - My Store" page
    Examples:
      | email               | password  |
      | yanyeline@gmail.com | 123456789 |
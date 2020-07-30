Feature: Address registration

  Background: User can successfully login
    Given Im on the home page
    When Im enter in Authentication page
    And I enter email "yanyeline@gmail.com" and Password "123456789"
    And I click the Sign In button
    Then I go to the "My account - My Store" page


  Scenario Outline: user can successfully register addresses
    When I click the My Addresses button
    And I go to the "Addresses - My Store" page
    And I click the Add a new address button
    And I enter the address data
      | firstName   | lastName   | company   | address   | addressLine2   | city   | state   | zipPostalCode   | country   | homePhone   | mobilePhone   | additionalInformation   | referenciaFutura   |
      | <firstName> | <lastName> | <company> | <address> | <addressLine2> | <city> | <state> | <zipPostalCode> | <country> | <homePhone> | <mobilePhone> | <additionalInformation> | <referenciaFutura> |
    And I click the Save button
    And I go to the "Addresses - My Store" page
    Then I register the address "<referenciaFutura>"
    Examples:
      | firstName | lastName | company | address | addressLine2 | city     | state    | zipPostalCode | country       | homePhone | mobilePhone | additionalInformation | referenciaFutura |
      | Miguel    | Bueno    | Prueba  | Prueba  | Prueba       | Medellin | Colorado | 00005         | United States | 111111    | 99999       | Prueba3               | direccion        |
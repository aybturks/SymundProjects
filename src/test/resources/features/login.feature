Feature: User login page feature

  Background: user is on the login page
    Given User is on to login page

  @1617
  Scenario: User can login with valid credentials
    When User enter id
    And User enter password
    Then User should be able to display dashboard page
@vip
    Scenario:-User cannot login with any invalid credentials
    -"Wrong username or password." should be displayed for invalid credentials
      When User enter wrong username
      And User enter wrong password
      And User should be click submit button
      Then User should be displayed for invalid credentials


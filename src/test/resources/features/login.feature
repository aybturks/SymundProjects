Feature: User login page feature

  Background: user is on the login page
    Given User is on to login page

@SYMU-1617
  Scenario: User can login with valid credentials
    When User enter id
    And User enter password
    Then User should be able to display dashboard page

@SYMU-1618
    Scenario:-User cannot login with any invalid credentials or empty
    -"Wrong username or password." should be displayed for invalid credentials
  When User hit enter or click login button without credentials show Alert
  When User enter wrong username
      And User enter wrong password
      And User should be click submit button
      Then User should be displayed for invalid credentials


  @SYMU-1619
  Scenario: User can see the password in form of dots by default
    When User enter password
    Then User can see the password in form of dots by default

  @SYMU-1620
  Scenario: -User can see the password explicitly if needed
      When User enter password
  And click to eyes button
      Then User can see the password in form of text

  @SYMU-1621
  Scenario:User can see the "Forgot password?" link on the login page and can
  see the "Reset password" button on the next page after clicking on forget password link
When User click to forget password button
    Then User should be display reset password page


@SYMU-1622
  Scenario: User can see valid placeholders on Username and Password fields
      Then User can see valid placeholders on Username and Password fields on loginpage


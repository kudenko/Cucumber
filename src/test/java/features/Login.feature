Feature: Application Login

  Scenario: Home page default login
    Given User is on Landing page
    When User log into application with username and password
    Then Home page is populate
    And Cards are displayed
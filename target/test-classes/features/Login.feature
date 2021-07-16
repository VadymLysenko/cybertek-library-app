Feature: Login feature

  @librarian
  Scenario: Loging in as librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

  @student
  Scenario: Loging in as student
    Given I am on the login page
    When I login as a student
    Then books should be displayed


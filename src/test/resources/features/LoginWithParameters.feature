Feature: Login with parameters

    @librarianParam
    Scenario: Login as librarian 43
      Given I am on the login page
      When I enter username "librarian43@library"
      And I enter password 'np6AxVIh'
      And click the sign button
      And there should be 5561 users
      Then  dashboard should be displayed


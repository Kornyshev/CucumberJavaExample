Feature: Just experimental feature

  Scenario: Multiply two numbers
    Given 2 was set up as first number
    And 5 was set up as second number
    When user multiplies first and second numbers
    Then verify that the result is equal to 10
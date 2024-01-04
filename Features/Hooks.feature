Feature: Hooks in cucumber

  Scenario: add new customer
    Given user is on add customer page
    When user fills the customer details
    Then customer is added

  Scenario: Edit customer
    Given user is on edit customer page
    When user edit contact details
    Then contact details updated

  Scenario: Delete customer
    Given user is on delete customer page
    When user delete customer
    Then customer deleted

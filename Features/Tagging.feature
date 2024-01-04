Feature: Tags in cucumber

  @SanityTest
  Scenario: Verify login
    Given This is a valid login test

  @SanityTest @E2ETest
  Scenario: Verify logout
    Given This is a logout test

  @RegressionTest
  Scenario: Verify search
    Given This is a search test

  @RegressionTest @E2ETest
  Scenario: Verify advance search
    Given This is a advance search test

  @E2ETest
  Scenario: Verify prepaid recharge
    Given This is prepaid recharge test

  @E2ETest
  Scenario: Verify postpaid recharge
    Given This is a postpaid recharge test
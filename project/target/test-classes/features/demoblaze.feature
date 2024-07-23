@tag
Feature: Demoblaze website testing

  @tag1
  Scenario: Verifying demoblaze url
    Given I am on google browser
    When I am using Demoblaze URL
    Then Check correct website is opened

  @tag2
  Scenario: Verifying greeting message
    Given I am on Demoblaze website
    When I am using credential for login
    Then Check greeting message is visible

  @tag3
  Scenario: Verifying user name
    Given I am on Demoblaze
    When if I am using correct credential for login
    Then I should be able to login

  @tag4
  Scenario: Selecting a Phone
    Given I am logged in Demoblaze Homepage
    When if I select a Phone to add it to the Cart
    Then I should be able to add the Phone to the Cart

  @tag5
  Scenario: Selecting a Laptop
    Given I am in Demoblaze Categories page
    When if I select a Laptop to add it to the Cart
    Then I should be able to add the Laptop to the Cart

  @tag6
  Scenario: Selecting a Monitor
    Given I am in Demoblaze Categories page
    When if I select a Monitor to add it to the Cart
    Then I should be able to add the Monitor to the Cart

  @tag7
  Scenario: Place an Order
    Given I am in Demoblaze Cart page
    When if I click on the Place Order button
    Then I should be able to complete the Purchase the Order

  @tag8
  Scenario: Contact
    Given I am on Demoblaze
    When if I click on the Contact link
    Then I should be able to send a New Message

  @tag9
  Scenario: About Us
    Given I am on Demoblaze
    When if I click on the About Us link
    Then I should be able to see the About Us modal

  @Tag10
  Scenario: User Sign Up
    Given I am on Demoblaze web
    When click on signup option
    Then Check signup window should show

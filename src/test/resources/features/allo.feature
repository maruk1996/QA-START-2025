Feature: training scenarios homework

  Scenario: Find iPhone 16 and see price


Given I open Allo homepage
When I search for "iPhone 16"
Then I should see the price of the item

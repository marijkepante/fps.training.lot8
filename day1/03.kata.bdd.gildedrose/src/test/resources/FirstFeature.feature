
Feature: Decrement per day

  Scenario: For an item, after a day it's updated
    Given an item "foo"
    And the quality is 10
    And the sell in is 10
    When I update quality
    Then the item's name is "foo"
    Then the quality is updated to 9
    And the sell in is updated to 9
Feature: request a dog from the pet store

  Background: user logging in
    Given user is navigated to the website

  Scenario Outline: request the order
    Given enter <username> and <password> and click login
    Then select the dogs from the pane
    And choose the appropriate dog
    Then select the item with the appropriate price
    And add the dog to the cart
    When updating the quantity and click update cart
    Then click proceed out
    And add the payment details
    Then confirm the details

    Examples:
      | username   | password |
      | mahmoud123 | 96532    |




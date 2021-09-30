#author: daniel.tobon@hotmail.com

Feature: See the payment method page

  As a user, I want to find a product and add it to the shopping cart and see the buy page.

  Scenario: See the payment method page

    Given Be on the page of falabella
    When Look for a product
      |  IPHONE 12  |
    And Add to shopping cart
    And Add personal information
      |  ANTIOQUIA   |   MEDELLIN  |  MEDELLIN  |  CALLE 77 AC  |   Interior 1411  |
    Then See the product on the payment method page
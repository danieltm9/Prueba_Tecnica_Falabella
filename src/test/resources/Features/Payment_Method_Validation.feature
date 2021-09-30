#author: daniel.tobon@hotmail.com

Feature: Automate the procces of buying a product on the Falabella website.

  I want to get to the product payment option

  Scenario: See the payment method

    Given See falabella's page
    When Look for a product
      |  IPHONE 12  |
    And Add to shopping cart
    And Add personal information
      |  ANTIOQUIA   |   MEDELLIN  |  MEDELLIN  |  CALLE 77 AC  |   Interior 1411  |
    Then See the product on the payment method page
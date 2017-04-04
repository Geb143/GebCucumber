Feature: Product Search

  Scenario: Search Motorola products
    Given I search the product "Moto" in the seacrh bar of Dashboard page
    And I verify the page title should contain "moto"
    Then select "Moto M (Grey, 64 GB)" to add to card
    And add the product to the cart
    Then Viewcart page and the "Moto M(Grey, 64Gb)" should have been added to the cart
    Then go to secure payment page

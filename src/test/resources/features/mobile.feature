Feature: mobile

 
   Scenario: mobile
    Given user launching amazon 
    When user ready to search product
    #And user select the project
   
    #Then user add the product and purchase
   

  Scenario: mobile list
    Given user launching amazon 
    When user ready to search product by one dime list
    |ipone|samsung|realme|
   # And user select the project
   
    #Then user add the product and purchase
    
    
    Scenario: mobile list
    Given user launching amazon 
    When user ready to search product by one dime map
    |phone1|iphonne|
    |phone2|samnsung|
    |phone3|readme|
 
    
    Scenario outline:
     Given user launching amazon 
    When user ready to search product"<phone>"
    
    Examples:
    |phone|
    |samsung|
    |iphone|
    |readme|
    
    
    
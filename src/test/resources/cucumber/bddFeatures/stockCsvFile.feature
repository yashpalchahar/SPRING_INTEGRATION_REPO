Feature: Process Stock csv file

  Scenario: Process stock csv file - general scenario
     Given stock csv file is provided with given contents
"""
UPDATE Stocks; product(code); warehouse(code);value;
;prod123456;W12;100
;prod123477;W22;200
;prod123488;W12;300
"""
     And warehouse code "W12" and update type "FULL" is given
     And record detail is given as below
     |warehouse| updationType| comment  |
     |w12      |FULL         | comment 1|
    And records detail list are given as belows
    |warehouse| updationType| comment  |
    |w50      |FULL         | comment 1|
    |w100     |PARTIAL      | comment 2|
    And information is given as below
    |info | comment| email|
    |add to cart operation| user perform add to cart | yashpal@gmail.com|
    When perform action on cart with given detail
    |product|quantity|userId           |
    |P123123|100     |yashpal@gmail.com|
    Then verify result with given "101" user id
@ProcessCustomerCsvFile
Feature: Process Customer csv file
  Scenario: Process customer csv file - general scenario
    Given customer csv file is provided with below contents
"""
#Customer Header
email,firstName,lastName
test1@gmail.com,first1,last1
test2@gmail.com,first2,last2
test3@gmail.com,first3,last3
test4@gmail.com,first4,last4
test5@gmail.com,first5,last5
"""
    And file name follows naming convention and it's name is given "customer" as prefix and "20190325" as suffix
    When place file in directory pointed by "spring.file.monitoring.dir" key
    Then verify following records are imported successfully
    |email| firstName | lastName|
    |test1|first1     |last1    |
    |test2|first2     |last2    |
    |test3|first3     |last3    |
    |test4|first4     |last4    |
    |test5|first5     |last5    |

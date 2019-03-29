Feature: Process Stock csv file

  Scenario: Process stock csv file - general scenario
     Given stock csv file is provided with given contents
"""
header comments
line1 contents
line2 contents
"""
     And warehouse code "W12" and update type "FULL" is given
    # And records details are given as belows
    # |warehouse| updationType| comment  |
     #|w12      |FULL         | comment 1|



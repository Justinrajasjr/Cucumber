#Author: your.email@your.domain.com
Feature: FaceBook Account

  Background: 
    Given user to create new account

  Scenario Outline: FaceBook Account Steps
    When user name enter "<Name>"
    And user surname enter "<Surname>"
    And user mobile or email enter  "<Number>"
    And user password is enter "<Password>"
    And user age is enter "<Age>"
    And user gender
    Then sign up

    Examples: 
      | Name   | Surname |  Number | Password|Age|
      | Justin | Rasa    |987543210|Justin   |26 |   
      | Raja   | Raju    |567890423|Rasa     |24 | 

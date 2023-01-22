Feature: UI Automation Case Study

  Background: : Login With User
    Given Access the webdriver login page
    When Enter username "witwises-admin"
    And Enter password "lLYVRayAHimpt9bJ"
    And Click on the login button
    Then See it's on the home page

  Scenario Outline: Assign Session
    When Click sessions menu
    And Click on the assign session button
    And Select session templates
    And Enter period start time
    And Enter period end time
    And Select assignment type "<assignmentType>"
    And Select test taker "<testTaker>"
    Then Click assign session

    Examples:
     | assignmentType | testTaker |
     | Single Assignment | Super Admin |

  Scenario: Completion Of The Testing Process
    When Click home menu
    Then Click first start test button
    And Click second start test button
    And Answer first question
    And Answer second question
    And Answer third question
    And Answer fourd question
    And Click first finished test button
    And Click second finished test button
    And See completed button



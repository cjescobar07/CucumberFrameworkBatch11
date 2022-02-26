Feature: Syntax API workflow for HRMS

  Background:
    Given a JWT bearer token is generated

  @WorkFlow
  Scenario: create an employee via API work flow
    Given a request is prepared for creating an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And the employee created contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as a global variable to be used for other calls





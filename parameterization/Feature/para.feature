Feature: scenario outline

Scenario Outline:- Login functionality for testmeapp.

Given user navigates to testmeapp

When I enter Username as "<username>" and Password as "<password>"

Then login should be unsuccessful

Examples: -
| username  | password  | 
| lalitha | password1 | 
| mercury | mercury |

Feature: Shopify Test Functionalities

  Background:
    Given User Navigates to The Shopify Home Page

  Scenario: Navigate to the Start Page
    When User Click On Start Option
    And  User Clicks On Start your Business
    And  User Clicks On Build Your Brand
    Then Users can see Branding Tools Title On This Page


  Scenario: Navigate to the Sell Page
    When User Click On Sell Option
    And  User Clicks On Sell EveryWhere Button
    And  User Clicks On Online Store Button
    Then Users can see Custom Online Store Title On This Page


  Scenario: Navigate to the Market Page
    When User Click On Market Option
    And  User Clicks On Market your Business
    And  User Click On Audience Button
    Then User Can See Audience Targeting Title in This Page


  Scenario: Navigate to the Manage Page
    When User Click On Manage Option
    And User Clicks On Manage Everything
    And User Click On Orders Button
    Then User Can See Centralized Order Fulfillment Title in This Page

  Scenario: Navigate to the Learn Page
        When User Click On Learn Option
        And User Clicks On Help Center
        And User Click On Intro To Shopify Button
        Then User Can See Intro To Shopify Title in This Page

  Scenario: Navigate to the Branding Page
    When User Click On Start Button
    And User Click On Branding Button
    And User Click On Business Name Generator
    Then Users can see Free Tools Title On This Page


  Scenario: Navigate to the Online Store Page
    When User Click On Sell Button
    And User Click On Online Store Button
    And User Click On OverView Button
    Then Users can see Shopify Online Store Title On This Page

  Scenario: Navigate to Email Marketing Page
    When User Click On Market Button
    And User Click On Email Marketing Button
    And User Click On Log In To Create Campaign Button
    Then Users can see Log In Continue To Shopify Title On This Page

  Scenario: Navigate to Balance Page
    When User Click On Manage Button
    And User Click On Balance Button
    And User Click On Rewards Button
    Then Users can see Shopify Balance Rewards Title On This Page

  Scenario: Navigate to Blog Page
    When User Click On Learn Button
    And User Click On Blog Button
    And User Click Need An Idea Button
    Then Users can see Find An Idea Title On This Page

  Scenario: Navigate to Pricing Page
    When User Click On Pricing Option
    And User Clicks On Learn More About Shopify Plus
    And User Clicks On Lets Talk
    Then User Can See Lets Talk About Business Title in This Page
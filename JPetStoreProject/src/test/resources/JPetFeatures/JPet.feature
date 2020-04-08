Feature: JPetStore Application Page
This feature verifies the functionality on JPetStore Application

@tc_01_LoginPage
Scenario Outline: Check that JPetStore Application LoginPage is displayed
Given Launch the Chrome browser
When Login JPetStore Page opened 
Then Enter username as "<uname>" and password as"<pass>"
And Clicks the Login button

Examples:
|uname|pass|
|Reddy4138|chitti@413|
|reddy4138|chitti@413|

@tc_02_BirdsPage
Scenario: Check that JPetStore Application BirdsPage is displayed
Given Launch the Chrome browser
When Bird JPetStore Page opened 
Then Click The Birds Image
Then Click The ProductID of Bird
Then Click The ItemId of Bird
Then Click The AddToCart
And Click The ProceedToCheckOut

@tc_03_CatsPage
Scenario: Check that JPetStore Application CatPage is displayed
Given Launch the Chrome browser
When Cats JPetStore Page opened 
Then Click The Cat Image
Then Click The ProductID of Cat
Then Click The ItemId of Cat
Then Click The AddToCart for cat
And Click The ProceedToCheckOut for cat

@tc_04_ReptilesPage
Scenario: Check that JPetStore Application ReptilePage is displayed
Given Launch the Chrome browser
When Reptiles JPetStore Page opened 
Then Click The Reptile Image
Then Click The ProductID of Reptile
Then Click The ItemId of Reptile
Then Click The AddToCart of Reptile
And Click The ProceedToCheckOut of Reptile

@tc_05_DogsPage
Scenario: Check that JPetStore Application DogsPage is displayed
Given Launch the Chrome browser
When Dogs JPetStore Page opened 
Then Clicks The Dogs Image
Then Clicks The ProductID for Dogs
Then Clicks The ItemId for Dogs
Then Clicks The AddToCart for Dogs
And Clicks The ProceedToCheckOut for Dogs

@tc_06_FishesPage
Scenario: Check that JPetStore Application FishPage is displayed
Given Launch the Chrome browser
When Fish JPetStore Page opened 
Then Clicks The Fish Image
Then Clicks The ProductID for Fish
Then Clicks The ItemId for Fish
Then Clicks The AddToCart for Fish
And Clicks The ProceedToCheckOut for Fish

@tc_07_ExcelReadLoginPage
Scenario: Check that user can sign in into jpetstore page
Given The jpetstore page is opened
Then Login page is opened
Then The <email> and <password> details are given
And Login and quit




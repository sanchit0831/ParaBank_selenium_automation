Feature: ParaBank Register, login, create account and bill payment automation testing

  # Register account
  Scenario Outline: Register a new account to ParaBank portal successfully
    Given user is on ParaBank home page
    And user clicks on register button
    When user enters <firstname>, <lastname>, <address>, <city>, <state>, <zip>, <phone>, <ssn>, <username> and <password>
    And user click on register button
    Then user is redirected to home page

    Examples: 
      | firstname | lastname | address | city | state       | zip    | phone      | ssn  | username | password          |
      | pratik    | shete    | Camp    | Pune | Maharashtra | 411023 | 9312312342 | 3421 | pratikk  | pratikshete@12345 |

  # Login account
  Scenario Outline: Login to ParaBank portal successfully
    When user enters the <username> and <password>
    And user click on login button
    Then user is logged in successfully

    Examples: 
      | username    | password          |
      | pratikk | pratikshete@12345 |

  Scenario: Open new account
    When user clicks Open new account button
    And user select Saving as type of account
    And user clicks on Open New Account button
    Then user new saving account is openned

  Scenario: Transfer amount
    When user clicks on Transfer Funds
    And user enters 50 in the Amount textbox
    And user select from and to account dropbox
    And user clicks on Transfer button
    Then amount is transfered successfully

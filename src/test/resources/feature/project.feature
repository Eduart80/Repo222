@regression
  Feature:FaceBook

      @smoke
      Scenario:NewEntry to facebook
        When i click new Account
        And i enter name Khan in field
        And i entered last Fight in field
        Then i entered khanfight@gmail.com in email
        Then i confirmed khanfight@gmail.com in field
        And i enter pass DuaPun1234. in password
        And select month 12 in calendar
        And select day 5 in date
        And select year 1995 in year
        When select gender male in buttons
        And select create new account

    @sanity
    Scenario Outline: Try all that apply

      When i click new Account
      And i enter name Khan in field
      And i entered last Fight in field
      Then i entered <invalidName> in email
      Then i confirmed <invalidName> in field
      And i enter pass <DuaPun1234.> in password
      And select month 12 in calendar
      And select day 5 in date
      And select year 1995 in year
      When select gender male in buttons
      And select create new account
      Examples:
        | invalidName           | DuaPun1234. |
        | duapun@hotmail.com    | sadr5432w   |
        | sduapun@live.com      | sdfrew      |
        | khanfight@gmail.com   | 123456789   |
        | totanKhamon@yahoo.com | 987654321   |
        | raGod@gmail.com       | 1q2w3e4r5t  |


@regression
  Feature:FaceBook
    #Background:

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
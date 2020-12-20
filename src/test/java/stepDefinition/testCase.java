package stepDefinition;

import PageLanding.WbsideDestination.landingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class testCase {
    landingPage lp =new landingPage();
    @When("^i click new Account$")
    public void newAccount(){
        lp.selectNewAccount();
    }
    @When("^i enter name (.+) in field$")
    public void enterN(String name){
        lp.enterNameInField(name);
    }
    @When("^i entered last (.+) in field$")
    public void enterL(String name){
        lp.enterLastInField(name);
    }
    @When("^i entered (.+) in email$")
    public void enterEmail(String name){
        lp.enterEmailInField(name);
    }
    @And("^i confirmed (.+) in field$")
    public void confirmEmail(String name){
        lp.confirmedEmailInField(name);
    }
    @When("^i enter pass (.+) in password$")
    public void enterPass(String numbers){
        lp.enterPassInField(numbers);
    }
    @When("^select month (.+) in calendar$")
    public void selectMonth(String month){
        lp.monthSelect(month);
    }
    @When("^select day (.+) in date$")
    public void selectDay(String day){
        lp.daySelect(day);
    }
    @When("^select year (.+) in year$")
    public void selectYear(String year){
        lp.yearSelect(year);
    }
    @When("^select gender male in buttons$")
    public void selectGender(){
        lp.clickRadioButton();
    }
    @When("^select create new account$")
    public void clickCreateButton(){
        lp.sendSignUP();
    }


}

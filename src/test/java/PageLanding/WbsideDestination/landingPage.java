package PageLanding.WbsideDestination;

import PageLanding.BasePage;
import org.openqa.selenium.By;

public class landingPage extends BasePage {

    // Locators
    By createNewAccount = By.id("u_0_2");
    By enterName = By.xpath("//input[@aria-label='First name']");
    By enterLast = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@name='reg_email__']");
    By confirmEmail = By.xpath("//input[@name='reg_email_confirmation__']");
    By enterPass = By.xpath("//input[@name='reg_passwd__']");
    By DOBmonth =By.id("month");
    By DOBday = By.id("day");
    By DOByear = By.id("year");
    By radioButton = By.xpath("//input[@name='sex']/preceding::label[contains(text(),'Male')]");
    By clickCreateButton=By.xpath("//button[@name='websubmit']");




    //Methods
    public void selectNewAccount(){
        clickThis(createNewAccount);
        waitForMe();
    }
    public void enterNameInField(String name){
        enterField(enterName, name);
    }
    public void enterLastInField(String name){
        enterField(enterLast, name);
    }
    public void enterEmailInField(String name){
        enterField(email, name);
    }
    public void confirmedEmailInField(String name){
        enterField(confirmEmail, name);
    }
    public void enterPassInField(String name){
        enterField(enterPass, name);
    }
    public void monthSelect(String month){
        dropDown(DOBmonth, month);
    }
    public void daySelect(String day){
        dropDown(DOBday, day);
    }
    public void yearSelect(String year){
        dropDown(DOByear, year);
    }
    public void clickRadioButton(){
        clickThis(radioButton);
    }
    public void sendSignUP(){
        clickThis(clickCreateButton);
    }




}

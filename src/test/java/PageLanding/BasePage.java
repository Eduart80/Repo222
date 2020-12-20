package PageLanding;

import WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public void clickThis(By locator) {
        Web.getDriver().findElement(locator).click();
    }
    public void enterField(By locator, String name){
        Web.getDriver().findElement(locator).sendKeys(name);
    }
    public void dropDown(By locator, String DOB){
        WebElement at = Web.getDriver().findElement(locator);
        Select birthday = new Select(at);
        birthday.selectByValue(DOB);
    }
    public void waitForMe(){
        Web.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void waitASec(){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectDropDown(By locator, String name){
        WebElement dropDown = Web.getDriver().findElement(locator);
        Select dropD = new Select(dropDown);
        dropD.selectByVisibleText(name);
    }

}

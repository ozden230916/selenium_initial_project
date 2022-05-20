package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUsButton.click();

        WebElement checkBoxInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));
        WebElement checkBoxDiv = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        checkBoxDiv.click();
        Thread.sleep(2000);
        boolean isCheckBoxSelected = false;
        if (checkBoxInput.isSelected()) isCheckBoxSelected = true;

        checkBoxDiv.click();
        Thread.sleep(2000);
        boolean isCheckBoxIsNotSelected = false;
        if (!checkBoxInput.isSelected()) isCheckBoxIsNotSelected = true;

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")? "Contact us url validation is PASSED" : "Contact us url validation is FAILED" );
        System.out.println(checkBoxDiv.isDisplayed() && isCheckBoxSelected && isCheckBoxIsNotSelected ? "Check box validation is PASSED" : "Check box validation is FAILED" );

        Driver.quitDriver();
    }
}

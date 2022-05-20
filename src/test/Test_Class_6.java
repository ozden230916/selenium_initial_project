package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Class_6 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUsButton.click();
        WebElement sendButton = driver.findElement(By.xpath("//button[@data-aid='CONTACT_SUBMIT_BUTTON_REND']"));

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")? "Contact us url validation is PASSED" : "Contact us url validation is FAILED" );
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() && sendButton.getText().equals("SEND") ? "Send button validation is PASSED" : "Send button validation is FAILED");
        Driver.quitDriver();
    }


}

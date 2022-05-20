package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']//li[3]/a"));
        contactUsButton.click();
        WebElement contactUsHeading = driver.findElement(By.cssSelector("h2[data-aid='CONTACT_SECTION_TITLE_REND']"));
        WebElement heading4 = driver.findElement(By.cssSelector("h4[data-aid='CONTACT_FORM_TITLE_REND']"));

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "Contact us button validation PASSED" : "Contact us button validation FAILED" );
        System.out.println(contactUsHeading.isDisplayed() && contactUsHeading.getText().equals("Contact Us") ? "Contact us heading validation is PASSED" : "Contact us heading validation is FAILED" );
        System.out.println(heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE") ? "Heading4 validation is PASSED" : "Heading4 validation is FAILED" );
        Driver.quitDriver();
    }
}

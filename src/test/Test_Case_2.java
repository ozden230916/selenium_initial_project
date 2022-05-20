package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUsButton.click();

        WebElement heading1 = driver.findElement(By.xpath("//h1[@role='heading']"));
        WebElement facebookIcon = driver.findElement(By.cssSelector("a[rel='noopener']"));
        WebElement instagramIcon = driver.findElement(By.cssSelector("a[aria-label='Instagram Social Link']"));

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "Contact Us url validation is PASSED" : "Contact Us url validation is FAILED");
        System.out.println(heading1.isDisplayed() && heading1.getText().equals("Connect With Us") ? "Heading1 validation is PASSED" : "Heading1 validation is FAILED" );
        System.out.println(facebookIcon.isDisplayed() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook icon validation is PASSED" : "Facebook icon validation is FAILED" );
        System.out.println(instagramIcon.isDisplayed() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "Instagram icon validation is PASSED" : "Instagram icon validation is FAILED" );

        Driver.quitDriver();
    }
}

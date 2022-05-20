package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_1 {
    public static void main(String[] args) {

            WebDriver driver = Driver.getDriver();
            driver.get("https://comfyelite.com/");

            WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact-us']"));
            contactUsButton.click();
            WebElement logo = driver.findElement(By.cssSelector("img[id='n-48560']"));
            WebElement header = driver.findElement(By.id("dynamic-tagline-48605"));

            System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "Contact Us url validation is PASSED" : "Contact Us url validation is FAILED");
            System.out.println(logo.isDisplayed() ? "Logo validation PASSED" : "Logo validation FAILED");
            System.out.println(header.isDisplayed() && header.getText().equals("High quality comfy pillows and accessories for travel, office and home.") ? "Header validation PASSED" : "Header validation FAILED");

            Driver.quitDriver();

        }
    }


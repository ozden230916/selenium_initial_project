package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//ul[@id='n-3734237352-navId']//li[3]/a"));
        contactUsButton.click();
        WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement firstNameInputBoxLabel = driver.findElement(By.xpath("//*[text()='First Name*']"));
        WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement lastNameInputBoxLabel = driver.findElement(By.xpath("//*[text()='Last Name*']"));
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement emailInputBoxLabel = driver.findElement(By.xpath("//*[text()='Email*']"));
        WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));

        String firstName = "Ozden";
        String lastName = "Firat";
        String email = "oozerfirat@gmail.com";
        String message = "Hello World";

        firstNameInputBox.sendKeys(firstName);
        lastNameInputBox.sendKeys(lastName);
        emailInputBox.sendKeys(email);
        messageInputBox.sendKeys(message);

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")? "Contact us url validation is PASSED" : "Contact us url validation is FAILED" );
        System.out.println(firstNameInputBox.isDisplayed() && firstNameInputBoxLabel.getText().equals("First Name*")&& firstNameInputBox.getAttribute("value").equals(firstName) ?
                "First name input box validation PASSED" : "First name input box validation FAILED" );
        System.out.println(lastNameInputBox.isDisplayed() && lastNameInputBoxLabel.getText().equals("Last Name*")&& lastNameInputBox.getAttribute("value").equals(lastName) ?
                "Last name input box validation PASSED" : "Last name input box validation FAILED" );
        System.out.println(emailInputBox.isDisplayed() && emailInputBoxLabel.getText().equals("Email*")&& emailInputBox.getAttribute("value").equals(email) ?
                "Email input box validation PASSED" : "Email input box validation FAILED" );
        System.out.println(messageInputBox.isDisplayed() && messageInputBox.getAttribute("placeholder").equals("Message*") && messageInputBox.getText().equals(message) ?
                "message input box validation PASSED" : "message input box validation FAILED");

        Driver.quitDriver();
    }
}

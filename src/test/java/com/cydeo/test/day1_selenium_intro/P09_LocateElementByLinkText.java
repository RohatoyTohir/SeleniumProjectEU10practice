package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByLinkText {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to google and print out the title
        driver.get("https://google.com");

        //identify and save the About link element on the top
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        //click on the link
        aboutLink.click();

        //close the browser
        driver.quit();

    }
}

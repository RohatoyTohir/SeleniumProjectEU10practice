package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementByPartialText {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to google and print out the title
        driver.get("https://google.com");

        //identify and save the "Helpful tips to fact check information online" element
        WebElement helpfultext = driver.findElement(By.partialLinkText("Helpful tips"));

        //printout text
        System.out.println(helpfultext.getText());

        //close the browser
        driver.quit();
    }
}

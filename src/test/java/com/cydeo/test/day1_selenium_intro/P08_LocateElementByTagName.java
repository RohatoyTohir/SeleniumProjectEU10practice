package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementByTagName {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to http://practice.cydeo.com/
        driver.get("http://practice.cydeo.com");

        //identify and save the "Test Automation Practice" element
        WebElement text = driver.findElement(By.tagName("h1"));

        //print out the text
        System.out.println(text.getText());

        //close the browser
        driver.quit();
    }
}

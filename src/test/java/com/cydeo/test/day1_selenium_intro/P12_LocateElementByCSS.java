package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByCSS {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to google and print out the title
        driver.get("https://google.com");

        //search for cydeo

        //verify Cydeo is appeared in the result

        //close the browser
        driver.quit();
    }
}

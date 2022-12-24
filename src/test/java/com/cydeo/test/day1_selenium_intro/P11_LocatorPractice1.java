package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorPractice1 {
    public static void main(String[] args) {

            //set up chrome and create WebDriver instance
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            //Make the windows maximized
            driver.manage().window().maximize();

            //navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");

        //Enter username provided: "abcd"
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

        //Enter password provided: "abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        //Click on login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        //Verify the massage "Invalid username or password"
        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("Message is Passed");
        }else{
            System.out.println("Message is Failed");
        }


        //Verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL is Passed");
        }else{
            System.out.println("URL is Failed");
        }

        //verify title is "Forgot Password"
        driver.findElement(By.partialLinkText("Forgot")).click();
        if(driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }
    }
}

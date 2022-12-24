package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementsByID {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to google and print out the title
        driver.get("https://google.com");

        //identify "I'm Feeling Lucky" element and save the element
       WebElement luckyText = driver.findElement(By.id("gbqfbb"));

        //find value of attribute
        String text = luckyText.getAttribute("value");

        //verify if value is "I'm Feeling Lucky"
        if (text.equals("I'm Feeling Lucky")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }



    }
}

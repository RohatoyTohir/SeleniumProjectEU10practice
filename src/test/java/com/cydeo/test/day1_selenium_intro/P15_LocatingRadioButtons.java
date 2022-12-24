package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to checkbox page from practice site
        driver.get("http://practice.cydeo.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
        System.out.println("Before clicking blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        blueRadioBtn.click();
        System.out.println("After clicking blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());

        //click red radio button
        WebElement redRadioBtn = driver.findElement(By.id("red"));
        System.out.println("Before clicking redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        redRadioBtn.click();
        System.out.println("After clicking redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        //check blue button is not selected
        System.out.println("After selecting red blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());

        //identify green radio button
        WebElement greenRadioBtn = driver.findElement(By.id("green"));
        greenRadioBtn.click();

        System.out.println("greenRadioBtn.isSelected() = " + greenRadioBtn.isSelected());
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size() = "+ allColors.size());

        for (WebElement eachColor : allColors){
            System.out.println("Current radio button is " + eachColor.getAttribute("id"));
            System.out.println("Is it enabled? "+ eachColor.isEnabled());
            System.out.println("Is it selected? " + eachColor.isSelected());
        }


        //close the browser
        //driver.quit();
    }
}

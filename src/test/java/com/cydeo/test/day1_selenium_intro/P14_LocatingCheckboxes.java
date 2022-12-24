package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to checkbox page from practice site
        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1") );
        System.out.println("Before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.id("box2") );
        System.out.println("Before click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));

        //if we want to check the chekbox
        if (checkbox1.isSelected()){
            System.out.println("checkbox is already selected");
        }else{
            checkbox1.click();
        }

        //quit browser
        driver.quit();
    }
}

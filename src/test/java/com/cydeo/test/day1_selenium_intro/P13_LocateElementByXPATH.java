package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByXPATH {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Make the windows maximized
        driver.manage().window().maximize();

        //navigate to google and print out the title
        driver.get("https://google.com");

        //search for cydeo
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        //verify Cydeo linkText is appeared in the results
        WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));
        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo text is appeared");
        }else{
            System.out.println("Cydeo text is did not appear");
        }

        //close the browser
        driver.quit();
    }
}

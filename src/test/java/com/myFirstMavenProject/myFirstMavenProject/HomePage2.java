package com.myFirstMavenProject.myFirstMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage2 {
	public WebDriver driver = null;
    String actualTitle = "Breaking News, Daily News and Videos - CNN.com";

    @BeforeMethod
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://www.cnn.com");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //String expectedTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("#search-button")).click();
        driver.findElement(By.cssSelector("#search-input-field")).sendKeys("politics", Keys.ENTER);

    }

    @AfterTest
    public void tearDown() throws Exception{
        //driver.close();

    }

}
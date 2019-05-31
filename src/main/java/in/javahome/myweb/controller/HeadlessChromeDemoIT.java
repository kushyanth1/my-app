package in.javahome.myweb.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;				
import org.junit.Test;

public class HeadlessChromeDemoIT
{
    public static void main(String args[])
    {
        test();
    }
    public static void test()
    {
        System.setProperty("ebdriver.chrome.driver","/usr/bin/chromedriver");
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("chrome.switches","--disable-extensions");
        
        WebDriver driver = new ChromeDriver(options);
      
        
        driver.get("https:google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");	
        driver.close();
        driver.quit();
        
    }
}

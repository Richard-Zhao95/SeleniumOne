package com.imooc.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumOne {
    WebDriver webDriver;
    public WebDriver InitDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
        webDriver = new ChromeDriver();
/*      System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\msedgedriver.exe");
        webDriver = new EdgeDriver();*/
        webDriver.get("https://www.imooc.com/");
        webDriver.manage().window().maximize();
        webDriver.getTitle();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return webDriver;
        //webDriver.close();
    }

    public void GetElement(){
        webDriver.findElement(By.id("js-signin-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.name("email")).sendKeys("18796220262");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("js-loginPassword")).sendKeys("Zyf18796220262");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement nodeElement = webDriver.findElement(By.className("rlf-autoin"));
        nodeElement.findElement(By.tagName("input")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
/*        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/
        webDriver.findElement(By.linkText("忘记密码")).click();
        webDriver.findElement(By.partialLinkText("遇到")).click();
        webDriver.findElement(By.xpath("/html/body/div[11]/div[2]/div/form/div[5]/input")).click();
    }

    public static void main(String[] args){
        SeleniumOne seleniumOne = new SeleniumOne();
        seleniumOne.InitDriver();
        seleniumOne.GetElement();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        seleniumOne.webDriver.close();
    }
}

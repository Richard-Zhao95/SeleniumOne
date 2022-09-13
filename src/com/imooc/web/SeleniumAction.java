package com.imooc.web;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumAction {
    public WebDriver webDriver;
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.imooc.com/");
    }

    public void InputElement(){
        webDriver.findElement(By.id("js-signin-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement emailElement = webDriver.findElement(By.name("email"));
        boolean info = emailElement.isEnabled();
        String inputInfo = emailElement.getAttribute("placeholder");
        emailElement.sendKeys("18796220262");
        String insertInfo = emailElement.getAttribute("value");
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(info);
        System.out.println();
        System.out.println(inputInfo);
        System.out.println();
        System.out.println(insertInfo);
        emailElement.clear();
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public void RadioElement(){
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
        //nodeElement.findElement(By.tagName("input")).click();
        System.out.println(nodeElement.isSelected());
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.linkText("个人信息")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("edit-info-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
//        List<WebElement> sexList = webDriver.findElements(By.name("sex"));
//        sexList.get(1).click();
        WebElement editUserForm = webDriver.findElement(By.id("profile"));
        List<WebElement> sexList = editUserForm.findElements(By.name("sex"));
        for(WebElement sex :sexList){
            if(sex.isSelected()){
                break;
            }else {
                sex.click();
            }
        }
        //sexList.get(1).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void CheckBoxElement(){
        webDriver.findElement(By.id("js-signin-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement checkBoxElement = webDriver.findElement(By.id("auto-signin"));
        System.out.println(checkBoxElement.isSelected());
        System.out.println(checkBoxElement.isEnabled());
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        checkBoxElement.click();
    }

    public void ButtonElement(){
        webDriver.findElement(By.id("js-signin-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement buttonElemnt = webDriver.findElement(By.className("moco-btn-red"));
        System.out.println(buttonElemnt.isDisplayed());
        //document.getElementsByClassName("moco-btn-red")[0].style.display=
        String js = "document.getElementsByClassName(\'moco-btn-red\')[0].style.display=\'None\';";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript(js);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(buttonElemnt.isDisplayed());

    }

    //input标签可以用sendkeys上传头像
    public void UploadFile(){
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
        //nodeElement.findElement(By.tagName("input")).click();
        System.out.println(nodeElement.isSelected());
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        WebElement headPng = webDriver.findElement(By.className("avator-img"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(headPng).perform();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("js-avator-link")).click();
        webDriver.findElement(By.id("upload")).sendKeys("C:\\Users\\Administrator\\Pictures\\63763106619290.png");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //AutoIt方式上传头像
    public void UploadFile_1() throws IOException {
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
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        WebElement headPng = webDriver.findElement(By.className("avator-img"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(headPng).perform();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("js-avator-link")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("avator-btn-fake")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\imooc.exe");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("moco-btn-blue")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void WebForm(){
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
/*        WebElement nodeElement = webDriver.findElement(By.className("rlf-autoin"));
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/
        webDriver.findElement(By.id("signup-form")).submit();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //键盘输入方式上传头像
    public void UploadFile_2() throws AWTException {
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
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        WebElement headPng = webDriver.findElement(By.className("avator-img"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(headPng).perform();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("js-avator-link")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("avator-btn-fake")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        StringSelection stringSelection = new StringSelection("C:\\Users\\Administrator\\Pictures\\63763106619290.png");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try{
            Thread.sleep(8000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("moco-btn-blue")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void SelectElement(){
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
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.linkText("个人信息")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("edit-info-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
//        List<WebElement> sexList = webDriver.findElements(By.name("sex"));
//        sexList.get(1).click();
        WebElement editUserForm = webDriver.findElement(By.id("profile"));
        editUserForm.findElement(By.id("job")).click();
        List<WebElement> jobList = editUserForm.findElements(By.tagName("option"));
        jobList.get(4).click();
        System.out.println(jobList.size());
/*        for(WebElement sex :sexList){
            if(sex.isSelected()){
                break;
            }else {
                sex.click();
            }
        }*/
        //sexList.get(1).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void SelectElementSelenium(){
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
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.id("header-avator")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.className("set-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.findElement(By.linkText("个人信息")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        webDriver.findElement(By.className("edit-info-btn")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
//        List<WebElement> sexList = webDriver.findElements(By.name("sex"));
//        sexList.get(1).click();
        WebElement editUserForm = webDriver.findElement(By.id("profile"));
        WebElement job = editUserForm.findElement(By.id("job"));
        Select jobDownList = new Select(job);
        jobDownList.selectByIndex(4);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        jobDownList.selectByValue("9");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        jobDownList.selectByVisibleText("架构师");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(jobDownList.isMultiple());
        //jobDownList.deselectByVisibleText("架构师");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> selectedOptions = jobDownList.getAllSelectedOptions();
        for(WebElement option:selectedOptions){
            System.out.println(option.getText());
        }
    }

    public void MouseAction(){
        Actions actions = new Actions(webDriver);
        List<WebElement> menuElementList = webDriver.findElements(By.className("item"));
        WebElement menuElement_1 = menuElementList.get(1);
        actions.moveToElement(menuElement_1).perform();
        webDriver.findElement(By.partialLinkText("Java")).click();
        try{
            Thread.sleep(6000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //这个方法跑不了，定位不到p标签
    public void SwitchIframe(){
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
        //nodeElement.findElement(By.tagName("input")).click();
        if(nodeElement.isSelected()){
            nodeElement.findElement(By.tagName("input")).click();
        }
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> listElements = webDriver.findElements(By.className("rlf-group"));
        listElements.get(4).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        webDriver.get("https://www.imooc.com/article/publish#");
        //无法直接输入
        //webDriver.findElement(By.id("ueditor_0")).sendKeys("ABCD");
        try {
            webDriver.findElement(By.id("ueditor_0")).sendKeys("ABCD");
        }catch(Exception e){
            System.out.println("定位输入错误");
        }

        WebElement IframeElement = webDriver.findElement(By.id("ueditor_0"));
        webDriver.switchTo().frame(IframeElement);
        //死活定位不到p标签
        WebElement uEditor = webDriver.findElement(By.tagName("p"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(uEditor).click().sendKeys("HIJK").perform();
        //actions.sendKeys("HIJK");
/*        uEditor.click();
        uEditor.sendKeys("EFGH");*/
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void WindowsHandle(){
        Actions actions = new Actions(webDriver);
        List<WebElement> menuElementList = webDriver.findElements(By.className("item"));
        WebElement menuElement_1 = menuElementList.get(1);
        actions.moveToElement(menuElement_1).perform();
        webDriver.findElement(By.partialLinkText("Java")).click();
        try{
            Thread.sleep(6000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Set<String> handles = webDriver.getWindowHandles();
        String currentHandle = webDriver.getWindowHandle();
        for(String handle : handles){
            if(handle.equals(currentHandle)){
                continue;
            }else {
                webDriver.switchTo().window(handle);
            }
        }
        List<WebElement> courses = webDriver.findElements(By.className("course-card"));
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(courses.size());
        courses.get(5).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void Wait(){
        //隐式等待
        //webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //显示等待
        //WebDriverWait webDriverWait = new WebDriverWait(webDriver,  1);
        //webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("js-signin-btn")));
    }

    public static void main(String[] args) throws IOException, AWTException {
        SeleniumAction seleniumAction = new SeleniumAction();
        seleniumAction.InitDriver();
//        seleniumAction.InputElement();
//        seleniumAction.RadioElement();
//        seleniumAction.CheckBoxElement();
//        seleniumAction.ButtonElement();
//        seleniumAction.UploadFile();
//        seleniumAction.UploadFile_1();
//        seleniumAction.WebForm();
//        seleniumAction.UploadFile_2();
//        seleniumAction.SelectElement();
//        seleniumAction.SelectElementSelenium();
//        seleniumAction.MouseAction();
//        seleniumAction.SwitchIframe();
//        seleniumAction.WindowsHandle();
        seleniumAction.Wait();
        //seleniumAction.webDriver.close();
    }
}

package com.fall23.basiclocators.hw;

import com.fall23.logintry.namba.BaseTestNamba;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class ByIdNamba extends BaseTestNamba {

    @Test
    void byIdTest(){
        openTheSite("https://nambafood.kg/freshbox");

        WebElement emailInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("_submit"));

        emailInput.sendKeys("jamishk789@gmail.com");
        passwordInput.sendKeys("123");
        submitBtn.click();


    }
}

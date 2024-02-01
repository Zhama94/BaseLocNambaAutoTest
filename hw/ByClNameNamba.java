package com.fall23.basiclocators.hw;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class ByClNameNamba extends BaseTest {

    @Test
    void byIdTest() {
        openTheSite("https://nambafood.kg/freshbox");
        WebElement submitBtn = driver.findElement(By.className("fb-login"));

        WebElement emailInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitBtn3 = driver.findElement(By.className("fb-login"));

        emailInput.sendKeys("jamishk789@gmail.com");
        passwordInput.sendKeys("123");
        submitBtn3.click();
    }
}
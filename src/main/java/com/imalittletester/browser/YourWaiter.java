package com.imalittletester.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourWaiter {
    private final int TIMEOUT = 30;
    public WebDriver driver;

    public YourWaiter(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForAttributeValueEquals(WebElement element,
                                            String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(TIMEOUT));
        ExpectedCondition expectedCondition =
                webDriver -> element.getAttribute(attribute).equals(value);
        wait.until(expectedCondition);
    }

    public void waitForTextEquals(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(TIMEOUT));
        ExpectedCondition expectedCondition =
                webDriver -> element.getText().equals(text);
        wait.until(expectedCondition);
    }

    public void sendKeys(WebElement element, String text) {
        sendKeys(element, text, TIMEOUT);
    }
    public void sendKeys(WebElement element, String text,
                         int specifiedTimeout) {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(specifiedTimeout));
        ExpectedCondition expectedCondition = webDriver -> {
            try {
                element.clear();
                element.sendKeys(text);
                return true;
            }
            catch (Exception e) {
                return false;
            }
        };
        wait.until(expectedCondition);
    }

    public void sendKeysAndWaitForAttributeEquals(WebElement element, String text) {
        sendKeys(element, text, 15);
        waitForAttributeValueEquals(element, "value", text);
    }













}

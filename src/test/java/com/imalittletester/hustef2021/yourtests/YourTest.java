package com.imalittletester.hustef2021.yourtests;

import com.imalittletester.browser.SetupHelper;
import com.imalittletester.browser.YourWaiter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.YourPage;

import java.io.File;
import java.util.List;
import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class YourTest extends SetupHelper {
    //TODO 3 - open the browser in @BeforeClass
    //TODO 3 - close all the browser windows in @AfterClass
    //TODO 4 - create YourPage class and initialize it in @BeforeClass

    private YourPage page;
    private YourWaiter waiter;

    @BeforeAll
    void beforeAll() {
        driver = browserGetter.getChromeDriver();
        page = PageFactory.initElements(driver, YourPage.class);
        waiter = new YourWaiter(driver);
    }

//    @AfterAll
//    void afterAll() {
//        driver.quit();
//    }

    //TODO 4 - open the example.com website; print to the console the url of
    // the current page
    @Test
    void _4_openUrl() throws InterruptedException {
        driver.get("http://www.example.com");
        Thread.sleep(3000);
    }

    //TODO 4 - open the local file:
    @Test
    void _4_openLocalFile() {

    }

    //TODO 6 - interactions.html - create the WebElement for the button
    // from the 'click' block. Click on the button
    @Test
    void _6_clickOnButton() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.buttonToClick.click();
    }

    //TODO 6 - interactions.html - create the WebElement for the checkbox
    // from the 'click' block. Click on the checkbox
    @Test
    void _6_clickOnCheckbox() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.checkboxToClick.click();
    }

    //TODO 6 - interactions.html - create the WebElement for the input from
    // the 'sendKeys' block. Type in the field using sendKeys
    @Test
    void _6_sendKeysToInput() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.inputToTypeInto.sendKeys("theText");
    }

    //TODO 6 - interactions.html - create the WebElement for the textarea
    // from the 'sendKeys' block. Type in the field using sendKeys. Clear the
    // field. Type a different text
    @Test
    void _6_clearTextArea() throws InterruptedException {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.textAreaToTypeInto.sendKeys("theText");
        Thread.sleep(3000);
        page.textAreaToTypeInto.clear();
        Thread.sleep(3000);
        page.textAreaToTypeInto.sendKeys("somethingElse");
    }

    //TODO 6 - interactions.html - create the WebElement for the Header 5
    // element in the 'getText' section. Get it's text and print it to the
    // console
    @Test
    void _6_getText() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        System.out.println(page.h5Element.getText());
    }

    //TODO 6 - interactions.html - Copy the code you wrote at _6_clearTextArea
    // and paste it this method. After each sendKeys use getAttribute to type
    // the text written into the input to the console
    @Test
    void _6_getAttribute() throws InterruptedException {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.textAreaToTypeInto.sendKeys("theText");
        System.out.println("Text is: " + page.textAreaToTypeInto.getAttribute("value"));

        Thread.sleep(3000);
        page.textAreaToTypeInto.clear();
        System.out.println("Text is: " + page.textAreaToTypeInto.getAttribute("value"));

        Thread.sleep(3000);
        page.textAreaToTypeInto.sendKeys("somethingElse");
        System.out.println("Text is: " + page.textAreaToTypeInto.getAttribute("value"));

    }

    //TODO 6 - interactions.html - Copy the code you wrote at _6_clickOnCheckbox
    // and paste it this method. Print to the console the value of the
    // attribute 'checked'. Click the checkbox again and print the attribute
    // value again
    @Test
    void _6_getAttributeChecked() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        page.checkboxToClick.click();
        System.out.println(page.checkboxToClick.getAttribute("checked"));

        page.checkboxToClick.click();
        System.out.println(page.checkboxToClick.getAttribute("checked"));
    }

    //TODO 6 - interactions.html -
    // 1. create the WebElement corresponding to the first dropdown in the
    // Select section.
    // 2. create the corresponding Select object in the test
    // 3. type all available options to the console
    // 4. select second option by visible text
    // 5. select option by index: third element in list
    // 6. selection last option by value
    @Test
    void _6_dropdown() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        System.out.println(driver.getPageSource());

        Select dropdown = new Select(page.firstDropdownElement);

        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        dropdown.selectByVisibleText("Doppio");

        dropdown.selectByIndex(2);

        dropdown.selectByValue("5");
    }

    //TODO 6 - interactions.html -
    // 1. create the WebElement corresponding to the multiple dropdown in the
    // Select section.
    // 2. create the corresponding Select object in the test
    // 3. select the second and third options
    // 4. print all the visible text of the selected options
    // 5. deselect all the options
    @Test
    void _6_multipleDropdown() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        Select dropdown = new Select(page.multipleDropdownElement);

        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);

        List<WebElement> allSelectedOptions = dropdown.getAllSelectedOptions();
        for (WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }

        dropdown.deselectAll();
        allSelectedOptions = dropdown.getAllSelectedOptions();
        System.out.println(allSelectedOptions.size());
    }

    //TODO - withIframes.html
    // 1. switch to frame which has id and print text of button
    // 2. switch to second frame by index and print text of button
    // 3. switch to third frame by WebElement and print text of button
    @Test
    void _7_iframes() {
        driver.get(new File("src/test/resources/html/withIframes.html").getAbsolutePath());
        driver.switchTo().frame("frameWithId");
        System.out.println(page.buttonInsideFirstFrame.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(page.buttonInsideFrameWithIndex.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(page.frameAsWebElement);
        System.out.println(page.buttonInsideFrameAsWebElement.getText());
    }

    //TODO 6 - interactions.html -
    // 1. refresh current page and print url
    // 2. click on the link from the click section and print current url
    // 3. go back to the previous page and print current url
    // 4. go forward and print current url
    @Test
    void _8_navigation() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());

        page.linkToClick.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
    }

    //TODO 6 - www.example.com
    // 1. get all cookies and print the list of them
    // 2. delete all cookies and print the list of them
    // 3. add new cookie by providing the name and value
    // 4. delete cookie by name
    @Test
    void _9_cookies() {
        driver.get("http://www.example.com");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        System.out.println(driver.manage().getCookies().size());

        driver.manage().addCookie(new Cookie("theCookie", "theValue"));
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookies());

        driver.manage().deleteCookieNamed("theCookie");
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookies());
    }

    //TODO - mainPage.html
    // 1. Get all current window handles
    // 2. Click on first link. Reload window handles list
    // 3. Close newly opened tab and switch back to initial window
    // 4. Get handle of current window (the initial one)
    // 5. Click on second link. Close second page and switch to initial one
    // using individual window handle
    @Test
    void _10_windows() {
        driver.get(new File("src/test/resources/html/mainPage.html").getAbsolutePath());
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        page.listOfLinks.get(0).click();
        windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        driver.switchTo().window((String) windowHandles.toArray()[1]);
        System.out.println(page.h4Element.getText());
        driver.close();

        driver.switchTo().window((String) windowHandles.toArray()[0]);
        windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        String windowHandle = driver.getWindowHandle();
        page.listOfLinks.get(1).click();
        windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        driver.switchTo().window((String) windowHandles.toArray()[1]);
        System.out.println(page.h4Element.getText());
        driver.close();

        driver.switchTo().window(windowHandle);
    }

    //TODO - userPrompts.html
    // 1. trigger the alert, then close it
    // 2. trigger the confirm, then accept it
    // 3. trigger the confirm, then dismiss it
    // 4. trigger the prompt, then dismiss it
    @Test
    void _11_userPrompts() throws InterruptedException {
        driver.get(new File("src/test/resources/html/userPrompts.html").getAbsolutePath());
        page.alertButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        page.confirmButton.click();
        alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        page.confirmButton.click();
        alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();

        page.promptButton.click();
        alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();
    }

    // TODO - copy content of _6_getAttribute
    //  1. replace printing of "value" attribute with waiting for it to have
    //  the value typed into the field
    //  2. replace sendKeys with waiting for the sendKeys to be successful
    //  3. combine sendKeys with waiting for attribute
    @Test
    void _12_waitGetAttribute() {
        driver.get(new File("src/test/resources/html/interactions.html").getAbsolutePath());

        waiter.sendKeysAndWaitForAttributeEquals(page.textAreaToTypeInto, "theText");

        page.textAreaToTypeInto.clear();
        waiter.waitForAttributeValueEquals(page.textAreaToTypeInto, "value", "");

        waiter.sendKeysAndWaitForAttributeEquals(page.textAreaToTypeInto, "somethingElse");

    }


}

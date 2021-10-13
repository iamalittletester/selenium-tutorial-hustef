package com.imalittletester.hustef2021.yourtests;

import com.imalittletester.browser.SetupHelper;
import com.imalittletester.browser.YourWaiter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.YourPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class YourTest extends SetupHelper {
    //TODO 3 - open the browser in @BeforeClass
    //TODO 3 - close all the browser windows in @AfterClass
    //TODO 4 - create YourPage class and initialize it in @BeforeClass

    private YourPage page;
    private YourWaiter waiter;

    @BeforeAll
    void beforeAll() {

    }

    @AfterAll
    void afterAll() {

    }

    //TODO 4 - open the example.com website; print to the console the url of
    // the current page
    @Test
    void _4_openUrl() {

    }

    //TODO 4 - open the local file:
    @Test
    void _4_openLocalFile() {

    }

    //TODO 6 - interactions.html - create the WebElement for the button
    // from the 'click' block. Click on the button
    @Test
    void _6_clickOnButton() {
    }

    //TODO 6 - interactions.html - create the WebElement for the checkbox
    // from the 'click' block. Click on the checkbox
    @Test
    void _6_clickOnCheckbox() {
    }

    //TODO 6 - interactions.html - create the WebElement for the input from
    // the 'sendKeys' block. Type in the field using sendKeys
    @Test
    void _6_sendKeysToInput() {
    }

    //TODO 6 - interactions.html - create the WebElement for the textarea
    // from the 'sendKeys' block. Type in the field using sendKeys. Clear the
    // field. Type a different text
    @Test
    void _6_clearTextArea() {
    }

    //TODO 6 - interactions.html - create the WebElement for the Header 5
    // element in the 'getText' section. Get it's text and print it to the
    // console
    @Test
    void _6_getText() {
    }

    //TODO 6 - interactions.html - Copy the code you wrote at _6_clearTextArea
    // and paste it this method. After each sendKeys use getAttribute to type
    // the text written into the input to the console
    @Test
    void _6_getAttribute() {
    }

    //TODO 6 - interactions.html - Copy the code you wrote at _6_clickOnCheckbox
    // and paste it this method. Print to the console the value of the
    // attribute 'checked'. Click the checkbox again and print the attribute
    // value again
    @Test
    void _6_getAttributeChecked() {
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
    }

    //TODO - withIframes.html
    // 1. switch to frame which has is and print text of button
    // 2. switch to second frame by index and print text of button
    // 3. switch to third frame by WebElement and print text of button
    @Test
    void _7_iframes() {
    }

    //TODO 6 - interactions.html -
    // 1. refresh current page and print url
    // 2. click on the link from the click section and print current url
    // 3. go back to the previous page and print current url
    // 4. go forward and print current url
    @Test
    void _8_navigation() {
    }

    //TODO 6 - www.example.com
    // 1. get all cookies and print the list of them
    // 2. delete all cookies and print the list of them
    // 3. add new cookie by providing the name and value
    // 4. delete cookie by name
    @Test
    void _9_cookies() {
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
    }

    //TODO - userPrompts.html
    // 1. trigger the alert, then close it
    // 2. trigger the confirm, then accept it
    // 3. trigger the confirm, then dismiss it
    // 4. trigger the prompt, then dismiss it
    @Test
    void _11_userPrompts() {
    }

    // TODO - copy content of _6_getAttribute
    //  1. replace printing of "value" attribute with waiting for it to have
    //  the value typed into the field
    //  2. replace sendKeys with waiting for the sendKeys to be successful
    //  3. combine sendKeys with waiting for attribute
    @Test
    void _12_waitGetAttribute() {
    }
}

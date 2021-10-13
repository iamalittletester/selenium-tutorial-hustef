package com.imalittletester.hustef2021;

import com.imalittletester.browser.SetupHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest extends SetupHelper {

    @BeforeAll
    void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }

    @Test
    void firstTest() throws InterruptedException {
        System.out.println("This test needs to pass successfully, open the " +
                "browser, wait for a few seconds, then close it.");
        Thread.sleep(5000);
    }
}

package org.prog.session8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.AlloPageHomework;
import org.prog.session8.page.GooglePage;
import org.prog.session8.page.W3SchoolsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class AlloTests {
    private WebDriver driver;
    private AlloPageHomework alloPageHomework;




        @BeforeSuite
        public void initWebDriver() {
            driver = new ChromeDriver();
            alloPageHomework = new AlloPageHomework(driver);

        }
        @Test
        public void myAlloTest() {
            alloPageHomework.loadPage();
            alloPageHomework.searchAllo();
            alloPageHomework.searchElementOfPrice();
        }

        @AfterSuite
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }



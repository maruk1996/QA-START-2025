package org.prog.session7.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeworkWebTest {

        private WebDriver driver;

        @BeforeSuite
        public void initWebDriver(){
            driver = new ChromeDriver();
        }

        @Test
        public void myHomeworkTest() {
            driver.get("https://allo.ua/");
            WebElement search = driver.findElement(By.name("search"));
            search.sendKeys("iPhone");
            search.sendKeys(Keys.ENTER);

        }

       @AfterSuite
        public void tearDown() {
            if (driver != null) {
               driver.quit();
            }
        }
    }



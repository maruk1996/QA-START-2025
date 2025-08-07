package org.prog.session8.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AlloPageHomework {


    private final WebDriver driver;
    public AlloPageHomework(WebDriver driver) {this.driver = driver;
    }


    public  void loadPage() {
        driver.get("https://allo.ua/");
    }
    public void searchAllo(){
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("iPhone 16");
        search.sendKeys(Keys.ENTER);
    }

    public void searchElementOfPrice(){
        WebElement search = driver.findElement(By.className("currency"));

          }




}

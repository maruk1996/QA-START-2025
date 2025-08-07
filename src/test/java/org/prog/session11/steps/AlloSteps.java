package org.prog.session11.steps;




import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.AlloPageHomework;


    public class AlloSteps {

        private WebDriver driver;
        private AlloPageHomework alloPage;

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            alloPage = new AlloPageHomework(driver);
        }

        @Given("I open Allo homepage")
        public void openAllo() {
            alloPage.loadPage();
        }

        @When("I search for {string}")
        public void searchProduct(String keyword) {
            alloPage.searchAllo(keyword);}

        @Then("I should see the price of the item")
        public void checkPrice() {
            alloPage.searchElementOfPrice();
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

}

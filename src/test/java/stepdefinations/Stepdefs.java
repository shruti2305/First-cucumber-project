package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stepdefs {
    WebDriver driver;
    String url="https://www.amazon.in/";
    @Given(": User opened the browser")
    public void user_opened_the_browser() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @When(": User navigated to app url")
    public void user_navigated_to_app_url() {
        driver.get(url);

    }
    @Then(": User is able to see the application homepage")
    public void user_is_able_to_see_the_application_homepage() {
        String Titleexpected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String Titleactual= driver.getTitle();
        Assert.assertEquals(Titleexpected, Titleactual);

    }
    @Given(": User open the browser and navigated to application homepage")
    public void user_open_the_browser_and_navigated_to_application_homepage() {
         user_opened_the_browser();
         user_navigated_to_app_url();
    }


    @When(": User search for product in Search field")
    public void user_search_for_product_in_search_field() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");

    }
    @Then(": Search results for  products is displayed")
    public void search_results_for_products_is_displayed() {
       System.out.println("Mobile list is displayed");


    }
}

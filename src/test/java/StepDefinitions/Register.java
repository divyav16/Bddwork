package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {


    WebDriver driver;




        @Given("^User able to Open Browser$")
         public void user_able_to_Open_Browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Given("^Enter an Url$")
    public void enter_an_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link() {driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }

    @When("^User on Register Page and Verify Register page Title$")
    public void user_on_Register_Page_and_Verify_Register_page_Title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }

    @Then("^User Enter Gender, First Name, Last Name, Date of Birthday, Date Of Birthday Month, Date of Birth Year,Email, Company Name, Password and Confirm Password on Register Button$")
    public void user_Enter_Gender_First_Name_Last_Name_Date_of_Birthday_Date_Of_Birthday_Month_Date_of_Birth_Year_Email_Company_Name_Password_and_Confirm_Password_on_Register_Button()  {
     driver.findElement(By.id("gender-female")).sendKeys("Female");
     driver.findElement(By.id("FirstName")).sendKeys("Divya");
     driver.findElement(By.id("LastName")).sendKeys("Vandra");
     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("26");
     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("July");
     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1985");
     driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("divyavandra1@gmail.com");
     driver.findElement(By.id("Company")).sendKeys("Hello");
     driver.findElement(By.id("Password")).sendKeys("saibaba86");
     driver.findElement(By.id("ConfirmPassword")).sendKeys("saibaba86");
     driver.findElement(By.id("register-button")).click();

    }

    @Then("^User is on Home Page and Verify Home page Title$")
    public void user_is_on_Home_Page_and_Verify_Home_page_Title() {

    }


    @Then("^User close the Browser$")
    public void user_close_the_Browser(){driver.close();


    }


}
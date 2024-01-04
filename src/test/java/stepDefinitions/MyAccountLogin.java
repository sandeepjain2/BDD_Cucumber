package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageObjects.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyAccountLogin extends BaseClass {

    public WebDriver driver = null;


    @Before
    public void setup() throws IOException
    {
        //Logging
        logger= Logger.getLogger("BDD_Cecumber");
        PropertyConfigurator.configure("Log4j.properties");
        logger.setLevel(Level.DEBUG);

        //Load properties file
        configProp= new Properties();
        FileInputStream configPropfile = new FileInputStream("config.properties");
        configProp.load(configPropfile);

        String br=configProp.getProperty("browser"); //getting the browser name from config.properties file

        //Launching browser
        if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();
        }

        else if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
            driver = new ChromeDriver();
        }

        else if (br.equals("ie")) {
            System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
            driver = new InternetExplorerDriver();
        }

    }

    @Given("Open the browser")
    public void open_the_browser() {
        System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
        //driver = new ChromeDriver();
        lp=new LoginPage(driver);
    }

    @When("Enter the URL {string}")
    public void enter_the_URL(String URL) {
        driver.get(URL);
    }

    @When("Click on My Account Menu")
    public void click_on_My_Account_Menu() {
    driver.findElement(By.linkText("My Account")).click();
    }

    @When("Enter registered username {string} and password {string}")
    public void enter_registered_username_and_password(String username, String pwd) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
    }

    @When("Click on login button")
    public void click_on_login_button() {
        driver.findElement(By.name("login")).click();
    }

    @Then("User must successfully login to the web page")
    public void user_must_successfully_login_to_the_web_page() {
        String capText = driver.findElement
                (By.xpath("//strong[contains(text(), 'pavanoltraining')]")).getText();
        Assert.assertEquals(true, capText.contains("pavanoltraining"));
        driver.quit();
    }

}

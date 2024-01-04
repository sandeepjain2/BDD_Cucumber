package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.LoginPage;

import java.util.List;
import java.util.Map;

public class MyAccountLoginFromMap extends BaseClass {

    @When("Enter registered username and password with map")
    public void enter_registered_username_and_password_with_map(DataTable dataTable) {
        List<Map<String,String >> data = dataTable.asMaps(String.class, String.class);
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
    }

}

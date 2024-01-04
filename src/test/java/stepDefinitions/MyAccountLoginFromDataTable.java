package stepDefinitions;

//import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Map;

public class MyAccountLoginFromDataTable extends BaseClass {

    @When("Enter registered username and password")
    public void enter_registered_username_and_password(DataTable dataTable) {
        List <List <String> > data = dataTable.asLists();
        driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
    }

}

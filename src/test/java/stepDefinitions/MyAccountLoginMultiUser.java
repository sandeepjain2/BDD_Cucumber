package stepDefinitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyAccountLoginMultiUser extends BaseClass{

    @Then("Verify Login")
    public void verify_Login() {
        String capText = driver.findElement
                (By.xpath("//strong[contains(text(), 'pavanoltraining')]")).getText();

        if(capText.contains("Error")) {
            Assert.assertTrue("Invalid user and password ",true);
            driver.quit();
        } else {
            Assert.assertTrue(false);
            driver.quit();
        }
        driver.quit();
    }

}

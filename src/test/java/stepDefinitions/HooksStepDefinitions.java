package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import java.sql.SQLOutput;

public class HooksStepDefinitions {

    @Before
    public void setUp(){
        System.out.println("launch browser");
    }

    @After
    public void tearDown(){
        System.out.println("Quit browser");
    }


    @Given("user is on add customer page")
    public void user_is_on_add_customer_page() {
        System.out.println("user is on add customer page");
    }

    @When("user fills the customer details")
    public void user_fills_the_customer_details() {
        System.out.println("user fills the customer details");
    }

    @Then("customer is added")
    public void customer_is_added() {
        System.out.println("customer is added");
    }

    @Given("user is on edit customer page")
    public void user_is_on_edit_customer_page() {
        System.out.println("user is on edit customer page");
    }

    @When("user edit contact details")
    public void user_edit_contact_details() {
        System.out.println("user edit contact details");
    }

    @Then("contact details updated")
    public void contact_details_updated() {
        System.out.println("contact details updated");
    }

    @Given("user is on delete customer page")
    public void user_is_on_delete_customer_page() {
        System.out.println("user is on delete customer page");
    }

    @When("user delete customer")
    public void user_delete_customer() {
        System.out.println("user delete customer");
    }

    @Then("customer deleted")
    public void customer_deleted() {
        System.out.println("customer deleted");
    }



}

package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {
    @Given("^User is on Landing page$")
    public void userIsOnBankingPage(){
        System.out.println("From GIVEN step");
    }

    @When("^User log into application with username and password$")
    public void loginUser(){
        System.out.println("login user");
    }

    @Then("^Home page is populate$")
    public void checkPopulatePage(){
        System.out.println("THEN STEP");
    }

    @And("^Cards are displayed$")
    public void showCards(){
        System.out.println("Cards are displayed");
    }

}

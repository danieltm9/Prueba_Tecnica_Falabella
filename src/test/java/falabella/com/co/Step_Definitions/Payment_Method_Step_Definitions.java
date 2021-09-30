package falabella.com.co.Step_Definitions;

import falabella.com.co.Exceptions.Different_Result;
import falabella.com.co.Questions.Payment_Page_Validation;
import falabella.com.co.Tasks.Add_Info;
import falabella.com.co.Tasks.Add_Product;
import falabella.com.co.Tasks.Search_Product;
import falabella.com.co.User_Interface.Falabella_Index_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class Payment_Method_Step_Definitions {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Given("Be on the page of falabella")
    public void iGoToFalabellaPage() {
        theActorCalled("user").wasAbleTo(Open.browserOn(new Falabella_Index_Page()));
    }

    @When("Look for a product")
    public void iWantToFindAProduct(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(Search_Product.FromthePage(dataTable));
    }

    @And("Add to shopping cart")
    public void addItToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(Add_Product.FromthePage());
    }

    @And("Add personal information")
    public void enterMyPersonalInformation(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(Add_Info.FromthePage(dataTable));
    }

    @Then("See the product on the payment method page")
    public void iWantTooSeeInTheBuyPageTheProduct() {
        theActorInTheSpotlight().should(seeThat(Payment_Page_Validation.IsSame(), equalTo("Resumen de tu orden")).orComplainWith(Different_Result.class, Different_Result.MensajeError()));
    }

}
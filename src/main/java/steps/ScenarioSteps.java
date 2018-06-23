package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    PolicyMakerSteps policyMakerSteps = new PolicyMakerSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    TravelAndBuySteps travelAndBuySteps = new TravelAndBuySteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMainMenu(String item){
        mainSteps.stepSelectMainMenu(item, BaseSteps.getDriver());
    }

    @When("^выбран вид страхования \"(.*)\"$")
    public void stepSelectInsuranceMenu(String item){
        mainSteps.stepSelectInsuranceMenu(item, BaseSteps.getDriver());
    }

    @Then("^проверли заголовок страницы")
    public void stepCheckTheTitle(){
        travelAndBuySteps.stepCheckTheTitle();
    }

    @When("^нажали на кнопку")
    public void stepPushTheButton(){
        travelAndBuySteps.stepPushTheButton();
    }

    @When("^выбрана сумма страховой защиты \"(.*)\"$")
    public void stepChoosePriceAndPushButton(String value){
        ArrayList tabs2 = new ArrayList(BaseSteps.getDriver().getWindowHandles());
        BaseSteps.getDriver().switchTo().window((String) tabs2.get(1));
        travelInsuranceSteps.stepChoosePriceAndPushButton(value);
    }

    @When("заполняются поля:")
    public void stepSetValueOfElements(DataTable fields){
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> policyMakerSteps.stepSetValueOfElement(key, value)
        );
    }

    @When("^выбран пол \"(.*)\"$")
    public void stepSetValueOfElementSex (String value){
        policyMakerSteps.stepSetValueOfElement("sex", value);
    }

    @Then("^проверили значения полей:$")
    public void stepCheckFillFields(DataTable fields){
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> policyMakerSteps.stepGetValueOfElement(key, value)
        );
    }

    @When("^нажали на \"(.*)\"$")
    public void stepPushButton(String value){
        policyMakerSteps.stepPushButton(value);
    }

    @Then("^проверли всплывающее сообщение \"(.*)\"$")
    public void stepGetValueOfElement(String value){
        policyMakerSteps.stepGetValueOfElement("cont", value);
    }

}

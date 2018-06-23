package steps;

import pages.PolicyMakerPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Кондратов on 21.06.2018.
 */
public class PolicyMakerSteps {

    @Step("Поле {0} заполняеся значением {1}")
    public void stepSetValueOfElement(String text, String value){
        new PolicyMakerPage(BaseSteps.getDriver()).setValueOfElement(text, value);
    }

    @Step("заполняются поля")
    public void stepSetValueOfElements(HashMap<String, String> fields){
        fields.forEach((key, value) -> stepSetValueOfElement(key, value));
    }

    @Step("Нажали кнопку{0}")
    public void stepPushButton(String value){
        new PolicyMakerPage(BaseSteps.getDriver()).pushButton(value);
    }


    @Step("Получили и проверили значение поля {0}")
    public void stepGetValueOfElement(String field, String value){
        String actual = new PolicyMakerPage(BaseSteps.getDriver()).getValueOfElement(field);
        assertEquals(value, actual);
    }

    @Step("поля заполнены верно")
    public void stepCheckFillFields(HashMap<String, String> fields){
        fields.forEach((key, value) -> stepGetValueOfElement(key, value));
    }
}

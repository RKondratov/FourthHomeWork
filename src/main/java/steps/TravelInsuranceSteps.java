package steps;

import pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 21.06.2018.
 */
public class TravelInsuranceSteps {

    @Step("Выбрана сумма страховой защиты {0}")
    public void stepChoosePriceAndPushButton(String value){
        new TravelInsurancePage(BaseSteps.getDriver()).choosePriceAndPushButton(value);
    }
}

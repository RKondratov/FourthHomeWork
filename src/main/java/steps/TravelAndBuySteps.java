package steps;

import pages.TravelAndBuyPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 21.06.2018.
 */
public class TravelAndBuySteps {

    @Step("Проверили заголовок")
    public void stepCheckTheTitle() {
        new TravelAndBuyPage(BaseSteps.getDriver()).checkTheTitle();
    }

    @Step("Выполнено нажатие на кнопку \"Оформить онлай\"")
    public void stepPushTheButton() {
        new TravelAndBuyPage(BaseSteps.getDriver()).pushTheButton();
    }
}

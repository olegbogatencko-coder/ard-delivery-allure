package ru.netology.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.pages.CardDeliveryPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest extends BaseTest {

    @Test
    @DisplayName("Успешный заказ доставки карты")
    void shouldOrderCardSuccessfully() {
        open("/");

        CardDeliveryPage page = new CardDeliveryPage();

        page.fillForm(
                "Москва",
                "25.12.2026",
                "Сидоров Алексей",
                "+79998887766"
        );

        page.successNotification()
                .shouldBe(visible)
                .shouldHave(text("Успешно"));
    }
}
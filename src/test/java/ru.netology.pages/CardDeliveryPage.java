package ru.netology.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CardDeliveryPage {

    public SelenideElement cityInput() {
        return $(".input__control", 0);
    }

    public SelenideElement dateInput() {
        return $(".input__control", 1);
    }

    public SelenideElement nameInput() {
        return $(".input__control", 2);
    }

    public SelenideElement phoneInput() {
        return $(".input__control", 3);
    }

    public SelenideElement agreementCheckbox() {
        return $(".checkbox__box");
    }

    public SelenideElement submitButton() {
        return $("button.button");
    }

    public SelenideElement successNotification() {
        // Ищем уведомление по точному data-test-id
        return $("[data-test-id='success-notification']");
    }

    public void fillForm(String city, String date, String name, String phone) {
        cityInput().shouldBe(visible).setValue(city);
        dateInput().shouldBe(visible).setValue(date);
        nameInput().shouldBe(visible).setValue(name);
        phoneInput().shouldBe(visible).setValue(phone);
        agreementCheckbox().click();
        submitButton().click();
    }
}
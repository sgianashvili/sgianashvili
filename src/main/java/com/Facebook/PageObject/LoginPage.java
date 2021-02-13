package com.Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    protected SelenideElement
            userNameInput = $(byXpath("//*[@id=\"email\"]"));
            // = $(By.ByXPath("//*[@id="pass"]"));
            logInInput =



}

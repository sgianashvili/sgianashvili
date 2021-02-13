package com.Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    protected SelenideElement
       createAccount = $("#u_0_2"),
       firstNameInput = $(By.name("firstname")),
       lastNameinput = $(By.name("lastname")),
       emailNameinput = $(By.name("reg_email__")),
       passwordInput =  $("#password_step_input"),
       monthInput = $("#month"),
       dataInput = $("#day"),
       yearInput = $("#year"),
       clickInput = $(by("data-type", "radio")),
       RegisterInput =  $(byName("websubmit"));

}

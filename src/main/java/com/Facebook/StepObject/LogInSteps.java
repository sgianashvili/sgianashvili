package com.Facebook.StepObject;

import com.Facebook.PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class LogInSteps extends LoginPage {


    @Step("userName {userName}")
    public LogInSteps UserNameValue (String userName){
        userNameInput.setValue(userName);
        userNameInput.shouldNotBe(Condition.empty);
        return this;
    }

   @Step("Paroli{Paroli}")
    public LogInSteps paroliValue(String paroli){
        paroli.setValue(paroli);
        paroli.shouldNotBe(Condition.empty);
        return this;


    }

    @Step("LogInButton{LogIn}")
    public RegisterPageSteps SetLogInButton(String logIn){
        logInInput.click();
        return this;
}

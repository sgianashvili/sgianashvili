package com.Facebook.StepObject;

import com.Facebook.PageObject.RegisterPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class RegisterPageSteps extends RegisterPage{
       @Step("CliCK{GoTocreateMethod}")
       public RegisterPageSteps GoTocreateMethod(){
           createAccount.click();
           return this;
       }

    @Step("First Name Value{Firstname}")
    public RegisterPageSteps FirstNAmeValue(String Firstname){
        firstNameInput.setValue(Firstname);
        firstNameInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("Last Name {Lastname}")
    public RegisterPageSteps LAstNameValue(String Lastname){
        lastNameinput.setValue(Lastname);
        lastNameinput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("E mail {Email}")
    public RegisterPageSteps EmailNAmeValue(String Email){
        emailNameinput.setValue(Email);
        emailNameinput.shouldNotBe(Condition.empty);
        return this;

    }
    @Step("password {Password}")
    public RegisterPageSteps PasswordNameValue(String Password){
        passwordInput.setValue(Password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;

    }

    @Step("month{Month}")
    public RegisterPageSteps MonthValue(String Month){
           monthInput.selectOption(Month);
           return this;
    }
    @Step("Date {Date}")
    public RegisterPageSteps DataOption(String Data){
        dataInput.selectOption(Data);
        return this;
    }

    @Step("year {Year}")
    public RegisterPageSteps YearOption(String year){
           yearInput.selectOption(year);
           return this;
    }

  /* @Step("click {click}")
    public RegisterPageSteps fluentapi(String click){
           clickInput.selectRadio(click);
           return this;
   }*/
     @Step("RadioButton{Radio}")
     public RegisterPageSteps SetRadioButton(String button){
      clickInput.click();
      return this;
  }
     @Step("Register {register}")
     public RegisterPageSteps SettRadioButton(String Register){
         RegisterInput.click();
         return this;
     }

}

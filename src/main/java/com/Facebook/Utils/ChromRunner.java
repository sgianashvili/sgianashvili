package com.Facebook.Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromRunner {

    @BeforeTest

public static void setUp() throws InterruptedException {
    Configuration.browser = "chrome";
    Thread.sleep(3000);

    Configuration.baseUrl = "https://www.facebook.com/";
    System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
    Configuration.startMaximized = true;
    Selenide.open("https://www.facebook.com/");
}


    @AfterTest

    public static void teaDown(){
        Selenide.close();


    }

}

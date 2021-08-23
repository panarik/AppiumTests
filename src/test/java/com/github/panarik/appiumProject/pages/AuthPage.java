package com.github.panarik.appiumProject.pages;

import com.github.panarik.appiumProject.util.Action;
import com.github.panarik.appiumProject.util.Wait;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class AuthPage extends Pages {

    @AndroidFindBy(id = "sign_in_logo")
    public AndroidElement sign_in_logo;

    @AndroidFindBy(id = "sign_in_without_auth")
    public AndroidElement sign_in_without_auth;

    @AndroidFindBy(id = "chat_toggleSingUpTextView")
    public AndroidElement chat_toggleSingUpTextView;

    By chat_toggleSingUpTextViewBy = By.id("chat_toggleSingUpTextView");

    public void severalClicks() {
        Action.click(chat_toggleSingUpTextViewBy);
        Wait.second(1);
        Action.click(chat_toggleSingUpTextViewBy);
        Wait.second(1);
    }

}

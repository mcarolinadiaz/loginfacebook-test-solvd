package com.solvd.web.facebook.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractUIObject {
    @FindBy(xpath = "//*[@id='email']")
    private ExtendedWebElement email;
    @FindBy(xpath = "//*[@id='pass']")
    private ExtendedWebElement pass;
    @FindBy(xpath = "//button[@name='login']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getEmail() {
        return email;
    }

    public ExtendedWebElement getPass() {
        return pass;
    }

    public void typeEmailValue(String value) {
        email.type(value);
    }

    public void typePassValue(String value) {
        pass.type(value);
    }

    public String getEmailInputPlaceholder() {
        return email.getAttribute("placeholder");
    }

    public String getPassInputPlaceholder() {
        return pass.getAttribute("placeholder");
    }

    public ExtendedWebElement getLoginButton() {
        return loginButton;
    }

    public ErrorPage clickLoginButton() {
        loginButton.click();
        return new ErrorPage(driver);
    }
}
